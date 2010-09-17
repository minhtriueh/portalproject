/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package student;

import java.util.ArrayList;
import org.netbeans.xml.schema.myobject.Message;

/**
 *
 * @author sanchikaro
 */

public class ViewHistoryMessage {
    private ArrayList<Message> list=new ArrayList<Message>();
    public ViewHistoryMessage() {
    }

    public String execute() throws Exception {


        try { // Call Web Service Operation
            sendmesstodeancomapp.SendMessToDeanComAppService7 service = new sendmesstodeancomapp.SendMessToDeanComAppService7();
            sendmesstodeancomapp.LoadMessagesWaitingPortType port = service.getLoadMessagesWaiting();
            // TODO initialize WS operation arguments here
            java.lang.String state = "wait";
            // TODO process result here
            org.netbeans.xml.schema.myobject.ListMessage result = port.loadMessagesWaitingOperation(state);
            for (int i = 0; i < result.getMessage().size(); i++) {
               list.add(result.getMessage().get(i));
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }


        return "success";
    }

    public ArrayList<Message> getList() {
        return list;
    }

    public void setList(ArrayList<Message> list) {
        this.list = list;
    }

   

}