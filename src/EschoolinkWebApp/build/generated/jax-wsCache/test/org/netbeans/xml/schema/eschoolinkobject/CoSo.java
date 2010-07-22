
package org.netbeans.xml.schema.eschoolinkobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CoSo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoSo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tenCoSo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="diaChiCoSo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ngayThanhLapCoSo" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="dienThoaiCoSo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="websiteCoSo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gioiThieuCoSo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}ToBoMon" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}KhoiLop" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoSo", propOrder = {
    "id",
    "tenCoSo",
    "diaChiCoSo",
    "ngayThanhLapCoSo",
    "dienThoaiCoSo",
    "websiteCoSo",
    "gioiThieuCoSo",
    "toBoMon",
    "khoiLop"
})
public class CoSo {

    protected long id;
    @XmlElement(required = true)
    protected String tenCoSo;
    @XmlElement(required = true)
    protected String diaChiCoSo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ngayThanhLapCoSo;
    @XmlElement(required = true)
    protected String dienThoaiCoSo;
    @XmlElement(required = true)
    protected String websiteCoSo;
    @XmlElement(required = true)
    protected String gioiThieuCoSo;
    @XmlElement(name = "ToBoMon")
    protected List<ToBoMon> toBoMon;
    @XmlElement(name = "KhoiLop")
    protected List<KhoiLop> khoiLop;

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
     * Gets the value of the tenCoSo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenCoSo() {
        return tenCoSo;
    }

    /**
     * Sets the value of the tenCoSo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenCoSo(String value) {
        this.tenCoSo = value;
    }

    /**
     * Gets the value of the diaChiCoSo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiaChiCoSo() {
        return diaChiCoSo;
    }

    /**
     * Sets the value of the diaChiCoSo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiaChiCoSo(String value) {
        this.diaChiCoSo = value;
    }

    /**
     * Gets the value of the ngayThanhLapCoSo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgayThanhLapCoSo() {
        return ngayThanhLapCoSo;
    }

    /**
     * Sets the value of the ngayThanhLapCoSo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgayThanhLapCoSo(XMLGregorianCalendar value) {
        this.ngayThanhLapCoSo = value;
    }

    /**
     * Gets the value of the dienThoaiCoSo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDienThoaiCoSo() {
        return dienThoaiCoSo;
    }

    /**
     * Sets the value of the dienThoaiCoSo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDienThoaiCoSo(String value) {
        this.dienThoaiCoSo = value;
    }

    /**
     * Gets the value of the websiteCoSo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsiteCoSo() {
        return websiteCoSo;
    }

    /**
     * Sets the value of the websiteCoSo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsiteCoSo(String value) {
        this.websiteCoSo = value;
    }

    /**
     * Gets the value of the gioiThieuCoSo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGioiThieuCoSo() {
        return gioiThieuCoSo;
    }

    /**
     * Sets the value of the gioiThieuCoSo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGioiThieuCoSo(String value) {
        this.gioiThieuCoSo = value;
    }

    /**
     * Gets the value of the toBoMon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toBoMon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToBoMon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ToBoMon }
     * 
     * 
     */
    public List<ToBoMon> getToBoMon() {
        if (toBoMon == null) {
            toBoMon = new ArrayList<ToBoMon>();
        }
        return this.toBoMon;
    }

    /**
     * Gets the value of the khoiLop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the khoiLop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKhoiLop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KhoiLop }
     * 
     * 
     */
    public List<KhoiLop> getKhoiLop() {
        if (khoiLop == null) {
            khoiLop = new ArrayList<KhoiLop>();
        }
        return this.khoiLop;
    }

}
