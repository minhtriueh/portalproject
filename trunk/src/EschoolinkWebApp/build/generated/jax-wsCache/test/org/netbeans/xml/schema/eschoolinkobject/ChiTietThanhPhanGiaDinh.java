
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ChiTietThanhPhanGiaDinh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChiTietThanhPhanGiaDinh">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tenQuanHe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hoTen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ngaySinh" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ngheNghiep" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChiTietThanhPhanGiaDinh", propOrder = {
    "id",
    "tenQuanHe",
    "hoTen",
    "ngaySinh",
    "ngheNghiep"
})
public class ChiTietThanhPhanGiaDinh {

    protected long id;
    @XmlElement(required = true)
    protected String tenQuanHe;
    @XmlElement(required = true)
    protected String hoTen;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ngaySinh;
    @XmlElement(required = true)
    protected String ngheNghiep;

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
     * Gets the value of the tenQuanHe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenQuanHe() {
        return tenQuanHe;
    }

    /**
     * Sets the value of the tenQuanHe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenQuanHe(String value) {
        this.tenQuanHe = value;
    }

    /**
     * Gets the value of the hoTen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * Sets the value of the hoTen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoTen(String value) {
        this.hoTen = value;
    }

    /**
     * Gets the value of the ngaySinh property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgaySinh() {
        return ngaySinh;
    }

    /**
     * Sets the value of the ngaySinh property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgaySinh(XMLGregorianCalendar value) {
        this.ngaySinh = value;
    }

    /**
     * Gets the value of the ngheNghiep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNgheNghiep() {
        return ngheNghiep;
    }

    /**
     * Sets the value of the ngheNghiep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNgheNghiep(String value) {
        this.ngheNghiep = value;
    }

}
