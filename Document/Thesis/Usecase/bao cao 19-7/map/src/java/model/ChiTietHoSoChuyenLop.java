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
@Table(name = "CHITIETHOSOCHUYENLOP")
public class ChiTietHoSoChuyenLop implements Serializable {

    long id;
    int hocKy;
    String lopChuyenDi;
    String lopChuyenDen;
    Date ngayChuyenLop;
    String lyDoChuyen;
    HocSinh hocSinh;

    public ChiTietHoSoChuyenLop() {
    }

    public ChiTietHoSoChuyenLop(int hocKy, String lopChuyenDi, String lopChuyenDen, Date ngayChuyenLop, String lyDoChuyen) {
        this.hocKy = hocKy;
        this.lopChuyenDi = lopChuyenDi;
        this.lopChuyenDen = lopChuyenDen;
        this.ngayChuyenLop = ngayChuyenLop;
        this.lyDoChuyen = lyDoChuyen;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_CHITIETHOSOCHUYENLOP")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getHocKy() {
        return hocKy;
    }

    public void setHocKy(int hocKy) {
        this.hocKy = hocKy;
    }

    public String getLopChuyenDen() {
        return lopChuyenDen;
    }

    public void setLopChuyenDen(String lopChuyenDen) {
        this.lopChuyenDen = lopChuyenDen;
    }

    public String getLopChuyenDi() {
        return lopChuyenDi;
    }

    public void setLopChuyenDi(String lopChuyenDi) {
        this.lopChuyenDi = lopChuyenDi;
    }

    public String getLyDoChuyen() {
        return lyDoChuyen;
    }

    public void setLyDoChuyen(String lyDoChuyen) {
        this.lyDoChuyen = lyDoChuyen;
    }

    @Temporal(TemporalType.DATE)
    public Date getNgayChuyenLop() {
        return ngayChuyenLop;
    }

    public void setNgayChuyenLop(Date ngayChuyenLop) {
        this.ngayChuyenLop = ngayChuyenLop;
    }

    //quanhe chi tiet ho so chuyen lop chua hoc sinh
    @OneToOne
    @JoinColumn(name = "ID_HOCSINH")
    public HocSinh getHocSinh() {
        return hocSinh;
    }

    public void setHocSinh(HocSinh hocSinh) {
        this.hocSinh = hocSinh;
    }
}
