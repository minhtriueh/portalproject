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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author nguyentanmo
 */
@Entity
@Table(name = "TRUONG")
public class Truong implements Serializable {

    long id;
    String tenTruong;
    String diaChiTruong;
    Date ngayThanhLapTruong;
    String loaiHinhTruong;
    int dienThoaiTruong;
    String websiteTruong;
    String gioiThieuTruong;
    Set<CoSo> coSos = new HashSet<CoSo>();
    HieuTruong hieuTruong;

    public Truong() {
    }

    public Truong(String tenTruong, String diaChiTruong, Date ngayThanhLapTruong, String loaiHinhTruong, int dienThoaiTruong, String websiteTruong, String gioiThieuTruong) {
        this.tenTruong = tenTruong;
        this.diaChiTruong = diaChiTruong;
        this.ngayThanhLapTruong = ngayThanhLapTruong;
        this.loaiHinhTruong = loaiHinhTruong;
        this.dienThoaiTruong = dienThoaiTruong;
        this.websiteTruong = websiteTruong;
        this.gioiThieuTruong = gioiThieuTruong;
    }

    @Id
    @Column(name = "ID_TRUONG")
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDiaChiTruong() {
        return diaChiTruong;
    }

    public void setDiaChiTruong(String diaChiTruong) {
        this.diaChiTruong = diaChiTruong;
    }

    public int getDienThoaiTruong() {
        return dienThoaiTruong;
    }

    public void setDienThoaiTruong(int dienThoaiTruong) {
        this.dienThoaiTruong = dienThoaiTruong;
    }

    public String getGioiThieuTruong() {
        return gioiThieuTruong;
    }

    public void setGioiThieuTruong(String gioiThieuTruong) {
        this.gioiThieuTruong = gioiThieuTruong;
    }

    public String getLoaiHinhTruong() {
        return loaiHinhTruong;
    }

    public void setLoaiHinhTruong(String loaiHinhTruong) {
        this.loaiHinhTruong = loaiHinhTruong;
    }

    @Temporal(TemporalType.DATE)
    public Date getNgayThanhLapTruong() {
        return ngayThanhLapTruong;
    }

    public void setNgayThanhLapTruong(Date ngayThanhLapTruong) {
        this.ngayThanhLapTruong = ngayThanhLapTruong;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public String getWebsiteTruong() {
        return websiteTruong;
    }

    public void setWebsiteTruong(String websiteTruong) {
        this.websiteTruong = websiteTruong;
    }

    //quanhe truong co nhieu co so
    @OneToMany
    @JoinColumn(name = "ID_Truong")
    public Set<CoSo> getCoSos() {
        return coSos;
    }

    public void setCoSos(Set<CoSo> coSos) {
        this.coSos = coSos;
    }
    
    //quan he truong voi hieu truong
    @OneToOne
    @JoinColumn(name="ID_HIEUTRUONG")
    public HieuTruong getHieuTruong() {
        return hieuTruong;
    }

    public void setHieuTruong(HieuTruong hieuTruong) {
        this.hieuTruong = hieuTruong;
    }



    //them co so
    public void addCoSo(CoSo coSo) {
        this.getCoSos().add(coSo);
    }
}
