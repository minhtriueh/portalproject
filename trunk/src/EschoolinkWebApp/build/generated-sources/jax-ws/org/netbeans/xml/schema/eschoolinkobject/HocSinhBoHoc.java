
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HocSinhBoHoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HocSinhBoHoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}ChiTietHocSinhBoHoc"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HocSinhBoHoc", propOrder = {
    "id",
    "chiTietHocSinhBoHoc"
})
public class HocSinhBoHoc {

    protected long id;
    @XmlElement(name = "ChiTietHocSinhBoHoc", required = true)
    protected ChiTietHocSinhBoHoc chiTietHocSinhBoHoc;

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
     * Gets the value of the chiTietHocSinhBoHoc property.
     * 
     * @return
     *     possible object is
     *     {@link ChiTietHocSinhBoHoc }
     *     
     */
    public ChiTietHocSinhBoHoc getChiTietHocSinhBoHoc() {
        return chiTietHocSinhBoHoc;
    }

    /**
     * Sets the value of the chiTietHocSinhBoHoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChiTietHocSinhBoHoc }
     *     
     */
    public void setChiTietHocSinhBoHoc(ChiTietHocSinhBoHoc value) {
        this.chiTietHocSinhBoHoc = value;
    }

}
