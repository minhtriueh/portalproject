
package org.netbeans.xml.schema.eschoolinkobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChiTietSoDiem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChiTietSoDiem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}LoaiDiem" maxOccurs="unbounded"/>
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
@XmlType(name = "ChiTietSoDiem", propOrder = {
    "id",
    "loaiDiem",
    "hocSinh"
})
public class ChiTietSoDiem {

    protected long id;
    @XmlElement(name = "LoaiDiem", required = true)
    protected List<LoaiDiem> loaiDiem;
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
     * Gets the value of the loaiDiem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loaiDiem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoaiDiem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoaiDiem }
     * 
     * 
     */
    public List<LoaiDiem> getLoaiDiem() {
        if (loaiDiem == null) {
            loaiDiem = new ArrayList<LoaiDiem>();
        }
        return this.loaiDiem;
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
