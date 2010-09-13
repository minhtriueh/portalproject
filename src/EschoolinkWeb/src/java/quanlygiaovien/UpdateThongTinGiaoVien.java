/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlygiaovien;

import com.opensymphony.xwork2.ActionContext;
import java.util.Map;
import org.netbeans.xml.schema.qlgv_eschoolinkobject.GiaoVien;

/**
 *
 * @author bon
 */
public class UpdateThongTinGiaoVien {

    private String date;
    private String hoten;
    private String cmnd;
    private String diachi;
    private String quequan;
    private String ngaysinh;
    private String sodienthoai;
    private String Email;
    private String trinhdo;
    private String tongiao;
    private String chucvu;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getTongiao() {
        return tongiao;
    }

    public void setTongiao(String tongiao) {
        this.tongiao = tongiao;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    public String execute() throws Exception {
        Map sessions = ActionContext.getContext().getSession();
        GiaoVien gv = (GiaoVien) sessions.get("giaovien");
        gv.setTenGiaoVien(getHoten());
        gv.setCmnd(getCmnd());
        gv.setChoOHienTai(getDiachi());
        gv.setQueQuan(getQuequan());
        gv.setSoDienThoai(getSodienthoai());
        gv.setTrinhDoVanHoa(getTrinhdo());
        gv.setTonGiao(getTongiao());
        gv.setChucVu(getChucvu());
        gv.setEmail(getEmail());
        callService(gv);
        return "success";

    }

    public void callService(GiaoVien gv) {

        try { // Call Web Service Operation
            qlgiaoviencomapp.QLGiaoVienComAppService4 service = new qlgiaoviencomapp.QLGiaoVienComAppService4();
            qlgiaoviencomapp.SuaGVPortType port = service.getSuaGV();
            // TODO initialize WS operation arguments here

            // TODO process result here
            long result = port.suaGVOperation(gv.getId(), gv.getChoOHienTai(), gv.getChucVu(), gv.getCmnd(), gv.getEmail(), gv.getGioiTinh(), gv.getHinhAnh(), true, true, gv.getNgayCap(), gv.getNgaySinh(), gv.getNgayVaoDang(), gv.getNgayVaoDoan(), gv.getNgaySinh(), gv.getNoiCap(), gv.getQueQuan(), gv.getSoDienThoai(), gv.getTenGiaoVien(), gv.getTinhTrangSucKhoe(), gv.getTonGiao(), gv.getTrinhDoVanHoa(), gv.getTrinhDoVanHoa(), gv.getNguoiDung().getId(), gv.getDanToc().getId(),1);
            System.out.println("Result = " + result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }
}
