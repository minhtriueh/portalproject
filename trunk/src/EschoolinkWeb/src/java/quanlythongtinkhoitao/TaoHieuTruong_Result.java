/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlythongtinkhoitao;

/**
 *
 * @author hunfan
 */
public class TaoHieuTruong_Result {
 String id_truong;

    public String execute() throws Exception {
        Long idTruong = new Long(id_truong);

        long id = callService(idTruong);
        if (id != -1) {
            return "success";
        }
        return "error";
    }

    private long callService(long id_truong) {
        long resultID = -1;

        try {

            qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService9 serv = new qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService9();
            qlthongtinkhoitaocomapp.TaoHieuTruongPortType port = serv.getTaoHieuTruong();

            long result = port.taoHieuTruongOperation(id_truong);
            resultID = result;
            System.out.println("Result ID : " + resultID);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return resultID;

    }

    public String getId_truong() {
        return id_truong;
    }

    public void setId_truong(String id_truong) {
        this.id_truong = id_truong;
    }
    
}
