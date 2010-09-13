/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlyhocba;

import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.netbeans.xml.schema.eschoolinkobject.HocSinh;

/**
 *
 * @author bon
 */
public class SearchHocSinhHB implements SessionAware{
    private String id_lop;
    private List<HocSinh> listhocsinh;
    private Map<String,List<HocSinh>> session;
    public String execute()throws Exception{
        Long id=new Long(id_lop);
        listhocsinh=callServiceTKHocSinhByLop(id);
        session.put("lisths", listhocsinh);
       return "success";
    }

    public Map<String, List<HocSinh>> getSession() {
        return session;
    }

    public String getId_lop() {
        return id_lop;
    }

    public void setId_lop(String id_lop) {
        this.id_lop = id_lop;
    }

    public List<HocSinh> getListhocsinh() {
        return listhocsinh;
    }

    public void setListhocsinh(List<HocSinh> listhocsinh) {
        this.listhocsinh = listhocsinh;
    }
    public List<HocSinh> callServiceTKHocSinhByLop(long idLop){
            List<HocSinh> list=null;

        try { // Call Web Service Operation
            qlhocsinhcomapp.QLHocSinhComAppService10 service = new qlhocsinhcomapp.QLHocSinhComAppService10();
            qlhocsinhcomapp.TimHocSinhTheoLopPortType port = service.getTimHocSinhTheoLop();
            // TODO initialize WS operation arguments here
            // TODO process result here
            org.netbeans.xml.schema.listobject.ListHocSinh result = port.timHocSinhTheoLopOperation(idLop);
            System.out.println("Result = "+result);
            list=result.getHocSinh();
        } catch (Exception ex) {
                    System.out.println(ex);
        }
                return list;
    }

   
    public void setSession(Map arg0) {
            this.session=arg0;
    }
}
