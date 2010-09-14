
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythongtinkhoitao;

import java.util.List;
import org.netbeans.xml.schema.eschoolinkobject.ToBoMon;

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

        //load To bo mon
        try { 

            qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService15 serv = new qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService15();
            qlthongtinkhoitaocomapp.LoadToBoMonPortType port = serv.getLoadToBoMon();
            org.netbeans.xml.schema.eschoolinkobject.DanhSachToBoMon rs = port.loadToBoMonOperation();
            this.dstobomon = rs.getToBoMon();

            System.out.println(rs);

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
