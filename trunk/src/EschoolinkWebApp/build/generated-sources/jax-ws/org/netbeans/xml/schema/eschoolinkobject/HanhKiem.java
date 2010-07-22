
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HanhKiem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HanhKiem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tenHanhKiem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ghiChu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HanhKiem", propOrder = {
    "id",
    "tenHanhKiem",
    "ghiChu"
})
public class HanhKiem {

    protected long id;
    @XmlElement(required = true)
    protected String tenHanhKiem;
    @XmlElement(required = true)
    protected String ghiChu;

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
     * Gets the value of the tenHanhKiem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenHanhKiem() {
        return tenHanhKiem;
    }

    /**
     * Sets the value of the tenHanhKiem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenHanhKiem(String value) {
        this.tenHanhKiem = value;
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

}
