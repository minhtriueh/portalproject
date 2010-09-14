/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythongtinkhoitao;


/**
 *
 * @author GIN
 */
public class TaoNhom_Result {

    String tennhom;
    String mota;

    public String execute() throws Exception {
        long id = callService(tennhom, mota);
        if(id != -1)
            return "success";
        return "error";
    }

    private long callService(String tennhom, String mota) {
        long resultID = -1;
        try {

            qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService3 serv = new qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService3();
            qlthongtinkhoitaocomapp.TaoNhomPortType port = serv.getTaoNhom();
            
            long result = port.taoNhomOperation(tennhom, mota);
            resultID = result;
            System.out.println("Result ID : " + resultID);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return resultID;

    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getTennhom() {
        return tennhom;
    }

    public void setTennhom(String tennhom) {
        this.tennhom = tennhom;
    }


}
