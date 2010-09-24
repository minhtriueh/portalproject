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
@Table(name = "QUANHUYENTHANHPHO")
public class QuanHuyenThanhPho implements Serializable {

    long id;
    String tenQuanHuyenThanhPho;
    Set<XaPhuongThiTran> xaPhuongThiTrans = new HashSet<XaPhuongThiTran>();

    public QuanHuyenThanhPho() {
    }

    public QuanHuyenThanhPho(String tenQuanHuyenThanhPho) {
        this.tenQuanHuyenThanhPho = tenQuanHuyenThanhPho;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_QUANHUYENTHANHPHO")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenQuanHuyenThanhPho() {
        return tenQuanHuyenThanhPho;
    }

    public void setTenQuanHuyenThanhPho(String tenQuanHuyenThanhPho) {
        this.tenQuanHuyenThanhPho = tenQuanHuyenThanhPho;
    }

    //quanhe huyen co nhieu xa
    @OneToMany
    @JoinColumn(name = "ID_QUANHUYENTHANHPHO")
    public Set<XaPhuongThiTran> getXaPhuongThiTrans() {
        return xaPhuongThiTrans;
    }

    public void setXaPhuongThiTrans(Set<XaPhuongThiTran> xaPhuongThiTrans) {
        this.xaPhuongThiTrans = xaPhuongThiTrans;
    }

    //them xa vao huyen
    public void addXaPhuongThiTran(XaPhuongThiTran xptt){
        this.getXaPhuongThiTrans().add(xptt);
    }
}
