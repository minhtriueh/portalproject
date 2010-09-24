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
@Table(name = "SODIEMCHUNHIEM")
public class SoDiemChuNhiem implements Serializable {

    long id;
    Set<SoDiem> soDiems = new HashSet<SoDiem>();
    Set<ChiTietHocBa> chiTietHocBas = new HashSet<ChiTietHocBa>();
    
    public SoDiemChuNhiem() {
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_SODIEMCHUNHIEM")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //quan he so diem chu nhiem chua nhieu so diem
    @OneToMany
    @JoinColumn(name = "ID_SODIEMCHUNHIEM")
    public Set<SoDiem> getSoDiems() {
        return soDiems;
    }

    public void setSoDiems(Set<SoDiem> soDiems) {
        this.soDiems = soDiems;
    }

    //quanhe so diem chu nhiem co nhieu chi tiet hoc ba
    @OneToMany
    @JoinColumn(name="ID_SODIEMCHUNHIEM")
    public Set<ChiTietHocBa> getChiTietHocBas() {
        return chiTietHocBas;
    }

    public void setChiTietHocBas(Set<ChiTietHocBa> chiTietHocBas) {
        this.chiTietHocBas = chiTietHocBas;
    }

    //them so diem vao so diem chu nhiem
    public void addSoDiem(SoDiem sd){
        this.soDiems.add(sd);
    }

    //them chi tiet hoc ba cho so diem chu nhiem
    public void addChiTietHocBa(ChiTietHocBa cthb){
        this.chiTietHocBas.add(cthb);
    }
}
