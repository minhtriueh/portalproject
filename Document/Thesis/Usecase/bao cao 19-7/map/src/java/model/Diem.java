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
@Table(name = "DIEM")
public class Diem implements Serializable {

    long id;
    double diem;
    int lan;

    public Diem() {
    }

    public Diem(double diem, int lan) {
        this.diem = diem;
        this.lan = lan;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_DIEM")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public int getLan() {
        return lan;
    }

    public void setLan(int lan) {
        this.lan = lan;
    }
}
