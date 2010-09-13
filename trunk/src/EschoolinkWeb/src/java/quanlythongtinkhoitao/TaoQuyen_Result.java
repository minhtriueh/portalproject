///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package quanlythongtinkhoitao;
//
///**
// *
// * @author GIN
// */
//public class TaoQuyen_Result {
//
//    String tenquyen;
//    String mota;
//
//    public String execute() throws Exception {
//        long id = callService(tenquyen, mota);
//        if(id != -1)
//            return "success";
//        return "error";
//    }
//
//    private long callService(String tenquyen, String mota) {
//        long resultID = -1;
//        try {
//            qlhethongcomapp.QLHeThongComAppService12 serv = new qlhethongcomapp.QLHeThongComAppService12();
//            qlhethongcomapp.ThemQuyenPortType port = serv.getThemQuyen();
//            long result = port.themQuyenOperation(mota, tenquyen);
//            resultID = result;
//            System.out.println("Result ID : " + resultID);
//        } catch (Exception ex) {
//            System.out.println(ex);
//        }
//
//        return resultID;
//
//    }
//}
