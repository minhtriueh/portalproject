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
@Table(name="KHOILOP")
public class KhoiLop implements Serializable {

    long id;
    String tenKhoi;
    Set<Lop> lops = new HashSet<Lop>();

    public KhoiLop() {
    }

    public KhoiLop(String tenKhoi) {
        this.tenKhoi = tenKhoi;
    }

    @Id
    @Column(name="ID_KHOILOP")
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenKhoi() {
        return tenKhoi;
    }

    public void setTenKhoi(String tenKhoi) {
        this.tenKhoi = tenKhoi;
    }

    //quanhe khoi lop co nhieu lop
    @OneToMany
    @JoinColumn(name = "ID_KhoiLop")
    public Set<Lop> getLops() {
        return lops;
    }

    public void setLops(Set<Lop> lops) {
        this.lops = lops;
    }

    //them lop
    public void addLop(Lop lop){
        this.getLops().add(lop);
    }
}
