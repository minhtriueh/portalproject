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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author nguyentanmo
 */
@Entity
@Table(name = "CHITIETTHANHPHANGIADINH")
public class ChiTietThanhPhanGiaDinh implements Serializable {

    long id;
    String tenQuanHe;
    String hoTen;
    Date ngaySinh;
    String ngheNghiep;

    public ChiTietThanhPhanGiaDinh() {
    }

    public ChiTietThanhPhanGiaDinh(String tenQuanHe, String hoTen, Date ngaySinh, String ngheNghiep) {
        this.tenQuanHe = tenQuanHe;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.ngheNghiep = ngheNghiep;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_CHITIETTHANHPHANGIADINH")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Temporal(TemporalType.DATE)
    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getTenQuanHe() {
        return tenQuanHe;
    }

    public void setTenQuanHe(String tenQuanHe) {
        this.tenQuanHe = tenQuanHe;
    }
}
