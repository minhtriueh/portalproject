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
@Table(name = "CHEDOUUTIEN")
public class CheDoUuTien implements Serializable {

    long id;
    String tenCheDoUuTien;
    double phanTramDuocGiam;
    String chuThich;

    public CheDoUuTien() {
    }

    public CheDoUuTien(String tenCheDoUuTien, double phanTramDuocGiam, String chuThich) {
        this.tenCheDoUuTien = tenCheDoUuTien;
        this.phanTramDuocGiam = phanTramDuocGiam;
        this.chuThich = chuThich;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_CHEDOUUTIEN")
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

    public double getPhanTramDuocGiam() {
        return phanTramDuocGiam;
    }

    public void setPhanTramDuocGiam(double phanTramDuocGiam) {
        this.phanTramDuocGiam = phanTramDuocGiam;
    }

    public String getTenCheDoUuTien() {
        return tenCheDoUuTien;
    }

    public void setTenCheDoUuTien(String tenCheDoUuTien) {
        this.tenCheDoUuTien = tenCheDoUuTien;
    }
}
