
package com.sun.demo.openesb.types.loanresponsemsg;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sun.demo.openesb.types.loanresponsemsg package. 
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

    private final static QName _LoanResponseMsg_QNAME = new QName("http://demo.sun.com/openesb/types/LoanResponseMsg", "loanResponseMsg");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sun.demo.openesb.types.loanresponsemsg
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoanResponseMsg }
     * 
     */
    public LoanResponseMsg createLoanResponseMsg() {
        return new LoanResponseMsg();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.sun.com/openesb/types/LoanResponseMsg", name = "loanResponseMsg")
    public JAXBElement<LoanResponseMsg> createLoanResponseMsg(LoanResponseMsg value) {
        return new JAXBElement<LoanResponseMsg>(_LoanResponseMsg_QNAME, LoanResponseMsg.class, null, value);
    }

}
