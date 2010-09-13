/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlyhocba;

import java.util.List;
import org.netbeans.xml.schema.qlhb_eschoolinkobject.NamHoc;

/**
 *
 * @author bon
 */
public class KhoiTaoTrangChinhSuaHocBa {
    private List<NamHoc> dsnamhoc;
    public String execute()throws Exception{
        callgetNamHocservice();
        return "success";
    }
public void callgetNamHocservice(){

    try { // Call Web Service Operation
        qlhocbacomapp.QLHocBaComAppService12 service = new qlhocbacomapp.QLHocBaComAppService12();
        qlhocbacomapp.LoadNamHocPortType port = service.getLoadNamHoc();
        // TODO process result here
        org.netbeans.xml.schema.mine.DanhSachNamHoc result = port.loadNamHocOperation();
        this.dsnamhoc=result.getNamHoc();
        System.out.println("Result = "+result);
    } catch (Exception ex) {
        // TODO handle custom exceptions here
    }

}

    public List<NamHoc> getDsnamhoc() {
        return dsnamhoc;
    }

    public void setDsnamhoc(List<NamHoc> dsnamhoc) {
        this.dsnamhoc = dsnamhoc;
    }


}
