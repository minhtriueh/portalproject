/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
@Table(name = "LOAIDIEM")
public class LoaiDiem implements Serializable {

    long id;
    String tenLoaiDiem;
    int heSo;
    String kyHieu;
    List<Diem> diems = new ArrayList<Diem>();

    public LoaiDiem() {
    }

    public LoaiDiem(String tenLoaiDiem, int heSo, String kyHieu) {
        this.tenLoaiDiem = tenLoaiDiem;
        this.heSo = heSo;
        this.kyHieu = kyHieu;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_LOAIDIEM")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }

    public String getKyHieu() {
        return kyHieu;
    }

    public void setKyHieu(String kyHieu) {
        this.kyHieu = kyHieu;
    }

    public String getTenLoaiDiem() {
        return tenLoaiDiem;
    }

    public void setTenLoaiDiem(String tenLoaiDiem) {
        this.tenLoaiDiem = tenLoaiDiem;
    }

    //quanhe loai diem co nhieu diem
    @OneToMany
    @JoinColumn(name = "ID_LOAIDIEM")
    public List<Diem> getDiems() {
        return diems;
    }

    public void setDiems(List<Diem> diems) {
        this.diems = diems;
    }

    //them diem
    public void addDiem(Diem diem){
        this.getDiems().add(diem);
    }
}
