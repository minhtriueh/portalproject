
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ChiTietHocSinhBoHoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChiTietHocSinhBoHoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="hocKy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ngayBoHoc" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lyDoBoHoc" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "ChiTietHocSinhBoHoc", propOrder = {
    "id",
    "hocKy",
    "ngayBoHoc",
    "lyDoBoHoc",
    "hocSinh"
})
public class ChiTietHocSinhBoHoc {

    protected long id;
    protected int hocKy;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ngayBoHoc;
    @XmlElement(required = true)
    protected String lyDoBoHoc;
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
     * Gets the value of the ngayBoHoc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgayBoHoc() {
        return ngayBoHoc;
    }

    /**
     * Sets the value of the ngayBoHoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgayBoHoc(XMLGregorianCalendar value) {
        this.ngayBoHoc = value;
    }

    /**
     * Gets the value of the lyDoBoHoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLyDoBoHoc() {
        return lyDoBoHoc;
    }

    /**
     * Sets the value of the lyDoBoHoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLyDoBoHoc(String value) {
        this.lyDoBoHoc = value;
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
