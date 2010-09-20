/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythoikhoabieu;

import java.util.LinkedList;
import java.util.List;
import org.netbeans.xml.schema.tkb_eschoolinkobject.ChiTietThoiKhoaBieu;
import org.netbeans.xml.schema.tkb_eschoolinkobject.ThoiKhoaBieu;

/**
 *
 * @author GIN
 */
public class TaoThoiKhoaBieu_Result {

    private String[] monhoc2, giaovien2;
    private String[] monhoc3, giaovien3;
    private String[] monhoc4, giaovien4;
    private String[] monhoc5, giaovien5;
    private String[] monhoc6, giaovien6;
    private String[] monhoc7, giaovien7;
    private String thu2, thu3, thu4, thu5, thu6, thu7;
    private String id_lop;
    private String hocky;
    private String id_namhoc="1";

    public String execute() throws Exception {
    
        ThoiKhoaBieu thoikhoabieu=new ThoiKhoaBieu();
        ChiTietThoiKhoaBieu chitietTKB2 = null;
        ChiTietThoiKhoaBieu chitietTKB3 = null;
        ChiTietThoiKhoaBieu chitietTKB4 = null;
        ChiTietThoiKhoaBieu chitietTKB5 = null;
        ChiTietThoiKhoaBieu chitietTKB6 = null;
        ChiTietThoiKhoaBieu chitietTKB7 = null;
        List<ChiTietThoiKhoaBieu> listChiTietTKB = new LinkedList<ChiTietThoiKhoaBieu>();
       if(giaovien2!=null)
        for (int i2 = 0; i2 < giaovien2.length; i2++) {
            chitietTKB2 = new ChiTietThoiKhoaBieu();
           chitietTKB2.setIdGiaovien(new Long(giaovien2[i2]));
           chitietTKB2.setIdMonhoc(new Long(monhoc2[i2]));
            chitietTKB2.setThu(new Long(thu2));
            chitietTKB2.setTietThuMay(i2);
            listChiTietTKB.add(chitietTKB2);
            thoikhoabieu.getChiTietThoiKhoaBieu().add(chitietTKB2);

        }
  if(giaovien3!=null)
        for (int i3 = 0; i3 < giaovien3.length; i3++) {
             chitietTKB3 = new ChiTietThoiKhoaBieu();
            chitietTKB3.setIdGiaovien(new Long(giaovien3[i3]));
           chitietTKB3.setIdMonhoc(new Long(monhoc3[i3]));
            chitietTKB3.setThu(Long.parseLong(thu3));
            chitietTKB3.setTietThuMay(i3);
            listChiTietTKB.add(chitietTKB3);
             thoikhoabieu.getChiTietThoiKhoaBieu().add(chitietTKB3);
        }
  if(giaovien4!=null)
        for (int i4 = 0; i4 < giaovien4.length; i4++) {
            chitietTKB4 = new ChiTietThoiKhoaBieu();
            chitietTKB4.setIdGiaovien(new Long(giaovien4[i4]));
           chitietTKB4.setIdMonhoc(new Long(monhoc4[i4]));
            chitietTKB4.setThu(Long.parseLong(thu4));
            chitietTKB4.setTietThuMay(i4);
            listChiTietTKB.add(chitietTKB4);
             thoikhoabieu.getChiTietThoiKhoaBieu().add(chitietTKB4);
        }
  if(giaovien5!=null)
        for (int i5 = 0; i5 < giaovien5.length; i5++) {
            chitietTKB5 = new ChiTietThoiKhoaBieu();
            chitietTKB5.setIdGiaovien(new Long(giaovien5[i5]));
           chitietTKB5.setIdMonhoc(new Long(monhoc5[i5]));
            chitietTKB5.setThu(Long.parseLong(thu5));
            chitietTKB5.setTietThuMay(i5);
            thoikhoabieu.getChiTietThoiKhoaBieu().add(chitietTKB5);
        }
  if(giaovien6!=null)
        for (int i6 = 0; i6 < giaovien6.length; i6++) {
            chitietTKB6 = new ChiTietThoiKhoaBieu();
           chitietTKB6.setIdGiaovien(new Long(giaovien6[i6]));
           chitietTKB6.setIdMonhoc(new Long(monhoc6[i6]));
            chitietTKB6.setThu(Long.parseLong(thu6));
            chitietTKB6.setTietThuMay(i6);
            listChiTietTKB.add(chitietTKB6);

             thoikhoabieu.getChiTietThoiKhoaBieu().add(chitietTKB6);
        }
  if(giaovien7!=null)
        for (int i7 = 0; i7 < giaovien7.length; i7++) {
            chitietTKB7 = new ChiTietThoiKhoaBieu();
            chitietTKB7.setIdGiaovien(new Long(giaovien7[i7]));
           chitietTKB7.setIdMonhoc(new Long(monhoc7[i7]));
             chitietTKB7.setTietThuMay(i7);
           chitietTKB7.setThu(Long.parseLong(thu7));
           thoikhoabieu.getChiTietThoiKhoaBieu().add(chitietTKB7);
        }
                Long idLop = new Long(id_lop);
        Integer hk = new Integer(hocky);
        Long idNamHoc = new Long(id_namhoc);

      thoikhoabieu.setHocKy(hk);
      thoikhoabieu.setIdNamHoc(idNamHoc);
      thoikhoabieu.setIdLop(idLop);




        long id = callService(thoikhoabieu);

        if (id != -1) {
            return "success";
        } else {
            return "error";
        }
    }

