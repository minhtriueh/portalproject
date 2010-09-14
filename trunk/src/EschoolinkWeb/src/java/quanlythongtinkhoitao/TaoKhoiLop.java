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
public class TaoKhoiLop {

    List<CoSo> dscoso;

    public String execute() throws Exception {
        load();
        return "success";
    }

    
    private void load() {

        //load co so
        try {

            qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService16 serv = new qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService16();
            qlthongtinkhoitaocomapp.LoadCoSoPortType port = serv.getLoadCoSo();
            org.netbeans.xml.schema.eschoolinkobject.DanhSachCoSo rs = port.loadCoSoOperation();
            this.dscoso = rs.getCoSo();

            System.out.println(rs);

        } catch (Exception ex) {
            System.out.println(ex);
        }


    }

    public List<CoSo> getDscoso() {
        return dscoso;
    }

    public void setDscoso(List<CoSo> dscoso) {
        this.dscoso = dscoso;
    }
}
