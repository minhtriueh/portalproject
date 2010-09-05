/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlygiaovien;

import java.util.List;
import org.netbeans.xml.schema.qlgv_eschoolinkobject.DanToc;
import org.netbeans.xml.schema.qlgv_eschoolinkobject.ToBoMon;

/**
 *
 * @author bon
 */
public class ThongTinBanDau {
    private List<DanToc> dsdantoc;
    private List<ToBoMon> dstobomon;

    public List<DanToc> getDsdantoc() {
        return dsdantoc;
    }

    public void setDsdantoc(List<DanToc> dsdantoc) {
        this.dsdantoc = dsdantoc;
    }

    public List<ToBoMon> getDstobomon() {
        return dstobomon;
    }

    public void setDstobomon(List<ToBoMon> dstobomon) {
        this.dstobomon = dstobomon;
    }

    

    public String execute()throws Exception{
        callLoadDanToc_ToBoMon();
        return "success";
    }

    public void callLoadDanToc_ToBoMon(){

        try { // Call Web Service Operation
            qlgiaoviencomapp.QLGiaoVienComAppService9 service = new qlgiaoviencomapp.QLGiaoVienComAppService9();
            qlgiaoviencomapp.LoadDanTocPortType port = service.getLoadDanToc();
            // TODO process result here
            org.netbeans.xml.schema.minexsd.DanhSachDanToc result = port.loadDanTocOperation();
            this.dsdantoc=result.getDanToc();
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        try { // Call Web Service Operation
            qlgiaoviencomapp.QLGiaoVienComAppService8 service = new qlgiaoviencomapp.QLGiaoVienComAppService8();
            qlgiaoviencomapp.LoadToBoMonPortType port = service.getLoadToBoMon();
            // TODO process result here
            org.netbeans.xml.schema.minexsd.DanhSachToBoMon result = port.loadToBoMonOperation();
           this.dstobomon=result.getToBoMon();
            System.out.println("Result = "+result);
        } catch (Exception ex) {
           System.out.println(ex);
        }
    }
        public static void main(String[] arg){
            new ThongTinBanDau().callLoadDanToc_ToBoMon();
        }
}
