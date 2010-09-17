/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package manager;

import java.util.ArrayList;
import org.netbeans.xml.schema.myobject.MessageOfStation;

/**
 *
 * @author sanchikaro
 */

public class ViewMessWaitting {
    private String station;
    private ArrayList<org.netbeans.xml.schema.myobject.MessageOfStation> list=new ArrayList<MessageOfStation>();
    public ViewMessWaitting() {
    }

    public String execute() throws Exception {

        try { // Call Web Service Operation
            sendmesstodeancomapp.SendMessToDeanComAppService9 service = new sendmesstodeancomapp.SendMessToDeanComAppService9();
            sendmesstodeancomapp.LoadMessageOfStationPortType port = service.getLoadMessageOfStation();
            // TODO initialize WS operation arguments here
            java.lang.String tableName = station;
            java.lang.String state = "wait";
            // TODO process result here
            org.netbeans.xml.schema.myobject.ListMessagesOfStation result = port.loadMessageOfStationOperation(tableName, state);
            for (int i = 0; i < result.getMessageOfStation().size(); i++) {
                list.add(result.getMessageOfStation().get(i));

            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return station;
    }

    public ArrayList<MessageOfStation> getList() {
        return list;
    }

    public void setList(ArrayList<MessageOfStation> list) {
        this.list = list;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }
    
    public static void main(String[] args) {

        try { // Call Web Service Operation
            sendmesstodeancomapp.SendMessToDeanComAppService9 service = new sendmesstodeancomapp.SendMessToDeanComAppService9();
            sendmesstodeancomapp.LoadMessageOfStationPortType port = service.getLoadMessageOfStation();
            // TODO initialize WS operation arguments here
            java.lang.String tableName = "manager";
            java.lang.String state = "ok";
            // TODO process result here
            org.netbeans.xml.schema.myobject.ListMessagesOfStation result = port.loadMessageOfStationOperation(tableName, state);
            System.out.println("Result = "+result);
            System.out.println(result.getMessageOfStation().size());
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }


    }
}