
package org.netbeans.xml.schema.eschoolinkobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoDiemChuNhiem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoDiemChuNhiem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}SoDiem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}ChiTietHocBa" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoDiemChuNhiem", propOrder = {
    "id",
    "soDiem",
    "chiTietHocBa"
})
public class SoDiemChuNhiem {

    protected long id;
    @XmlElement(name = "SoDiem")
    protected List<SoDiem> soDiem;
    @XmlElement(name = "ChiTietHocBa")
    protected List<ChiTietHocBa> chiTietHocBa;

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
     * Gets the value of the soDiem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soDiem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoDiem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoDiem }
     * 
     * 
     */
    public List<SoDiem> getSoDiem() {
        if (soDiem == null) {
            soDiem = new ArrayList<SoDiem>();
        }
        return this.soDiem;
    }

    /**
     * Gets the value of the chiTietHocBa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chiTietHocBa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChiTietHocBa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChiTietHocBa }
     * 
     * 
     */
    public List<ChiTietHocBa> getChiTietHocBa() {
        if (chiTietHocBa == null) {
            chiTietHocBa = new ArrayList<ChiTietHocBa>();
        }
        return this.chiTietHocBa;
    }

}
