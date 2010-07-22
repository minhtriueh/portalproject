
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XaPhuongThiTran complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XaPhuongThiTran">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tenXaPhuongThiTran" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}ThonXom"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XaPhuongThiTran", propOrder = {
    "id",
    "tenXaPhuongThiTran",
    "thonXom"
})
public class XaPhuongThiTran {

    protected long id;
    @XmlElement(required = true)
    protected String tenXaPhuongThiTran;
    @XmlElement(name = "ThonXom", required = true)
    protected ThonXom thonXom;

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
     * Gets the value of the tenXaPhuongThiTran property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenXaPhuongThiTran() {
        return tenXaPhuongThiTran;
    }

    /**
     * Sets the value of the tenXaPhuongThiTran property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenXaPhuongThiTran(String value) {
        this.tenXaPhuongThiTran = value;
    }

    /**
     * Gets the value of the thonXom property.
     * 
     * @return
     *     possible object is
     *     {@link ThonXom }
     *     
     */
    public ThonXom getThonXom() {
        return thonXom;
    }

    /**
     * Sets the value of the thonXom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThonXom }
     *     
     */
    public void setThonXom(ThonXom value) {
        this.thonXom = value;
    }

}
