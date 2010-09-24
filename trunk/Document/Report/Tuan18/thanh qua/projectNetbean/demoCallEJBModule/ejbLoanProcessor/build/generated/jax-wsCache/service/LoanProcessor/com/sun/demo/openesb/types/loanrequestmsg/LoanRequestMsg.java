
package com.sun.demo.openesb.types.loanrequestmsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanRequestMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanRequestMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="applicantName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="applicantAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="applicantEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="applicantAge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="applicantGender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="annualSalary" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="amountRequested" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanRequestMsg", propOrder = {
    "socialSecurityNumber",
    "applicantName",
    "applicantAddress",
    "applicantEmailAddress",
    "applicantAge",
    "applicantGender",
    "annualSalary",
    "amountRequested"
})
public class LoanRequestMsg {

    @XmlElement(required = true, nillable = true)
    protected String socialSecurityNumber;
    @XmlElement(required = true, nillable = true)
    protected String applicantName;
    @XmlElement(required = true, nillable = true)
    protected String applicantAddress;
    @XmlElement(required = true, nillable = true)
    protected String applicantEmailAddress;
    protected int applicantAge;
    @XmlElement(required = true, nillable = true)
    protected String applicantGender;
    protected float annualSalary;
    protected float amountRequested;

    /**
     * Gets the value of the socialSecurityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets the value of the socialSecurityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityNumber(String value) {
        this.socialSecurityNumber = value;
    }

    /**
     * Gets the value of the applicantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantName() {
        return applicantName;
    }

    /**
     * Sets the value of the applicantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantName(String value) {
        this.applicantName = value;
    }

    /**
     * Gets the value of the applicantAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantAddress() {
        return applicantAddress;
    }

    /**
     * Sets the value of the applicantAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantAddress(String value) {
        this.applicantAddress = value;
    }

    /**
     * Gets the value of the applicantEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantEmailAddress() {
        return applicantEmailAddress;
    }

    /**
     * Sets the value of the applicantEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantEmailAddress(String value) {
        this.applicantEmailAddress = value;
    }

    /**
     * Gets the value of the applicantAge property.
     * 
     */
    public int getApplicantAge() {
        return applicantAge;
    }

    /**
     * Sets the value of the applicantAge property.
     * 
     */
    public void setApplicantAge(int value) {
        this.applicantAge = value;
    }

    /**
     * Gets the value of the applicantGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantGender() {
        return applicantGender;
    }

    /**
     * Sets the value of the applicantGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantGender(String value) {
        this.applicantGender = value;
    }

    /**
     * Gets the value of the annualSalary property.
     * 
     */
    public float getAnnualSalary() {
        return annualSalary;
    }

    /**
     * Sets the value of the annualSalary property.
     * 
     */
    public void setAnnualSalary(float value) {
        this.annualSalary = value;
    }

    /**
     * Gets the value of the amountRequested property.
     * 
     */
    public float getAmountRequested() {
        return amountRequested;
    }

    /**
     * Sets the value of the amountRequested property.
     * 
     */
    public void setAmountRequested(float value) {
        this.amountRequested = value;
    }

}
