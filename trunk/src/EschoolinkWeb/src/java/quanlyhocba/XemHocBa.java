/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyhocba;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.netbeans.xml.schema.qlhb_eschoolinkobject.HocBa;

/**
 *
 * @author bon
 */
public class XemHocBa implements SessionAware {

    private String id_hocsinh;
    private HocBa hocba;
    private Map session;

    public HocBa getHocba() {
        return hocba;
    }

    public Map getSession() {
        return session;
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

    public String execute() throws Exception {
        Long id = new Long(id_hocsinh);
        hocba = callTimHocBaService(id);
        session.put("shocba", hocba);
        return "success";
    }

    public HocBa callTimHocBaService(Long idHocsinh) {
        HocBa hocb = null;
        try { // Call Web Service Operation
            qlhocbacomapp.QLHocBaComAppService1 service = new qlhocbacomapp.QLHocBaComAppService1();
            qlhocbacomapp.TracuuhocbacanamPortType port = service.getTracuuhocbacanam();
            // TODO initialize WS operation arguments here
            long namsau = 2010L;
            long namtruoc = 2009L;
            // TODO process result here
            org.netbeans.xml.schema.qlhb_eschoolinkobject.HocBa result = port.tracuuhocbacanamOperation(idHocsinh, namsau, namtruoc);
            hocb = result;
            System.out.println("Result = " + result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return hocb;
    }

    public void setSession(Map arg0) {
        this.session = arg0;
    }
}
