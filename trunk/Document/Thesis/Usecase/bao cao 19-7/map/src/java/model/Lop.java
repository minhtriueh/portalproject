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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author nguyentanmo
 */
@Entity
@Table(name = "LOP")
public class Lop implements Serializable {

    long id;
    String tenLop;
    int siSoLop;
    Set<GiaoVien> giaoViens = new HashSet<GiaoVien>();
    Set<MonHoc> monHocs = new HashSet<MonHoc>();
    GiaoVienChuNhiem giaoVienChuNhiem;
    Set<HocSinh> hocSinhs = new HashSet<HocSinh>();

    public Lop() {
    }

    public Lop(String tenLop, int siSoLop) {
        this.tenLop = tenLop;
        this.siSoLop = siSoLop;
    }

    @Id
    @Column(name = "ID_LOP")
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSiSoLop() {
        return siSoLop;
    }

    public void setSiSoLop(int siSoLop) {
        this.siSoLop = siSoLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    //quanhe lop duoc day boi nhieu giao vien
    @ManyToMany(mappedBy = "lops")
    public Set<GiaoVien> getGiaoViens() {
        return giaoViens;
    }

    public void setGiaoViens(Set<GiaoVien> giaoViens) {
        this.giaoViens = giaoViens;
    }

    //quanhe lop hoc nhieu mon
    @ManyToMany
    public Set<MonHoc> getMonHocs() {
        return monHocs;
    }

    public void setMonHocs(Set<MonHoc> monHocs) {
        this.monHocs = monHocs;
    }

    //quanhe lop voi giao vien chu nhiem
    @OneToOne
    @JoinColumn(name = "ID_GIAOVIENCHUNHIEM")
    public GiaoVienChuNhiem getGiaoVienChuNhiem() {
        return giaoVienChuNhiem;
    }

    public void setGiaoVienChuNhiem(GiaoVienChuNhiem giaoVienChuNhiem) {
        this.giaoVienChuNhiem = giaoVienChuNhiem;
    }

    //quanhe lop co nhieu hoc sinh
    @OneToMany
    @JoinColumn(name = "ID_LOP")
    public Set<HocSinh> getHocSinhs() {
        return hocSinhs;
    }

    public void setHocSinhs(Set<HocSinh> hocSinhs) {
        this.hocSinhs = hocSinhs;
    }

    //them mon hoc cho lop
    public void addMonHoc(MonHoc mh) {
        this.getMonHocs().add(mh);
        mh.getLops().add(this);
    }

    //them hoc sinh cho lop
    public void addHocSinh(HocSinh hs){
        this.getHocSinhs().add(hs);
    }
}
