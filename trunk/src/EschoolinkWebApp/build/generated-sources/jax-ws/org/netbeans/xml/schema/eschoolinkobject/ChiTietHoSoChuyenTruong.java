
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ChiTietHoSoChuyenTruong complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChiTietHoSoChuyenTruong">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="truongChuyenDi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="truongChuyenDen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ngayChuyenTruong" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lyDoChuyen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}HocSinh"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChiTietHoSoChuyenTruong", propOrder = {
    "id",
    "truongChuyenDi",
    "truongChuyenDen",
    "ngayChuyenTruong",
    "lyDoChuyen",
    "hocSinh"
})
public class ChiTietHoSoChuyenTruong {

    protected long id;
    @XmlElement(required = true)
    protected String truongChuyenDi;
    @XmlElement(required = true)
    protected String truongChuyenDen;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ngayChuyenTruong;
    @XmlElement(required = true)
    protected String lyDoChuyen;
    @XmlElement(name = "HocSinh", required = true)
    protected HocSinh hocSinh;

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
     * Gets the value of the truongChuyenDi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTruongChuyenDi() {
        return truongChuyenDi;
    }

    /**
     * Sets the value of the truongChuyenDi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTruongChuyenDi(String value) {
        this.truongChuyenDi = value;
    }

    /**
     * Gets the value of the truongChuyenDen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTruongChuyenDen() {
        return truongChuyenDen;
    }

    /**
     * Sets the value of the truongChuyenDen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTruongChuyenDen(String value) {
        this.truongChuyenDen = value;
    }

    /**
     * Gets the value of the ngayChuyenTruong property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgayChuyenTruong() {
        return ngayChuyenTruong;
    }

    /**
     * Sets the value of the ngayChuyenTruong property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgayChuyenTruong(XMLGregorianCalendar value) {
        this.ngayChuyenTruong = value;
    }

    /**
     * Gets the value of the lyDoChuyen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLyDoChuyen() {
        return lyDoChuyen;
    }

    /**
     * Sets the value of the lyDoChuyen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLyDoChuyen(String value) {
        this.lyDoChuyen = value;
    }

    /**
     * Gets the value of the hocSinh property.
     * 
     * @return
     *     possible object is
     *     {@link HocSinh }
     *     
     */
    public HocSinh getHocSinh() {
        return hocSinh;
    }

    /**
     * Sets the value of the hocSinh property.
     * 
     * @param value
     *     allowed object is
     *     {@link HocSinh }
     *     
     */
    public void setHocSinh(HocSinh value) {
        this.hocSinh = value;
    }

}
