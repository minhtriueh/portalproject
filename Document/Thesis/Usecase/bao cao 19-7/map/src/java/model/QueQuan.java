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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author nguyentanmo
 */
@Entity
@Table(name = "QUEQUAN")
public class QueQuan implements Serializable {

    long id;
    ThonXom thonXom;
    XaPhuongThiTran xaPhuongThiTran;
    QuanHuyenThanhPho quanHuyenThanhPho;

    public QueQuan() {
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_QUEQUAN")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //quanhe que quan voi quan huyen thanh pho
    @OneToOne
    @JoinColumn(name = "ID_QUANHUYENTHANHPHO")
    public QuanHuyenThanhPho getQuanHuyenThanhPho() {
        return quanHuyenThanhPho;
    }

    public void setQuanHuyenThanhPho(QuanHuyenThanhPho quanHuyenThanhPho) {
        this.quanHuyenThanhPho = quanHuyenThanhPho;
    }

    //quanhe que quan voi thon xom
    @OneToOne
    @JoinColumn(name = "ID_THONXOM")
    public ThonXom getThonXom() {
        return thonXom;
    }

    public void setThonXom(ThonXom thonXom) {
        this.thonXom = thonXom;
    }

    //quanhe que quan voi xa phuong thi tran
    @OneToOne
    @JoinColumn(name = "ID_XAPHUONGTHITRAN")
    public XaPhuongThiTran getXaPhuongThiTran() {
        return xaPhuongThiTran;
    }

    public void setXaPhuongThiTran(XaPhuongThiTran xaPhuongThiTran) {
        this.xaPhuongThiTran = xaPhuongThiTran;
    }
}
