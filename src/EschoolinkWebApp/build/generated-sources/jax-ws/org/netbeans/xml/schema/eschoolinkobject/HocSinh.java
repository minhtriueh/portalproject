
package org.netbeans.xml.schema.eschoolinkobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HocSinh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HocSinh">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tenHocSinh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ngaySinh" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="gioiTinh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="soNha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tonGiao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hinhAnh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ketNapDoi" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ngayVaoDoi" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ketNapDoan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ngayVaoDoan" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ghiChu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="biXoaHayChua" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ngayTao" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}DanToc" minOccurs="0"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}HocBa" minOccurs="0"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}LoaiHocSinh" minOccurs="0"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}CheDoUuTien" minOccurs="0"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}ThanhPhanGiaDinh" minOccurs="0"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}NguoiDung" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HocSinh", propOrder = {
    "id",
    "tenHocSinh",
    "ngaySinh",
    "gioiTinh",
    "soNha",
    "tonGiao",
    "hinhAnh",
    "ketNapDoi",
    "ngayVaoDoi",
    "ketNapDoan",
    "ngayVaoDoan",
    "ghiChu",
    "biXoaHayChua",
    "ngayTao",
    "danToc",
    "hocBa",
    "loaiHocSinh",
    "cheDoUuTien",
    "thanhPhanGiaDinh",
    "nguoiDung"
})
public class HocSinh {

    protected long id;
    @XmlElement(required = true)
    protected String tenHocSinh;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ngaySinh;
    @XmlElement(required = true)
    protected String gioiTinh;
    @XmlElement(required = true)
    protected String soNha;
    @XmlElement(required = true)
    protected String tonGiao;
    @XmlElement(required = true)
    protected String hinhAnh;
    protected boolean ketNapDoi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ngayVaoDoi;
    protected boolean ketNapDoan;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ngayVaoDoan;
    @XmlElement(required = true)
    protected String ghiChu;
    protected boolean biXoaHayChua;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ngayTao;
    @XmlElement(name = "DanToc")
    protected DanToc danToc;
    @XmlElement(name = "HocBa")
    protected HocBa hocBa;
    @XmlElement(name = "LoaiHocSinh")
    protected LoaiHocSinh loaiHocSinh;
    @XmlElement(name = "CheDoUuTien")
    protected CheDoUuTien cheDoUuTien;
    @XmlElement(name = "ThanhPhanGiaDinh")
    protected ThanhPhanGiaDinh thanhPhanGiaDinh;
    @XmlElement(name = "NguoiDung")
    protected NguoiDung nguoiDung;

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
     * Gets the value of the tenHocSinh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenHocSinh() {
        return tenHocSinh;
    }

    /**
     * Sets the value of the tenHocSinh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenHocSinh(String value) {
        this.tenHocSinh = value;
    }

    /**
     * Gets the value of the ngaySinh property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgaySinh() {
        return ngaySinh;
    }

    /**
     * Sets the value of the ngaySinh property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgaySinh(XMLGregorianCalendar value) {
        this.ngaySinh = value;
    }

    /**
     * Gets the value of the gioiTinh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * Sets the value of the gioiTinh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGioiTinh(String value) {
        this.gioiTinh = value;
    }

    /**
     * Gets the value of the soNha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoNha() {
        return soNha;
    }

    /**
     * Sets the value of the soNha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoNha(String value) {
        this.soNha = value;
    }

    /**
     * Gets the value of the tonGiao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTonGiao() {
        return tonGiao;
    }

    /**
     * Sets the value of the tonGiao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTonGiao(String value) {
        this.tonGiao = value;
    }

    /**
     * Gets the value of the hinhAnh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHinhAnh() {
        return hinhAnh;
    }

    /**
     * Sets the value of the hinhAnh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHinhAnh(String value) {
        this.hinhAnh = value;
    }

    /**
     * Gets the value of the ketNapDoi property.
     * 
     */
    public boolean isKetNapDoi() {
        return ketNapDoi;
    }

    /**
     * Sets the value of the ketNapDoi property.
     * 
     */
    public void setKetNapDoi(boolean value) {
        this.ketNapDoi = value;
    }

