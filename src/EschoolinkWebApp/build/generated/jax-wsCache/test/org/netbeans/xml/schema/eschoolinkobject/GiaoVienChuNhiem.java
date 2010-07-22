
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GiaoVienChuNhiem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GiaoVienChuNhiem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xml.netbeans.org/schema/EschoolinkObject}GiaoVien">
 *       &lt;sequence>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}SoDiemChuNhiem"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiaoVienChuNhiem", propOrder = {
    "soDiemChuNhiem"
})
public class GiaoVienChuNhiem
    extends GiaoVien
{

    @XmlElement(name = "SoDiemChuNhiem", required = true)
    protected SoDiemChuNhiem soDiemChuNhiem;

    /**
     * Gets the value of the soDiemChuNhiem property.
     * 
     * @return
     *     possible object is
     *     {@link SoDiemChuNhiem }
     *     
     */
    public SoDiemChuNhiem getSoDiemChuNhiem() {
        return soDiemChuNhiem;
    }

    /**
     * Sets the value of the soDiemChuNhiem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoDiemChuNhiem }
     *     
     */
    public void setSoDiemChuNhiem(SoDiemChuNhiem value) {
        this.soDiemChuNhiem = value;
    }

}
