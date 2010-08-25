/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlyhocsinh;

import java.io.File;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.taglibs.standard.tag.common.core.ForEachSupport;
import org.netbeans.xml.schema.eschoolinkobject.ChiTietThanhPhanGiaDinh;
import utils.MyGregorianCalendar;


/**
 *
 * @author sanchikaro
 */

public class TaoHocSinh_result {

    private String hoVaTenLot,ten,gioiTinh,diaChiNhaO,tonGiao,ghiChu,quequan,ngaySinh,ngayVaoDoi,ngayVaoDoan;
    private long idQuanhuyenthanhpho,idDantoc,idChedouutien,idLop,idLoaihocsinh,idKhuvuc,idTinh,idQuanhuyenthanhphoQq
            ,idTinhQq;
    private boolean ketNapDoi,ketNapDoan;
    private File file;
    private String contentType;
    private String filename;
    private String[] ten_tpgd;
    private String[] quanHe;
    private String[] ngaySinh_tpgd;
    private String[] ngheNghiep_tpgd;


    public String execute() throws Exception {


//        try { // Call Web Service Operation
//            qlhocsinhcomapp.QLHocSinhComAppService1 service = new qlhocsinhcomapp.QLHocSinhComAppService1();
//            qlhocsinhcomapp.ThemHocSinhPortType port = service.getToHocSinh();
//            // TODO initialize WS operation arguments here
//            java.lang.String username = "";
//            java.lang.String password = "";
//
//            java.lang.String maso = "";
//
//            long idThonxom = Long.parseLong("0");
//            long idXaphuongthitran = Long.parseLong("0");
//
//
//            java.lang.String hinhAnh = "";
//
//
//            long idXaphuongthitranQq = Long.parseLong("0");
//            long idThonxomQq = Long.parseLong("0");
//
//            org.netbeans.xml.schema.eschoolinkobject.ThanhPhanGiaDinh thanhPhanGiaDinh = new org.netbeans.xml.schema.eschoolinkobject.ThanhPhanGiaDinh();
//            // TODO process result here
//            for(int i=0;i<ten_tpgd.length;i++){
//                if(!ten_tpgd[i].equals("")){
//                    ChiTietThanhPhanGiaDinh e=new ChiTietThanhPhanGiaDinh();
//                    e.setHoTen(ten_tpgd[i]);
//                    e.setNgheNghiep(ngheNghiep_tpgd[i]);
//                    e.setNgaySinh(new MyGregorianCalendar(ngaySinh_tpgd[i]).getMyXMLGregorianCalendar());
//                    e.setTenQuanHe(quanHe[i]);
//                }
//            }
//            long result = port.themHocSinhOperation(username, password, hoVaTenLot, ten, maso, ngaySinh, gioiTinh, diaChiNhaO, idThonxom, idXaphuongthitran, idQuanhuyenthanhpho, idDantoc, tonGiao, hinhAnh, ketNapDoi, ngayVaoDoi, ketNapDoan, ngayVaoDoan, ghiChu, idChedouutien, idLop, idLoaihocsinh, idKhuvuc, idTinh, quequan, idQuanhuyenthanhphoQq, idXaphuongthitranQq, idThonxomQq, idTinhQq, thanhPhanGiaDinh);
//
//        } catch (Exception ex) {
//            // TODO handle custom exceptions here
//        }


        return "success";
    }
public void setUpload(File file) {
         this.file = file;
      }

      public void setUploadContentType(String contentType) {
         this.contentType = contentType;
      }

      public void setUploadFileName(String filename) {
         this.filename = filename;
      }

    public TaoHocSinh_result() {
    }

    public String getDiaChiNhaO() {
        return diaChiNhaO;
    }

    public void setDiaChiNhaO(String diaChiNhaO) {
        this.diaChiNhaO = diaChiNhaO;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getHoVaTenLot() {
        return hoVaTenLot;
    }

    public void setHoVaTenLot(String hoVaTenLot) {
        this.hoVaTenLot = hoVaTenLot;
    }

    public long getIdChedouutien() {
        return idChedouutien;
    }

    public void setIdChedouutien(long idChedouutien) {
        this.idChedouutien = idChedouutien;
    }

    public long getIdDantoc() {
        return idDantoc;
    }

    public void setIdDantoc(long idDantoc) {
        this.idDantoc = idDantoc;
    }

    public long getIdKhuvuc() {
        return idKhuvuc;
    }

    public void setIdKhuvuc(long idKhuvuc) {
        this.idKhuvuc = idKhuvuc;
    }

    public long getIdLoaihocsinh() {
        return idLoaihocsinh;
    }

    public void setIdLoaihocsinh(long idLoaihocsinh) {
        this.idLoaihocsinh = idLoaihocsinh;
    }

    public long getIdLop() {
        return idLop;
    }

    public void setIdLop(long idLop) {
        this.idLop = idLop;
    }

    public long getIdQuanhuyenthanhpho() {
        return idQuanhuyenthanhpho;
    }

    public void setIdQuanhuyenthanhpho(long idQuanhuyenthanhpho) {
        this.idQuanhuyenthanhpho = idQuanhuyenthanhpho;
    }

    public long getIdQuanhuyenthanhphoQq() {
        return idQuanhuyenthanhphoQq;
    }

    public void setIdQuanhuyenthanhphoQq(long idQuanhuyenthanhphoQq) {
        this.idQuanhuyenthanhphoQq = idQuanhuyenthanhphoQq;
    }

    public long getIdTinh() {
        return idTinh;
    }

    public void setIdTinh(long idTinh) {
        this.idTinh = idTinh;
    }

    public long getIdTinhQq() {
        return idTinhQq;
    }

    public void setIdTinhQq(long idTinhQq) {
        this.idTinhQq = idTinhQq;
    }

    public boolean isKetNapDoan() {
        return ketNapDoan;
    }

    public void setKetNapDoan(boolean ketNapDoan) {
        this.ketNapDoan = ketNapDoan;
    }

    public boolean isKetNapDoi() {
        return ketNapDoi;
    }

    public void setKetNapDoi(boolean ketNapDoi) {
        this.ketNapDoi = ketNapDoi;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTonGiao() {
        return tonGiao;
    }

    public void setTonGiao(String tonGiao) {
        this.tonGiao = tonGiao;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNgayVaoDoan() {
        return ngayVaoDoan;
    }

    public void setNgayVaoDoan(String ngayVaoDoan) {
        this.ngayVaoDoan = ngayVaoDoan;
    }

    public String getNgayVaoDoi() {
        return ngayVaoDoi;
    }

    public void setNgayVaoDoi(String ngayVaoDoi) {
        this.ngayVaoDoi = ngayVaoDoi;
    }

    public String[] getNgaySinh_tpgd() {
        return ngaySinh_tpgd;
    }

    public void setNgaySinh_tpgd(String[] ngaySinh_tpgd) {
        this.ngaySinh_tpgd = ngaySinh_tpgd;
    }

    public String[] getNgheNghiep_tpgd() {
        return ngheNghiep_tpgd;
    }

    public void setNgheNghiep_tpgd(String[] ngheNghiep_tpgd) {
        this.ngheNghiep_tpgd = ngheNghiep_tpgd;
    }

    public String[] getQuanHe() {
        return quanHe;
    }

    public void setQuanHe(String[] quanHe) {
        this.quanHe = quanHe;
    }

    public String[] getTen_tpgd() {
        return ten_tpgd;
    }

    public void setTen_tpgd(String[] ten_tpgd) {
        this.ten_tpgd = ten_tpgd;
    }

}