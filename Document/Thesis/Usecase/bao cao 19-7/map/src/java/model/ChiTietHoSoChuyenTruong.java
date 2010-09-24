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
@Table(name = "CHITIETHOSOCHUYENTRUONG")
public class ChiTietHoSoChuyenTruong implements Serializable {

    long id;
    String truongChuyenDi;
    String truongChuyenDen;
    Date ngayChuyenTruong;
    String lyDoChuyen;
    HocSinh hocSinh;

    public ChiTietHoSoChuyenTruong() {
    }

    public ChiTietHoSoChuyenTruong(String truongChuyenDi, String truongChuyenDen, Date ngayChuyenTruong, String lyDoChuyen) {
        this.truongChuyenDi = truongChuyenDi;
        this.truongChuyenDen = truongChuyenDen;
        this.ngayChuyenTruong = ngayChuyenTruong;
        this.lyDoChuyen = lyDoChuyen;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_CHITIETHOSOCHUYENTRUONG")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLyDoChuyen() {
        return lyDoChuyen;
    }

    public void setLyDoChuyen(String lyDoChuyen) {
        this.lyDoChuyen = lyDoChuyen;
    }

    @Temporal(TemporalType.DATE)
    public Date getNgayChuyenTruong() {
        return ngayChuyenTruong;
    }

    public void setNgayChuyenTruong(Date ngayChuyenTruong) {
        this.ngayChuyenTruong = ngayChuyenTruong;
    }

    public String getTruongChuyenDen() {
        return truongChuyenDen;
    }

    public void setTruongChuyenDen(String truongChuyenDen) {
        this.truongChuyenDen = truongChuyenDen;
    }

    public String getTruongChuyenDi() {
        return truongChuyenDi;
    }

    public void setTruongChuyenDi(String truongChuyenDi) {
        this.truongChuyenDi = truongChuyenDi;
    }

    //quanhe chi tiet ho so chuyen truong chua hoc sinh
    @OneToOne
    @JoinColumn(name = "ID_HOCSINH")
    public HocSinh getHocSinh() {
        return hocSinh;
    }

    public void setHocSinh(HocSinh hocSinh) {
        this.hocSinh = hocSinh;
    }
}
