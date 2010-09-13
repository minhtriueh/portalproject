///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package quanlythongtinkhoitao;
//
//import javax.xml.datatype.XMLGregorianCalendar;
//import utils.MyGregorianCalendar;
//
///**
// *
// * @author GIN
// */
//public class TaoTruong_Result {
//String diachi;
//    String dienthoai;
//    String gioithieu;
//    String loaihinh;
//    String ngaythanhlap, thangthanhlap, namthanhlap;
//    String tentruong;
//    String website;
//
//    public String execute() throws Exception {
//        XMLGregorianCalendar datethanhlap = new MyGregorianCalendar(ngaythanhlap + "-" + thangthanhlap + "-" + namthanhlap).getMyXMLGregorianCalendar();
//
//        long id = callService(diachi, dienthoai, gioithieu, loaihinh, datethanhlap, tentruong, website);
//
//        if(id != -1)
//            return "success";
//        else {
//            return "error";
//        }
//
//    }
//
//    private long callService(String diachi,
//            String dienthoai,
//            String gioithieu,
//            String loaihinh,
//            javax.xml.datatype.XMLGregorianCalendar datethanhlap,
//            String tentruong,
//            String website) {
//
//        long result = -1;
//
//        try {
//            quanlytruonglopcomapp.QuanLyTruongLopComAppService1 serv = new quanlytruonglopcomapp.QuanLyTruongLopComAppService1();
//            quanlytruonglopcomapp.TaoTruongPortType port = serv.getTaoTruong();
//
//            long id = port.taoTruongOperation(tentruong, dienthoai, gioithieu, loaihinh, datethanhlap, tentruong, website);
//            result = id;
//            System.out.println("ID : " + result);
//        }
//        catch (Exception ex){
//            System.out.println(ex);
//        }
//
//        return result;
//
//    }
//
//    public String getDiachi() {
//        return diachi;
//    }
//
//    public void setDiachi(String diachi) {
//        this.diachi = diachi;
//    }
//
//    public String getDienthoai() {
//        return dienthoai;
//    }
//
//    public void setDienthoai(String dienthoai) {
//        this.dienthoai = dienthoai;
//    }
//
//    public String getGioithieu() {
//        return gioithieu;
//    }
//
//    public void setGioithieu(String gioithieu) {
//        this.gioithieu = gioithieu;
//    }
//
//    public String getLoaihinh() {
//        return loaihinh;
//    }
//
//    public void setLoaihinh(String loaihinh) {
//        this.loaihinh = loaihinh;
//    }
//
//    public String getNamthanhlap() {
//        return namthanhlap;
//    }
//
//    public void setNamthanhlap(String namthanhlap) {
//        this.namthanhlap = namthanhlap;
//    }
//
//    public String getNgaythanhlap() {
//        return ngaythanhlap;
//    }
//
//    public void setNgaythanhlap(String ngaythanhlap) {
//        this.ngaythanhlap = ngaythanhlap;
//    }
//
//    public String getTentruong() {
//        return tentruong;
//    }
//
//    public void setTentruong(String tentruong) {
//        this.tentruong = tentruong;
//    }
//
//    public String getThangthanhlap() {
//        return thangthanhlap;
//    }
//
//    public void setThangthanhlap(String thangthanhlap) {
//        this.thangthanhlap = thangthanhlap;
//    }
//
//    public String getWebsite() {
//        return website;
//    }
//
//    public void setWebsite(String website) {
//        this.website = website;
//    }
//
//}
