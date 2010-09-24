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
@Table(name = "HOCBA")
public class HocBa implements Serializable {

    long id;
    Set<ChiTietHocBa> chiTietHocBas = new HashSet<ChiTietHocBa>();
    HocSinh hocSinh;

    public HocBa() {
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_HOCBA")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //quanhe hoc ba co nhieu chi tiet hoc ba
    @OneToMany
    @JoinColumn(name = "ID_HOCBA")
    public Set<ChiTietHocBa> getChiTietHocBas() {
        return chiTietHocBas;
    }

    public void setChiTietHocBas(Set<ChiTietHocBa> chiTietHocBas) {
        this.chiTietHocBas = chiTietHocBas;
    }

    //quanhe hoc ba chua mot hoc sinh
    @OneToOne
    @JoinColumn(name = "ID_HOCSINH")
    public HocSinh getHocSinh() {
        return hocSinh;
    }

    public void setHocSinh(HocSinh hocSinh) {
        this.hocSinh = hocSinh;
    }

    //them chi tiet hoc ba vao hoc ba
    public void addChiTietHocBa(ChiTietHocBa cthb) {
        this.chiTietHocBas.add(cthb);
    }
}
