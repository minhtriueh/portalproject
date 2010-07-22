
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoaiHocSinh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoaiHocSinh">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tenLoaiHocSinh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="moTa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoaiHocSinh", propOrder = {
    "id",
    "tenLoaiHocSinh",
    "moTa"
})
public class LoaiHocSinh {

    protected long id;
    @XmlElement(required = true)
    protected String tenLoaiHocSinh;
    @XmlElement(required = true)
    protected String moTa;

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
     * Gets the value of the tenLoaiHocSinh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenLoaiHocSinh() {
        return tenLoaiHocSinh;
    }

    /**
     * Sets the value of the tenLoaiHocSinh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenLoaiHocSinh(String value) {
        this.tenLoaiHocSinh = value;
    }

    /**
     * Gets the value of the moTa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoTa() {
        return moTa;
    }

    /**
     * Sets the value of the moTa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoTa(String value) {
        this.moTa = value;
    }

}
