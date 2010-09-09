/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydiem;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.netbeans.xml.schema.loaidiem.ChiTietXemDiem;
import org.netbeans.xml.schema.loaidiem.Diem;

/**
 *
 * @author nguyentanmo
 */
public class XemDiemResult {

    String lop;
    String monhoc;
    String hocky;
    String idhocsinh;
    String idnamhocmoinhat;
    String mons;
    String tenmonhocs;
    HttpServletRequest request = ServletActionContext.getRequest();

    public XemDiemResult() {
    }

    public String execute() throws Exception {
        //call service lay danh sach cot diem
        org.netbeans.xml.schema.loaidiem.ListCotDiem cotdiems = null;
        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService39 service = new qldiemcomapp.QLDiemComAppService39();
            qldiemcomapp.LayDanhSachCotDiemPortType port = service.getLayDanhSachCotDiem();
            cotdiems = port.layDanhSachCotDiemOperation();
        } catch (Exception ex) {
            System.err.println("loi 1 XemDiemResult " + ex.getMessage());
        }

        //call service tim ten hoc sinh by id hoc sinh
        String tenhocsinh = "";
        long idHocsinh = 0;
        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService40 service = new qldiemcomapp.QLDiemComAppService40();
            qldiemcomapp.TimTenHocSinhByIdHocSinhPortType port = service.getTimTenHocSinhByIdHocSinh();
            idHocsinh = Long.parseLong(idhocsinh);
            tenhocsinh = port.timTenHocSinhByIdHocSinhOperation(idHocsinh);
        } catch (Exception ex) {
            System.err.println("loi 4 XemDiemResult " + ex.getMessage());
        }

//call service lay id nam hoc moi nhat
        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService58 service = new qldiemcomapp.QLDiemComAppService58();
            qldiemcomapp.LayIdNamHocMoiPortType port = service.getLayIdNamHocMoi();
            long idnamhoc = port.layIdNamHocMoiOperation();
            idnamhocmoinhat = "" + idnamhoc;
        } catch (Exception ex) {
            System.err.println("loi 2 XemDiemResult " + ex.getMessage());
        }
        if (monhoc.equals("tatcacacmon")) {
            List<List<Diem>> listdiems = new ArrayList<List<Diem>>();
            List<Double> listdiemtrungbinhs = new ArrayList<Double>();
            StringTokenizer st = new StringTokenizer(mons, ", ");
            while (st.hasMoreTokens()) {
                String idmon = st.nextToken();
                idHocsinh = Long.parseLong(idhocsinh);
                long idLop = Long.parseLong(lop);
                long idMonhoc = Long.parseLong(idmon);
                long idNamhoc = Long.parseLong(idnamhocmoinhat);
                int hk = Integer.parseInt(hocky);
//call service lay danh sach diem cua hoc sinh theo mon
                try { // Call Web Service Operation
                    qldiemcomapp.QLDiemComAppService57 service = new qldiemcomapp.QLDiemComAppService57();
                    qldiemcomapp.LayDanhSachDiemCuaHocSinhByMonHocPortType port = service.getLayDanhSachDiemCuaHocSinhByMonHoc();
                    org.netbeans.xml.schema.loaidiem.ListDiem diems = port.layDanhSachDiemCuaHocSinhByMonHocOperation(idHocsinh, idLop, idMonhoc, idNamhoc, hk);
                    //them vao danh sach diem cua hoc sinh
                    listdiems.add(diems.getDiem());
                } catch (Exception ex) {
                    System.err.println("loi 3 XemDiemResult " + ex.getMessage());
                }
//call service lay diem trung binh cua hoc sinh

                try { // Call Web Service Operation
                    qldiemcomapp.QLDiemComAppService59 service = new qldiemcomapp.QLDiemComAppService59();
                    qldiemcomapp.LayDiemTrungBinhCuaHocSinhPortType port = service.getLayDiemTrungBinhCuaHocSinh();
                    double diemtrungbinh = port.layDiemTrungBinhCuaHocSinhOperation(idHocsinh, hk, idMonhoc, idNamhoc, idLop);
                    //them diem trung binh cua mon hoc vao list
                    listdiemtrungbinhs.add(diemtrungbinh);
                } catch (Exception ex) {
                    System.err.println("loi 4 XemDiemResult " + ex.getMessage());
                }

            }
//lay danh sach tat ca cac mon hoc
            List<String> listMonHoc = new ArrayList<String>();
            StringTokenizer str = new StringTokenizer(tenmonhocs, ", ");
            while (str.hasMoreTokens()) {
                String tenmon = str.nextToken();
                listMonHoc.add(tenmon);
            }
//them cac thong tin vao chitietxemdiem
            List<ChiTietXemDiem> listChiTietXemDiems = new ArrayList<ChiTietXemDiem>();
            ChiTietXemDiem chiTietXemDiem = null;
            if (listMonHoc.size() == listdiemtrungbinhs.size()) {
                for (int i = 0; i < listMonHoc.size(); i++) {
                    chiTietXemDiem = new ChiTietXemDiem();
                    chiTietXemDiem.setSothutu(i + 1);
                    chiTietXemDiem.setHovaten(tenhocsinh);
                    chiTietXemDiem.setMonhoc(listMonHoc.get(i));
                    chiTietXemDiem.setDiemtrungbinh(listdiemtrungbinhs.get(i));
                    List<Diem> listdiem = listdiems.get(i);
                    for (int j = 0; j < listdiem.size(); j++) {
                        chiTietXemDiem.getDiem().add(listdiem.get(j).getDiem());
                    }
//them noi dung vao list diem hien thi
                    listChiTietXemDiems.add(chiTietXemDiem);
                }
            }

//luu bien request
            getRequest().setAttribute("listchitietxemdiems", listChiTietXemDiems);
            getRequest().setAttribute("cotdiems", cotdiems.getCotDiem());
            return "success";
        }

