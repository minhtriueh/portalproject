/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythongtinkhoitao;

import javax.xml.datatype.XMLGregorianCalendar;
import utils.MyGregorianCalendar;

/**
 *
 * @author hunfan
 */
public class TaoCoSo_Result {

    String diachicoso;
    String dienthoaicoso;
    String gioithieucoso;
    String ngaythanhlap, thangthanhlap, namthanhlap;
    String tencoso;
    String websitecoso;
    String id_truong;

    public String execute() throws Exception {
        Long idTruong = new Long(id_truong);

        int ngay = Integer.parseInt(ngaythanhlap);
        int thang = Integer.parseInt(thangthanhlap);
        int nam = Integer.parseInt(namthanhlap);

        XMLGregorianCalendar datethanhlap = new MyGregorianCalendar(nam, thang, ngay).getMyXMLGregorianCalendar();

        long id = callService(diachicoso, dienthoaicoso, gioithieucoso, datethanhlap, tencoso, websitecoso, idTruong);

        if (id != -1) {
            return "success";
        }
        return "error";
    }

    private long callService(String diachicoso,
            String dienthoaicoso,
            String gioithieucoso,
            javax.xml.datatype.XMLGregorianCalendar ngaythanhlapcoso,
            String tencoso,
            String websitecoso,
            long id_truong) {
        long resultID = -1;

        try {

            qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService12 serv = new qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService12();
            qlthongtinkhoitaocomapp.TaoCoSoPortType port = serv.getTaoCoSo();

            long result = port.taoCoSoOperation(diachicoso, dienthoaicoso, gioithieucoso, ngaythanhlapcoso, tencoso, websitecoso, id_truong);
            resultID = result;
            System.out.println("Result ID : " + resultID);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return resultID;

    }

    public String getDiachicoso() {
        return diachicoso;
    }

    public void setDiachicoso(String diachicoso) {
        this.diachicoso = diachicoso;
    }

    public String getDienthoaicoso() {
        return dienthoaicoso;
    }

    public void setDienthoaicoso(String dienthoaicoso) {
        this.dienthoaicoso = dienthoaicoso;
    }

    public String getGioithieucoso() {
        return gioithieucoso;
    }

    public void setGioithieucoso(String gioithieucoso) {
        this.gioithieucoso = gioithieucoso;
    }

    public String getId_truong() {
        return id_truong;
    }

    public void setId_truong(String id_truong) {
        this.id_truong = id_truong;
    }

    public String getNamthanhlap() {
        return namthanhlap;
    }

    public void setNamthanhlap(String namthanhlap) {
        this.namthanhlap = namthanhlap;
    }

    public String getNgaythanhlap() {
        return ngaythanhlap;
    }

    public void setNgaythanhlap(String ngaythanhlap) {
        this.ngaythanhlap = ngaythanhlap;
    }

    public String getTencoso() {
        return tencoso;
    }

    public void setTencoso(String tencoso) {
        this.tencoso = tencoso;
    }

    public String getThangthanhlap() {
        return thangthanhlap;
    }

    public void setThangthanhlap(String thangthanhlap) {
        this.thangthanhlap = thangthanhlap;
    }

    public String getWebsitecoso() {
        return websitecoso;
    }

    public void setWebsitecoso(String websitecoso) {
        this.websitecoso = websitecoso;
    }


}
