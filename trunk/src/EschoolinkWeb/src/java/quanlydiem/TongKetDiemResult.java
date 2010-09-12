/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydiem;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.netbeans.xml.schema.loaidiem.ChiTietDiem;
import org.netbeans.xml.schema.loaidiem.DiemTrungBinh;
import org.netbeans.xml.schema.loaidiem.HocSinh;
import org.netbeans.xml.schema.loaidiem.MonHoc;

/**
 *
 * @author nguyentanmo
 */
public class TongKetDiemResult {

    String lop;
    String hocky;
    HttpServletRequest request = ServletActionContext.getRequest();

    public TongKetDiemResult() {
    }

    public String execute() throws Exception {
        long id_lop = 0;
        int hk = 0;
        long idNamhoc = 0;
        List<HocSinh> listhocsinhs = new ArrayList<HocSinh>();
        List<MonHoc> listmonhocs = new ArrayList<MonHoc>();
//        List<DiemTrungBinh> listdiemtrungbinhs = new ArrayList<DiemTrungBinh>();
        List<ChiTietDiem> listchitietdiems = new ArrayList<ChiTietDiem>();
        try {
            id_lop = Long.parseLong(lop);
            hk = Integer.parseInt(hocky);
        } catch (Exception ex) {
            System.err.println("Tong ket diem result loi1 " + ex.getMessage());
        }

//call service lay danh sach mon hoc cua lop
        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService46 service = new qldiemcomapp.QLDiemComAppService46();
            qldiemcomapp.LayDanhSachMonHocCuaLopPortType port = service.getLayDanhSachMonHocCuaLop();
            org.netbeans.xml.schema.loaidiem.ListMonHoc monhocs = port.layDanhSachMonHocCuaLopOperation(id_lop);
            listmonhocs = monhocs.getMonHoc();
        } catch (Exception ex) {
            System.err.println("Tong ket diem result loi2 " + ex.getMessage());
        }

//call service lay danh sach hoc sinh cua lop
        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService61 service = new qldiemcomapp.QLDiemComAppService61();
            qldiemcomapp.LayDanhSachHocSinhByIdLopPortType port = service.getLayDanhSachHocSinhByIdLop();
            org.netbeans.xml.schema.loaidiem.ListHocSinh hocsinhs = port.layDanhSachHocSinhByIdLopOperation(id_lop);
            listhocsinhs = hocsinhs.getHocSinh();
        } catch (Exception ex) {
            System.err.println("Tong ket diem result loi3 " + ex.getMessage());
        }

//call service lay id nam hoc moi
        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService58 service = new qldiemcomapp.QLDiemComAppService58();
            qldiemcomapp.LayIdNamHocMoiPortType port = service.getLayIdNamHocMoi();
            idNamhoc = port.layIdNamHocMoiOperation();
        } catch (Exception ex) {
            System.err.println("Tong ket diem result loi4 " + ex.getMessage());
        }

//call service lay diem trung binh cua hoc sinh
        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService59 service = new qldiemcomapp.QLDiemComAppService59();
            qldiemcomapp.LayDiemTrungBinhCuaHocSinhPortType port = service.getLayDiemTrungBinhCuaHocSinh();
            for (int i = 0; i < listhocsinhs.size(); i++) {
                long idHocsinh = listhocsinhs.get(i).getIdHocsinh();
                String tenHocSinh = listhocsinhs.get(i).getTenhocsinh();
                ChiTietDiem chiTietDiem = new ChiTietDiem();
                for (int j = 0; j < listmonhocs.size(); j++) {
                    long idMonhoc = listmonhocs.get(j).getIdMonhoc();
                    double diemtrungbinhmon = port.layDiemTrungBinhCuaHocSinhOperation(idHocsinh, hk, idMonhoc, idNamhoc, id_lop);
                    chiTietDiem.getDiem().add(diemtrungbinhmon);
                }
                chiTietDiem.setSothutu(i + 1);
                chiTietDiem.setHovaten(tenHocSinh);
                listchitietdiems.add(chiTietDiem);
            }
            getRequest().setAttribute("listmonhocs", listmonhocs);
            getRequest().setAttribute("listchitietdiems", listchitietdiems);
            return "success";
        } catch (Exception ex) {
            System.err.println("Tong ket diem result loi5 " + ex.getMessage());
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

    public String getHocky() {
        return hocky;
    }

    public void setHocky(String hocky) {
        this.hocky = hocky;
    }

    public static void main(String[] s) {
        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService46 service = new qldiemcomapp.QLDiemComAppService46();
            qldiemcomapp.LayDanhSachMonHocCuaLopPortType port = service.getLayDanhSachMonHocCuaLop();
            org.netbeans.xml.schema.loaidiem.ListMonHoc monhocs = port.layDanhSachMonHocCuaLopOperation(1);
            List<MonHoc> listmonhocs = monhocs.getMonHoc();
            System.out.println("size mon hoc" + listmonhocs.size());
        } catch (Exception ex) {
            System.err.println("Tong ket diem result loi2 " + ex.getMessage());
        }

        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService61 service = new qldiemcomapp.QLDiemComAppService61();
            qldiemcomapp.LayDanhSachHocSinhByIdLopPortType port = service.getLayDanhSachHocSinhByIdLop();
            org.netbeans.xml.schema.loaidiem.ListHocSinh hocsinhs = port.layDanhSachHocSinhByIdLopOperation(1);
            List<HocSinh> listhocsinhs = hocsinhs.getHocSinh();
            System.out.println("size hoc sinh " + listhocsinhs.size());
        } catch (Exception ex) {
            System.err.println("Tong ket diem result loi3 " + ex.getMessage());
        }

        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService58 service = new qldiemcomapp.QLDiemComAppService58();
            qldiemcomapp.LayIdNamHocMoiPortType port = service.getLayIdNamHocMoi();
            long idNamhoc = port.layIdNamHocMoiOperation();
            System.out.println("id nam hoc " + idNamhoc);
        } catch (Exception ex) {
            System.err.println("Tong ket diem result loi4 " + ex.getMessage());
        }
    }
}
