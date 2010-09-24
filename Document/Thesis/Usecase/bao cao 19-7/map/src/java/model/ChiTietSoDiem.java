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
@Table(name = "CHITIETSODIEM")
public class ChiTietSoDiem implements Serializable {

    long id;
    Set<LoaiDiem> loaiDiems = new HashSet<LoaiDiem>();
    HocSinh hocSinh;

    public ChiTietSoDiem() {
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_CHITIETSODIEM")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //quanhe chi tiet so diem co nhieu loai diem
    @OneToMany
    @JoinColumn(name = "ID_CHITIETSODIEM")
    public Set<LoaiDiem> getLoaiDiems() {
        return loaiDiems;
    }

    public void setLoaiDiems(Set<LoaiDiem> loaiDiems) {
        this.loaiDiems = loaiDiems;
    }

    //them loai diem vao chi tiet so diem
    public void addLoaiDiem(LoaiDiem ld) {
        this.getLoaiDiems().add(ld);
    }

    //quanhe chi tiet so diem chua hoc sinh
    @OneToOne
    @JoinColumn(name = "ID_HOCSINH")
    public HocSinh getHocSinh() {
        return hocSinh;
    }

    public void setHocSinh(HocSinh hocSinh) {
        this.hocSinh = hocSinh;
    }
}
