/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydiem;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author nguyentanmo
 */
public class TongKetDiemResult {

    String lop;
    HttpServletRequest request = ServletActionContext.getRequest();

    public TongKetDiemResult() {
    }

    public String execute() throws Exception {
//call service lay danh sach mon hoc cua lop
        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService46 service = new qldiemcomapp.QLDiemComAppService46();
            qldiemcomapp.LayDanhSachMonHocCuaLopPortType port = service.getLayDanhSachMonHocCuaLop();
            long id_lop = Long.parseLong(lop);
            org.netbeans.xml.schema.loaidiem.ListMonHoc listmonhocs = port.layDanhSachMonHocCuaLopOperation(id_lop);
            getRequest().setAttribute("listmonhocs", listmonhocs);
            return "success";
        } catch (Exception ex) {
            System.err.println("Tong ket diem result loi1 " + ex.getMessage());
        }
        return "error";
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }
}
