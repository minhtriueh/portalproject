
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoSoChuyenTruong complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HoSoChuyenTruong">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}ChiTietHoSoChuyenTruong"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoSoChuyenTruong", propOrder = {
    "id",
    "chiTietHoSoChuyenTruong"
})
public class HoSoChuyenTruong {

    protected long id;
    @XmlElement(name = "ChiTietHoSoChuyenTruong", required = true)
    protected ChiTietHoSoChuyenTruong chiTietHoSoChuyenTruong;

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
     * Gets the value of the chiTietHoSoChuyenTruong property.
     * 
     * @return
     *     possible object is
     *     {@link ChiTietHoSoChuyenTruong }
     *     
     */
    public ChiTietHoSoChuyenTruong getChiTietHoSoChuyenTruong() {
        return chiTietHoSoChuyenTruong;
    }

    /**
     * Sets the value of the chiTietHoSoChuyenTruong property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChiTietHoSoChuyenTruong }
     *     
     */
    public void setChiTietHoSoChuyenTruong(ChiTietHoSoChuyenTruong value) {
        this.chiTietHoSoChuyenTruong = value;
    }

}
