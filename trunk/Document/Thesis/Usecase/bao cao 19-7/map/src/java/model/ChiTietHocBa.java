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
@Table(name = "CHITIETHOCBA")
public class ChiTietHocBa implements Serializable {

    long id;
    String nhanXet;
    HanhKiem hanhKiem;
    HocLuc hocLuc;
    NamHoc namHoc;

    public ChiTietHocBa() {
    }

    public ChiTietHocBa(String nhanXet) {
        this.nhanXet = nhanXet;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_CHITIETHOCBA")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNhanXet() {
        return nhanXet;
    }

    public void setNhanXet(String nhanXet) {
        this.nhanXet = nhanXet;
    }

    //quanhe chi tiet hoc ba co mot hanh kiem
    @OneToOne
    @JoinColumn(name = "ID_HANHKIEM")
    public HanhKiem getHanhKiem() {
        return hanhKiem;
    }

    public void setHanhKiem(HanhKiem hanhKiem) {
        this.hanhKiem = hanhKiem;
    }

    //quanhe chi tiet hoc ba co mot hoc luc
    @OneToOne
    @JoinColumn(name = "ID_HOCLUC")
    public HocLuc getHocLuc() {
        return hocLuc;
    }

    public void setHocLuc(HocLuc hocLuc) {
        this.hocLuc = hocLuc;
    }

    //quanhe chi tiet hoc ba voi nam hoc
    @OneToOne
    @JoinColumn(name = "ID_NAMHOC")
    public NamHoc getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(NamHoc namHoc) {
        this.namHoc = namHoc;
    }
}
