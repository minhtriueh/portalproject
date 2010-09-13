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
//public class TaoNhom_Result {
//
//    String tennhom;
//    String mota;
//
//    public String execute() throws Exception {
//        long id = callService(tennhom, mota);
//        if(id != -1)
//            return "success";
//        return "error";
//    }
//
//    private long callService(String tennhom, String mota) {
//        long resultID = -1;
//        try {
//            qlhethongcomapp.QLHeThongComAppService4 serv = new qlhethongcomapp.QLHeThongComAppService4();
//            qlhethongcomapp.ThemNhomPortType port = serv.getThemNhom();
//            long result = port.themNhomOperation(tennhom, mota);
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
