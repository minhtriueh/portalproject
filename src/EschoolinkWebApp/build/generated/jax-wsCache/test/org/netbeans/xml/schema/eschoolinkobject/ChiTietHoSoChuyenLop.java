
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ChiTietHoSoChuyenLop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChiTietHoSoChuyenLop">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="hocKy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lopChuyenDi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lopChuyenDen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ngayChuyenLop" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
@XmlType(name = "ChiTietHoSoChuyenLop", propOrder = {
    "id",
    "hocKy",
    "lopChuyenDi",
    "lopChuyenDen",
    "ngayChuyenLop",
    "lyDoChuyen",
    "hocSinh"
})
public class ChiTietHoSoChuyenLop {

    protected long id;
    protected int hocKy;
    @XmlElement(required = true)
    protected String lopChuyenDi;
    @XmlElement(required = true)
    protected String lopChuyenDen;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ngayChuyenLop;
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
     * Gets the value of the lopChuyenDi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLopChuyenDi() {
        return lopChuyenDi;
    }

    /**
     * Sets the value of the lopChuyenDi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLopChuyenDi(String value) {
        this.lopChuyenDi = value;
    }

    /**
     * Gets the value of the lopChuyenDen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLopChuyenDen() {
        return lopChuyenDen;
    }

    /**
     * Sets the value of the lopChuyenDen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLopChuyenDen(String value) {
        this.lopChuyenDen = value;
    }

    /**
     * Gets the value of the ngayChuyenLop property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgayChuyenLop() {
        return ngayChuyenLop;
    }

    /**
     * Sets the value of the ngayChuyenLop property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgayChuyenLop(XMLGregorianCalendar value) {
        this.ngayChuyenLop = value;
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
