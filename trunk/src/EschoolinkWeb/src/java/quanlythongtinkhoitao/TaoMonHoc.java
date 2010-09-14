
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythongtinkhoitao;

import java.util.List;
import org.netbeans.xml.schema.qlgv_eschoolinkobject.ToBoMon;

/**
 *
 * @author hunfan
 */
public class TaoMonHoc {

    List<ToBoMon> dstobomon;

    public String execute() throws Exception {
        loadToBoMon();
        return "success";
    }

    public List<ToBoMon> getDstobomon() {
        return dstobomon;
    }

    public void setDstobomon(List<ToBoMon> dstobomon) {
        this.dstobomon = dstobomon;
    }


    

    private void loadToBoMon() {
        try { // Call Web Service Operation

            qlgiaoviencomapp.QLGiaoVienComAppService8 service = new qlgiaoviencomapp.QLGiaoVienComAppService8();
            qlgiaoviencomapp.LoadToBoMonPortType port = service.getLoadToBoMon();
            // TODO process result here
            org.netbeans.xml.schema.minexsd.DanhSachToBoMon result = port.loadToBoMonOperation();
            this.dstobomon = result.getToBoMon();

            System.out.println("Result = " + result);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
