
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author sanchikaro
 */

public class Login implements SessionAware{
    private String error,username,pass;
    private Map session;
    public Login() {
    }

    public String execute() throws Exception {

        try { // Call Web Service Operation
            qlhethongcomapp.QLHeThongComAppService11 service = new qlhethongcomapp.QLHeThongComAppService11();
            qlhethongcomapp.DangNhapPortType port = service.getDangNhap();
            // TODO initialize WS operation arguments here

            // TODO process result here
            boolean result = port.dangNhapOperation(username, pass);
            if(result){
                writeSession();
                getSession().put("login", result);
                return "success";
            }else{
                getSession().put("login", result);
                error="Account not ton tai";
                return "error";
            }
        } catch (Exception ex) {
            error=ex.getMessage();
                return "error";
            }
        }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    private void writeSession(){

        try { // Call Web Service Operation
            qlhethongcomapp.QLHeThongComAppService21 service = new qlhethongcomapp.QLHeThongComAppService21();
            qlhethongcomapp.LoadUserIdPortType port = service.getLoadUserId();

            // TODO process result here
            org.netbeans.xml.schema.eschoolinkobject.NguoiDung result = port.loadUserIdOperation(username, pass);
            getSession().put("userId", result.getId());
            getSession().put("nhomQuyen", result.getNhom().get(0).getTenNhom());
            
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }

    @Override
    public void setSession(Map<String, Object> arg0) {
        this.session=arg0;
    }

    public Map getSession() {
        return session;
    }

    }

