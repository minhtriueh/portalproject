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
@Table(name = "HANHKIEM")
public class HanhKiem implements Serializable {

    long id;
    String tenHanhKiem;
    String ghiChu;

    public HanhKiem() {
    }

    public HanhKiem(String tenHanhKiem, String ghiChu) {
        this.tenHanhKiem = tenHanhKiem;
        this.ghiChu = ghiChu;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_HANHKIEM")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getTenHanhKiem() {
        return tenHanhKiem;
    }

    public void setTenHanhKiem(String tenHanhKiem) {
        this.tenHanhKiem = tenHanhKiem;
    }
}
