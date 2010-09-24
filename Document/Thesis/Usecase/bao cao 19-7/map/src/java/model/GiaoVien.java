/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author nguyentanmo
 */
@Entity
@Table(name = "GIAOVIEN")
@Inheritance(strategy = InheritanceType.JOINED)
public class GiaoVien implements Serializable {

    long id;
    String tenGiaoVien;
    Date ngaySinh;
    String gioiTinh;
    String cmnd;
    Date ngayCap;
    String noiCap;
    String tonGiao;
    String queQuan;
    String choOHienTai;
    String email;
    String soDienThoai;
    String hinhAnh;
    String chucVu;
    String trinhDoVanHoa;
    String trinhDoDaoTao;
    String tinhTrangSucKhoe;
    Date ngayVaoTruong;
    boolean ketNapDoan;
    Date ngayVaoDoan;
    boolean ketNapDang;
    Date ngayVaoDang;
    DanToc danToc;
    Set<Lop> lops = new HashSet<Lop>();
    Set<MonHoc> monHocs = new HashSet<MonHoc>();
    NguoiDung nguoiDung;

    public GiaoVien() {
    }

    public GiaoVien(String tenGiaoVien, Date ngaySinh, String gioiTinh, String cmnd, Date ngayCap, String noiCap, String tonGiao, String queQuan, String choOHienTai, String email, String soDienThoai, String hinhAnh, String chucVu, String trinhDoVanHoa, String trinhDoDaoTao, String tinhTrangSucKhoe, Date ngayVaoTruong, boolean ketNapDoan, Date ngayVaoDoan, boolean ketNapDang, Date ngayVaoDang) {
        this.tenGiaoVien = tenGiaoVien;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.ngayCap = ngayCap;
        this.noiCap = noiCap;
        this.tonGiao = tonGiao;
        this.queQuan = queQuan;
        this.choOHienTai = choOHienTai;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.hinhAnh = hinhAnh;
        this.chucVu = chucVu;
        this.trinhDoVanHoa = trinhDoVanHoa;
        this.trinhDoDaoTao = trinhDoDaoTao;
        this.tinhTrangSucKhoe = tinhTrangSucKhoe;
        this.ngayVaoTruong = ngayVaoTruong;
        this.ketNapDoan = ketNapDoan;
        this.ngayVaoDoan = ngayVaoDoan;
        this.ketNapDang = ketNapDang;
        this.ngayVaoDang = ngayVaoDang;
    }

    @Id
    @Column(name = "ID_GIAOVIEN")
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getChoOHienTai() {
        return choOHienTai;
    }

    public void setChoOHienTai(String choOHienTai) {
        this.choOHienTai = choOHienTai;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public boolean isKetNapDang() {
        return ketNapDang;
    }

    public void setKetNapDang(boolean ketNapDang) {
        this.ketNapDang = ketNapDang;
    }

    public boolean isKetNapDoan() {
        return ketNapDoan;
    }

    public void setKetNapDoan(boolean ketNapDoan) {
        this.ketNapDoan = ketNapDoan;
    }

    @Temporal(TemporalType.DATE)
    public Date getNgayCap() {
        return ngayCap;
    }

    public void setNgayCap(Date ngayCap) {
        this.ngayCap = ngayCap;
    }

    @Temporal(TemporalType.DATE)
    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Temporal(TemporalType.DATE)
    public Date getNgayVaoDang() {
        return ngayVaoDang;
    }

    public void setNgayVaoDang(Date ngayVaoDang) {
        this.ngayVaoDang = ngayVaoDang;
    }

    @Temporal(TemporalType.DATE)
    public Date getNgayVaoDoan() {
        return ngayVaoDoan;
    }

    public void setNgayVaoDoan(Date ngayVaoDoan) {
        this.ngayVaoDoan = ngayVaoDoan;
    }

    @Temporal(TemporalType.DATE)
    public Date getNgayVaoTruong() {
        return ngayVaoTruong;
    }

    public void setNgayVaoTruong(Date ngayVaoTruong) {
        this.ngayVaoTruong = ngayVaoTruong;
    }

    public String getNoiCap() {
        return noiCap;
    }

    public void setNoiCap(String noiCap) {
        this.noiCap = noiCap;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getTenGiaoVien() {
        return tenGiaoVien;
    }

    public void setTenGiaoVien(String tenGiaoVien) {
        this.tenGiaoVien = tenGiaoVien;
    }

    public String getTinhTrangSucKhoe() {
        return tinhTrangSucKhoe;
    }

    public void setTinhTrangSucKhoe(String tinhTrangSucKhoe) {
        this.tinhTrangSucKhoe = tinhTrangSucKhoe;
    }

    public String getTonGiao() {
        return tonGiao;
    }

    public void setTonGiao(String tonGiao) {
        this.tonGiao = tonGiao;
    }

    public String getTrinhDoDaoTao() {
        return trinhDoDaoTao;
    }

    public void setTrinhDoDaoTao(String trinhDoDaoTao) {
        this.trinhDoDaoTao = trinhDoDaoTao;
    }

    public String getTrinhDoVanHoa() {
        return trinhDoVanHoa;
    }

    public void setTrinhDoVanHoa(String trinhDoVanHoa) {
        this.trinhDoVanHoa = trinhDoVanHoa;
    }

    //quanhe giao vien voi dan toc
    @OneToOne
    @JoinColumn(name="ID_DANTOC")
    public DanToc getDanToc() {
        return danToc;
    }

    public void setDanToc(DanToc danToc) {
        this.danToc = danToc;
    }

    //quanhe giao vien day nhieu lop
    @ManyToMany
    public Set<Lop> getLops() {
        return lops;
    }

    public void setLops(Set<Lop> lops) {
        this.lops = lops;
    }

    //quanhe giao vien day nhieu mon
    @ManyToMany
    public Set<MonHoc> getMonHocs() {
        return monHocs;
    }

    public void setMonHocs(Set<MonHoc> monHocs) {
        this.monHocs = monHocs;
    }

    //quanhe giao vien voi nguoi dung
    @OneToOne
    @JoinColumn(name="ID_NGUOIDUNG")
    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

    //them mon hoc
    public void addMonHoc(MonHoc mh) {
        this.getMonHocs().add(mh);
        mh.getGiaoViens().add(this);
    }

    //them lop
    public void addLop(Lop lop) {
        this.getLops().add(lop);
        lop.getGiaoViens().add(this);
    }
}
