
package org.netbeans.xml.schema.eschoolinkobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GiaoVien complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GiaoVien">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tenGiaoVien" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ngaySinh" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="gioiTinh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cmnd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ngayCap" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="noiCap" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tonGiao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="queQuan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="choOHienTai" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="soDienThoai" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hinhAnh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chucVu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trinhDoVanHoa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tinhTrangSucKhoe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ngayVaoTruong" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ketNapDoan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ngayVaoDoan" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ketNapDang" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ngayVaoDang" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}DanToc" minOccurs="0"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}Lop" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/EschoolinkObject}MonHoc" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "GiaoVien", propOrder = {
    "id",
    "tenGiaoVien",
    "ngaySinh",
    "gioiTinh",
    "cmnd",
    "ngayCap",
    "noiCap",
    "tonGiao",
    "queQuan",
    "choOHienTai",
    "email",
    "soDienThoai",
    "hinhAnh",
    "chucVu",
    "trinhDoVanHoa",
    "tinhTrangSucKhoe",
    "ngayVaoTruong",
    "ketNapDoan",
    "ngayVaoDoan",
    "ketNapDang",
    "ngayVaoDang",
    "danToc",
    "lop",
    "monHoc",
    "nguoiDung"
})
@XmlSeeAlso({
    GiaoVienChuNhiem.class,
    HieuTruong.class
})
public class GiaoVien {

    protected long id;
    @XmlElement(required = true)
    protected String tenGiaoVien;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ngaySinh;
    @XmlElement(required = true)
    protected String gioiTinh;
    @XmlElement(required = true)
    protected String cmnd;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ngayCap;
    @XmlElement(required = true)
    protected String noiCap;
    @XmlElement(required = true)
    protected String tonGiao;
    @XmlElement(required = true)
    protected String queQuan;
    @XmlElement(required = true)
    protected String choOHienTai;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String soDienThoai;
    @XmlElement(required = true)
    protected String hinhAnh;
    @XmlElement(required = true)
    protected String chucVu;
    @XmlElement(required = true)
    protected String trinhDoVanHoa;
    @XmlElement(required = true)
    protected String tinhTrangSucKhoe;
    @XmlElement(required = true)
    protected String ngayVaoTruong;
    protected boolean ketNapDoan;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ngayVaoDoan;
    protected boolean ketNapDang;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ngayVaoDang;
    @XmlElement(name = "DanToc")
    protected DanToc danToc;
    @XmlElement(name = "Lop")
    protected List<Lop> lop;
    @XmlElement(name = "MonHoc")
    protected List<MonHoc> monHoc;
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
     * Gets the value of the tenGiaoVien property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenGiaoVien() {
        return tenGiaoVien;
    }

    /**
     * Sets the value of the tenGiaoVien property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenGiaoVien(String value) {
        this.tenGiaoVien = value;
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
     * Gets the value of the cmnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmnd() {
        return cmnd;
    }

    /**
     * Sets the value of the cmnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmnd(String value) {
        this.cmnd = value;
    }

    /**
     * Gets the value of the ngayCap property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgayCap() {
        return ngayCap;
    }

    /**
     * Sets the value of the ngayCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgayCap(XMLGregorianCalendar value) {
        this.ngayCap = value;
    }

    /**
     * Gets the value of the noiCap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoiCap() {
        return noiCap;
    }

    /**
     * Sets the value of the noiCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoiCap(String value) {
        this.noiCap = value;
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
     * Gets the value of the queQuan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * Sets the value of the queQuan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueQuan(String value) {
        this.queQuan = value;
    }

    /**
     * Gets the value of the choOHienTai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoOHienTai() {
        return choOHienTai;
    }

    /**
     * Sets the value of the choOHienTai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoOHienTai(String value) {
        this.choOHienTai = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the soDienThoai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoDienThoai() {
        return soDienThoai;
    }

    /**
     * Sets the value of the soDienThoai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoDienThoai(String value) {
        this.soDienThoai = value;
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
     * Gets the value of the chucVu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChucVu() {
        return chucVu;
    }

    /**
     * Sets the value of the chucVu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChucVu(String value) {
        this.chucVu = value;
    }

    /**
     * Gets the value of the trinhDoVanHoa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrinhDoVanHoa() {
        return trinhDoVanHoa;
    }

    /**
     * Sets the value of the trinhDoVanHoa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrinhDoVanHoa(String value) {
        this.trinhDoVanHoa = value;
    }

    /**
     * Gets the value of the tinhTrangSucKhoe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTinhTrangSucKhoe() {
        return tinhTrangSucKhoe;
    }

    /**
     * Sets the value of the tinhTrangSucKhoe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTinhTrangSucKhoe(String value) {
        this.tinhTrangSucKhoe = value;
    }

    /**
     * Gets the value of the ngayVaoTruong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNgayVaoTruong() {
        return ngayVaoTruong;
    }

    /**
     * Sets the value of the ngayVaoTruong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNgayVaoTruong(String value) {
        this.ngayVaoTruong = value;
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
     * Gets the value of the ketNapDang property.
     * 
     */
    public boolean isKetNapDang() {
        return ketNapDang;
    }

    /**
     * Sets the value of the ketNapDang property.
     * 
     */
    public void setKetNapDang(boolean value) {
        this.ketNapDang = value;
    }

    /**
     * Gets the value of the ngayVaoDang property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgayVaoDang() {
        return ngayVaoDang;
    }

    /**
     * Sets the value of the ngayVaoDang property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgayVaoDang(XMLGregorianCalendar value) {
        this.ngayVaoDang = value;
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
     * Gets the value of the lop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lop }
     * 
     * 
     */
    public List<Lop> getLop() {
        if (lop == null) {
            lop = new ArrayList<Lop>();
        }
        return this.lop;
    }

    /**
     * Gets the value of the monHoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monHoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonHoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonHoc }
     * 
     * 
     */
    public List<MonHoc> getMonHoc() {
        if (monHoc == null) {
            monHoc = new ArrayList<MonHoc>();
        }
        return this.monHoc;
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
