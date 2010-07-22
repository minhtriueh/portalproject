
package org.netbeans.xml.schema.eschoolinkobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ToBoMon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ToBoMon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tenBoMon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}MonHoc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}GiaoVien" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToBoMon", propOrder = {
    "id",
    "tenBoMon",
    "monHoc",
    "giaoVien"
})
public class ToBoMon {

    protected long id;
    @XmlElement(required = true)
    protected String tenBoMon;
    @XmlElement(name = "MonHoc")
    protected List<MonHoc> monHoc;
    @XmlElement(name = "GiaoVien")
    protected List<GiaoVien> giaoVien;

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
     * Gets the value of the tenBoMon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenBoMon() {
        return tenBoMon;
    }

    /**
     * Sets the value of the tenBoMon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenBoMon(String value) {
        this.tenBoMon = value;
    }

    /**
     * Gets the value of the monHoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monHoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonHoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonHoc }
     * 
     * 
     */
    public List<MonHoc> getMonHoc() {
        if (monHoc == null) {
            monHoc = new ArrayList<MonHoc>();
        }
        return this.monHoc;
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

}
