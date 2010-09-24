/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gresb.tute;

import javax.ejb.Stateless;
import javax.jws.WebService;
import org.netbeans.j2ee.wsdl.ejbloanprocessor.loanprocessor.*;
/**
 *
 * @author sanchikaro
 */
@WebService(serviceName = "loanProcessorService", portName = "loanProcessorPort", endpointInterface = "org.netbeans.j2ee.wsdl.ejbloanprocessor.loanprocessor.LoanProcessorPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/ejbLoanProcessor/loanProcessor", wsdlLocation = "META-INF/wsdl/LoanProcessor/loanProcessorWrapper.wsdl")
@Stateless
public class LoanProcessor implements LoanProcessorPortType{

    public com.sun.demo.openesb.types.loanresponsemsg.LoanResponseMsg processLoan(com.sun.demo.openesb.types.loanrequestmsg.LoanRequestMsg processorInput) {
        int MINIMUM_AGE_LIMIT = 18;
        int MAXIMUM_AGE_LIMIT = 65;
        double MINIMUM_SALARY = 20000;
        int AVERAGE_LIFE_EXPECTANCY = 70;

        com.sun.demo.openesb.types.loanresponsemsg.LoanResponseMsg response = new com.sun.demo.openesb.types.loanresponsemsg.LoanResponseMsg();
        int applicantAge = processorInput.getApplicantAge();
        float annualSalary = processorInput.getAnnualSalary();
        float amountRequested = processorInput.getAmountRequested();

        String result = "Loan Application APPROVED.";
        String status = "APPROVED";

        if (applicantAge < MINIMUM_AGE_LIMIT) {
            result = "Loan Application REJECTED - Reason: Under-aged " + applicantAge + ". Age needs to be over " + MINIMUM_AGE_LIMIT + " years to qualify.";
            System.out.println(result);
            response.setDecision(result);
            response.setStatus("DENIED");
            return response;
        }

        if (applicantAge > MAXIMUM_AGE_LIMIT) {
            result = "Loan Application REJECTED - Reason: Over-aged " + applicantAge + ". Age needs to be under " + MAXIMUM_AGE_LIMIT + " years to qualify.";
            System.out.println(result);
            response.setDecision(result);
            response.setStatus("DENIED");
            return response;
        }

        if (annualSalary < MINIMUM_SALARY) {
            result = "Loan Application REJECTED - Reason: Annual Salary $" + annualSalary + " too low. Annual Salary needs to be over $" + MINIMUM_SALARY + " to qualify.";
            System.out.println(result);
            response.setDecision(result);
            response.setStatus("DENIED");
            return response;
        }

        int yearsToRepay = AVERAGE_LIFE_EXPECTANCY - applicantAge;
        double limit = annualSalary * yearsToRepay * 0.5;
        if (amountRequested > limit) {
            result = "Loan Application REJECTED - Reason: You are asking for too much $" + amountRequested + ". Annual Salary $" + annualSalary + ", Age " + applicantAge + " years. Your limit is $" + limit;
            System.out.println(result);
            response.setDecision(result);
            response.setStatus("DENIED");
            return response;
        }

        System.out.println(result);
        response.setDecision(result);
        response.setStatus(status);
        return response;
    }

}
