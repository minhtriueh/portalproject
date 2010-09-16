/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydiem;

import com.opensymphony.xwork2.ActionContext;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author nguyentanmo
 */
public class TongKetDiem {

    HttpServletRequest request = ServletActionContext.getRequest();

    public TongKetDiem() {
    }

    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        Long idgv = (Long) session.get("userId");
        long idGiaovienChuNhiem = idgv;
//call service lay lop ma giao vien chu nhiem
        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService60 service = new qldiemcomapp.QLDiemComAppService60();
            qldiemcomapp.LayLopChoGiaoVienChuNhiemPortType port = service.getLayLopChoGiaoVienChuNhiem();
            org.netbeans.xml.schema.loaidiem.Lop lop = port.layLopChoGiaoVienChuNhiemOperation(idGiaovienChuNhiem);
            getRequest().setAttribute("lop", lop);
            return "success";
        } catch (Exception ex) {
            System.err.println("Tong ket diem loi1 " + ex.getMessage());
        }
        return "error";
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public static void main(String[] s) {
        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService60 service = new qldiemcomapp.QLDiemComAppService60();
            qldiemcomapp.LayLopChoGiaoVienChuNhiemPortType port = service.getLayLopChoGiaoVienChuNhiem();
            org.netbeans.xml.schema.loaidiem.Lop lop = port.layLopChoGiaoVienChuNhiemOperation(1);
            System.out.println(lop.getTenlop());
        } catch (Exception ex) {
            System.err.println("Tong ket diem loi1 " + ex.getMessage());
        }
    }
}
