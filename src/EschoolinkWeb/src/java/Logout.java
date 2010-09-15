
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

public class Logout implements SessionAware{
    private Map session;
    public Logout() {
    }

    public String execute() throws Exception {
        getSession().remove("userId");
        getSession().put("login", false);
        getSession().remove("nhomQuyen");
        return "success";
    }

    @Override
    public void setSession(Map<String, Object> arg0) {
        this.session=arg0;
    }

    public Map getSession() {
        return session;
    }

}