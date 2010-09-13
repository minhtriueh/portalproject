/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlygiaovien;
import java.util.List;
import org.netbeans.xml.schema.qlgv_eschoolinkobject.Lop;
/**
 *
 * @author bon
 */
public class LayDanhSachLop {
private long id_giaovien;
            private String tenkhoilop;
            private List<Lop> danhsachlop;
            private long id_lop;


    public String execute()throws Exception{
        danhsachlop=callgetListLopTheoKhoi(tenkhoilop);

        return "success";
    }
    public List<Lop> callgetListLopTheoKhoi(String tenkhoi){
        List<Lop> dslop=null;

        try { // Call Web Service Operation
            qlgiaoviencomapp.QLGiaoVienComAppService7 service = new qlgiaoviencomapp.QLGiaoVienComAppService7();
            qlgiaoviencomapp.GetLopbyTheoKhoiPortType port = service.getGetLopTheoKhoi();
            // TODO initialize WS operation arguments here
            // TODO process result here
            org.netbeans.xml.schema.minexsd.DanhSachLopHoc result = port.getLopbyTheoKhoiOperation(tenkhoi);
            dslop=result.getLop();
            System.out.println("Result = "+result);

        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }


        return dslop;
    }
    public List<Lop> getDanhsachlop() {
        return danhsachlop;
    }

    public void setDanhsachlop(List<Lop> danhsachlop) {
        this.danhsachlop = danhsachlop;
    }

    public long getId_giaovien() {
        return id_giaovien;
    }

    public void setId_giaovien(long id_giaovien) {
        this.id_giaovien = id_giaovien;
    }

    public long getId_lop() {
        return id_lop;
    }

    public void setId_lop(long id_lop) {
        this.id_lop = id_lop;
    }

    public String getTenkhoilop() {
        return tenkhoilop;
    }

    public void setTenkhoilop(String tenkhoilop) {
        this.tenkhoilop = tenkhoilop;
    }
 public static void main(String[] arg){
        new LayDanhSachLop().callgetListLopTheoKhoi("11");

 }



}
