/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlygiaovien;

/**
 *
 * @author bon
 */
public class PhanLopChuNhiem {
    private String id_giaovien;
    private String id_lop;
    private boolean result;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
    public String execute()throws Exception{
       result= CallPhanLopService();
            return "success";
    }
    public boolean CallPhanLopService(){
        boolean result=false;

        try { // Call Web Service Operation
            qlgiaoviencomapp.QLGiaoVienComAppService6 service = new qlgiaoviencomapp.QLGiaoVienComAppService6();
            qlgiaoviencomapp.PhanLopChuNhiemPortType port = service.getPhanLopChuNhiem();
            // TODO initialize WS operation arguments here
            long idGiaovien = new Long(id_giaovien);
            long idLop = new Long(id_lop);
            // TODO process result here
            result = port.phanLopChuNhiemOperation(idGiaovien, idLop);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
                System.out.println(ex);
        }

        return result;

    }
    public String getId_giaovien() {
        return id_giaovien;
    }

    public void setId_giaovien(String id_giaovien) {
        this.id_giaovien = id_giaovien;
    }

    public String getId_lop() {
        return id_lop;
    }

    public void setId_lop(String id_lop) {
        this.id_lop = id_lop;
    }


}
