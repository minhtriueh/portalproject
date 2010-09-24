/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author nguyentanmo
 */
@Entity
@Table(name = "HIEUTRUONG")
@PrimaryKeyJoinColumn(name = "ID_HIEUTRUONG")
public class HieuTruong extends GiaoVien implements Serializable {

    public HieuTruong() {
    }

    public HieuTruong(String tenGiaoVien, Date ngaySinh, String gioiTinh, String cmnd, Date ngayCap, String noiCap, String tonGiao, String queQuan, String choOHienTai, String email, String soDienThoai, String hinhAnh, String chucVu, String trinhDoVanHoa, String trinhDoDaoTao, String tinhTrangSucKhoe, Date ngayVaoTruong, boolean ketNapDoan, Date ngayVaoDoan, boolean ketNapDang, Date ngayVaoDang) {
        super(tenGiaoVien, ngaySinh, gioiTinh, cmnd, ngayCap, noiCap, tonGiao, queQuan, choOHienTai, email, soDienThoai, hinhAnh, chucVu, trinhDoVanHoa, trinhDoDaoTao, tinhTrangSucKhoe, ngayVaoTruong, ketNapDoan, ngayVaoDoan, ketNapDang, ngayVaoDang);

    }
}
