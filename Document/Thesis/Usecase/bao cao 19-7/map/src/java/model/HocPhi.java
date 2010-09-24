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
@Table(name = "HOCPHI")
public class HocPhi implements Serializable {

    long id;
    Set<ChiTietHocPhi> chiTietHocPhis = new HashSet<ChiTietHocPhi>();

    public HocPhi() {
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_HOCPHI")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //quan he hoc phi chua chi tiet hoc phi
    @OneToMany
    @JoinColumn(name = "ID_HOCPHI")
    public Set<ChiTietHocPhi> getChiTietHocPhis() {
        return chiTietHocPhis;
    }

    public void setChiTietHocPhis(Set<ChiTietHocPhi> chiTietHocPhis) {
        this.chiTietHocPhis = chiTietHocPhis;
    }

    //them chi tiet hoc phi vao hoc phi
    public void addChiTietHocPhi(ChiTietHocPhi cthp){
        this.getChiTietHocPhis().add(cthp);
    }
}
