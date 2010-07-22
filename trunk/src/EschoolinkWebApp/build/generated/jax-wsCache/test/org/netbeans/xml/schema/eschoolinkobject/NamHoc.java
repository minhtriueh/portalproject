
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamHoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NamHoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="hocKy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="namTruoc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="namSau" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamHoc", propOrder = {
    "id",
    "hocKy",
    "namTruoc",
    "namSau"
})
public class NamHoc {

    protected long id;
    protected int hocKy;
    protected int namTruoc;
    protected int namSau;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the hocKy property.
     * 
     */
    public int getHocKy() {
        return hocKy;
    }

    /**
     * Sets the value of the hocKy property.
     * 
     */
    public void setHocKy(int value) {
        this.hocKy = value;
    }

    /**
     * Gets the value of the namTruoc property.
     * 
     */
    public int getNamTruoc() {
        return namTruoc;
    }

    /**
     * Sets the value of the namTruoc property.
     * 
     */
    public void setNamTruoc(int value) {
        this.namTruoc = value;
    }

    /**
     * Gets the value of the namSau property.
     * 
     */
    public int getNamSau() {
        return namSau;
    }

    /**
     * Sets the value of the namSau property.
     * 
     */
    public void setNamSau(int value) {
        this.namSau = value;
    }

}
