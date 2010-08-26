/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlydiachi;

import java.util.ArrayList;
import org.netbeans.xml.schema.eschoolinkobject.QuanHuyenThanhPho;

/**
 *
 * @author sanchikaro
 */

public class LayDanhSachHuyen {
    private ArrayList<QuanHuyenThanhPho> listHuyen=new ArrayList<QuanHuyenThanhPho>();
    private long idTinh;
    public LayDanhSachHuyen() {
    }

    public String execute() throws Exception {

        try { // Call Web Service Operation
            quanlydiachicomapp.QuanLyDiaChiComAppService10 service = new quanlydiachicomapp.QuanLyDiaChiComAppService10();
            quanlydiachicomapp.LayDanhSachHuyenPortType port = service.getLayDanhSachHuyen();
            // TODO initialize WS operation arguments here

            // TODO process result here
            org.netbeans.xml.schema.eschoolinkobject.ListHuyen result = port.layDanhSachHuyenOperation(idTinh);
            for (int i = 0; i < result.getQuanHuyenThanhPho().size(); i++) {
                listHuyen.add(result.getQuanHuyenThanhPho().get(i));
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        return "success";
    }

    public long getIdTinh() {
        return idTinh;
    }

    public void setIdTinh(long idTinh) {
        this.idTinh = idTinh;
    }

    public ArrayList<QuanHuyenThanhPho> getListHuyen() {
        return listHuyen;
    }

    public void setListHuyen(ArrayList<QuanHuyenThanhPho> listHuyen) {
        this.listHuyen = listHuyen;
    }

   
}