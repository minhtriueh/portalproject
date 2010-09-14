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
public class TaoLop {

    List<NamHoc> dsnamhoc;
    List<ThoiKhoaBieu> dsthoikhoabieu;
    List<GiaoVienChuNhiem> dsgvcn;
    List<KhoiLop> dskhoilop;

    public String execute() throws Exception {
        load();
        return "success";
    }

    private void load() {


        // load nam hoc
        try {
            qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService18 serv = new qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService18();
            qlthongtinkhoitaocomapp.LoadNamHocPortType port = serv.getLoadNamHoc();
            org.netbeans.xml.schema.eschoolinkobject.DanhSachNamHoc rs = port.loadNamHocOperation();
            this.dsnamhoc = rs.getNamHoc();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        // load tkb
        try {
            qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService19 serv = new qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService19();
            qlthongtinkhoitaocomapp.LoadThoiKhoaBieuPortType port = serv.getLoadThoiKhoaBieu();
            org.netbeans.xml.schema.eschoolinkobject.DanhSachThoiKhoaBieu rs = port.loadThoiKhoaBieuOperation();
            this.dsthoikhoabieu = rs.getThoiKhoaBieu();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        // load gvcn
        try {
            qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService17 serv = new qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService17();
            qlthongtinkhoitaocomapp.LoadGVCNPortType port = serv.getLoadGVCN();
            org.netbeans.xml.schema.eschoolinkobject.DanhSachGVCN rs = port.loadGVCNOperation();
            this.dsgvcn = rs.getGiaoVienChuNhiem();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        // load khoi lop
        try {
            qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService14 serv = new qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService14();
            qlthongtinkhoitaocomapp.LoadKhoiLopPortType port = serv.getLoadKhoiLop();
            org.netbeans.xml.schema.eschoolinkobject.DanhSachKhoiLop rs = port.loadKhoiLopOperation();
            this.dskhoilop = rs.getKhoiLop();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
