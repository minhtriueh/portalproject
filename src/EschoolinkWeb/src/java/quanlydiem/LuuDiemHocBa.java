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
public class LuuDiemHocBa {

    String lop;
    String hocky;
    String namhoc;
    String idhocsinh;
    String diemtrungbinh;
    HttpServletRequest request = ServletActionContext.getRequest();

    public LuuDiemHocBa() {
    }

    public String execute() throws Exception {
        List<Integer> listidhocsinhs = new ArrayList<Integer>();
        StringTokenizer st1 = new StringTokenizer(idhocsinh, ", ");
        try {
            while (st1.hasMoreTokens()) {
                int id = Integer.parseInt(st1.nextToken());
                listidhocsinhs.add(id);
            }
        } catch (Exception e) {
            System.out.println("loi 1 Luu diem hoc ba " + e.getMessage());
        }

        List<Double> listdiemtrungbinhs = new ArrayList<Double>();
        StringTokenizer st2 = new StringTokenizer(diemtrungbinh, ", ");
        try {
            while (st2.hasMoreTokens()) {
                double dtb = Double.parseDouble(st2.nextToken());
                listdiemtrungbinhs.add(dtb);
            }
        } catch (Exception e) {
            System.out.println("loi 2 Luu diem hoc ba " + e.getMessage());
        }
//call service cap nhat hoc ba

        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService63 service = new qldiemcomapp.QLDiemComAppService63();
            qldiemcomapp.CapNhatHocBaPortType port = service.getCapNhatHocBa();
//call service lay id hoc ba by id hoc sinh

            try { // Call Web Service Operation
                qldiemcomapp.QLDiemComAppService64 service1 = new qldiemcomapp.QLDiemComAppService64();
                qldiemcomapp.LayHocBaChoHocSinhPortType port1 = service1.getLayHocBaChoHocSinh();
                int hk = Integer.parseInt(hocky);
                int nh = Integer.parseInt(namhoc);
                long idLop = Long.parseLong(lop);
                long idHocsinh = 0;
                boolean capnhathocbaBoolean = false;
                for (int i = 0; i < listidhocsinhs.size(); i++) {
                    idHocsinh = listidhocsinhs.get(i);
                    double dtb = listdiemtrungbinhs.get(i);
                    long idhocba = port1.layHocBaChoHocSinhOperation(hk, nh, idHocsinh);
                    capnhathocbaBoolean = port.capNhatHocBaOperation(hk, nh, idHocsinh, idLop, dtb, idhocba);
                }
                if (capnhathocbaBoolean == true) {
                    return "success";
                }
            } catch (Exception ex) {
                System.out.println("loi 3 Luu diem hoc ba " + ex.getMessage());
            }
        } catch (Exception ex) {
            System.out.println("loi 4 Luu diem hoc ba " + ex.getMessage());
        }
        return "error";
    }

    public String getDiemtrungbinh() {
        return diemtrungbinh;
    }

    public void setDiemtrungbinh(String diemtrungbinh) {
        this.diemtrungbinh = diemtrungbinh;
    }

    public String getHocky() {
        return hocky;
    }

    public void setHocky(String hocky) {
        this.hocky = hocky;
    }

    public String getIdhocsinh() {
        return idhocsinh;
    }

    public void setIdhocsinh(String idhocsinh) {
        this.idhocsinh = idhocsinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNamhoc() {
        return namhoc;
    }

    public void setNamhoc(String namhoc) {
        this.namhoc = namhoc;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }
}
