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
@Table(name = "NAMHOC")
public class NamHoc implements Serializable {

    long id;
    int hocKy;
    int namTruoc;
    int namSau;

    public NamHoc() {
    }

    public NamHoc(int hocKy, int namTruoc, int namSau) {
        this.hocKy = hocKy;
        this.namTruoc = namTruoc;
        this.namSau = namSau;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_NAMHOC")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
