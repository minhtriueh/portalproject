/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydiem;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.netbeans.xml.schema.loaidiem.MonHoc;

/**
 *
 * @author nguyentanmo
 */
public class XacNhanMSHS{

    String masohocsinh;
    String lop;
    String idhocsinh;
    HttpServletRequest request = ServletActionContext.getRequest();

    public XacNhanMSHS() {
    }

    public String execute() throws Exception {
//call service tim id hoc sinh dua vao mshs
        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService56 service = new qldiemcomapp.QLDiemComAppService56();
            qldiemcomapp.TimIdHocSinhByMshsPortType port = service.getTimIdHocSinhByMshs();
            long id = port.timIdHocSinhByMshsOperation(masohocsinh);
            idhocsinh = "" + id;
        } catch (Exception ex) {
            System.err.println("loi 2 XacNhanMSHS " + ex.getMessage());
        }

//call service tim id lop dua vao mshs
        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService45 service = new qldiemcomapp.QLDiemComAppService45();
            qldiemcomapp.TimIdLopByMshsPortType port = service.getTimIdLopByMshs();
            long id_lop = port.timIdLopByMshsOperation(masohocsinh);
            lop = "" + id_lop;
            if (!lop.equals("")) {
//call service lay danh sach mon hoc cua lop
                try { // Call Web Service Operation
                    qldiemcomapp.QLDiemComAppService46 service1 = new qldiemcomapp.QLDiemComAppService46();
                    qldiemcomapp.LayDanhSachMonHocCuaLopPortType port1 = service1.getLayDanhSachMonHocCuaLop();
                    org.netbeans.xml.schema.loaidiem.ListMonHoc listmonhoc = port1.layDanhSachMonHocCuaLopOperation(id_lop);
                    List<MonHoc> monhocs = new ArrayList<MonHoc>();
                    monhocs.addAll(listmonhoc.getMonHoc());
                    getRequest().setAttribute("monhocs", monhocs);
                } catch (Exception ex) {
                    System.err.println("loi 2 XacNhanMSHS " + ex.getMessage());
                }
                return "success";
            }
        } catch (Exception ex) {
            System.err.println("loi 3 XacNhanMSHS " + ex.getMessage());
        }
        return "error";
    }

    public String getMasohocsinh() {
        return masohocsinh;
    }

    public void setMasohocsinh(String masohocsinh) {
        this.masohocsinh = masohocsinh;
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

    public String getIdhocsinh() {
        return idhocsinh;
    }

    public void setIdhocsinh(String idhocsinh) {
        this.idhocsinh = idhocsinh;
    }
    
}
