/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlygiaovien;

import javax.servlet.http.HttpServletRequest;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.struts2.interceptor.ServletRequestAware;
import utils.MyGregorianCalendar;
import utils.MyImage;
import java.io.File;
/**
 *
 * @author bon
 */
public class TaoGiaoVien implements ServletRequestAware{

    private String choohientai;
    private String chucvu;
    private String cmnd;
    private String email;
    private String gioitinh;
    private String hinhanh;
    private String ketnapdang;
    private String ketnapdoan;
    private String ngaysinh, thangsinh, namsinh;
    private String ngayvaodang,thangvaodang,namvaodang;
    private String ngayvaodoan,thangvaodoan,namvaodoan;
    private String ngayvaotruong,thangvaotruong,namvaotruong;
    private String ngaycap,thangcap,namcap;
    private String noicap;
    private String quequan;
    private String sodienthoai;
    private String tengiaovien;
    private String tinhtrangsuckhoe = "Tot";
    private String tongiao;
    private String trinhdodaotao;
    private String trinhdovanhoa;
    private String id_dantoc;
    private String id_tobomon;
    private HttpServletRequest request;
    private String error;
   private File file;
    private String filename,contentType;
    public String execute() throws Exception {
                Long idToBoMon=new Long(id_tobomon);
                Long idDanToc=new Long(id_dantoc);
                XMLGregorianCalendar datesinh=new MyGregorianCalendar(ngaysinh+"-"+thangsinh+"-"+namsinh).getMyXMLGregorianCalendar();
                XMLGregorianCalendar datevaodoan=new MyGregorianCalendar(ngayvaodoan+"-"+thangvaodoan+"-"+namvaodoan).getMyXMLGregorianCalendar();
                XMLGregorianCalendar datevaodang=new MyGregorianCalendar(ngayvaodang+"-"+thangvaodang+"-"+namvaodang).getMyXMLGregorianCalendar();
                XMLGregorianCalendar datevaotruong=new MyGregorianCalendar(ngayvaotruong+"-"+thangvaotruong+"-"+namvaotruong).getMyXMLGregorianCalendar();
                XMLGregorianCalendar datecap=new MyGregorianCalendar(ngaycap+"-"+thangcap+"-"+namcap).getMyXMLGregorianCalendar();
                //ngay vao truong today
//                java.util.GregorianCalendar today =
//                new java.util.GregorianCalendar();
//                 javax.xml.datatype.DatatypeFactory factory =
//                javax.xml.datatype.DatatypeFactory.newInstance();
//                 javax.xml.datatype.XMLGregorianCalendar calendar =
//                factory.newXMLGregorianCalendar(
//                today.get(java.util.GregorianCalendar.YEAR),
//                today.get(java.util.GregorianCalendar.MONTH) + 1,
//                today.get(java.util.GregorianCalendar.DAY_OF_MONTH),
//                0, 0, 0, 0, 0);
                String localDir=getRequest().getRealPath("")+"\\images\\Upload";
                hinhanh = MyImage.saveImage(file, filename, contentType, localDir, 200);
//                hinhanh="...";
                long id = callservice(choohientai, chucvu, cmnd, email, gioitinh, hinhanh, new Boolean(ketnapdang), new Boolean(ketnapdoan), datecap, datesinh, datevaodang, datevaodoan, datevaotruong, noicap, quequan, sodienthoai, tengiaovien, tinhtrangsuckhoe, tongiao, trinhdodaotao, trinhdovanhoa, idDanToc, idToBoMon);
                System.out.print(id + "GIAOVIEN");
                if (id != -1) {
                    return "success";
                } else {
                    setError("Thao Tác Thất Bại,Vui long kiểm tra lại CMND,Email,Số Điện Thoại");
                    return "error";
                }
    }

