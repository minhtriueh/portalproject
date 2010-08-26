/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlyhocsinh;

import java.util.ArrayList;
import org.netbeans.xml.schema.eschoolinkobject.CheDoUuTien;
import org.netbeans.xml.schema.eschoolinkobject.DanToc;
import org.netbeans.xml.schema.eschoolinkobject.KhuVuc;
import org.netbeans.xml.schema.eschoolinkobject.LoaiHocSinh;
import org.netbeans.xml.schema.eschoolinkobject.Lop;
import org.netbeans.xml.schema.eschoolinkobject.Tinh;



/**
 *
 * @author sanchikaro
 */

public class TaoHocSinh {
    private ArrayList<Tinh> listTinh=new ArrayList<Tinh>();
    private ArrayList<LoaiHocSinh> listLoaiHocSinh=new ArrayList<LoaiHocSinh>();
    private ArrayList<CheDoUuTien> listCheDoUuTien=new ArrayList<CheDoUuTien>();
    private ArrayList<DanToc> listDanToc=new ArrayList<DanToc>();
    private ArrayList<KhuVuc> listKhuVuc=new ArrayList<KhuVuc>();
    private ArrayList<Lop> listLop=new ArrayList<Lop>();
    public TaoHocSinh() {
        //lay danh sach Tinh

        try { // Call Web Service Operation
            quanlydiachicomapp.QuanLyDiaChiComAppService9 service = new quanlydiachicomapp.QuanLyDiaChiComAppService9();
            quanlydiachicomapp.LayDanhSachTinhPortType port = service.getLayDanhSachTinh();
            // TODO process result here
            org.netbeans.xml.schema.eschoolinkobject.ListTinh result = port.layDanhSachTinhOperation();
            for (int i = 0; i < result.getTinh().size(); i++) {
                listTinh.add(result.getTinh().get(i));
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        // lay danh sach loai hoc sinh

        try { // Call Web Service Operation
            quanlythongtinkhoitaocomapp.QuanLyThongTinKhoiTaoComAppService7 service = new quanlythongtinkhoitaocomapp.QuanLyThongTinKhoiTaoComAppService7();
            quanlythongtinkhoitaocomapp.GetAllLoaiHocSinhPortType port = service.getLayDanhSachLoaiHocSinh();
            // TODO process result here
            org.netbeans.xml.schema.listobject.ListLoaiHocSinh result = port.getAllLoaiHocSinhOperation();
            for (int i = 0; i < result.getLoaiHocSinh().size(); i++) {
                listLoaiHocSinh.add(result.getLoaiHocSinh().get(i));
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        //lay danh sach che do uu tien

        try { // Call Web Service Operation
            quanlythongtinkhoitaocomapp.QuanLyThongTinKhoiTaoComAppService8 service = new quanlythongtinkhoitaocomapp.QuanLyThongTinKhoiTaoComAppService8();
            quanlythongtinkhoitaocomapp.GetAllCheDoUuTienPortType port = service.getLayDanhSachCheDoUuTien();
            // TODO process result here
            org.netbeans.xml.schema.listobject.ListCheDoUuTien result = port.getAllCheDoUuTienOperation();
            for (int i = 0; i < result.getCheDoUuTien().size(); i++) {
                listCheDoUuTien.add(result.getCheDoUuTien().get(i));
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        //lay danh sach dan toc

        try { // Call Web Service Operation
            quanlythongtinkhoitaocomapp.QuanLyThongTinKhoiTaoComAppService9 service = new quanlythongtinkhoitaocomapp.QuanLyThongTinKhoiTaoComAppService9();
            quanlythongtinkhoitaocomapp.GetAllDanTocPortType port = service.getLayDanhSachDanToc();
            // TODO process result here
            org.netbeans.xml.schema.listobject.ListDanToc result = port.getAllDanTocOperation();
            for (int i = 0; i < result.getDanToc().size(); i++) {
               result.getDanToc().get(i).getTenDanToc().trim();
               listDanToc.add(result.getDanToc().get(i));

            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        //lay danh sach khu vuc

        try { // Call Web Service Operation
            quanlydiachicomapp.QuanLyDiaChiComAppService11 service = new quanlydiachicomapp.QuanLyDiaChiComAppService11();
            quanlydiachicomapp.LayDanhSachKhuVucPortType port = service.getLayDanhSachKhuVuc();
            // TODO process result here
            org.netbeans.xml.schema.eschoolinkobject.ListKhuVuc result = port.layDanhSachKhuVucOperation();
            for (int i = 0; i < result.getKhuVuc().size(); i++) {
                listKhuVuc.add(result.getKhuVuc().get(i));

            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        //lay danh sach lop hien tai

        try { // Call Web Service Operation
            quanlythongtinkhoitaocomapp.QuanLyThongTinKhoiTaoComAppService10 service = new quanlythongtinkhoitaocomapp.QuanLyThongTinKhoiTaoComAppService10();
            quanlythongtinkhoitaocomapp.GetAllLopPortType port = service.getLayDanhSachLop();
            // TODO process result here
            org.netbeans.xml.schema.listobject.ListLop result = port.getAllLopOperation();
            for (int i = 0; i < result.getLop().size(); i++) {
                listLop.add(result.getLop().get(i));

            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }


    }

    

    public String execute() throws Exception {
     
        return "success";
    }

    public ArrayList<Tinh> getListTinh() {
        return listTinh;
    }

    public void setListTinh(ArrayList<Tinh> listTinh) {
        this.listTinh = listTinh;
    }

    public ArrayList<LoaiHocSinh> getListLoaiHocSinh() {
        return listLoaiHocSinh;
    }

    public void setListLoaiHocSinh(ArrayList<LoaiHocSinh> listLoaiHocSinh) {
        this.listLoaiHocSinh = listLoaiHocSinh;
    }

    public ArrayList<CheDoUuTien> getListCheDoUuTien() {
        return listCheDoUuTien;
    }

    public void setListCheDoUuTien(ArrayList<CheDoUuTien> listCheDoUuTien) {
        this.listCheDoUuTien = listCheDoUuTien;
    }

    public ArrayList<DanToc> getListDanToc() {
        return listDanToc;
    }

    public void setListDanToc(ArrayList<DanToc> listDanToc) {
        this.listDanToc = listDanToc;
    }

    public ArrayList<KhuVuc> getListKhuVuc() {
        return listKhuVuc;
    }

    public void setListKhuVuc(ArrayList<KhuVuc> listKhuVuc) {
        this.listKhuVuc = listKhuVuc;
    }

    public ArrayList<Lop> getListLop() {
        return listLop;
    }

    public void setListLop(ArrayList<Lop> listLop) {
        this.listLop = listLop;
    }

    

}