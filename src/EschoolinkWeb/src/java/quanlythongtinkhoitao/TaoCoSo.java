/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythongtinkhoitao;

import java.util.List;
import org.netbeans.xml.schema.eschoolinkobject.*;

/**
 *
 * @author hunfan
 */
public class TaoCoSo {

    List<Truong> dstruong;

    public String execute() throws Exception {
        loadtruong();
        return "success";
    }

    private void loadtruong() {

        //load truong
        try {

            qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService20 serv = new qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService20();
            qlthongtinkhoitaocomapp.LoadTruongPortType port = serv.getLoadTruong();
            org.netbeans.xml.schema.eschoolinkobject.DanhSachTruong rs = port.loadTruongOperation();
            this.dstruong = rs.getTruong();

            System.out.println(rs);

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public List<Truong> getDstruong() {
        return dstruong;
    }

    public void setDstruong(List<Truong> dstruong) {
        this.dstruong = dstruong;
    }
}
