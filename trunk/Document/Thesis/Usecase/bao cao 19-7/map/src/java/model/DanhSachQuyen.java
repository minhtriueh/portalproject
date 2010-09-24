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
@Table(name = "DANHSACHQUYEN")
public class DanhSachQuyen implements Serializable {

    long id;
    Set<Quyen> quyens = new HashSet<Quyen>();

    public DanhSachQuyen() {
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_DANHSACHQUYEN")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //quanhe danh sach quyen chua nhieu quyen
    @OneToMany
    @JoinColumn(name = "ID_DANHSACHQUYEN")
    public Set<Quyen> getQuyens() {
        return quyens;
    }

    public void setQuyens(Set<Quyen> quyens) {
        this.quyens = quyens;
    }
}
