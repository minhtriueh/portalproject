/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythongtinkhoitao;


/**
 *
 * @author hunfan
 */
public class TaoMonHoc_Result {

    String tenmonhoc;
    String id_tobomon;

    public String execute() throws Exception {
        Long idToBoMon = new Long(id_tobomon);
        
        long id = callService(tenmonhoc, idToBoMon);
        if (id != -1) {
            return "success";
        }
        return "error";
    }

    private long callService(String tenmonhoc, long idToBoMon) {
        long resultID = -1;

        try {

            qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService5 serv = new qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService5();
            qlthongtinkhoitaocomapp.TaoMonHocPortType port = serv.getTaoMonHoc();

            long result = port.taoMonHocOperation(tenmonhoc, idToBoMon);
            resultID = result;
            System.out.println("Result ID : " + resultID);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return resultID;

    }

    public String getId_tobomon() {
        return id_tobomon;
    }

    public void setId_tobomon(String id_tobomon) {
        this.id_tobomon = id_tobomon;
    }

    public String getTenmonhoc() {
        return tenmonhoc;
    }

    public void setTenmonhoc(String tenmonhoc) {
        this.tenmonhoc = tenmonhoc;
    }


}