    /**
     * Gets the value of the ngayVaoDoi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgayVaoDoi() {
        return ngayVaoDoi;
    }

    /**
     * Sets the value of the ngayVaoDoi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgayVaoDoi(XMLGregorianCalendar value) {
        this.ngayVaoDoi = value;
    }

    /**
     * Gets the value of the ketNapDoan property.
     * 
     */
    public boolean isKetNapDoan() {
        return ketNapDoan;
    }

    /**
     * Sets the value of the ketNapDoan property.
     * 
     */
    public void setKetNapDoan(boolean value) {
        this.ketNapDoan = value;
    }

    /**
     * Gets the value of the ngayVaoDoan property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgayVaoDoan() {
        return ngayVaoDoan;
    }

    /**
     * Sets the value of the ngayVaoDoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgayVaoDoan(XMLGregorianCalendar value) {
        this.ngayVaoDoan = value;
    }

    /**
     * Gets the value of the ghiChu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGhiChu() {
        return ghiChu;
    }

    /**
     * Sets the value of the ghiChu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGhiChu(String value) {
        this.ghiChu = value;
    }

    /**
     * Gets the value of the biXoaHayChua property.
     * 
     */
    public boolean isBiXoaHayChua() {
        return biXoaHayChua;
    }

    /**
     * Sets the value of the biXoaHayChua property.
     * 
     */
    public void setBiXoaHayChua(boolean value) {
        this.biXoaHayChua = value;
    }

    /**
     * Gets the value of the ngayTao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgayTao() {
        return ngayTao;
    }

    /**
     * Sets the value of the ngayTao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgayTao(XMLGregorianCalendar value) {
        this.ngayTao = value;
    }

    /**
     * Gets the value of the danToc property.
     * 
     * @return
     *     possible object is
     *     {@link DanToc }
     *     
     */
    public DanToc getDanToc() {
        return danToc;
    }

    /**
     * Sets the value of the danToc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DanToc }
     *     
     */
    public void setDanToc(DanToc value) {
        this.danToc = value;
    }

    /**
     * Gets the value of the hocBa property.
     * 
     * @return
     *     possible object is
     *     {@link HocBa }
     *     
     */
    public HocBa getHocBa() {
        return hocBa;
    }

    /**
     * Sets the value of the hocBa property.
     * 
     * @param value
     *     allowed object is
     *     {@link HocBa }
     *     
     */
    public void setHocBa(HocBa value) {
        this.hocBa = value;
    }

    /**
     * Gets the value of the loaiHocSinh property.
     * 
     * @return
     *     possible object is
     *     {@link LoaiHocSinh }
     *     
     */
    public LoaiHocSinh getLoaiHocSinh() {
        return loaiHocSinh;
    }

    /**
     * Sets the value of the loaiHocSinh property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoaiHocSinh }
     *     
     */
    public void setLoaiHocSinh(LoaiHocSinh value) {
        this.loaiHocSinh = value;
    }

    /**
     * Gets the value of the cheDoUuTien property.
     * 
     * @return
     *     possible object is
     *     {@link CheDoUuTien }
     *     
     */
    public CheDoUuTien getCheDoUuTien() {
        return cheDoUuTien;
    }

    /**
     * Sets the value of the cheDoUuTien property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheDoUuTien }
     *     
     */
    public void setCheDoUuTien(CheDoUuTien value) {
        this.cheDoUuTien = value;
    }

    /**
     * Gets the value of the thanhPhanGiaDinh property.
     * 
     * @return
     *     possible object is
     *     {@link ThanhPhanGiaDinh }
     *     
     */
    public ThanhPhanGiaDinh getThanhPhanGiaDinh() {
        return thanhPhanGiaDinh;
    }

    /**
     * Sets the value of the thanhPhanGiaDinh property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThanhPhanGiaDinh }
     *     
     */
    public void setThanhPhanGiaDinh(ThanhPhanGiaDinh value) {
        this.thanhPhanGiaDinh = value;
    }

    /**
     * Gets the value of the nguoiDung property.
     * 
     * @return
     *     possible object is
     *     {@link NguoiDung }
     *     
     */
    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    /**
     * Sets the value of the nguoiDung property.
     * 
     * @param value
     *     allowed object is
     *     {@link NguoiDung }
     *     
     */
    public void setNguoiDung(NguoiDung value) {
        this.nguoiDung = value;
    }

}
