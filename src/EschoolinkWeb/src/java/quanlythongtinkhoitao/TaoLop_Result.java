/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythongtinkhoitao;

/**
 *
 * @author hunfan
 */
public class TaoLop_Result {

    String tenlop;
    String sisolop;
    String id_namhoc;
    String id_thoikhoabieu;
    String id_giaovienchunhiem;
    String id_khoilop;

    public String execute() throws Exception {
        Integer siso = new Integer(sisolop);
        Long idNamHoc = new Long(id_namhoc);
        Long idTKB = new Long(id_thoikhoabieu);
        Long idGVCN = new Long(id_giaovienchunhiem);
        Long idKhoiLop = new Long(id_khoilop);

        long id = callService(tenlop,siso, idNamHoc,idTKB,idGVCN,idKhoiLop);
        if (id != -1) {
            return "success";
        }
        return "error";
    }

    private long callService(String tenlop,int sisolop,long id_namhoc,long id_thoikhoabieu,long id_giaovienchunhiem,long id_khoilop) {
        long resultID = -1;

        try {

            qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService6 serv = new qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService6();
            qlthongtinkhoitaocomapp.TaoLopPortType port = serv.getTaoLop();

            long result = port.taoLopOperation(sisolop,tenlop, id_namhoc, id_thoikhoabieu, id_giaovienchunhiem, id_khoilop);
            resultID = result;
            System.out.println("Result ID : " + resultID);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return resultID;

    }

    public String getId_giaovienchunhiem() {
        return id_giaovienchunhiem;
    }

    public void setId_giaovienchunhiem(String id_giaovienchunhiem) {
        this.id_giaovienchunhiem = id_giaovienchunhiem;
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

    public String getId_thoikhoabieu() {
        return id_thoikhoabieu;
    }

    public void setId_thoikhoabieu(String id_thoikhoabieu) {
        this.id_thoikhoabieu = id_thoikhoabieu;
    }

    public String getSisolop() {
        return sisolop;
    }

    public void setSisolop(String sisolop) {
        this.sisolop = sisolop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }


}
