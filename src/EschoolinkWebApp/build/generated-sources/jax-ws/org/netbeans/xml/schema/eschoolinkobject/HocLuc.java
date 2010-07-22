
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HocLuc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HocLuc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tenHocLuc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ghiChu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="diemCanTren" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="diemCanDuoi" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="khongCoMonDuoi" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HocLuc", propOrder = {
    "id",
    "tenHocLuc",
    "ghiChu",
    "diemCanTren",
    "diemCanDuoi",
    "khongCoMonDuoi"
})
public class HocLuc {

    protected long id;
    @XmlElement(required = true)
    protected String tenHocLuc;
    @XmlElement(required = true)
    protected String ghiChu;
    protected double diemCanTren;
    protected double diemCanDuoi;
    protected double khongCoMonDuoi;

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
     * Gets the value of the tenHocLuc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenHocLuc() {
        return tenHocLuc;
    }

    /**
     * Sets the value of the tenHocLuc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenHocLuc(String value) {
        this.tenHocLuc = value;
    }

    /**
     * Gets the value of the ghiChu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGhiChu() {
        return ghiChu;
    }

    /**
     * Sets the value of the ghiChu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGhiChu(String value) {
        this.ghiChu = value;
    }

    /**
     * Gets the value of the diemCanTren property.
     * 
     */
    public double getDiemCanTren() {
        return diemCanTren;
    }

    /**
     * Sets the value of the diemCanTren property.
     * 
     */
    public void setDiemCanTren(double value) {
        this.diemCanTren = value;
    }

    /**
     * Gets the value of the diemCanDuoi property.
     * 
     */
    public double getDiemCanDuoi() {
        return diemCanDuoi;
    }

    /**
     * Sets the value of the diemCanDuoi property.
     * 
     */
    public void setDiemCanDuoi(double value) {
        this.diemCanDuoi = value;
    }

    /**
     * Gets the value of the khongCoMonDuoi property.
     * 
     */
    public double getKhongCoMonDuoi() {
        return khongCoMonDuoi;
    }

    /**
     * Sets the value of the khongCoMonDuoi property.
     * 
     */
    public void setKhongCoMonDuoi(double value) {
        this.khongCoMonDuoi = value;
    }

}
