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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author nguyentanmo
 */
@Entity
@Table(name = "SODIEMDANH")
public class SoDiemDanh implements Serializable {

    long id;
    Set<ChiTietSoDiemDanh> chiTietSoDiemDanhs = new HashSet<ChiTietSoDiemDanh>();
    NamHoc namHoc;

    public SoDiemDanh() {
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_SODIEMDANH")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //quanhe so diem danh chua nhieu chi tiet diem danh
    @OneToMany
    @JoinColumn(name = "ID_SODIEMDANH")
    public Set<ChiTietSoDiemDanh> getChiTietSoDiemDanhs() {
        return chiTietSoDiemDanhs;
    }

    public void setChiTietSoDiemDanhs(Set<ChiTietSoDiemDanh> chiTietSoDiemDanhs) {
        this.chiTietSoDiemDanhs = chiTietSoDiemDanhs;
    }

    //xet nam hoc cho so diem danh
    @OneToOne
    @JoinColumn(name = "ID_NAMHOC")
    public NamHoc getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(NamHoc namHoc) {
        this.namHoc = namHoc;
    }

    //them chi tiet so diem danh
    public void addChiTietSoDiemDanh(ChiTietSoDiemDanh ctsdd) {
        this.getChiTietSoDiemDanhs().add(ctsdd);
    }
}
