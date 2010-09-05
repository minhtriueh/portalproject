/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlygiaovien;
import java.util.Calendar;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.netbeans.xml.schema.qlgv_eschoolinkobject.GiaoVien;
/**
 *
 * @author bon
 */
public class TraCuuGiaoVien implements ServletRequestAware,ServletResponseAware,SessionAware{
        private long idGv;
        private String id_giaovien;
        private GiaoVien giaovien;
        private HttpServletRequest request;

    public Map<String, GiaoVien> getSession() {
        return session;
    }
        private HttpServletResponse respond;
        private Map<String,GiaoVien> session;

        public String execute() throws Exception{
            idGv=new Long(id_giaovien);
            giaovien=tracuugiaovienbyID(idGv);
            session.put("giaovien",giaovien);
            request.setAttribute("giaovien", giaovien);
            return "success";
       }

    public HttpServletRequest getRequest() {
        return request;
    }

    public HttpServletResponse getRespond() {
        return respond;
    }

    public GiaoVien getGiaovien() {
        return giaovien;
    }

    public void setGiaovien(GiaoVien giaovien) {
        this.giaovien = giaovien;
    }

    public long getIdGv() {
        return idGv;
    }

    public void setIdGv(long idGv) {
        this.idGv = idGv;
    }

    public String getId_giaovien() {
        return id_giaovien;
    }

    public void setId_giaovien(String id_giaovien) {
        this.id_giaovien = id_giaovien;
    }
      public GiaoVien tracuugiaovienbyID(long id){
       GiaoVien gv=null;

       try { // Call Web Service Operation
           qlgiaoviencomapp.QLGiaoVienComAppService1 service = new qlgiaoviencomapp.QLGiaoVienComAppService1();
           qlgiaoviencomapp.TracuuGVPortType port = service.getTracuuGVbyID();
           // TODO initialize WS operation arguments here

           // TODO process result here
          gv = port.tracuuGVOperation(id);

       } catch (Exception ex) {
           System.out.print(ex);
       }
       return gv;
   }
   public static void main(String[] arg){
       GiaoVien giaovien;
       giaovien=new TraCuuGiaoVien().tracuugiaovienbyID(2);
//       System.out.print(giaovien.getNgaySinh().toString());
       Calendar ca=Calendar.getInstance();
        System.out.print(ca.get(Calendar.YEAR)+"SDSDDSD");
   }

    public void setServletRequest(HttpServletRequest arg0) {
            this.request=arg0;
    }

    public void setServletResponse(HttpServletResponse arg0) {
            this.respond=arg0;
    }

    public void setSession(Map arg0) {
        this.session=arg0;
    }


}


