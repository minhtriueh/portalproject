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
    String idchitietsodiem;
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
            getRequest().setAttribute("loi1", ex.getMessage());
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
            getRequest().setAttribute("loi2", ex.getMessage());
        }
//call service lay danh sach he so
        List<Integer> listIdChiTietSoDiem = new ArrayList<Integer>();
        List<String> listStringIdChiTietSoDiem = new ArrayList<String>();
        StringTokenizer strn = new StringTokenizer(idchitietsodiem, ", ");
        try {
            while (strn.hasMoreTokens()) {
                listStringIdChiTietSoDiem.add(strn.nextToken());
            }
            for (int i = 0; i < listStringIdChiTietSoDiem.size(); i++) {
                int idctsd = Integer.parseInt(listStringIdChiTietSoDiem.get(i));
                listIdChiTietSoDiem.add(idctsd);
            }
        } catch (Exception ex) {
            System.err.println("loi3 luu diem " + ex.getMessage());
            getRequest().setAttribute("loi3", ex.getMessage());
        }
//call service lay danh sach he so cot diem
        List<Integer> listHeSo = new ArrayList<Integer>();
        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService44 service = new qldiemcomapp.QLDiemComAppService44();
            qldiemcomapp.LayDanhSachHeSoPortType port = service.getLayDanhSachHeSo();
            org.netbeans.xml.schema.loaidiem.ListDanhSachHeSo hesos = port.layDanhSachHeSoOperation();
            for (int i = 0; i < hesos.getHeso().size(); i++) {
                listHeSo.add(hesos.getHeso().get(i).intValue());
            }
        } catch (Exception ex) {
            System.err.println("loi4 luu diem " + ex.getMessage());
            getRequest().setAttribute("loi4", ex.getMessage());
        }
        if(listDiem.size()!=listIdDiem.size()){
            listDiem.add(0, -1.0);
        }
//kiem tra dieu kien listdiem va listiddiem
        if (listDiem.size() > 0 && listIdDiem.size() > 0 && listHeSo.size() > 0 && listDiem.size() == listIdDiem.size()) {
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
//tinh diem trung binh
                    int soheso = listHeSo.size();
                    boolean tinhDiemTrungBinh = false;
                    List<List<Double>> diems = new ArrayList<List<Double>>();
                    diems = TinhDiemTrungBinh.laydanhsachdiem(listDiem, soheso);
                    for (int i = 0; i < diems.size(); i++) {
                        double diemTrungBinh = 0;
                        diemTrungBinh = TinhDiemTrungBinh.tinhDiemTrungBinh(diems.get(i), listHeSo);
//call service tinh diem trung binh
                        try { // Call Web Service Operation
                            qldiemcomapp.QLDiemComAppService16 service1 = new qldiemcomapp.QLDiemComAppService16();
                            qldiemcomapp.TinhDiemTrungBinhPortType port1 = service1.getTinhDiemTrungBinh();
                            long idChiTietSoDiem = listIdChiTietSoDiem.get(i);
                            tinhDiemTrungBinh = port1.tinhDiemTrungBinhOperation(idChiTietSoDiem, diemTrungBinh);
                        } catch (Exception ex) {
                            System.err.println("loi6 luu diem " + ex.getMessage());
                            getRequest().setAttribute("loi6", ex.getMessage());
                        }
                    }
                    if (tinhDiemTrungBinh == true) {
                        getRequest().setAttribute("listdiem", listDiem);
                        getRequest().setAttribute("listidchitietsodiem", listIdChiTietSoDiem);
                        getRequest().setAttribute("listheso", listHeSo);
                        return "success";
                    }
                }
            } catch (Exception ex) {
                System.err.println("loi7 luu diem " + ex.getMessage());
                getRequest().setAttribute("loi7", ex.getMessage());
            }
        }
        getRequest().setAttribute("listdiem", listDiem);
        getRequest().setAttribute("listidchitietsodiem", listIdChiTietSoDiem);
        getRequest().setAttribute("listheso", listHeSo);
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

    public String getIdchitietsodiem() {
        return idchitietsodiem;
    }

    public void setIdchitietsodiem(String idchitietsodiem) {
        this.idchitietsodiem = idchitietsodiem;
    }
}
