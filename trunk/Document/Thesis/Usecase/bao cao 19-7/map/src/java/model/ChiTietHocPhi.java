/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author nguyentanmo
 */
@Entity
@Table(name = "CHITIETHOCPHI")
public class ChiTietHocPhi implements Serializable {

    long id;
    String tenLoaiHocPhi;
    double tienCanDong;
    double tienDaDong;
    boolean daDongDuChua;
    String chuThich;
    HocSinh hocSinh;
    NamHoc namHoc;

    public ChiTietHocPhi() {
    }

    public ChiTietHocPhi(String tenLoaiHocPhi, double tienCanDong, double tienDaDong, boolean daDongDuChua, String chuThich) {
        this.tenLoaiHocPhi = tenLoaiHocPhi;
        this.tienCanDong = tienCanDong;
        this.tienDaDong = tienDaDong;
        this.daDongDuChua = daDongDuChua;
        this.chuThich = chuThich;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_CHITIETHOCPHI")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getChuThich() {
        return chuThich;
    }

    public void setChuThich(String chuThich) {
        this.chuThich = chuThich;
    }

    public boolean isDaDongDuChua() {
        return daDongDuChua;
    }

    public void setDaDongDuChua(boolean daDongDuChua) {
        this.daDongDuChua = daDongDuChua;
    }

    public String getTenLoaiHocPhi() {
        return tenLoaiHocPhi;
    }

    public void setTenLoaiHocPhi(String tenLoaiHocPhi) {
        this.tenLoaiHocPhi = tenLoaiHocPhi;
    }

    public double getTienCanDong() {
        return tienCanDong;
    }

    public void setTienCanDong(double tienCanDong) {
        this.tienCanDong = tienCanDong;
    }

    public double getTienDaDong() {
        return tienDaDong;
    }

    public void setTienDaDong(double tienDaDong) {
        this.tienDaDong = tienDaDong;
    }

    //quanhe chi tiet hoc phi chua hoc sinh
    @OneToOne
    @JoinColumn(name = "ID_HOCSINH")
    public HocSinh getHocSinh() {
        return hocSinh;
    }

    public void setHocSinh(HocSinh hocSinh) {
        this.hocSinh = hocSinh;
    }

    //xet nam hoc cho chi tiet hoc phi
    @OneToOne
    @JoinColumn(name = "ID_NAMHOC")
    public NamHoc getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(NamHoc namHoc) {
        this.namHoc = namHoc;
    }
}
