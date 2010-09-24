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
@Table(name = "XAPHUONGTHITRAN")
public class XaPhuongThiTran implements Serializable {

    long id;
    String tenXaPhuongThiTran;
    Set<ThonXom> thonXoms = new HashSet<ThonXom>();

    public XaPhuongThiTran() {
    }

    public XaPhuongThiTran(String tenXaPhuongThiTran) {
        this.tenXaPhuongThiTran = tenXaPhuongThiTran;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_XAPHUONGTHITRAN")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenXaPhuongThiTran() {
        return tenXaPhuongThiTran;
    }

    public void setTenXaPhuongThiTran(String tenXaPhuongThiTran) {
        this.tenXaPhuongThiTran = tenXaPhuongThiTran;
    }

    //quanhe mot xa co nhieu thon
    @OneToMany
    @JoinColumn(name = "ID_XAPHUONGTHITRAN")
    public Set<ThonXom> getThonXoms() {
        return thonXoms;
    }

    public void setThonXoms(Set<ThonXom> thonXoms) {
        this.thonXoms = thonXoms;
    }

    //them thon vao xa
    public void addThonXom(ThonXom thonXom) {
        this.getThonXoms().add(thonXom);
    }
}
