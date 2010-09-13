/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thongtincanhan;

import org.netbeans.xml.schema.qlgv_eschoolinkobject.GiaoVien;

/**
 *
 * @author bon
 */
public class ThongTinGiaoVien {
    private GiaoVien gv;
    private String idgv="1";
    public String execute()throws Exception{
       callgetGVService(new Long(idgv));
        return "success";
        
    }
    public void callgetGVService(long idGV){

        try { // Call Web Service Operation
            qlgiaoviencomapp.QLGiaoVienComAppService1 service = new qlgiaoviencomapp.QLGiaoVienComAppService1();
            qlgiaoviencomapp.TracuuGVPortType port = service.getTracuuGVbyID();
            // TODO initialize WS operation arguments here

            // TODO process result here
            org.netbeans.xml.schema.qlgv_eschoolinkobject.GiaoVien result = port.tracuuGVOperation(idGV);
            this.gv=result;
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }

    public GiaoVien getGv() {
        return gv;
    }

    public void setGv(GiaoVien gv) {
        this.gv = gv;
    }

    public String getIdgv() {
        return idgv;
    }

    public void setIdgv(String idgv) {
        this.idgv = idgv;
    }
}
