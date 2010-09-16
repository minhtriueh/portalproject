/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythoikhoabieu;

import javax.servlet.http.HttpServletRequest;
import org.netbeans.xml.schema.thoikhoabieu_eschoolinkobject.ThoiKhoaBieu;

/**
 *
 * @author GIN
 */
public class XemThoiKhoaBieu_Result {

    String tenlop;
    String hocky;

    ThoiKhoaBieu thoikhoabieu;


    public String execute() throws Exception {
        thoikhoabieu = new ThoiKhoaBieu();

        thoikhoabieu = callService(tenlop, new Integer(hocky));

        thoikhoabieu.getChiTietThoiKhoaBieu();
       


        return "success";
    }

    private ThoiKhoaBieu callService(String tenlop, int hocky) {


        ThoiKhoaBieu tkb = new ThoiKhoaBieu();

        try { // Call Web Service Operation
            qlthoikhoabieu.QLThoiKhoaBieuService3 service = new qlthoikhoabieu.QLThoiKhoaBieuService3();
            qlthoikhoabieu.XemTKBPortType port = service.getXemTKB();
            // TODO initialize WS operation arguments here
            // TODO process result here
            org.netbeans.xml.schema.thoikhoabieu_eschoolinkobject.ThoiKhoaBieu result = port.xemTKBOperation(tenlop, hocky);
            System.out.println("Result = "+result);
            tkb=result;
        } catch (Exception ex) {
             System.out.println("Result = "+ex);
        }



        return tkb;

    }


    public String getHocky() {
        return hocky;
    }

    public void setHocky(String hocky) {
        this.hocky = hocky;
    }


    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public ThoiKhoaBieu getThoikhoabieu() {
        return thoikhoabieu;
    }

    public void setThoikhoabieu(ThoiKhoaBieu thoikhoabieu) {
        this.thoikhoabieu = thoikhoabieu;
    }


}
