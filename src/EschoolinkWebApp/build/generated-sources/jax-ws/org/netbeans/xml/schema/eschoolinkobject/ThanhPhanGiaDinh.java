
package org.netbeans.xml.schema.eschoolinkobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThanhPhanGiaDinh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThanhPhanGiaDinh">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}ChiTietThanhPhanGiaDinh" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThanhPhanGiaDinh", propOrder = {
    "id",
    "chiTietThanhPhanGiaDinh"
})
public class ThanhPhanGiaDinh {

    protected long id;
    @XmlElement(name = "ChiTietThanhPhanGiaDinh", required = true)
    protected List<ChiTietThanhPhanGiaDinh> chiTietThanhPhanGiaDinh;

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
     * Gets the value of the chiTietThanhPhanGiaDinh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chiTietThanhPhanGiaDinh property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChiTietThanhPhanGiaDinh().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChiTietThanhPhanGiaDinh }
     * 
     * 
     */
    public List<ChiTietThanhPhanGiaDinh> getChiTietThanhPhanGiaDinh() {
        if (chiTietThanhPhanGiaDinh == null) {
            chiTietThanhPhanGiaDinh = new ArrayList<ChiTietThanhPhanGiaDinh>();
        }
        return this.chiTietThanhPhanGiaDinh;
    }

}
