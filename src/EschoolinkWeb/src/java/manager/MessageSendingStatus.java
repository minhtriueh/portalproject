/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package manager;

import org.netbeans.xml.schema.myobject.Message;

/**
 *
 * @author sanchikaro
 */

public class MessageSendingStatus {
    private String name,code,mess,error;
    private Message message;
    public MessageSendingStatus() {
    }

    public String execute() throws Exception {

        try { // Call Web Service Operation
            sendmesstodeancomapp.SendMessToDeanComAppService10 service = new sendmesstodeancomapp.SendMessToDeanComAppService10();
            sendmesstodeancomapp.LoadMessSendingPortType port = service.getLoadMessSending();
            // TODO initialize WS operation arguments here

            // TODO process result here
            org.netbeans.xml.schema.myobject.Message result = port.loadMessSendingOperation(name, code, mess);
            message=result;
        } catch (Exception ex) {
            error=ex.getMessage();
            return "error";
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

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

}