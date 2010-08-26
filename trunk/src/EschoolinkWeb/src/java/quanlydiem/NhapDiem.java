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
import org.netbeans.xml.schema.loaidiem.ListDiem;

/**
 *
 * @author nguyentanmo
 */
public class NhapDiem {

    String monhoc;
    String lop;
    String hocky;
    HttpServletRequest request = ServletActionContext.getRequest();

    public NhapDiem() {
    }

    public String execute() throws Exception {
        org.netbeans.xml.schema.loaidiem.ListChiTietSoDiem chitietsodiems = null;
        org.netbeans.xml.schema.loaidiem.ListCotDiem cotdiems = null;
        long idMonhoc = 0;
        long idLop = 0;
        long hockyin = 0;

//call service tim id mon hoc tu mon hoc
        try {
            qldiemcomapp.QLDiemComAppService37 service = new qldiemcomapp.QLDiemComAppService37();
            qldiemcomapp.TimIdMonHocByTenMonHocPortType port = service.getTimIdMonHocByTenMonHoc();
            idMonhoc = port.timIdMonHocByTenMonHocOperation(monhoc);
        } catch (Exception ex) {
            System.err.println("loi1 nhap diem " + ex.getMessage());
        }

//call service tim id lop tu ten lop
        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService38 service = new qldiemcomapp.QLDiemComAppService38();
            qldiemcomapp.TimIdLopByTenLopPortType port = service.getTimIdLopByTenLop();
            idLop = port.timIdLopByTenLopOperation(lop);
        } catch (Exception ex) {
            System.err.println("loi2 nhap diem " + ex.getMessage());
        }


//call service load so diem
        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService36 service = new qldiemcomapp.QLDiemComAppService36();
            qldiemcomapp.LoadSoDiemPortType port = service.getLoadSoDiem();
            hockyin = Long.parseLong(hocky);
            chitietsodiems = port.loadSoDiemOperation(idMonhoc, idLop, hockyin);
        } catch (Exception ex) {
            System.err.println("loi3 nhap diem " + ex.getMessage());
        }

//call service lay danh sach cot diem
        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService39 service = new qldiemcomapp.QLDiemComAppService39();
            qldiemcomapp.LayDanhSachCotDiemPortType port = service.getLayDanhSachCotDiem();
            // TODO process result here
            cotdiems = port.layDanhSachCotDiemOperation();
        } catch (Exception ex) {
            System.err.println("loi4 nhap diem " + ex.getMessage());
        }

//lay danh sach hoc sinh va cot diem
        if (chitietsodiems.getChiTietSoDiem().size() > 0 && cotdiems.getCotDiem().size() > 0) {
            List<ChiTietDiem> chiTietDiems = new ArrayList<ChiTietDiem>();
            ChiTietDiem chiTietDiem = null;
            ListDiem listdiem = null;
            for (int i = 0; i < chitietsodiems.getChiTietSoDiem().size(); i++) {
                long idHocsinh = chitietsodiems.getChiTietSoDiem().get(i).getIdHocsinh();
                String tenhocsinh = "";
                double diemtrungbinh = chitietsodiems.getChiTietSoDiem().get(i).getDiemtrungbinh();
                long idChiTietSoDiem = chitietsodiems.getChiTietSoDiem().get(i).getIdChitietsodiem();
//call service tim ten hoc sinh by id hoc sinh
                try { // Call Web Service Operation
                    qldiemcomapp.QLDiemComAppService40 service = new qldiemcomapp.QLDiemComAppService40();
                    qldiemcomapp.TimTenHocSinhByIdHocSinhPortType port = service.getTimTenHocSinhByIdHocSinh();
                    tenhocsinh = port.timTenHocSinhByIdHocSinhOperation(idHocsinh);
                    chiTietDiem = new ChiTietDiem();
                    chiTietDiem.setSothutu(i + 1);
                    chiTietDiem.setHovaten(tenhocsinh);
                    chiTietDiem.setDiemtrungbinh(diemtrungbinh);
                    chiTietDiem.setIdChitietsodiem(idChiTietSoDiem);

// call service lay danh sach diem cua chitietsodiem
                    try { // Call Web Service Operation
                        qldiemcomapp.QLDiemComAppService41 service1 = new qldiemcomapp.QLDiemComAppService41();
                        qldiemcomapp.LayDanhSachDiemCuaChiTietSoDiemPortType port1 = service1.getLayDanhSachDiemCuaChiTietSoDiem();
                        listdiem = port1.layDanhSachDiemCuaChiTietSoDiemOperation(idChiTietSoDiem);

                    } catch (Exception ex) {
                        System.err.println("loi5 nhap diem " + ex.getMessage());
                    }

//them danh sach diem va danh sach id_diem vao chitietsodiem
                    for (int k = 0; k < listdiem.getDiem().size(); k++) {
                        chiTietDiem.getDiem().add(listdiem.getDiem().get(k).getDiem());
                        chiTietDiem.getIdDiem().add(listdiem.getDiem().get(k).getIdDiem());
                    }
                    chiTietDiems.add(chiTietDiem);
                } catch (Exception ex) {
                    System.err.println("loi6 nhap diem " + ex.getMessage());
                }
            }
            getRequest().setAttribute("cotdiems", cotdiems.getCotDiem());
            getRequest().setAttribute("chitietdiems", chiTietDiems);
            getRequest().setAttribute("monhoc", monhoc);
            getRequest().setAttribute("lop", lop);
            getRequest().setAttribute("hocky", hocky);
            return "success";
        }
        return "error";
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

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(String monhoc) {
        this.monhoc = monhoc;
    }

//    public static void main(String[] s) {
//        try {
////            NhapDiem nd = new NhapDiem();
////            nd.execute();
//            List<Integer> list = new ArrayList<Integer>();
//            for (int i = 0; i < 63; i++) {
//                list.add(i);
//                System.err.println(i);
//            }
//            System.err.println("size "+list.subList(0, 13).size());
//        } catch (Exception ex) {
//            System.err.println(ex.getMessage());
//        }
//    }
}
