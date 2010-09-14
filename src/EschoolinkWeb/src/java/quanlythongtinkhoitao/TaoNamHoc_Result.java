/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythongtinkhoitao;


/**
 *
 * @author GIN
 */
public class TaoNamHoc_Result {

    String namtruoc;
    String namsau;

    public String execute() throws Exception {

        Integer nt = new Integer(namtruoc);
        Integer ns = new Integer(namsau);

        long id = callService(nt, ns);
        
        if(id != -1)
            return "success";
        return "error";
    }

    private long callService(int namtruoc, int namsau) {
        long resultID = -1;

        try {

            qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService4 serv  = new qlthongtinkhoitaocomapp.QLThongTinKhoiTaoComAppService4();
            qlthongtinkhoitaocomapp.TaoNamHocPortType port = serv.getTaoNamHoc();

            long result = port.taoNamHocOperation(namtruoc,namsau);

            resultID = result;
            System.out.println("Result ID : " + resultID);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return resultID;

    }

    public String getNamsau() {
        return namsau;
    }

    public void setNamsau(String namsau) {
        this.namsau = namsau;
    }

    public String getNamtruoc() {
        return namtruoc;
    }

    public void setNamtruoc(String namtruoc) {
        this.namtruoc = namtruoc;
    }


}
