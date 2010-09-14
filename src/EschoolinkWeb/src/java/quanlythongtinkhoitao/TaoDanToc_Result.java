/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlythongtinkhoitao;

/**
 *
 * @author hunfan
 */
public class TaoDanToc_Result {

    String dantocthieuso;
    String tendantoc;

    public String execute() throws Exception {

        Boolean thieuso = new Boolean(dantocthieuso);

        long id = callService(tendantoc, thieuso);
        if (id != -1) {
            return "success";
        }
        return "error";
    }

    private long callService(String tendantoc, boolean dantocthieuso) {
        long resultID = -1;

        try {

            qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService11 serv = new qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService11();
            qlthongtinkhoitaocomapp.TaoDanTocPortType port = serv.getTaoDanToc();

            long result = port.taoDanTocOperation(tendantoc, dantocthieuso);
            resultID = result;
            System.out.println("Result ID : " + resultID);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return resultID;

    }

    public String getDantocthieuso() {
        return dantocthieuso;
    }

    public void setDantocthieuso(String dantocthieuso) {
        this.dantocthieuso = dantocthieuso;
    }

    public String getTendantoc() {
        return tendantoc;
    }

    public void setTendantoc(String tendantoc) {
        this.tendantoc = tendantoc;
    }

    
}