    public long callservice(String choohientai, String chucvu, String cmnd, String email, String gioitinh, String hinhanh, boolean ketnapdang, boolean ketnapdoan, javax.xml.datatype.XMLGregorianCalendar ngaycap,
            javax.xml.datatype.XMLGregorianCalendar ngaysinh, javax.xml.datatype.XMLGregorianCalendar ngayvaodang,
            javax.xml.datatype.XMLGregorianCalendar ngayvaodoan, javax.xml.datatype.XMLGregorianCalendar ngayvaotruong, String noicap,
            String quequan, String sodienthoai, String tengiaovien,
            String tinhtrangsuckhoe, String tongiao, String trinhdodaotao,
            String trinhdovanhoa, long idDantoc, long idTobomon) {

        long resultid = -1;
        try { // Call Web Service Operation
            qlgiaoviencomapp.QLGiaoVienComAppService3 service = new qlgiaoviencomapp.QLGiaoVienComAppService3();
            qlgiaoviencomapp.ThemGVPortType port = service.getThemGV();
            // TODO initialize WS operation arguments here
            // TODO process result here
            long result = port.themGVOperation(choohientai, chucvu, cmnd, email, gioitinh, hinhanh, ketnapdang, ketnapdoan, ngaycap, ngaysinh, ngayvaodang, ngayvaodoan, ngayvaotruong, noicap, quequan, sodienthoai, tengiaovien, tinhtrangsuckhoe, tongiao, trinhdodaotao, trinhdovanhoa, idDantoc, idTobomon);
            resultid = result;
            System.out.println("Result = " + result);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return resultid;
    }

    public static void main(String[] a) {
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getChoohientai() {
        return choohientai;
    }

    public void setChoohientai(String choohientai) {
        this.choohientai = choohientai;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

   
    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getId_dantoc() {
        return id_dantoc;
    }

    public void setId_dantoc(String id_dantoc) {
        this.id_dantoc = id_dantoc;
    }

    public String getId_tobomon() {
        return id_tobomon;
    }

    public void setId_tobomon(String id_tobomon) {
        this.id_tobomon = id_tobomon;
    }

    public String getKetnapdang() {
        return ketnapdang;
    }

    public void setKetnapdang(String ketnapdang) {
        this.ketnapdang = ketnapdang;
    }

    public String getKetnapdoan() {
        return ketnapdoan;
    }

    public void setKetnapdoan(String ketnapdoan) {
        this.ketnapdoan = ketnapdoan;
    }

    public String getNamcap() {
        return namcap;
    }

    public void setNamcap(String namcap) {
        this.namcap = namcap;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getNamvaodang() {
        return namvaodang;
    }

    public void setNamvaodang(String namvaodang) {
        this.namvaodang = namvaodang;
    }

    public String getNamvaodoan() {
        return namvaodoan;
    }

    public void setNamvaodoan(String namvaodoan) {
        this.namvaodoan = namvaodoan;
    }

    public String getNamvaotruong() {
        return namvaotruong;
    }

    public void setNamvaotruong(String namvaotruong) {
        this.namvaotruong = namvaotruong;
    }

    public String getNgaycap() {
        return ngaycap;
    }

    public void setNgaycap(String ngaycap) {
        this.ngaycap = ngaycap;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getNgayvaodang() {
        return ngayvaodang;
    }

    public void setNgayvaodang(String ngayvaodang) {
        this.ngayvaodang = ngayvaodang;
    }

    public String getNgayvaodoan() {
        return ngayvaodoan;
    }

    public void setNgayvaodoan(String ngayvaodoan) {
        this.ngayvaodoan = ngayvaodoan;
    }

    public String getNgayvaotruong() {
        return ngayvaotruong;
    }

    public void setNgayvaotruong(String ngayvaotruong) {
        this.ngayvaotruong = ngayvaotruong;
    }

    public String getNoicap() {
        return noicap;
    }

    public void setNoicap(String noicap) {
        this.noicap = noicap;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getTengiaovien() {
        return tengiaovien;
    }

    public void setTengiaovien(String tengiaovien) {
        this.tengiaovien = tengiaovien;
    }

    public String getThangcap() {
        return thangcap;
    }

    public void setThangcap(String thangcap) {
        this.thangcap = thangcap;
    }

    public String getThangsinh() {
        return thangsinh;
    }

    public void setThangsinh(String thangsinh) {
        this.thangsinh = thangsinh;
    }

    public String getThangvaodang() {
        return thangvaodang;
    }

    public void setThangvaodang(String thangvaodang) {
        this.thangvaodang = thangvaodang;
    }

    public String getThangvaodoan() {
        return thangvaodoan;
    }

    public void setThangvaodoan(String thangvaodoan) {
        this.thangvaodoan = thangvaodoan;
    }

    public String getThangvaotruong() {
        return thangvaotruong;
    }

    public void setThangvaotruong(String thangvaotruong) {
        this.thangvaotruong = thangvaotruong;
    }

    public String getTinhtrangsuckhoe() {
        return tinhtrangsuckhoe;
    }

    public void setTinhtrangsuckhoe(String tinhtrangsuckhoe) {
        this.tinhtrangsuckhoe = tinhtrangsuckhoe;
    }

    public String getTongiao() {
        return tongiao;
    }

    public void setTongiao(String tongiao) {
        this.tongiao = tongiao;
    }

    public String getTrinhdodaotao() {
        return trinhdodaotao;
    }

    public void setTrinhdodaotao(String trinhdodaotao) {
        this.trinhdodaotao = trinhdodaotao;
    }

    public String getTrinhdovanhoa() {
        return trinhdovanhoa;
    }

    public void setTrinhdovanhoa(String trinhdovanhoa) {
        this.trinhdovanhoa = trinhdovanhoa;
    }

    @Override
    public void setServletRequest(HttpServletRequest arg0) {
        this.request=arg0;
    }

    public HttpServletRequest getRequest() {
        return request;
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
}

