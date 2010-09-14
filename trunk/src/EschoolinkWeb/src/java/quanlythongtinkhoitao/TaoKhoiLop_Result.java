/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlythongtinkhoitao;

/**
 *
 * @author hunfan
 */
public class TaoKhoiLop_Result {

    String tenkhoi;
    String id_coso;


    public String execute() throws Exception {
        Long idCoSo = new Long(id_coso);

        long id = callService(tenkhoi, idCoSo);
        if (id != -1) {
            return "success";
        }
        return "error";
    }

    private long callService(String tenkhoi, long idCoSo) {
        long resultID = -1;

        try {

            qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService7 serv = new qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService7();
            qlthongtinkhoitaocomapp.TaoKhoiLopPortType port = serv.getTaoKhoiLop();

            
            long result = port.taoKhoiLopOperation(tenkhoi, idCoSo);
            resultID = result;
            System.out.println("Result ID : " + resultID);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return resultID;

    }

    public String getId_coso() {
        return id_coso;
    }

    public void setId_coso(String id_coso) {
        this.id_coso = id_coso;
    }

    public String getTenkhoi() {
        return tenkhoi;
    }

    public void setTenkhoi(String tenkhoi) {
        this.tenkhoi = tenkhoi;
    }

    
}
