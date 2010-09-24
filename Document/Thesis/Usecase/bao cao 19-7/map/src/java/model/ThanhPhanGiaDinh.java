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
@Table(name = "THANHPHANGIADINH")
public class ThanhPhanGiaDinh implements Serializable {

    long id;
    Set<ChiTietThanhPhanGiaDinh> chiTietThanhPhanGiaDinhs = new HashSet<ChiTietThanhPhanGiaDinh>();

    @Id
    @GeneratedValue
    @Column(name = "ID_THANHPHANGIADINH")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //quanhe thanh phan gia dinh co nhieu chi tiet thanh phan gia dinh
    @OneToMany
    @JoinColumn(name = "ID_THANHPHANGIADINH")
    public Set<ChiTietThanhPhanGiaDinh> getChiTietThanhPhanGiaDinhs() {
        return chiTietThanhPhanGiaDinhs;
    }

    public void setChiTietThanhPhanGiaDinhs(Set<ChiTietThanhPhanGiaDinh> chiTietThanhPhanGiaDinhs) {
        this.chiTietThanhPhanGiaDinhs = chiTietThanhPhanGiaDinhs;
    }

    //them chi tiet thanh phan gia dinh
    public void addChiTietThanhPhanGiaDinh(ChiTietThanhPhanGiaDinh cttpgd){
        this.getChiTietThanhPhanGiaDinhs().add(cttpgd);
    }
}
