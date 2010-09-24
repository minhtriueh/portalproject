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
@Table(name = "HOCSINHBOHOC")
public class HocSinhBoHoc implements Serializable {

    long id;
    Set<ChiTietHocSinhBoHoc> chiTietHocSinhBoHocs = new HashSet<ChiTietHocSinhBoHoc>();

    public HocSinhBoHoc() {
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_HOCSINHBOHOC")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //quanhe hoc sinh bo hoc chua nhieu chi tiet hoc sinh bo hoc
    @OneToMany
    @JoinColumn(name = "ID_HOCSINHBOHOC")
    public Set<ChiTietHocSinhBoHoc> getChiTietHocSinhBoHocs() {
        return chiTietHocSinhBoHocs;
    }

    public void setChiTietHocSinhBoHocs(Set<ChiTietHocSinhBoHoc> chiTietHocSinhBoHocs) {
        this.chiTietHocSinhBoHocs = chiTietHocSinhBoHocs;
    }

    //them chi tiet hoc sinh bo hoc
    public void addChiTietHocSinhBoHoc(ChiTietHocSinhBoHoc cthsbh){
        this.getChiTietHocSinhBoHocs().add(cthsbh);
    }
}
