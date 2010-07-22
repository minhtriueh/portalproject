
package org.netbeans.xml.schema.eschoolinkobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KhoiLop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KhoiLop">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tenKhoi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}Lop" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KhoiLop", propOrder = {
    "id",
    "tenKhoi",
    "lop"
})
public class KhoiLop {

    protected long id;
    @XmlElement(required = true)
    protected String tenKhoi;
    @XmlElement(name = "Lop")
    protected List<Lop> lop;

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
     * Gets the value of the tenKhoi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenKhoi() {
        return tenKhoi;
    }

    /**
     * Sets the value of the tenKhoi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenKhoi(String value) {
        this.tenKhoi = value;
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

}
