/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thongtincanhan;

import com.opensymphony.xwork2.ActionContext;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.netbeans.xml.schema.qlhb_eschoolinkobject.NamHoc;
import org.netbeans.xml.schema.qlhb_eschoolinkobject.HocBa;

/**
 *
 * @author bon
 */
public class XemHocBa_CN implements SessionAware{
    private String id_hocsinh="1";
    private String id_namhoc;
    private HocBa hocba;
    private Map session;
    public String execute() throws Exception{
        Map sess=ActionContext.getContext().getSession();
        List<NamHoc> listnamhoc=(List<NamHoc>) session.get("namhocsession");
        int idnamhoc=new Integer(id_namhoc);
        int namtruoc=0;
        int namsau=0;
        for(int i=0;i<listnamhoc.size();i++){
           if(listnamhoc.get(i).getId()==idnamhoc){
               namtruoc=listnamhoc.get(i).getNamTruoc();
               namsau=listnamhoc.get(i).getNamSau();
               break;
           }
       }

        callgetHocBA(new Long(id_hocsinh), new Long(namsau), new Long(namtruoc));

        return "success";
    }

    public void callgetHocBA(long idHocsinh,long namsau,long namtruoc){
    try { // Call Web Service Operation
        qlhocbacomapp.QLHocBaComAppService1 service = new qlhocbacomapp.QLHocBaComAppService1();
        qlhocbacomapp.TracuuhocbacanamPortType port = service.getTracuuhocbacanam();
        // TODO initialize WS operation arguments here
        // TODO process result here
        org.netbeans.xml.schema.qlhb_eschoolinkobject.HocBa result = port.tracuuhocbacanamOperation(idHocsinh, namsau, namtruoc);
        hocba=result;
        session.put("hocba", hocba);
        System.out.println("Result = "+result);

    } catch (Exception ex) {
        System.out.println(ex);
    }
    }

    public HocBa getHocba() {
        return hocba;
    }

    public void setHocba(HocBa hocba) {
        this.hocba = hocba;
    }

    public String getId_hocsinh() {
        return id_hocsinh;
    }

    public void setId_hocsinh(String id_hocsinh) {
        this.id_hocsinh = id_hocsinh;
    }

    public String getId_namhoc() {
        return id_namhoc;
    }

    public void setId_namhoc(String id_namhoc) {
        this.id_namhoc = id_namhoc;
    }


    public void setSession(Map<String, Object> arg0) {
            this.session=arg0;
    }

    public Map getSession() {
        return session;
    }


}
