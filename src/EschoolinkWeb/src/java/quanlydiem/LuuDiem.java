/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydiem;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author nguyentanmo
 */
public class LuuDiem {

    String diemnhap;
    String iddiemnhap;
    HttpServletRequest request = ServletActionContext.getRequest();

    public LuuDiem() {
    }

    public String execute() throws Exception {
//lay danh sach nhung diem da nhap
        List<Double> listDiem = new ArrayList<Double>();
        List<String> listString = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(diemnhap, ",");
        try {
            while (st.hasMoreTokens()) {
                String tr = st.nextToken();
                listString.add(tr);
            }
            for (int i = 0; i < listString.size(); i++) {
                String s = listString.get(i);
                double diem = -1;
                if (s.equals(" ")) {
                    listDiem.add(diem);
                } else {
                    diem = Double.parseDouble(s);
                    listDiem.add(diem);
                }
            }
        } catch (Exception ex) {
            System.err.println("loi1 luu diem " + ex.getMessage());
        }
//lay danh sach id nhung diem da nhap
        List<Long> listIdDiem = new ArrayList<Long>();
        List<String> listStringIdDiem = new ArrayList<String>();
        StringTokenizer str = new StringTokenizer(iddiemnhap, ", ");
        try {
            while (str.hasMoreTokens()) {
                listStringIdDiem.add(str.nextToken());
            }
            for (int i = 0; i < listStringIdDiem.size(); i++) {
                long id = Long.parseLong(listStringIdDiem.get(i));
                listIdDiem.add(id);
            }
        } catch (Exception ex) {
            System.err.println("loi2 luu diem " + ex.getMessage());
        }
//kiem tra dieu kien listdiem va listiddiem
        if (listDiem.size() > 0 && listIdDiem.size() > 0 && listDiem.size() == listIdDiem.size()) {
//call service luu diem
            try { // Call Web Service Operation
                qldiemcomapp.QLDiemComAppService42 service = new qldiemcomapp.QLDiemComAppService42();
                qldiemcomapp.LuuDiemPortType port = service.getLuuDiem();
                boolean result = false;
                for (int k = 0; k < listDiem.size(); k++) {
                    double diem = listDiem.get(k);
                    long idDiem = listIdDiem.get(k);
                    result = port.luuDiemOperation(idDiem, diem);
                }
                if (result == true) {
//call service lay danh sach he so cot diem
                    return "success";
                }
            } catch (Exception ex) {
                System.err.println("loi3 luu diem " + ex.getMessage());
            }
        }
        return "error";
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public String getDiemnhap() {
        return diemnhap;
    }

    public void setDiemnhap(String diemnhap) {
        this.diemnhap = diemnhap;
    }

    public String getIddiemnhap() {
        return iddiemnhap;
    }

    public void setIddiemnhap(String iddiemnhap) {
        this.iddiemnhap = iddiemnhap;
    }
}
