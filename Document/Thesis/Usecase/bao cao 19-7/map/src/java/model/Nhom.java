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
@Table(name = "NHOM")
public class Nhom implements Serializable {

    long id;
    String tenNhom;
    String moTa;
    Set<NguoiDung> nguoiDungs = new HashSet<NguoiDung>();
    Set<Quyen> quyens = new HashSet<Quyen>();

    public Nhom() {
    }

    public Nhom(String tenNhom, String moTa) {
        this.tenNhom = tenNhom;
        this.moTa = moTa;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_NHOM")
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

    public String getTenNhom() {
        return tenNhom;
    }

    public void setTenNhom(String tenNhom) {
        this.tenNhom = tenNhom;
    }

    //quanhe nhom chua nhieu nguoi dung
    @ManyToMany(mappedBy="nhoms")
    public Set<NguoiDung> getNguoiDungs() {
        return nguoiDungs;
    }

    public void setNguoiDungs(Set<NguoiDung> nguoiDungs) {
        this.nguoiDungs = nguoiDungs;
    }
    
    //quanhe nhom co nhieu quyen
    @ManyToMany
    public Set<Quyen> getQuyens() {
        return quyens;
    }

    public void setQuyens(Set<Quyen> quyens) {
        this.quyens = quyens;
    }

    //them quyen cho nhom
    public void addQuyen(Quyen quyen){
        this.getQuyens().add(quyen);
        quyen.getNhoms().add(this);
    }

}

