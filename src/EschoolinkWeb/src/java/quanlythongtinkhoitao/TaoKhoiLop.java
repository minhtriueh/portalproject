///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package quanlythongtinkhoitao;
//
//import java.util.List;
//import org.netbeans.xml.schema.eschoolinkobject.KhoiLop;
//
///**
// *
// * @author hunfan
// */
//public class TaoKhoiLop {
//    List<KhoiLop> dsKhoiLop;
//
//     public String execute() throws Exception {
//        loadKhoiLop();
//        return "success";
//    }
//
//     private void loadKhoiLop() {
//        try { // Call Web Service Operationa
//
//            qlgiaoviencomapp.QLGiaoVienComAppService8 service = new qlgiaoviencomapp.QLGiaoVienComAppService8();
//            qlgiaoviencomapp.LoadKhoiLopPortType port = service.getLoadKhoiLop();
//            // TODO process result here
//
//
//            org.netbeans.xml.schema.minexsd.DanhSachKhoiLop result = port.loadKhoiLopOperation();
//            this.dsKhoiLop = result.getKhoiLop();
//
//            System.out.println("Result = " + result);
//        } catch (Exception ex) {
//            System.out.println(ex);
//        }
//    }
//
//}
