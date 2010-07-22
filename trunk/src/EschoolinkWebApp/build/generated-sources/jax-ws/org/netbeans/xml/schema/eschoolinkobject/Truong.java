
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
 * <p>Java class for Truong complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Truong">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tenTruong" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="diaChiTruong" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ngayThanhLapTruong" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="loaiHinhTruong" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dienThoaiTruong" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="websiteTruong" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gioiThieuTruong" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}CoSo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}HieuTruong" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Truong", propOrder = {
    "id",
    "tenTruong",
    "diaChiTruong",
    "ngayThanhLapTruong",
    "loaiHinhTruong",
    "dienThoaiTruong",
    "websiteTruong",
    "gioiThieuTruong",
    "coSo",
    "hieuTruong"
})
public class Truong {

    protected long id;
    @XmlElement(required = true)
    protected String tenTruong;
    @XmlElement(required = true)
    protected String diaChiTruong;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ngayThanhLapTruong;
    @XmlElement(required = true)
    protected String loaiHinhTruong;
    @XmlElement(required = true)
    protected String dienThoaiTruong;
    @XmlElement(required = true)
    protected String websiteTruong;
    @XmlElement(required = true)
    protected String gioiThieuTruong;
    @XmlElement(name = "CoSo")
    protected List<CoSo> coSo;
    @XmlElement(name = "HieuTruong")
    protected HieuTruong hieuTruong;

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
     * Gets the value of the tenTruong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenTruong() {
        return tenTruong;
    }

    /**
     * Sets the value of the tenTruong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenTruong(String value) {
        this.tenTruong = value;
    }

    /**
     * Gets the value of the diaChiTruong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiaChiTruong() {
        return diaChiTruong;
    }

    /**
     * Sets the value of the diaChiTruong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiaChiTruong(String value) {
        this.diaChiTruong = value;
    }

    /**
     * Gets the value of the ngayThanhLapTruong property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgayThanhLapTruong() {
        return ngayThanhLapTruong;
    }

    /**
     * Sets the value of the ngayThanhLapTruong property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgayThanhLapTruong(XMLGregorianCalendar value) {
        this.ngayThanhLapTruong = value;
    }

    /**
     * Gets the value of the loaiHinhTruong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoaiHinhTruong() {
        return loaiHinhTruong;
    }

    /**
     * Sets the value of the loaiHinhTruong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoaiHinhTruong(String value) {
        this.loaiHinhTruong = value;
    }

    /**
     * Gets the value of the dienThoaiTruong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDienThoaiTruong() {
        return dienThoaiTruong;
    }

    /**
     * Sets the value of the dienThoaiTruong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDienThoaiTruong(String value) {
        this.dienThoaiTruong = value;
    }

    /**
     * Gets the value of the websiteTruong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsiteTruong() {
        return websiteTruong;
    }

    /**
     * Sets the value of the websiteTruong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsiteTruong(String value) {
        this.websiteTruong = value;
    }

    /**
     * Gets the value of the gioiThieuTruong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGioiThieuTruong() {
        return gioiThieuTruong;
    }

    /**
     * Sets the value of the gioiThieuTruong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGioiThieuTruong(String value) {
        this.gioiThieuTruong = value;
    }

    /**
     * Gets the value of the coSo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coSo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoSo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoSo }
     * 
     * 
     */
    public List<CoSo> getCoSo() {
        if (coSo == null) {
            coSo = new ArrayList<CoSo>();
        }
        return this.coSo;
    }

    /**
     * Gets the value of the hieuTruong property.
     * 
     * @return
     *     possible object is
     *     {@link HieuTruong }
     *     
     */
    public HieuTruong getHieuTruong() {
        return hieuTruong;
    }

    /**
     * Sets the value of the hieuTruong property.
     * 
     * @param value
     *     allowed object is
     *     {@link HieuTruong }
     *     
     */
    public void setHieuTruong(HieuTruong value) {
        this.hieuTruong = value;
    }

}
