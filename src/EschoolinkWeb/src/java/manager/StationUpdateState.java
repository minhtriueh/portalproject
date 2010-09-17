/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package manager;

/**
 *
 * @author sanchikaro
 */

public class StationUpdateState {
    private String station,state,note,traloi,id,idMess;
    private boolean result;
    public StationUpdateState() {
    }

    public String execute() throws Exception {
        if(station.equals("manager")){
            managerProcess();
        }
        if(station.equals("secretary")){
            secretaryProcess();
        }
        if(station.equals("teacher")){
            teacherProcess();
        }

        return "success";
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdMess() {
        return idMess;
    }

    public void setIdMess(String idMess) {
        this.idMess = idMess;
    }

    public String getTraloi() {
        return traloi;
    }

    public void setTraloi(String traloi) {
        this.traloi = traloi;
    }

    private void feedBack(){

        try { // Call Web Service Operation
            sendmesstodeancomapp.SendMessToDeanComAppService3 service = new sendmesstodeancomapp.SendMessToDeanComAppService3();
            sendmesstodeancomapp.FeedbackPortType port = service.getFeedBack();
            // TODO initialize WS operation arguments here
            long idMessIn = Long.parseLong(idMess);
            java.lang.String contentFeedBack = traloi;
            // TODO process result here
            result = port.feedbackOperation(idMessIn, contentFeedBack);            
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }
    private void managerProcess(){

        try { // Call Web Service Operation
            sendmesstodeancomapp.SendMessToDeanComAppService5 service = new sendmesstodeancomapp.SendMessToDeanComAppService5();
            sendmesstodeancomapp.ManagerSetStatePortType port = service.getManagerSetState();
            // TODO process result here
            result = port.managerSetStateOperation(id, state, note);
            if(state.equals("feedback")){
                feedBack();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }
    private void secretaryProcess(){

        try { // Call Web Service Operation
            sendmesstodeancomapp.SendMessToDeanComAppService4 service = new sendmesstodeancomapp.SendMessToDeanComAppService4();
            sendmesstodeancomapp.SecretarySetStatePortType port = service.getSecretarySetState();

            // TODO process result here
            result = port.secretarySetStateOperation(id, state, note);
            if(state.equals("feedback")){
                feedBack();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
    }

    private void teacherProcess(){
        try { // Call Web Service Operation
            sendmesstodeancomapp.SendMessToDeanComAppService6 service = new sendmesstodeancomapp.SendMessToDeanComAppService6();
            sendmesstodeancomapp.TeacherSetStatePortType port = service.getTeacherSetState();
            // TODO process result here
            result = port.teacherSetStateOperation(id, state, note);
            if(state.equals("feedback")){
                feedBack();
            }
            feedBack();
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }

}