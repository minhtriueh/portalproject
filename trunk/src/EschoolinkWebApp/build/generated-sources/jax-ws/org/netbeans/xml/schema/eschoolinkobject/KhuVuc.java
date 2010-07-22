
package org.netbeans.xml.schema.eschoolinkobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KhuVuc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KhuVuc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tenKhuVuc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="moTa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}QuanHuyenThanhPho" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KhuVuc", propOrder = {
    "id",
    "tenKhuVuc",
    "moTa",
    "quanHuyenThanhPho"
})
public class KhuVuc {

    protected long id;
    @XmlElement(required = true)
    protected String tenKhuVuc;
    @XmlElement(required = true)
    protected String moTa;
    @XmlElement(name = "QuanHuyenThanhPho", required = true)
    protected List<QuanHuyenThanhPho> quanHuyenThanhPho;

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
     * Gets the value of the tenKhuVuc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenKhuVuc() {
        return tenKhuVuc;
    }

    /**
     * Sets the value of the tenKhuVuc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenKhuVuc(String value) {
        this.tenKhuVuc = value;
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
     * Gets the value of the quanHuyenThanhPho property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quanHuyenThanhPho property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuanHuyenThanhPho().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuanHuyenThanhPho }
     * 
     * 
     */
    public List<QuanHuyenThanhPho> getQuanHuyenThanhPho() {
        if (quanHuyenThanhPho == null) {
            quanHuyenThanhPho = new ArrayList<QuanHuyenThanhPho>();
        }
        return this.quanHuyenThanhPho;
    }

}
