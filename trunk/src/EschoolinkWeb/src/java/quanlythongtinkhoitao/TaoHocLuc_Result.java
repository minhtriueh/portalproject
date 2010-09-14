/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythongtinkhoitao;

/**
 *
 * @author hunfan
 */
public class TaoHocLuc_Result {

    String diemcanduoi;
    String diemcantren;
    String ghichu;
    String khongcomonduoi;
    String tenhocluc;

    public String execute() throws Exception {
        Double canduoi = new Double(diemcanduoi);
        Double cantren = new Double(diemcantren);
        Double monduoi = new Double(khongcomonduoi);

        long id = callService(tenhocluc, canduoi,cantren,monduoi,ghichu);
        if (id != -1) {
            return "success";
        }
        return "error";
    }

    private long callService(String tenhocluc,double diemcanduoi,double  diemcantren,double khongcomonduoi,String ghichu) {
        long resultID = -1;

        try {

            qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService8 serv = new qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService8();
            qlthongtinkhoitaocomapp.TaoHocLucPortType port = serv.getTaoHocLuc();

            long result = port.taoHocLucOperation(diemcantren, diemcanduoi, ghichu, khongcomonduoi, tenhocluc);
            resultID = result;
            System.out.println("Result ID : " + resultID);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return resultID;

    }

    public String getDiemcanduoi() {
        return diemcanduoi;
    }

    public void setDiemcanduoi(String diemcanduoi) {
        this.diemcanduoi = diemcanduoi;
    }

    public String getDiemcantren() {
        return diemcantren;
    }

    public void setDiemcantren(String diemcantren) {
        this.diemcantren = diemcantren;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getKhongcomonduoi() {
        return khongcomonduoi;
    }

    public void setKhongcomonduoi(String khongcomonduoi) {
        this.khongcomonduoi = khongcomonduoi;
    }

    public String getTenhocluc() {
        return tenhocluc;
    }

    public void setTenhocluc(String tenhocluc) {
        this.tenhocluc = tenhocluc;
    }

    
}
