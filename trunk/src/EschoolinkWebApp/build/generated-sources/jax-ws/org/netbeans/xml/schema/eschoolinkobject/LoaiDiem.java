
package org.netbeans.xml.schema.eschoolinkobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoaiDiem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoaiDiem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tenLoaiDiem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="heSo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kyHieu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}Diem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoaiDiem", propOrder = {
    "id",
    "tenLoaiDiem",
    "heSo",
    "kyHieu",
    "diem"
})
public class LoaiDiem {

    protected long id;
    @XmlElement(required = true)
    protected String tenLoaiDiem;
    protected int heSo;
    @XmlElement(required = true)
    protected String kyHieu;
    @XmlElement(name = "Diem", required = true)
    protected List<Diem> diem;

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
     * Gets the value of the tenLoaiDiem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenLoaiDiem() {
        return tenLoaiDiem;
    }

    /**
     * Sets the value of the tenLoaiDiem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenLoaiDiem(String value) {
        this.tenLoaiDiem = value;
    }

    /**
     * Gets the value of the heSo property.
     * 
     */
    public int getHeSo() {
        return heSo;
    }

    /**
     * Sets the value of the heSo property.
     * 
     */
    public void setHeSo(int value) {
        this.heSo = value;
    }

    /**
     * Gets the value of the kyHieu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKyHieu() {
        return kyHieu;
    }

    /**
     * Sets the value of the kyHieu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKyHieu(String value) {
        this.kyHieu = value;
    }

    /**
     * Gets the value of the diem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Diem }
     * 
     * 
     */
    public List<Diem> getDiem() {
        if (diem == null) {
            diem = new ArrayList<Diem>();
        }
        return this.diem;
    }

}
