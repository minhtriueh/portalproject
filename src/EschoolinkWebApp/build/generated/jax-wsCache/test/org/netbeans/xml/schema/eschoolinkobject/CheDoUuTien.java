
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheDoUuTien complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheDoUuTien">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tenCheDoUuTien" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phanTramDuocGiam" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="chuThich" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheDoUuTien", propOrder = {
    "id",
    "tenCheDoUuTien",
    "phanTramDuocGiam",
    "chuThich"
})
public class CheDoUuTien {

    protected long id;
    @XmlElement(required = true)
    protected String tenCheDoUuTien;
    protected double phanTramDuocGiam;
    @XmlElement(required = true)
    protected String chuThich;

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
     * Gets the value of the tenCheDoUuTien property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenCheDoUuTien() {
        return tenCheDoUuTien;
    }

    /**
     * Sets the value of the tenCheDoUuTien property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenCheDoUuTien(String value) {
        this.tenCheDoUuTien = value;
    }

    /**
     * Gets the value of the phanTramDuocGiam property.
     * 
     */
    public double getPhanTramDuocGiam() {
        return phanTramDuocGiam;
    }

    /**
     * Sets the value of the phanTramDuocGiam property.
     * 
     */
    public void setPhanTramDuocGiam(double value) {
        this.phanTramDuocGiam = value;
    }

    /**
     * Gets the value of the chuThich property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChuThich() {
        return chuThich;
    }

    /**
     * Sets the value of the chuThich property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChuThich(String value) {
        this.chuThich = value;
    }

}
