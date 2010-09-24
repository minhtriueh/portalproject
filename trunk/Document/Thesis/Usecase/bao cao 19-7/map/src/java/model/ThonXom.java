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
@Table(name="THONXOM")
public class ThonXom implements Serializable {

    long id;
    String tenThonXom;

    public ThonXom() {
    }

    public ThonXom(String tenThonXom) {
        this.tenThonXom = tenThonXom;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_THONXOM")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenThonXom() {
        return tenThonXom;
    }

    public void setTenThonXom(String tenThonXom) {
        this.tenThonXom = tenThonXom;
    }
}
