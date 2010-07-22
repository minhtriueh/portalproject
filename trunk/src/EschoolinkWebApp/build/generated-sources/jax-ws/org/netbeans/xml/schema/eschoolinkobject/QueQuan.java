
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueQuan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueQuan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}ThonXom"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}XaPhuongThiTran"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}QuanHuyenThanhPho"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueQuan", propOrder = {
    "id",
    "thonXom",
    "xaPhuongThiTran",
    "quanHuyenThanhPho"
})
public class QueQuan {

    protected long id;
    @XmlElement(name = "ThonXom", required = true)
    protected ThonXom thonXom;
    @XmlElement(name = "XaPhuongThiTran", required = true)
    protected XaPhuongThiTran xaPhuongThiTran;
    @XmlElement(name = "QuanHuyenThanhPho", required = true)
    protected QuanHuyenThanhPho quanHuyenThanhPho;

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

    /**
     * Gets the value of the xaPhuongThiTran property.
     * 
     * @return
     *     possible object is
     *     {@link XaPhuongThiTran }
     *     
     */
    public XaPhuongThiTran getXaPhuongThiTran() {
        return xaPhuongThiTran;
    }

    /**
     * Sets the value of the xaPhuongThiTran property.
     * 
     * @param value
     *     allowed object is
     *     {@link XaPhuongThiTran }
     *     
     */
    public void setXaPhuongThiTran(XaPhuongThiTran value) {
        this.xaPhuongThiTran = value;
    }

    /**
     * Gets the value of the quanHuyenThanhPho property.
     * 
     * @return
     *     possible object is
     *     {@link QuanHuyenThanhPho }
     *     
     */
    public QuanHuyenThanhPho getQuanHuyenThanhPho() {
        return quanHuyenThanhPho;
    }

    /**
     * Sets the value of the quanHuyenThanhPho property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuanHuyenThanhPho }
     *     
     */
    public void setQuanHuyenThanhPho(QuanHuyenThanhPho value) {
        this.quanHuyenThanhPho = value;
    }

}
