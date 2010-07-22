
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoSoChuyenLop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HoSoChuyenLop">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}ChiTietHoSoChuyenLop"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoSoChuyenLop", propOrder = {
    "id",
    "chiTietHoSoChuyenLop"
})
public class HoSoChuyenLop {

    protected long id;
    @XmlElement(name = "ChiTietHoSoChuyenLop", required = true)
    protected ChiTietHoSoChuyenLop chiTietHoSoChuyenLop;

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
     * Gets the value of the chiTietHoSoChuyenLop property.
     * 
     * @return
     *     possible object is
     *     {@link ChiTietHoSoChuyenLop }
     *     
     */
    public ChiTietHoSoChuyenLop getChiTietHoSoChuyenLop() {
        return chiTietHoSoChuyenLop;
    }

    /**
     * Sets the value of the chiTietHoSoChuyenLop property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChiTietHoSoChuyenLop }
     *     
     */
    public void setChiTietHoSoChuyenLop(ChiTietHoSoChuyenLop value) {
        this.chiTietHoSoChuyenLop = value;
    }

}
