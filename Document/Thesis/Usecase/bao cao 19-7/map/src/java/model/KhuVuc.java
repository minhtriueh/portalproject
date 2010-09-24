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
@Table(name = "KHUVUC")
public class KhuVuc implements Serializable {

    long id;
    String tenKhuVuc;
    String moTa;
    Set<QuanHuyenThanhPho> quanHuyenThanhPhos = new HashSet<QuanHuyenThanhPho>();

    public KhuVuc() {
    }

    public KhuVuc(String tenKhuVuc, String moTa) {
        this.tenKhuVuc = tenKhuVuc;
        this.moTa = moTa;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_KHUVUC")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTenKhuVuc() {
        return tenKhuVuc;
    }

    public void setTenKhuVuc(String tenKhuVuc) {
        this.tenKhuVuc = tenKhuVuc;
    }

    //quanhe khu vuc co nhieu quan huyen
    @OneToMany
    @JoinColumn(name = "ID_KHUVUC")
    public Set<QuanHuyenThanhPho> getQuanHuyenThanhPhos() {
        return quanHuyenThanhPhos;
    }

    public void setQuanHuyenThanhPhos(Set<QuanHuyenThanhPho> quanHuyenThanhPhos) {
        this.quanHuyenThanhPhos = quanHuyenThanhPhos;
    }

    //them quan huyen vao khu vuc
    public void addQuanHuyenThanhPho(QuanHuyenThanhPho qhtp){
        this.getQuanHuyenThanhPhos().add(qhtp);
    }
}
