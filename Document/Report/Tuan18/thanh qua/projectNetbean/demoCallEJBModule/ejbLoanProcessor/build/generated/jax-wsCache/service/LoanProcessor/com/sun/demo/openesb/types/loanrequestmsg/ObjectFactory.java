
package com.sun.demo.openesb.types.loanrequestmsg;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sun.demo.openesb.types.loanrequestmsg package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoanRequestMsg_QNAME = new QName("http://demo.sun.com/openesb/types/LoanRequestMsg", "loanRequestMsg");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sun.demo.openesb.types.loanrequestmsg
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoanRequestMsg }
     * 
     */
    public LoanRequestMsg createLoanRequestMsg() {
        return new LoanRequestMsg();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanRequestMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.sun.com/openesb/types/LoanRequestMsg", name = "loanRequestMsg")
    public JAXBElement<LoanRequestMsg> createLoanRequestMsg(LoanRequestMsg value) {
        return new JAXBElement<LoanRequestMsg>(_LoanRequestMsg_QNAME, LoanRequestMsg.class, null, value);
    }

}
