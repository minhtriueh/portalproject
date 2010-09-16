/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlythoikhoabieu;

import java.math.BigInteger;
import org.netbeans.xml.schema.minexsd.DanhSachLopHoc;
import org.netbeans.xml.schema.qlgv_eschoolinkobject.Lop;
import java.util.List;
/**
 *
 * @author GIN
 */
public class XemThoiKhoaBieu {
  
   List<Lop> dslop;

    public String execute() throws Exception {
        load();
        return "success";
    }

    private void load() {

        //load lop


        try { // Call Web Service Operation
            qlgiaoviencomapp.QLGiaoVienComAppService5 service = new qlgiaoviencomapp.QLGiaoVienComAppService5();
            qlgiaoviencomapp.GetLopTrongNMPortType port = service.getGetLopTrongNM();
            // TODO initialize WS operation arguments here
            java.math.BigInteger namsau =BigInteger.valueOf(2010);
            java.math.BigInteger namtruoc =BigInteger.valueOf(2009);
            // TODO process result here
            DanhSachLopHoc result = port.getLopTrongNMOperation(namsau, namtruoc);
            this.dslop = result.getLop();
            System.out.println("ResultFFFF = " + result);
        } catch (Exception ex) {
             System.out.println(ex);
            }

        


    }

    
    public List<Lop> getDslop() {
        return dslop;
    }

    public void setDslop(List<Lop> dslop) {
        this.dslop = dslop;
    }

}
