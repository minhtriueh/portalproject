/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author nguyentanmo
 */
@Entity
@Table(name = "GIAOVIENCHUNHIEM")
@PrimaryKeyJoinColumn(name = "ID_GIAOVIENCHUNHIEM")
public class GiaoVienChuNhiem extends GiaoVien implements Serializable {

    SoDiemChuNhiem soDiemChuNhiem;

    public GiaoVienChuNhiem() {
    }

    public GiaoVienChuNhiem(String tenGiaoVien, Date ngaySinh, String gioiTinh, String cmnd, Date ngayCap, String noiCap, String tonGiao, String queQuan, String choOHienTai, String email, String soDienThoai, String hinhAnh, String chucVu, String trinhDoVanHoa, String trinhDoDaoTao, String tinhTrangSucKhoe, Date ngayVaoTruong, boolean ketNapDoan, Date ngayVaoDoan, boolean ketNapDang, Date ngayVaoDang) {
        super(tenGiaoVien, ngaySinh, gioiTinh, cmnd, ngayCap, noiCap, tonGiao, queQuan, choOHienTai, email, soDienThoai, hinhAnh, chucVu, trinhDoVanHoa, trinhDoDaoTao, tinhTrangSucKhoe, ngayVaoTruong, ketNapDoan, ngayVaoDoan, ketNapDang, ngayVaoDang);
    }

    //quanhe so diem chu nhiem voi giao vien chu nhiem
    @OneToOne
    @JoinColumn(name = "ID_SODIEMCHUNHIEM")
    public SoDiemChuNhiem getSoDiemChuNhiem() {
        return soDiemChuNhiem;
    }

    public void setSoDiemChuNhiem(SoDiemChuNhiem soDiemChuNhiem) {
        this.soDiemChuNhiem = soDiemChuNhiem;
    }
}
