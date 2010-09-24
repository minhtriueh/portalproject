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
@Table(name = "HOSOCHUYENLOP")
public class HoSoChuyenLop implements Serializable {

    long id;
    Set<ChiTietHoSoChuyenLop> chiTietHoSoChuyenLops = new HashSet<ChiTietHoSoChuyenLop>();

    @Id
    @GeneratedValue
    @Column(name = "ID_HOSOCHUYENLOP")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //quanhe ho so chuyen lop chua chi tiet ho so chuyen lop
    @OneToMany
    @JoinColumn(name = "ID_HOSOCHUYENLOP")
    public Set<ChiTietHoSoChuyenLop> getChiTietHoSoChuyenLops() {
        return chiTietHoSoChuyenLops;
    }

    public void setChiTietHoSoChuyenLops(Set<ChiTietHoSoChuyenLop> chiTietHoSoChuyenLops) {
        this.chiTietHoSoChuyenLops = chiTietHoSoChuyenLops;
    }

    //them chi tiet ho so chuyen lop
    public void addChiTietHoSoChuyenLop(ChiTietHoSoChuyenLop cthscl){
        this.getChiTietHoSoChuyenLops().add(cthscl);
    }
}