    private long callService(ThoiKhoaBieu thoikhoabieu) {

        long resultID = -1;

        try { // Call Web Service Operation
            qlthoikhoabieu.QLThoiKhoaBieuService2 service = new qlthoikhoabieu.QLThoiKhoaBieuService2();
            qlthoikhoabieu.ThemTKBPortType port = service.getThemTKB();
            // TODO initialize WS operation arguments here
            // TODO process result here
            long result = port.themTKBOperation(thoikhoabieu);
            System.out.println("Result = "+result);
            resultID=result;
        } catch (Exception ex) {
             System.out.println(ex);
        }
                return resultID;


    }

    public String[] getGiaovien2() {
        return giaovien2;
    }

    public void setGiaovien2(String[] giaovien2) {
        this.giaovien2 = giaovien2;
    }

    public String[] getGiaovien3() {
        return giaovien3;
    }

    public void setGiaovien3(String[] giaovien3) {
        this.giaovien3 = giaovien3;
    }

    public String[] getGiaovien4() {
        return giaovien4;
    }

    public void setGiaovien4(String[] giaovien4) {
        this.giaovien4 = giaovien4;
    }

    public String[] getGiaovien5() {
        return giaovien5;
    }

    public void setGiaovien5(String[] giaovien5) {
        this.giaovien5 = giaovien5;
    }

    public String[] getGiaovien6() {
        return giaovien6;
    }

    public void setGiaovien6(String[] giaovien6) {
        this.giaovien6 = giaovien6;
    }

    public String[] getGiaovien7() {
        return giaovien7;
    }

    public void setGiaovien7(String[] giaovien7) {
        this.giaovien7 = giaovien7;
    }

    public String getHocky() {
        return hocky;
    }

    public void setHocky(String hocky) {
        this.hocky = hocky;
    }

    public String getId_lop() {
        return id_lop;
    }

    public void setId_lop(String id_lop) {
        this.id_lop = id_lop;
    }

    public String[] getMonhoc2() {
        return monhoc2;
    }

    public void setMonhoc2(String[] monhoc2) {
        this.monhoc2 = monhoc2;
    }

    public String[] getMonhoc3() {
        return monhoc3;
    }

    public void setMonhoc3(String[] monhoc3) {
        this.monhoc3 = monhoc3;
    }

    public String[] getMonhoc4() {
        return monhoc4;
    }

    public void setMonhoc4(String[] monhoc4) {
        this.monhoc4 = monhoc4;
    }

    public String[] getMonhoc5() {
        return monhoc5;
    }

    public void setMonhoc5(String[] monhoc5) {
        this.monhoc5 = monhoc5;
    }

    public String[] getMonhoc6() {
        return monhoc6;
    }

    public void setMonhoc6(String[] monhoc6) {
        this.monhoc6 = monhoc6;
    }

    public String[] getMonhoc7() {
        return monhoc7;
    }

    public void setMonhoc7(String[] monhoc7) {
        this.monhoc7 = monhoc7;
    }

    public String getThu2() {
        return thu2;
    }

    public void setThu2(String thu2) {
        this.thu2 = thu2;
    }

    public String getThu3() {
        return thu3;
    }

    public void setThu3(String thu3) {
        this.thu3 = thu3;
    }

    public String getThu4() {
        return thu4;
    }

    public void setThu4(String thu4) {
        this.thu4 = thu4;
    }

    public String getThu5() {
        return thu5;
    }

    public void setThu5(String thu5) {
        this.thu5 = thu5;
    }

    public String getThu6() {
        return thu6;
    }

    public void setThu6(String thu6) {
        this.thu6 = thu6;
    }

    public String getThu7() {
        return thu7;
    }

    public void setThu7(String thu7) {
        this.thu7 = thu7;
    }
}
