
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Diem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Diem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="diem" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lan" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ngayNhap" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Diem", propOrder = {
    "id",
    "diem",
    "lan",
    "ngayNhap"
})
public class Diem {

    protected long id;
    protected double diem;
    protected int lan;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ngayNhap;

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
     * Gets the value of the diem property.
     * 
     */
    public double getDiem() {
        return diem;
    }

    /**
     * Sets the value of the diem property.
     * 
     */
    public void setDiem(double value) {
        this.diem = value;
    }

    /**
     * Gets the value of the lan property.
     * 
     */
    public int getLan() {
        return lan;
    }

    /**
     * Sets the value of the lan property.
     * 
     */
    public void setLan(int value) {
        this.lan = value;
    }

    /**
     * Gets the value of the ngayNhap property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgayNhap() {
        return ngayNhap;
    }

    /**
     * Sets the value of the ngayNhap property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgayNhap(XMLGregorianCalendar value) {
        this.ngayNhap = value;
    }

}
