
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChiTietHocPhi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChiTietHocPhi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tenLoaiHocPhi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tienCanDong" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tienDaDong" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="daDongDuChua" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="chuThich" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}HocSinh" minOccurs="0"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}NamHoc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChiTietHocPhi", propOrder = {
    "id",
    "tenLoaiHocPhi",
    "tienCanDong",
    "tienDaDong",
    "daDongDuChua",
    "chuThich",
    "hocSinh",
    "namHoc"
})
public class ChiTietHocPhi {

    protected long id;
    @XmlElement(required = true)
    protected String tenLoaiHocPhi;
    protected double tienCanDong;
    protected double tienDaDong;
    protected boolean daDongDuChua;
    @XmlElement(required = true)
    protected String chuThich;
    @XmlElement(name = "HocSinh")
    protected HocSinh hocSinh;
    @XmlElement(name = "NamHoc")
    protected NamHoc namHoc;

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
     * Gets the value of the tenLoaiHocPhi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenLoaiHocPhi() {
        return tenLoaiHocPhi;
    }

    /**
     * Sets the value of the tenLoaiHocPhi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenLoaiHocPhi(String value) {
        this.tenLoaiHocPhi = value;
    }

    /**
     * Gets the value of the tienCanDong property.
     * 
     */
    public double getTienCanDong() {
        return tienCanDong;
    }

    /**
     * Sets the value of the tienCanDong property.
     * 
     */
    public void setTienCanDong(double value) {
        this.tienCanDong = value;
    }

    /**
     * Gets the value of the tienDaDong property.
     * 
     */
    public double getTienDaDong() {
        return tienDaDong;
    }

    /**
     * Sets the value of the tienDaDong property.
     * 
     */
    public void setTienDaDong(double value) {
        this.tienDaDong = value;
    }

    /**
     * Gets the value of the daDongDuChua property.
     * 
     */
    public boolean isDaDongDuChua() {
        return daDongDuChua;
    }

    /**
     * Sets the value of the daDongDuChua property.
     * 
     */
    public void setDaDongDuChua(boolean value) {
        this.daDongDuChua = value;
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

    /**
     * Gets the value of the namHoc property.
     * 
     * @return
     *     possible object is
     *     {@link NamHoc }
     *     
     */
    public NamHoc getNamHoc() {
        return namHoc;
    }

    /**
     * Sets the value of the namHoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamHoc }
     *     
     */
    public void setNamHoc(NamHoc value) {
        this.namHoc = value;
    }

}
