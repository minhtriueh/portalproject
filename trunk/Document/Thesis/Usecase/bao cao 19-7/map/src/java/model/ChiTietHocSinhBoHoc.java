/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author nguyentanmo
 */
@Entity
@Table(name = "CHITIETHOCSINHBOHOC")
public class ChiTietHocSinhBoHoc implements Serializable {

    long id;
    int hocKy;
    Date ngayBoHoc;
    String lyDoBoHoc;
    HocSinh hocSinh;

    public ChiTietHocSinhBoHoc() {
    }

    public ChiTietHocSinhBoHoc(int hocKy, Date ngayBoHoc, String lyDoBoHoc) {
        this.hocKy = hocKy;
        this.ngayBoHoc = ngayBoHoc;
        this.lyDoBoHoc = lyDoBoHoc;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_CHITIETHOCSINHBOHOC")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getHocKy() {
        return hocKy;
    }

    public void setHocKy(int hocKy) {
        this.hocKy = hocKy;
    }

    public String getLyDoBoHoc() {
        return lyDoBoHoc;
    }

    public void setLyDoBoHoc(String lyDoBoHoc) {
        this.lyDoBoHoc = lyDoBoHoc;
    }

    @Temporal(TemporalType.DATE)
    public Date getNgayBoHoc() {
        return ngayBoHoc;
    }

    public void setNgayBoHoc(Date ngayBoHoc) {
        this.ngayBoHoc = ngayBoHoc;
    }

    //quanhe chi tiet hoc sinh bo hoc chua hoc sinh
    @OneToOne
    @JoinColumn(name = "ID_HOCSINH")
    public HocSinh getHocSinh() {
        return hocSinh;
    }

    public void setHocSinh(HocSinh hocSinh) {
        this.hocSinh = hocSinh;
    }
}
