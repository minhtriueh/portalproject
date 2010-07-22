
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChiTietHocBa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChiTietHocBa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nhanXet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}HanhKiem" minOccurs="0"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}HocLuc" minOccurs="0"/>
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
@XmlType(name = "ChiTietHocBa", propOrder = {
    "id",
    "nhanXet",
    "hanhKiem",
    "hocLuc",
    "namHoc"
})
public class ChiTietHocBa {

    protected long id;
    @XmlElement(required = true)
    protected String nhanXet;
    @XmlElement(name = "HanhKiem")
    protected HanhKiem hanhKiem;
    @XmlElement(name = "HocLuc")
    protected HocLuc hocLuc;
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
     * Gets the value of the nhanXet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNhanXet() {
        return nhanXet;
    }

    /**
     * Sets the value of the nhanXet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNhanXet(String value) {
        this.nhanXet = value;
    }

    /**
     * Gets the value of the hanhKiem property.
     * 
     * @return
     *     possible object is
     *     {@link HanhKiem }
     *     
     */
    public HanhKiem getHanhKiem() {
        return hanhKiem;
    }

    /**
     * Sets the value of the hanhKiem property.
     * 
     * @param value
     *     allowed object is
     *     {@link HanhKiem }
     *     
     */
    public void setHanhKiem(HanhKiem value) {
        this.hanhKiem = value;
    }

    /**
     * Gets the value of the hocLuc property.
     * 
     * @return
     *     possible object is
     *     {@link HocLuc }
     *     
     */
    public HocLuc getHocLuc() {
        return hocLuc;
    }

    /**
     * Sets the value of the hocLuc property.
     * 
     * @param value
     *     allowed object is
     *     {@link HocLuc }
     *     
     */
    public void setHocLuc(HocLuc value) {
        this.hocLuc = value;
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
