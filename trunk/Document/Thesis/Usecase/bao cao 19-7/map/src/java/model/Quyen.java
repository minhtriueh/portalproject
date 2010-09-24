/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author nguyentanmo
 */
@Entity
@Table(name = "QUYEN")
public class Quyen implements Serializable {

    long id;
    String tenQuyen;
    String moTa;
    Set<NguoiDung> nguoiDungs = new HashSet<NguoiDung>();
    Set<Nhom> nhoms = new HashSet<Nhom>();

    public Quyen() {
    }

    public Quyen(String tenQuyen, String moTa) {
        this.tenQuyen = tenQuyen;
        this.moTa = moTa;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_QUYEN")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTenQuyen() {
        return tenQuyen;
    }

    public void setTenQuyen(String tenQuyen) {
        this.tenQuyen = tenQuyen;
    }

    //quanhe quyen chua nhieu nguoi dung
    @ManyToMany(mappedBy = "quyens")
    public Set<NguoiDung> getNguoiDungs() {
        return nguoiDungs;
    }

    public void setNguoiDungs(Set<NguoiDung> nguoiDungs) {
        this.nguoiDungs = nguoiDungs;
    }

    //quanhe quyen cua nhieu nhom
    @ManyToMany(mappedBy = "quyens")
    public Set<Nhom> getNhoms() {
        return nhoms;
    }

    public void setNhoms(Set<Nhom> nhoms) {
        this.nhoms = nhoms;
    }
}
