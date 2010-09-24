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
@Table(name = "DANTOC")
public class DanToc implements Serializable {

    long id;
    String tenDanToc;
    boolean danTocThieuSo;

    public DanToc() {
    }

    public DanToc(String tenDanToc, boolean danTocThieuSo) {
        this.tenDanToc = tenDanToc;
        this.danTocThieuSo = danTocThieuSo;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_DANTOC")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isDanTocThieuSo() {
        return danTocThieuSo;
    }

    public void setDanTocThieuSo(boolean danTocThieuSo) {
        this.danTocThieuSo = danTocThieuSo;
    }

    public String getTenDanToc() {
        return tenDanToc;
    }

    public void setTenDanToc(String tenDanToc) {
        this.tenDanToc = tenDanToc;
    }
}
