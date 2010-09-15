/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thongtincanhan;

import com.opensymphony.xwork2.ActionContext;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.netbeans.xml.schema.eschoolinkobject.HocSinh;
import org.netbeans.xml.schema.qlhb_eschoolinkobject.NamHoc;

/**
 *
 * @author bon
 */
public class ThongTinHocSinh implements SessionAware{
    private HocSinh hs;
    private List<NamHoc> dsnamhoc;
    private Map<String,List<NamHoc>> sessions;
    public String execute()throws Exception{
        Map session=ActionContext.getContext().getSession();
        Long idhocsinh=(Long) session.get("userId");
        callgetHocSinhservice(idhocsinh);
       callgetNamHoc();
        return "success";
    }
    public void callgetNamHoc(){

        try { // Call Web Service Operation
            qlhocbacomapp.QLHocBaComAppService12 service = new qlhocbacomapp.QLHocBaComAppService12();
            qlhocbacomapp.LoadNamHocPortType port = service.getLoadNamHoc();
            // TODO process result here
            org.netbeans.xml.schema.mine.DanhSachNamHoc result = port.loadNamHocOperation();
            this.dsnamhoc=result.getNamHoc();
            this.sessions.put("namhocsession", dsnamhoc);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            System.out.println(ex);
        }

        
    }
    public void callgetHocSinhservice(long id_hocsinh){

        try { // Call Web Service Operation
            qlhocsinhcomapp.QLHocSinhComAppService4 service = new qlhocsinhcomapp.QLHocSinhComAppService4();
            qlhocsinhcomapp.TimHocSinhByIdHocSinhPortType port = service.getTImHocSinhByIDHocSinh();
            // TODO initialize WS operation arguments here

            org.netbeans.xml.schema.eschoolinkobject.HocSinh result = port.timHocSinhByIdHocSinhOperation(id_hocsinh);
            this.hs=result;
            System.out.println("Result = "+result);
        } catch (Exception ex) {
           System.out.println(ex);
        }


    }

    public HocSinh getHs() {
        return hs;
    }

    public void setHs(HocSinh hs) {
        this.hs = hs;
    }

 

    public List<NamHoc> getDsnamhoc() {
        return dsnamhoc;
    }

    public void setDsnamhoc(List<NamHoc> dsnamhoc) {
        this.dsnamhoc = dsnamhoc;
    }

    public void setSession(Map arg0) {
        this.sessions=arg0;
    }

    public Map<String, List<NamHoc>> getSessions() {
        return sessions;
    }

}
