/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package student;

import org.netbeans.xml.schema.myobject.Message;

/**
 *
 * @author sanchikaro
 */

public class SendMessage {
    private String name,code,mess;
    private Message message;
    public SendMessage() {
    }

    public String execute() {
        long idMess=0;
        try { // Call Web Service Operation
            sendmesstodeancomapp.SendMessToDeanComAppService1 service = new sendmesstodeancomapp.SendMessToDeanComAppService1();
            sendmesstodeancomapp.SendMessToDeanPortType port = service.getSendMessToDean();
            // TODO initialize WS operation arguments here
            java.lang.String hoVaTen = name;
            java.lang.String mssv = code;
            
            // TODO process result here
            java.lang.String result = port.sendMessToDeanOperation(hoVaTen, mssv, mess);
            idMess=Long.parseLong(result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        try { // Call Web Service Operation
            sendmesstodeancomapp.SendMessToDeanComAppService8 service = new sendmesstodeancomapp.SendMessToDeanComAppService8();
            sendmesstodeancomapp.LoadMessageByIdMessagePortType port = service.getLoadMessageByIdMessage();
            // TODO initialize WS operation arguments here
            long id = idMess;
            // TODO process result here
            org.netbeans.xml.schema.myobject.Message result = port.loadMessageByIdMessageOperation(id);
            message=result;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        return "success";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

}