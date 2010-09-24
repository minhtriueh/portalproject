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
@Table(name = "NGUOIDUNG")
public class NguoiDung implements Serializable {

    long id;
    String username;
    String password;
    GiaoVien giaoVien;
    HocSinh hocSinh;
    Set<Quyen> quyens = new HashSet<Quyen>();
    Set<Nhom> nhoms = new HashSet<Nhom>();

    public NguoiDung() {
    }

    public NguoiDung(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_NGUOIDUNG")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //quanhe nguoi dung voi giao vien
    @OneToOne
    @JoinColumn(name = "ID_GIAOVIEN")
    public GiaoVien getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(GiaoVien giaoVien) {
        this.giaoVien = giaoVien;
    }

    //quanhe nguoi dung voi hoc sinh
    @OneToOne
    @JoinColumn(name = "ID_HOCSINH")
    public HocSinh getHocSinh() {
        return hocSinh;
    }

    public void setHocSinh(HocSinh hocSinh) {
        this.hocSinh = hocSinh;
    }

    //quanhe nguoi dung co nhieu quyen
    @ManyToMany
    public Set<Quyen> getQuyens() {
        return quyens;
    }

    public void setQuyens(Set<Quyen> quyens) {
        this.quyens = quyens;
    }

    //quan he nguoi dung thuoc nhieu nhom
    @ManyToMany
    public Set<Nhom> getNhoms() {
        return nhoms;
    }

    public void setNhoms(Set<Nhom> nhoms) {
        this.nhoms = nhoms;
    }

    //them quyen cho nguoi dung
    public void addQuyen(Quyen quyen){
        this.getQuyens().add(quyen);
        quyen.getNguoiDungs().add(this);
    }

    //them nhom cho nguoi dung
    public void addNhom(Nhom nhom){
        this.getNhoms().add(nhom);
        nhom.getNguoiDungs().add(this);
    }
}
