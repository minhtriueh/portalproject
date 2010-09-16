/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythoikhoabieu;

import java.math.BigInteger;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.netbeans.xml.schema.thoikhoabieu_eschoolinkobject.ThoiKhoaBieu;

/**
 *
 * @author GIN
 */
public class XemThoiKhoaBieu_Result {

    String tenlop;
    String hocky;
    String idNamHoc;
    ThoiKhoaBieu thoikhoabieu;

    HttpServletRequest request = ServletActionContext.getRequest();

    public String execute() throws Exception {
        thoikhoabieu = new ThoiKhoaBieu();
        BigInteger hk = new BigInteger(hocky);
        Integer hk2  = new Integer(hocky);
        Long idnh = new Long(idNamHoc);

        long idLop = callIdLop(tenlop);

        thoikhoabieu = callService(tenlop, hk);

        thoikhoabieu.setIdLop(idLop);
        thoikhoabieu.setHocKy(hk2);
        thoikhoabieu.setIdNamHoc(idnh);
        thoikhoabieu.getChiTietThoiKhoaBieu();

        

        return "success";
    }

    private ThoiKhoaBieu callService(String tenlop, BigInteger hk) {


        ThoiKhoaBieu tkb = new ThoiKhoaBieu();


        try {

            // Call Web Service Operation
            qlthoikhoabieu.QLThoiKhoaBieuService3 service = new qlthoikhoabieu.QLThoiKhoaBieuService3();
            qlthoikhoabieu.XemTKBPortType port = service.getXemTKB();
            // TODO initialize WS operation arguments here

            // TODO process result here
            org.netbeans.xml.schema.thoikhoabieu_eschoolinkobject.ThoiKhoaBieu result = port.xemTKBOperation(tenlop, hk);
            tkb = result;

            System.out.println("Result = " + tkb);

        } catch (Exception ex) {
            System.out.println(ex);
        }


        return tkb;

    }

    private long callIdLop(String tenlop) {
        long resultid = -1;
        try { // Call Web Service Operation
            qldiemcomapp.QLDiemComAppService38 service = new qldiemcomapp.QLDiemComAppService38();
            qldiemcomapp.TimIdLopByTenLopPortType port = service.getTimIdLopByTenLop();
            // TODO initialize WS operation arguments here
            // TODO process result here
            long result = port.timIdLopByTenLopOperation(tenlop);
            resultid = result;
            System.out.println("Result = " + result);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return resultid;

    }
}
