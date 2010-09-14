/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythongtinkhoitao;

/**
 *
 * @author hunfan
 */
public class TaoHanhKiem_Result {

    String tenhanhkiem;
    String ghichu;

    public String execute() throws Exception {

        long id = callService(tenhanhkiem, ghichu);
        if (id != -1) {
            return "success";
        }
        return "error";
    }

    private long callService(String tenhanhkiem, String ghichu) {
        long resultID = -1;

        try {

            qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService10 serv = new qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService10();
            qlthongtinkhoitaocomapp.TaoHanhKiemPortType port = serv.getTaoHanhKiem();

            long result = port.taoHanhKiemOperation(tenhanhkiem, ghichu);
            resultID = result;
            System.out.println("Result ID : " + resultID);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return resultID;

    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getTenhanhkiem() {
        return tenhanhkiem;
    }

    public void setTenhanhkiem(String tenhanhkiem) {
        this.tenhanhkiem = tenhanhkiem;
    }

    
}
