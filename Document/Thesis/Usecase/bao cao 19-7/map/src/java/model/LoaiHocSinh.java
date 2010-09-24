/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author nguyentanmo
 */
@Entity
@Table(name = "LOAIHOCSINH")
public class LoaiHocSinh implements Serializable {

    long id;
    String tenLoaiHocSinh;
    String moTa;

    public LoaiHocSinh() {
    }

    public LoaiHocSinh(String tenLoaiHocSinh, String moTa) {
        this.tenLoaiHocSinh = tenLoaiHocSinh;
        this.moTa = moTa;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_LOAIHOCSINH")
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

    public String getTenLoaiHocSinh() {
        return tenLoaiHocSinh;
    }

    public void setTenLoaiHocSinh(String tenLoaiHocSinh) {
        this.tenLoaiHocSinh = tenLoaiHocSinh;
    }
}
