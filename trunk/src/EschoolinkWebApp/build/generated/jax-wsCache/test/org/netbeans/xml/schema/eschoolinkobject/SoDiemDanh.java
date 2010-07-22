
package org.netbeans.xml.schema.eschoolinkobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoDiemDanh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoDiemDanh">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}ChiTietSoDiemDanh" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}NamHoc"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoDiemDanh", propOrder = {
    "id",
    "chiTietSoDiemDanh",
    "namHoc"
})
public class SoDiemDanh {

    protected long id;
    @XmlElement(name = "ChiTietSoDiemDanh")
    protected List<ChiTietSoDiemDanh> chiTietSoDiemDanh;
    @XmlElement(name = "NamHoc", required = true)
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
     * Gets the value of the chiTietSoDiemDanh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chiTietSoDiemDanh property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChiTietSoDiemDanh().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChiTietSoDiemDanh }
     * 
     * 
     */
    public List<ChiTietSoDiemDanh> getChiTietSoDiemDanh() {
        if (chiTietSoDiemDanh == null) {
            chiTietSoDiemDanh = new ArrayList<ChiTietSoDiemDanh>();
        }
        return this.chiTietSoDiemDanh;
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
