/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythongtinkhoitao;



/**
 *
 * @author GIN
 */
public class TaoQuyen_Result {

    String tenquyen;
    String mota;

    public String execute() throws Exception {
        long id = callService(tenquyen, mota);
        if(id != -1)
            return "success";
        return "error";
    }

    private long callService(String tenquyen, String mota) {
        long resultID = -1;
        try {

            qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService2 serv = new qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService2();
            qlthongtinkhoitaocomapp.TaoQuyenPortType port = serv.getTaoQuyen();


            long result = port.taoQuyenOperation(mota, tenquyen);
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

    public String getTenquyen() {
        return tenquyen;
    }

    public void setTenquyen(String tenquyen) {
        this.tenquyen = tenquyen;
    }


}
