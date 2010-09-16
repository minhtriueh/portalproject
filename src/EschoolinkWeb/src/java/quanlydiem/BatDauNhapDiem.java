/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydiem;

import com.opensymphony.xwork2.ActionContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author nguyentanmo
 */
public class BatDauNhapDiem {

    HttpServletRequest request = ServletActionContext.getRequest();

    public BatDauNhapDiem() {
    }

    public String execute() throws Exception {

//call service lay danh sach mon hoc cua giao vien
        Map session = ActionContext.getContext().getSession();
        Long idgv = (Long) session.get("userId");
        long idGiaovien = idgv;
        org.netbeans.xml.schema.loaidiem.ListMonHoc monhocs = null;
        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService22 service = new qldiemcomapp.QLDiemComAppService22();
            qldiemcomapp.LayDanhSachMonHocCuaGiaoVienPortType port = service.getLayDanhSachMonHocCuaGiaoVien();
            monhocs = port.layDanhSachMonHocCuaGiaoVienOperation(idGiaovien);
            System.err.println("size mon hoc " + monhocs.getMonHoc().size());
            getRequest().setAttribute("monhocs", monhocs.getMonHoc());
        } catch (Exception ex) {
            System.err.println("loi1 " + ex.getMessage());
        }


//call service lay danh sach lop giao vien day (cua cung mot mon)

        List<String> tenlops = new ArrayList<String>();
        Map<String, List<String>> monhoclop = new HashMap<String, List<String>>();
        Set<Map.Entry<String, List<String>>> setmonhoclop = new HashSet<Map.Entry<String, List<String>>>();
        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService35 service = new qldiemcomapp.QLDiemComAppService35();
            qldiemcomapp.LayDanhSachLopGiaoVienDayPortType port = service.getLayDanhSachLopGiaoVienDay();
            //lay danh sach cac mon hoc va danh sach lop cua cung mot giao vien
            if (monhocs.getMonHoc().size() > 0) {
                for (int i = 0; i < monhocs.getMonHoc().size(); i++) {
                    long idMonhoc = monhocs.getMonHoc().get(i).getIdMonhoc();
                    System.err.println("idmonhoc " + idMonhoc);
                    String tenMonHoc = monhocs.getMonHoc().get(i).getTenmonhoc();
                    org.netbeans.xml.schema.loaidiem.ListLop lops = port.layDanhSachLopGiaoVienDayOperation(idGiaovien, idMonhoc);
                    System.err.println("size lop " + lops.getLop().size());
                    for (int j = 0; j < lops.getLop().size(); j++) {
                        String tenlop = lops.getLop().get(j).getTenlop();
                        if (!tenlops.contains(tenlop)) {
                            tenlops.add(tenlop);
                        }
                    }
                    System.out.println("tenlopsize " + tenlops.size());
                    monhoclop.put(tenMonHoc, tenlops);
                    setmonhoclop = monhoclop.entrySet();
//                    Iterator<Map.Entry<String, List<String>>> iterator = setmonhoclop.iterator();
//                    while(iterator.hasNext()){
//                        System.err.println("ket qua "+iterator.next().getKey()+" "+iterator.next().getValue());
//                    }
                }
                getRequest().setAttribute("tenlops", tenlops);
                getRequest().setAttribute("setmonhoclop", setmonhoclop);
                getRequest().setAttribute("idgv", idgv);
                return "success";
            }
        } catch (Exception ex) {
            System.err.println("loi2 " + ex.getMessage());
        }

        return "error";
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public static void main(String[] s) {
//        try {
//            BatDauNhapDiem bdnd = new BatDauNhapDiem();
//            String ss = bdnd.execute();
//            System.err.println("result " + ss);
//        } catch (Exception ex) {
//            System.err.println("loi3 " + ex.getMessage());
//
//        }
        long idGiaovien = 1;
        org.netbeans.xml.schema.loaidiem.ListMonHoc monhocs = null;
        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService22 service = new qldiemcomapp.QLDiemComAppService22();
            qldiemcomapp.LayDanhSachMonHocCuaGiaoVienPortType port = service.getLayDanhSachMonHocCuaGiaoVien();
            monhocs = port.layDanhSachMonHocCuaGiaoVienOperation(idGiaovien);
            System.err.println("size mon hoc " + monhocs.getMonHoc().size());
//            getRequest().setAttribute("monhocs", monhocs.getMonHoc());
        } catch (Exception ex) {
            System.err.println("loi1 " + ex.getMessage());
        }
    }
}
