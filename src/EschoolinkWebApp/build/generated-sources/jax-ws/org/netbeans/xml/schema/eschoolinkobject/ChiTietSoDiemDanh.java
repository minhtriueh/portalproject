
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ChiTietSoDiemDanh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChiTietSoDiemDanh">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ngayNghi" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="buoiNghi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lyDoNghi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="coPhepHayKhong" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "ChiTietSoDiemDanh", propOrder = {
    "id",
    "ngayNghi",
    "buoiNghi",
    "lyDoNghi",
    "coPhepHayKhong",
    "hocSinh"
})
public class ChiTietSoDiemDanh {

    protected long id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ngayNghi;
    @XmlElement(required = true)
    protected String buoiNghi;
    @XmlElement(required = true)
    protected String lyDoNghi;
    protected boolean coPhepHayKhong;
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
     * Gets the value of the ngayNghi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgayNghi() {
        return ngayNghi;
    }

    /**
     * Sets the value of the ngayNghi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgayNghi(XMLGregorianCalendar value) {
        this.ngayNghi = value;
    }

    /**
     * Gets the value of the buoiNghi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuoiNghi() {
        return buoiNghi;
    }

    /**
     * Sets the value of the buoiNghi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuoiNghi(String value) {
        this.buoiNghi = value;
    }

    /**
     * Gets the value of the lyDoNghi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLyDoNghi() {
        return lyDoNghi;
    }

    /**
     * Sets the value of the lyDoNghi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLyDoNghi(String value) {
        this.lyDoNghi = value;
    }

    /**
     * Gets the value of the coPhepHayKhong property.
     * 
     */
    public boolean isCoPhepHayKhong() {
        return coPhepHayKhong;
    }

    /**
     * Sets the value of the coPhepHayKhong property.
     * 
     */
    public void setCoPhepHayKhong(boolean value) {
        this.coPhepHayKhong = value;
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
