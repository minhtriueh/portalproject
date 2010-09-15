/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythoikhoabieu;

import java.math.BigInteger;
import java.util.List;
import org.netbeans.xml.schema.loaidiem.MonHoc;
import org.netbeans.xml.schema.qlgv_eschoolinkobject.GiaoVien;
import org.netbeans.xml.schema.qlgv_eschoolinkobject.Lop;

/**
 *
 * @author GIN
 */
public class TaoThoiKhoaBieu {

    List<GiaoVien> dsgiaovien;
    List<MonHoc> dsmonhoc;
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
            org.netbeans.xml.schema.minexsd.DanhSachLopHoc result = port.getLopTrongNMOperation(namsau, namtruoc);
            this.dslop = result.getLop();
            System.out.println("ResultFFFF = " + result);
        } catch (Exception ex) {
             System.out.println(ex);
            }

        //load giao vien

        try { // Call Web Service Operation
            qlgiaoviencomapp.QLGiaoVienComAppService2 service = new qlgiaoviencomapp.QLGiaoVienComAppService2();
            qlgiaoviencomapp.SearchGVPortType port = service.getSearchGV();
            // TODO initialize WS operation arguments here
            java.lang.String tengiaovien = "";
            java.lang.String quequan = "";
            java.lang.String cmnd = "";
            java.lang.String chucvu = "";
            // TODO process result here
            org.netbeans.xml.schema.minexsd.DanhSachGiaoVien result = port.searchGVOperation(tengiaovien, quequan, cmnd, chucvu);
            this.dsgiaovien = result.getGiaoVien();
            System.out.println("Result = "+result);
        } catch (Exception ex) {
           System.out.println(ex);
        }

        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService46 service = new qldiemcomapp.QLDiemComAppService46();
            qldiemcomapp.LayDanhSachMonHocCuaLopPortType port = service.getLayDanhSachMonHocCuaLop();
            // TODO initialize WS operation arguments here
            long idLop = 1L;
            // TODO process result here
            org.netbeans.xml.schema.loaidiem.ListMonHoc result = port.layDanhSachMonHocCuaLopOperation(idLop);
            System.out.println("Result = "+result);
            this.dsmonhoc=result.getMonHoc();
        } catch (Exception ex) {
           System.out.println(ex);
        }

        
    }

    public List<GiaoVien> getDsgiaovien() {
        return dsgiaovien;
    }

    public void setDsgiaovien(List<GiaoVien> dsgiaovien) {
        this.dsgiaovien = dsgiaovien;
    }

    public List<Lop> getDslop() {
        return dslop;
    }

    public void setDslop(List<Lop> dslop) {
        this.dslop = dslop;
    }

    public List<MonHoc> getDsmonhoc() {
        return dsmonhoc;
    }

    public void setDsmonhoc(List<MonHoc> dsmonhoc) {
        this.dsmonhoc = dsmonhoc;
    }
}
