/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlygiaovien;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.netbeans.xml.schema.qlgv_eschoolinkobject.GiaoVien;
import org.netbeans.xml.schema.qlgv_eschoolinkobject.Lop;

/**
 *
 * @author bon
 */
public class SearchGiaoVien implements ServletRequestAware, ServletResponseAware {

    private java.lang.String tengiaovien = "";
    private java.lang.String quequan = "";
    private java.lang.String cmnd = "";
    private java.lang.String chucvu = "";
    private java.util.List listgiaovien = null;
    private HttpServletRequest request;
    private HttpServletResponse respond;

    public String execute() throws Exception {
        listgiaovien = callSearchGV(tengiaovien, quequan, cmnd, chucvu);
        request.setAttribute("danhsachgiaovien", listgiaovien);
        return "success";

    }

    public List<GiaoVien> callSearchGV(String tengiaovien, String quequan, String cmnd, String chucvu) {
        List<GiaoVien> danhsachgiaovien = null;
        System.out.println("Result = ");
        try { // Call Web Service Operation
            qlgiaoviencomapp.QLGiaoVienComAppService2 service = new qlgiaoviencomapp.QLGiaoVienComAppService2();
            qlgiaoviencomapp.SearchGVPortType port = service.getSearchGV();
            // TODO initialize WS operation arguments here

            // TODO process result here
            org.netbeans.xml.schema.minexsd.DanhSachGiaoVien result = port.searchGVOperation(tengiaovien, quequan, cmnd, chucvu);
            danhsachgiaovien = result.getGiaoVien();
            System.out.println("Result = " + result);
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return danhsachgiaovien;
    }

    public List<Lop> callgetListlop() {
        List<Lop> dslop = null;
        try { // Call Web Service Operation
            qlgiaoviencomapp.QLGiaoVienComAppService5 service = new qlgiaoviencomapp.QLGiaoVienComAppService5();
            qlgiaoviencomapp.GetLopTrongNMPortType port = service.getGetLopTrongNM();
            // TODO initialize WS operation arguments here
            Calendar ca = Calendar.getInstance();

            java.math.BigInteger namsau = BigInteger.valueOf(ca.get(Calendar.YEAR));
            java.math.BigInteger namtruoc = BigInteger.valueOf(ca.get(Calendar.YEAR) - 1);
            // TODO process result here
            org.netbeans.xml.schema.minexsd.DanhSachLopHoc result = port.getLopTrongNMOperation(namsau, namtruoc);
            dslop = result.getLop();

            System.out.println("Result = " + dslop.size());
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return dslop;
    }

    /**
     * @return the tengiaovien
     */
    public java.lang.String getTengiaovien() {
        return tengiaovien;
    }

    /**
     * @param tengiaovien the tengiaovien to set
     */
    public void setTengiaovien(java.lang.String tengiaovien) {
        this.tengiaovien = tengiaovien;
    }

    /**
     * @return the quequan
     */
    public java.lang.String getQuequan() {
        return quequan;
    }

    /**
     * @param quequan the quequan to set
     */
    public void setQuequan(java.lang.String quequan) {
        this.quequan = quequan;
    }

    /**
     * @return the cmnd
     */
    public java.lang.String getCmnd() {
        return cmnd;
    }

    /**
     * @param cmnd the cmnd to set
     */
    public void setCmnd(java.lang.String cmnd) {
        this.cmnd = cmnd;
    }

    /**
     * @return the chucvu
     */
    public java.lang.String getChucvu() {
        return chucvu;
    }

    /**
     * @param chucvu the chucvu to set
     */
    public void setChucvu(java.lang.String chucvu) {
        this.chucvu = chucvu;
    }

    /**
     * @return the listgiaovien
     */
    public java.util.List getListgiaovien() {
        return listgiaovien;
    }

    /**
     * @param listgiaovien the listgiaovien to set
     */
    public void setListgiaovien(java.util.List listgiaovien) {
        this.listgiaovien = listgiaovien;
    }

    public static void main(String[] arg) {
        new SearchGiaoVien().callSearchGV("", "", "", "");
    }

    public void setServletRequest(HttpServletRequest arg0) {
        this.request = arg0;
    }

    public void setServletResponse(HttpServletResponse arg0) {
        this.respond = arg0;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public HttpServletResponse getRespond() {
        return respond;
    }
}


