
package org.netbeans.xml.schema.eschoolinkobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuanHuyenThanhPho complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuanHuyenThanhPho">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tenQuanHuyenThanhPho" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}XaPhuongThiTran" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuanHuyenThanhPho", propOrder = {
    "id",
    "tenQuanHuyenThanhPho",
    "xaPhuongThiTran"
})
public class QuanHuyenThanhPho {

    protected long id;
    @XmlElement(required = true)
    protected String tenQuanHuyenThanhPho;
    @XmlElement(name = "XaPhuongThiTran", required = true)
    protected List<XaPhuongThiTran> xaPhuongThiTran;

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
     * Gets the value of the tenQuanHuyenThanhPho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenQuanHuyenThanhPho() {
        return tenQuanHuyenThanhPho;
    }

    /**
     * Sets the value of the tenQuanHuyenThanhPho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenQuanHuyenThanhPho(String value) {
        this.tenQuanHuyenThanhPho = value;
    }

    /**
     * Gets the value of the xaPhuongThiTran property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xaPhuongThiTran property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXaPhuongThiTran().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XaPhuongThiTran }
     * 
     * 
     */
    public List<XaPhuongThiTran> getXaPhuongThiTran() {
        if (xaPhuongThiTran == null) {
            xaPhuongThiTran = new ArrayList<XaPhuongThiTran>();
        }
        return this.xaPhuongThiTran;
    }

}
