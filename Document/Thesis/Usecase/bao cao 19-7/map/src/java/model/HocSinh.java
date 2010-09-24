/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author nguyentanmo
 */
@Entity
@Table(name = "HOCSINH")
public class HocSinh implements Serializable {

    long id;
    String tenHocSinh;
    Date ngaySinh;
    String gioiTinh;
    String soNha;
    String tonGiao;
    String hinhAnh;
    boolean ketNapDoi;
    Date ngayVaoDoi;
    boolean ketNapDoan;
    Date ngayVaoDoan;
    String ghiChu;
    boolean biXoaHayChua;
    DanToc danToc;
    HocBa hocBa;
    LoaiHocSinh loaiHocSinh;
    CheDoUuTien cheDoUuTien;
    ThanhPhanGiaDinh thanhPhanGiaDinh;
    NguoiDung nguoiDung;

    public HocSinh() {
    }

    public HocSinh(String tenHocSinh, Date ngaySinh, String gioiTinh, String soNha, String tonGiao, String hinhAnh, boolean ketNapDoi, Date ngayVaoDoi, boolean ketNapDoan, Date ngayVaoDoan, String ghiChu, boolean biXoaHayChua) {
        this.tenHocSinh = tenHocSinh;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soNha = soNha;
        this.tonGiao = tonGiao;
        this.hinhAnh = hinhAnh;
        this.ketNapDoi = ketNapDoi;
        this.ngayVaoDoi = ngayVaoDoi;
        this.ketNapDoan = ketNapDoan;
        this.ngayVaoDoan = ngayVaoDoan;
        this.ghiChu = ghiChu;
        this.biXoaHayChua = biXoaHayChua;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_HOCSINH")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isBiXoaHayChua() {
        return biXoaHayChua;
    }

    public void setBiXoaHayChua(boolean biXoaHayChua) {
        this.biXoaHayChua = biXoaHayChua;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
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

    public boolean isKetNapDoan() {
        return ketNapDoan;
    }

    public void setKetNapDoan(boolean ketNapDoan) {
        this.ketNapDoan = ketNapDoan;
    }

    public boolean isKetNapDoi() {
        return ketNapDoi;
    }

    public void setKetNapDoi(boolean ketNapDoi) {
        this.ketNapDoi = ketNapDoi;
    }

    @Temporal(TemporalType.DATE)
    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Temporal(TemporalType.DATE)
    public Date getNgayVaoDoan() {
        return ngayVaoDoan;
    }

    public void setNgayVaoDoan(Date ngayVaoDoan) {
        this.ngayVaoDoan = ngayVaoDoan;
    }

    @Temporal(TemporalType.DATE)
    public Date getNgayVaoDoi() {
        return ngayVaoDoi;
    }

    public void setNgayVaoDoi(Date ngayVaoDoi) {
        this.ngayVaoDoi = ngayVaoDoi;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getTenHocSinh() {
        return tenHocSinh;
    }

    public void setTenHocSinh(String tenHocSinh) {
        this.tenHocSinh = tenHocSinh;
    }

    public String getTonGiao() {
        return tonGiao;
    }

    public void setTonGiao(String tonGiao) {
        this.tonGiao = tonGiao;
    }

//quan he dan toc voi hoc sinh
    @OneToOne
    @JoinColumn(name = "ID_DANTOC")
    public DanToc getDanToc() {
        return danToc;
    }

    public void setDanToc(DanToc danToc) {
        this.danToc = danToc;
    }

    //quanhe hoc sinh co mot hoc ba
    @OneToOne
    @JoinColumn(name = "ID_HOCBA")
    public HocBa getHocBa() {
        return hocBa;
    }

    public void setHocBa(HocBa hocBa) {
        this.hocBa = hocBa;
    }

    //quanhe hoc sinh thuoc loai hoc sinh nao
    @OneToOne
    @JoinColumn(name = "ID_LOAIHOCSINH")
    public LoaiHocSinh getLoaiHocSinh() {
        return loaiHocSinh;
    }

    public void setLoaiHocSinh(LoaiHocSinh loaiHocSinh) {
        this.loaiHocSinh = loaiHocSinh;
    }

    //quanhe hoc sinh voi che do uu tien
    @OneToOne
    @JoinColumn(name = "ID_CHEDOUUTIEN")
    public CheDoUuTien getCheDoUuTien() {
        return cheDoUuTien;
    }

    public void setCheDoUuTien(CheDoUuTien cheDoUuTien) {
        this.cheDoUuTien = cheDoUuTien;
    }

    //quanhe hoc sinh voi thanh phan gia dinh
    @OneToOne
    @JoinColumn(name = "ID_THANHPHANGIADINH")
    public ThanhPhanGiaDinh getThanhPhanGiaDinh() {
        return thanhPhanGiaDinh;
    }

    public void setThanhPhanGiaDinh(ThanhPhanGiaDinh thanhPhanGiaDinh) {
        this.thanhPhanGiaDinh = thanhPhanGiaDinh;
    }

    //quanhe hoc sinh voi nguoi dung
    @OneToOne
    @JoinColumn(name = "ID_NGUOIDUNG")
    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }
}
