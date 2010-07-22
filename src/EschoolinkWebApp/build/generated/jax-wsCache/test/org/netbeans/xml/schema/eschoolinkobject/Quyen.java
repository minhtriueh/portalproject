
package org.netbeans.xml.schema.eschoolinkobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quyen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Quyen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tenQuyen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="moTa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}NguoiDung" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Quyen", propOrder = {
    "id",
    "tenQuyen",
    "moTa",
    "nguoiDung",
    "nhom"
})
public class Quyen {

    protected long id;
    @XmlElement(required = true)
    protected String tenQuyen;
    @XmlElement(required = true)
    protected String moTa;
    @XmlElement(name = "NguoiDung")
    protected List<NguoiDung> nguoiDung;
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
     * Gets the value of the tenQuyen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenQuyen() {
        return tenQuyen;
    }

    /**
     * Sets the value of the tenQuyen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenQuyen(String value) {
        this.tenQuyen = value;
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

    /**
     * Gets the value of the nguoiDung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nguoiDung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNguoiDung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NguoiDung }
     * 
     * 
     */
    public List<NguoiDung> getNguoiDung() {
        if (nguoiDung == null) {
            nguoiDung = new ArrayList<NguoiDung>();
        }
        return this.nguoiDung;
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
