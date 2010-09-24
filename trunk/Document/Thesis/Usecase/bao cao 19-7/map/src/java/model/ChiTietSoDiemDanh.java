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
@Table(name = "CHITIETSODIEMDANH")
public class ChiTietSoDiemDanh implements Serializable {

    long id;
    Date ngayNghi;
    String buoiNghi;
    String lyDoNghi;
    boolean coPhepHayKhong;
    HocSinh hocSinh;

    public ChiTietSoDiemDanh() {
    }

    public ChiTietSoDiemDanh(Date ngayNghi, String buoiNghi, String lyDoNghi, boolean coPhepHayKhong) {
        this.ngayNghi = ngayNghi;
        this.buoiNghi = buoiNghi;
        this.lyDoNghi = lyDoNghi;
        this.coPhepHayKhong = coPhepHayKhong;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_CHITIETSODIEMDANH")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBuoiNghi() {
        return buoiNghi;
    }

    public void setBuoiNghi(String buoiNghi) {
        this.buoiNghi = buoiNghi;
    }

    public boolean isCoPhepHayKhong() {
        return coPhepHayKhong;
    }

    public void setCoPhepHayKhong(boolean coPhepHayKhong) {
        this.coPhepHayKhong = coPhepHayKhong;
    }

    public String getLyDoNghi() {
        return lyDoNghi;
    }

    public void setLyDoNghi(String lyDoNghi) {
        this.lyDoNghi = lyDoNghi;
    }

    @Temporal(TemporalType.DATE)
    public Date getNgayNghi() {
        return ngayNghi;
    }

    public void setNgayNghi(Date ngayNghi) {
        this.ngayNghi = ngayNghi;
    }

    //quanhe chi tiet so diem danh chua hoc sinh
    @OneToOne
    @JoinColumn(name = "ID_HOCSINH")
    public HocSinh getHocSinh() {
        return hocSinh;
    }

    public void setHocSinh(HocSinh hocSinh) {
        this.hocSinh = hocSinh;
    }
}
