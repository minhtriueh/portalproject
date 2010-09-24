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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author nguyentanmo
 */
@Entity
@Table(name = "MONHOC")
public class MonHoc implements Serializable {

    long id;
    String tenMonHoc;
    Set<GiaoVien> giaoViens = new HashSet<GiaoVien>();
    Set<Lop> lops = new HashSet<Lop>();
    SoDiem soDiem;

    public MonHoc() {
    }

    public MonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    @Id
    @Column(name = "ID_MONHOC")
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    //quanhe mon hoc duoc day boi nhieu giao vien
    @ManyToMany(mappedBy = "monHocs")
    public Set<GiaoVien> getGiaoViens() {
        return giaoViens;
    }

    public void setGiaoViens(Set<GiaoVien> giaoViens) {
        this.giaoViens = giaoViens;
    }

    //quanhe mon hoc duoc hoc boi nhieu lop
    @ManyToMany(mappedBy = "monHocs")
    public Set<Lop> getLops() {
        return lops;
    }

    public void setLops(Set<Lop> lops) {
        this.lops = lops;
    }

    //quanhe mon hoc voi so diem
    @OneToOne
    @JoinColumn(name = "ID_SODIEM")
    public SoDiem getSoDiem() {
        return soDiem;
    }

    public void setSoDiem(SoDiem soDiem) {
        this.soDiem = soDiem;
    }
}
