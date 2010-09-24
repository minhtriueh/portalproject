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
import javax.persistence.Table;

/**
 *
 * @author nguyentanmo
 */
@Entity
@Table(name = "HOCLUC")
public class HocLuc implements Serializable {

    long id;
    String tenHocLuc;
    String ghiChu;
    double diemCanTren;
    double diemCanDuoi;
    double khongCoMonDuoi;

    public HocLuc() {
    }

    public HocLuc(String tenHocLuc, String ghiChu, double diemCanTren, double diemCanDuoi, double khongCoMonDuoi) {
        this.tenHocLuc = tenHocLuc;
        this.ghiChu = ghiChu;
        this.diemCanTren = diemCanTren;
        this.diemCanDuoi = diemCanDuoi;
        this.khongCoMonDuoi = khongCoMonDuoi;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_HOCLUC")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getTenHocLuc() {
        return tenHocLuc;
    }

    public void setTenHocLuc(String tenHocLuc) {
        this.tenHocLuc = tenHocLuc;
    }

    public double getDiemCanDuoi() {
        return diemCanDuoi;
    }

    public void setDiemCanDuoi(double diemCanDuoi) {
        this.diemCanDuoi = diemCanDuoi;
    }

    public double getDiemCanTren() {
        return diemCanTren;
    }

    public void setDiemCanTren(double diemCanTren) {
        this.diemCanTren = diemCanTren;
    }

    public double getKhongCoMonDuoi() {
        return khongCoMonDuoi;
    }

    public void setKhongCoMonDuoi(double khongCoMonDuoi) {
        this.khongCoMonDuoi = khongCoMonDuoi;
    }
}
