
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DanToc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DanToc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tenDanToc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="danTocThieuSo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DanToc", propOrder = {
    "id",
    "tenDanToc",
    "danTocThieuSo"
})
public class DanToc {

    protected long id;
    @XmlElement(required = true)
    protected String tenDanToc;
    protected boolean danTocThieuSo;

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
     * Gets the value of the tenDanToc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenDanToc() {
        return tenDanToc;
    }

    /**
     * Sets the value of the tenDanToc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenDanToc(String value) {
        this.tenDanToc = value;
    }

    /**
     * Gets the value of the danTocThieuSo property.
     * 
     */
    public boolean isDanTocThieuSo() {
        return danTocThieuSo;
    }

    /**
     * Sets the value of the danTocThieuSo property.
     * 
     */
    public void setDanTocThieuSo(boolean value) {
        this.danTocThieuSo = value;
    }

}
