/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlyhocba;

import com.opensymphony.xwork2.ActionContext;
import java.util.List;
import java.util.Map;
import org.netbeans.xml.schema.qlhb_eschoolinkobject.HanhKiem;
import org.netbeans.xml.schema.qlhb_eschoolinkobject.HocBa;
import org.netbeans.xml.schema.qlhb_eschoolinkobject.HocBaTungHK;
import org.netbeans.xml.schema.qlhb_eschoolinkobject.HocLuc;

/**
 *
 * @author bon
 */
public class DanhGiaHanhKiemVaHocLuc {
        private String id_hocluc;
        private String id_hanhkiem;
        private String stt;
        private String nhanxet;
        private boolean kq;
        private List<HanhKiem> listhk;
        private List<HocLuc> listhl;

    public List<HanhKiem> getListhk() {
        return listhk;
    }

    public void setListhk(List<HanhKiem> listhk) {
        this.listhk = listhk;
    }

    public List<HocLuc> getListhl() {
        return listhl;
    }

    public void setListhl(List<HocLuc> listhl) {
        this.listhl = listhl;
    }


    public String getNhanxet() {
        return nhanxet;
    }

    public void setNhanxet(String nhanxet) {
        this.nhanxet = nhanxet;
    }

    public String getId_hanhkiem() {
        return id_hanhkiem;
    }

    public void setId_hanhkiem(String id_hanhkiem) {
        this.id_hanhkiem = id_hanhkiem;
    }

    public String getId_hocluc() {
        return id_hocluc;
    }

    public void setId_hocluc(String id_hocluc) {
        this.id_hocluc = id_hocluc;
    }

    public boolean isKq() {
        return kq;
    }

    public void setKq(boolean kq) {
        this.kq = kq;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }
        
    public String execute() throws Exception{
        if(stt==null)
        {

            callKhoiTaoHKvaHL();
            return "success";
        }
        else{
            Map sessions = ActionContext.getContext().getSession();
            HocBa hocba = (HocBa) sessions.get("shocba");
            System.out.print(hocba);
            List<HocBaTungHK> listhocbatunghk=hocba.getHocBaTungHK();
            HocBaTungHK hba=listhocbatunghk.get(new Integer(stt));
            long idHocba=hba.getId();
            double diemtrungbinh=hba.getDiemtrungbinhcanam();
            boolean lenlophaykhong=true;
            long idHocluc=new Long(id_hocluc);
            long idNamhoc=hba.getNamHoc().getId();
            long idHanhkiem=new Long(id_hanhkiem);
            long idLop=hba.getLop().getId();
            kq=CallUpdateService(idHocba, diemtrungbinh, lenlophaykhong, nhanxet, idHocluc, idNamhoc, idHanhkiem, idLop);
            return "direct";
        }
    }
    public boolean CallUpdateService(long idHocba, double diemtrungbinh,boolean lenlophaykhong,java.lang.String nhanxet,long idHocluc,long idNamhoc,long idHanhkiem,long idLop){
            boolean ketqua=false;

        try { // Call Web Service Operation
            qlhocbacomapp.QLHocBaComAppService6 service = new qlhocbacomapp.QLHocBaComAppService6();
            qlhocbacomapp.ChinhsuahocbaPortType port = service.getChinhsuahocba();
            // TODO initialize WS operation arguments here

            // TODO process result here
            boolean result = port.chinhsuahocbaOperation(idHocba, diemtrungbinh, lenlophaykhong, nhanxet, idHocluc, idNamhoc, idHanhkiem, idLop);
            ketqua=result;
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            System.out.println(ex);
        }
                    return ketqua;
    }
    public void callKhoiTaoHKvaHL(){

        try { // Call Web Service Operation
            qlhocbacomapp.QLHocBaComAppService11 service = new qlhocbacomapp.QLHocBaComAppService11();
            qlhocbacomapp.LoadHanhKiemPortType port = service.getLoadHanhKiem();
            // TODO process result here
            org.netbeans.xml.schema.mine.DanhSachHanhKiem result = port.loadHanhKiemOperation();
            this.listhk=result.getHanhKiem();
            System.out.println("Result = "+result);
        } catch (Exception ex) {
             System.out.println(ex);
        }
//
        try { // Call Web Service Operation
            qlhocbacomapp.QLHocBaComAppService10 service = new qlhocbacomapp.QLHocBaComAppService10();
            qlhocbacomapp.LoadHocLucPortType port = service.getLoadHocLuc();
            // TODO process result here
            org.netbeans.xml.schema.mine.DanhSachHocLuc result = port.loadHocLucOperation();
            this.listhl=result.getHocLuc();
            System.out.println("Result = "+result);

        } catch (Exception ex) {
            System.out.println(ex);
        }


    }
      public static void main(String[] arg){

            new DanhGiaHanhKiemVaHocLuc().callKhoiTaoHKvaHL();

      }
}
