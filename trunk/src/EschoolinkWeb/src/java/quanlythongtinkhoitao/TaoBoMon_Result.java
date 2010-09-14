/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythongtinkhoitao;

/**
 *
 * @author hunfan
 */
public class TaoBoMon_Result {

    String tenbomon;
    String id_coso;

    public String execute() throws Exception {
        Long idCoSo = new Long(id_coso);

        long id = callService(tenbomon, idCoSo);
        if (id != -1) {
            return "success";
        }
        return "error";
    }

    private long callService(String tenbomon, long idCoSo) {
        long resultID = -1;

        try {

            qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService13 serv = new qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService13();
            qlthongtinkhoitaocomapp.TaoBoMonPortType port = serv.getTaoBoMon();

            long result = port.taoBoMonOperation(tenbomon, idCoSo);
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

    public String getTenbomon() {
        return tenbomon;
    }

    public void setTenbomon(String tenbomon) {
        this.tenbomon = tenbomon;
    }

    
}
