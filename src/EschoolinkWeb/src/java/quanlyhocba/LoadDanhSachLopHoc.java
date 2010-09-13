/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlyhocba;

import java.util.List;
import org.netbeans.xml.schema.qlhb_eschoolinkobject.Lop;

/**
 *
 * @author bon
 */
public class LoadDanhSachLopHoc {
        private String id_khoilop;
        private String id_namhoc;
        private List<Lop> dslop;
    public String execute()throws Exception{
        callLopHocService();
        return "success";
    }
    public void callLopHocService(){


        try { // Call Web Service Operation
            qlhocbacomapp.QLHocBaComAppService13 service = new qlhocbacomapp.QLHocBaComAppService13();
            qlhocbacomapp.LoadLopTheoKhoiLopVaNamHocPortType port = service.getLoadLopTheoKhoivaNam();
            // TODO initialize WS operation arguments here
            long idNamhoc = new Long(id_namhoc);
            long idKhoilop = new Long(id_khoilop);
            // TODO process result here
            org.netbeans.xml.schema.mine.DanhSachLop result = port.loadLopTheoKhoiLopVaNamHocOperation(idNamhoc, idKhoilop);
           this.dslop=result.getLop();
            System.out.println("Result = "+result);
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

    public String getId_khoilop() {
        return id_khoilop;
    }

    public void setId_khoilop(String id_khoilop) {
        this.id_khoilop = id_khoilop;
    }

    public String getId_namhoc() {
        return id_namhoc;
    }

    public void setId_namhoc(String id_namhoc) {
        this.id_namhoc = id_namhoc;
    }

}