//call service lay danh sach diem cua hoc sinh theo mon
        if (!monhoc.equals("tatcacacmon")) {
            try { // Call Web Service Operation
                qldiemcomapp.QLDiemComAppService57 service = new qldiemcomapp.QLDiemComAppService57();
                qldiemcomapp.LayDanhSachDiemCuaHocSinhByMonHocPortType port = service.getLayDanhSachDiemCuaHocSinhByMonHoc();
                idHocsinh = Long.parseLong(idhocsinh);
                long idLop = Long.parseLong(lop);
                long idMonhoc = 0;
//call service tim idmonhoc by tenmonhoc
                try { // Call Web Service Operation
                    qldiemcomapp.QLDiemComAppService37 service1 = new qldiemcomapp.QLDiemComAppService37();
                    qldiemcomapp.TimIdMonHocByTenMonHocPortType port1 = service1.getTimIdMonHocByTenMonHoc();
                    idMonhoc = port1.timIdMonHocByTenMonHocOperation(monhoc);
                } catch (Exception ex) {
                    System.err.println("loi 5 XemDiemResult " + ex.getMessage());
                }
                long idNamhoc = Long.parseLong(idnamhocmoinhat);
                int hk = Integer.parseInt(hocky);
                org.netbeans.xml.schema.loaidiem.ListDiem diems = port.layDanhSachDiemCuaHocSinhByMonHocOperation(idHocsinh, idLop, idMonhoc, idNamhoc, hk);

//call service lay diem trung binh cua hoc sinh
                double diemtrungbinh = 0;
                try { // Call Web Service Operation
                    qldiemcomapp.QLDiemComAppService59 service3 = new qldiemcomapp.QLDiemComAppService59();
                    qldiemcomapp.LayDiemTrungBinhCuaHocSinhPortType port3 = service3.getLayDiemTrungBinhCuaHocSinh();
                    diemtrungbinh = port3.layDiemTrungBinhCuaHocSinhOperation(idHocsinh, hk, idMonhoc, idNamhoc, idLop);
                } catch (Exception ex) {
                    System.err.println("loi 6 XemDiemResult " + ex.getMessage());
                }

//luu bien request
                getRequest().setAttribute("chonmotmon", "chonmotmon");
                getRequest().setAttribute("diems", diems.getDiem());
                getRequest().setAttribute("diemtrungbinh", diemtrungbinh);
                getRequest().setAttribute("tenhocsinh", tenhocsinh);
                getRequest().setAttribute("cotdiems", cotdiems.getCotDiem());
                return "success";
            } catch (Exception ex) {
                System.err.println("loi 6 XemDiemResult " + ex.getMessage());
            }
        }
        return "error";
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

    public String getIdhocsinh() {
        return idhocsinh;
    }

    public void setIdhocsinh(String idhocsinh) {
        this.idhocsinh = idhocsinh;
    }

    public String getIdnamhocmoinhat() {
        return idnamhocmoinhat;
    }

    public void setIdnamhocmoinhat(String idnamhocmoinhat) {
        this.idnamhocmoinhat = idnamhocmoinhat;
    }

    public String getMons() {
        return mons;
    }

    public void setMons(String mons) {
        this.mons = mons;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public String getTenmonhocs() {
        return tenmonhocs;
    }

    public void setTenmonhocs(String tenmonhocs) {
        this.tenmonhocs = tenmonhocs;
    }
}
