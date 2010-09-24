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
@Table(name = "HOSOCHUYENTRUONG")
public class HoSoChuyenTruong implements Serializable {

    long id;
    Set<ChiTietHoSoChuyenTruong> chiTietHoSoChuyenTruongs = new HashSet<ChiTietHoSoChuyenTruong>();

    @Id
    @GeneratedValue
    @Column(name = "ID_HOSOCHUYENTRUONG")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //quanhe ho so chuyen truong chua chi tiet ho so chuyen truong
    @OneToMany
    @JoinColumn(name = "ID_HOSOCHUYENTRUONG")
    public Set<ChiTietHoSoChuyenTruong> getChiTietHoSoChuyenTruongs() {
        return chiTietHoSoChuyenTruongs;
    }

    public void setChiTietHoSoChuyenTruongs(Set<ChiTietHoSoChuyenTruong> chiTietHoSoChuyenTruongs) {
        this.chiTietHoSoChuyenTruongs = chiTietHoSoChuyenTruongs;
    }
}
