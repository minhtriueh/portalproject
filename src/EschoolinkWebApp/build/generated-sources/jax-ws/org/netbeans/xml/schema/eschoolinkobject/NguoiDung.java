
package org.netbeans.xml.schema.eschoolinkobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NguoiDung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NguoiDung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}GiaoVien" minOccurs="0"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}HocSinh" minOccurs="0"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}Quyen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}Nhom" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NguoiDung", propOrder = {
    "id",
    "username",
    "password",
    "giaoVien",
    "hocSinh",
    "quyen",
    "nhom"
})
public class NguoiDung {

    protected long id;
    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(name = "GiaoVien")
    protected GiaoVien giaoVien;
    @XmlElement(name = "HocSinh")
    protected HocSinh hocSinh;
    @XmlElement(name = "Quyen")
    protected List<Quyen> quyen;
    @XmlElement(name = "Nhom")
    protected List<Nhom> nhom;

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
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the giaoVien property.
     * 
     * @return
     *     possible object is
     *     {@link GiaoVien }
     *     
     */
    public GiaoVien getGiaoVien() {
        return giaoVien;
    }

    /**
     * Sets the value of the giaoVien property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiaoVien }
     *     
     */
    public void setGiaoVien(GiaoVien value) {
        this.giaoVien = value;
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
     * Gets the value of the quyen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quyen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuyen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Quyen }
     * 
     * 
     */
    public List<Quyen> getQuyen() {
        if (quyen == null) {
            quyen = new ArrayList<Quyen>();
        }
        return this.quyen;
    }

    /**
     * Gets the value of the nhom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nhom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNhom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Nhom }
     * 
     * 
     */
    public List<Nhom> getNhom() {
        if (nhom == null) {
            nhom = new ArrayList<Nhom>();
        }
        return this.nhom;
    }

}
