/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author nguyentanmo
 */
@Entity
@Table(name="COSO")
public class CoSo implements Serializable {

    long id;
    String tenCoSo;
    String diaChiCoSo;
    Date ngayThanhLapCoSo;
    int dienThoaiCoSo;
    String websiteCoSo;
    String gioiThieuCoSo;
    Set<ToBoMon> toBoMons = new HashSet<ToBoMon>();
    Set<KhoiLop> khoiLops = new HashSet<KhoiLop>();

    public CoSo() {
    }

    public CoSo(String tenCoSo, String diaChiCoSo, Date ngayThanhLapCoSo, int dienThoaiCoSo, String websiteCoSo, String gioiThieuCoSo) {
        this.tenCoSo = tenCoSo;
        this.diaChiCoSo = diaChiCoSo;
        this.ngayThanhLapCoSo = ngayThanhLapCoSo;
        this.dienThoaiCoSo = dienThoaiCoSo;
        this.websiteCoSo = websiteCoSo;
        this.gioiThieuCoSo = gioiThieuCoSo;
    }

    @Id
    @Column(name="ID_COSO")
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDiaChiCoSo() {
        return diaChiCoSo;
    }

    public void setDiaChiCoSo(String diaChiCoSo) {
        this.diaChiCoSo = diaChiCoSo;
    }

    public int getDienThoaiCoSo() {
        return dienThoaiCoSo;
    }

    public void setDienThoaiCoSo(int dienThoaiCoSo) {
        this.dienThoaiCoSo = dienThoaiCoSo;
    }

    public String getGioiThieuCoSo() {
        return gioiThieuCoSo;
    }

    public void setGioiThieuCoSo(String gioiThieuCoSo) {
        this.gioiThieuCoSo = gioiThieuCoSo;
    }

    @Temporal(TemporalType.DATE)
    public Date getNgayThanhLapCoSo() {
        return ngayThanhLapCoSo;
    }

    public void setNgayThanhLapCoSo(Date ngayThanhLapCoSo) {
        this.ngayThanhLapCoSo = ngayThanhLapCoSo;
    }

    public String getTenCoSo() {
        return tenCoSo;
    }

    public void setTenCoSo(String tenCoSo) {
        this.tenCoSo = tenCoSo;
    }

    public String getWebsiteCoSo() {
        return websiteCoSo;
    }

    public void setWebsiteCoSo(String websiteCoSo) {
        this.websiteCoSo = websiteCoSo;
    }

    //quanhe coso co nhieu tobomon
    @OneToMany
    @JoinColumn(name = "ID_CoSo")
    public Set<ToBoMon> getToBoMons() {
        return toBoMons;
    }

    public void setToBoMons(Set<ToBoMon> toBoMons) {
        this.toBoMons = toBoMons;
    }

    //quanhe coso co nhieu khoi lop
    @OneToMany
    @JoinColumn(name = "ID_CoSo")
    public Set<KhoiLop> getKhoiLops() {
        return khoiLops;
    }

    public void setKhoiLops(Set<KhoiLop> khoiLops) {
        this.khoiLops = khoiLops;
    }

    //them tobomon vao coso
    public void addToBoMon(ToBoMon tbm){
        this.getToBoMons().add(tbm);
    }

    //them khoi lop
    public void addKhoiLop(KhoiLop kl){
        this.getKhoiLops().add(kl);
    }
}
