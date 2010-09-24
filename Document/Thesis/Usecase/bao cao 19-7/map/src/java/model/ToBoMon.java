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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author nguyentanmo
 */
@Entity
@Table(name="TOBOMON")
public class ToBoMon implements Serializable {

    long id;
    String tenBoMon;
    Set<MonHoc> monHocs = new HashSet<MonHoc>();
    Set<GiaoVien> giaoViens = new HashSet<GiaoVien>();

    public ToBoMon() {
    }

    public ToBoMon(String tenBoMon) {
        this.tenBoMon = tenBoMon;
    }

    @Id
    @Column(name="ID_TOBOMON")
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenBoMon() {
        return tenBoMon;
    }

    public void setTenBoMon(String tenBoMon) {
        this.tenBoMon = tenBoMon;
    }

    //quanhe to bo mon co nhieu mon hoc
    @OneToMany
    @JoinColumn(name = "ID_TOBOMON")
    public Set<MonHoc> getMonHocs() {
        return monHocs;
    }

    public void setMonHocs(Set<MonHoc> monHocs) {
        this.monHocs = monHocs;
    }

    //quanhe to bo mon co nhieu giao vien
    @OneToMany
    @JoinColumn(name = "ID_TOBOMON")
    public Set<GiaoVien> getGiaoViens() {
        return giaoViens;
    }

    public void setGiaoViens(Set<GiaoVien> giaoViens) {
        this.giaoViens = giaoViens;
    }

    //them mon hoc vao to bo mon
    public void addMonHoc(MonHoc mh){
        this.getMonHocs().add(mh);
    }

    //them giao vien vao to bo mon
    public void addGiaoVien(GiaoVien gv){
        this.getGiaoViens().add(gv);
    }
}
