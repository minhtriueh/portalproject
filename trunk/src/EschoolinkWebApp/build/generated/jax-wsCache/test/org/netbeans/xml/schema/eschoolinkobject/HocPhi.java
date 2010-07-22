
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HocPhi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HocPhi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}ChiTietHocPhi"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HocPhi", propOrder = {
    "id",
    "chiTietHocPhi"
})
public class HocPhi {

    protected long id;
    @XmlElement(name = "ChiTietHocPhi", required = true)
    protected ChiTietHocPhi chiTietHocPhi;

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
     * Gets the value of the chiTietHocPhi property.
     * 
     * @return
     *     possible object is
     *     {@link ChiTietHocPhi }
     *     
     */
    public ChiTietHocPhi getChiTietHocPhi() {
        return chiTietHocPhi;
    }

    /**
     * Sets the value of the chiTietHocPhi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChiTietHocPhi }
     *     
     */
    public void setChiTietHocPhi(ChiTietHocPhi value) {
        this.chiTietHocPhi = value;
    }

}
