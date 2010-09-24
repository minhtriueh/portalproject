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
@Table(name = "SODIEM")
public class SoDiem implements Serializable {

    long id;
    Set<ChiTietSoDiem> chiTietSoDiems = new HashSet<ChiTietSoDiem>();

    public SoDiem() {
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_SODIEM")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //quanhe so diem co nhieu chi tiet so diem
    @OneToMany
    @JoinColumn(name = "ID_SODIEM")
    public Set<ChiTietSoDiem> getChiTietSoDiems() {
        return chiTietSoDiems;
    }

    public void setChiTietSoDiems(Set<ChiTietSoDiem> chiTietSoDiems) {
        this.chiTietSoDiems = chiTietSoDiems;
    }

    //them chi tiet so diem vao so diem
    public void addChiTietSoDiem(ChiTietSoDiem ctsd){
        this.getChiTietSoDiems().add(ctsd);
    }
}
