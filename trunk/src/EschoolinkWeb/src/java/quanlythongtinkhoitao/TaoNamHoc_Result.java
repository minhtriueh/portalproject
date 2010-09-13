/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythongtinkhoitao;

import java.math.BigInteger;

/**
 *
 * @author GIN
 */
public class TaoNamHoc_Result {

    String namtruoc;
    String namsau;

    public String execute() throws Exception {
        long id = callService(namtruoc, namsau);
        if(id != -1)
            return "success";
        return "error";
    }

    private long callService(String namtruoc, String namsau) {
        long resultID = -1;
        try {
            quanlythongtinkhoitaocomapp.QuanLyThongTinKhoiTaoComAppService2 serv = new quanlythongtinkhoitaocomapp.QuanLyThongTinKhoiTaoComAppService2();
            quanlythongtinkhoitaocomapp.TaoNamHocPortType port = serv.getTaoNamHoc();
            long result = port.taoNamHocOperation();
            resultID = result;
            System.out.println("Result ID : " + resultID);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return resultID;

    }
}
