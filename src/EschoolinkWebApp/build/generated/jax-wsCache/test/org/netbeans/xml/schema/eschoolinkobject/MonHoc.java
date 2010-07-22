
package org.netbeans.xml.schema.eschoolinkobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonHoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonHoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tenMonHoc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}GiaoVien" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}Lop" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}SoDiem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonHoc", propOrder = {
    "id",
    "tenMonHoc",
    "giaoVien",
    "lop",
    "soDiem"
})
public class MonHoc {

    protected long id;
    @XmlElement(required = true)
    protected String tenMonHoc;
    @XmlElement(name = "GiaoVien")
    protected List<GiaoVien> giaoVien;
    @XmlElement(name = "Lop")
    protected List<Lop> lop;
    @XmlElement(name = "SoDiem")
    protected SoDiem soDiem;

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
     * Gets the value of the tenMonHoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenMonHoc() {
        return tenMonHoc;
    }

    /**
     * Sets the value of the tenMonHoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenMonHoc(String value) {
        this.tenMonHoc = value;
    }

    /**
     * Gets the value of the giaoVien property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giaoVien property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiaoVien().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GiaoVien }
     * 
     * 
     */
    public List<GiaoVien> getGiaoVien() {
        if (giaoVien == null) {
            giaoVien = new ArrayList<GiaoVien>();
        }
        return this.giaoVien;
    }

    /**
     * Gets the value of the lop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lop }
     * 
     * 
     */
    public List<Lop> getLop() {
        if (lop == null) {
            lop = new ArrayList<Lop>();
        }
        return this.lop;
    }

    /**
     * Gets the value of the soDiem property.
     * 
     * @return
     *     possible object is
     *     {@link SoDiem }
     *     
     */
    public SoDiem getSoDiem() {
        return soDiem;
    }

    /**
     * Sets the value of the soDiem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoDiem }
     *     
     */
    public void setSoDiem(SoDiem value) {
        this.soDiem = value;
    }

}
