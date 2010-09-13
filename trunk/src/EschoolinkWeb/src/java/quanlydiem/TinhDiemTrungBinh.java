/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydiem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguyentanmo
 */
public class TinhDiemTrungBinh {

    public static double tinhDiemTrungBinh(List<Double> listDiem, List<Integer> listHeSo) {
        listDiem = chuyenListDiem(listDiem);
        int tongHeSo = 0;
        int tongDiem = 0;
        double diemThi = 0;
        double diemHocKy = 0;
        double diemTrungBinh = 0;
        for (int i = 0; i < listHeSo.size() - 1; i++) {
            tongHeSo += listHeSo.get(i);
        }
        for (int i = 0; i < listDiem.size() - 1; i++) {
            double diem = listDiem.get(i);
            int heSo = listHeSo.get(i);
            double diemCot = 0;
            diemCot = diem * heSo;
//            System.out.println("----------diem cot----------- "+diemCot);
            tongDiem += diemCot;
        }
        diemThi = listDiem.get(listDiem.size() - 1);
//        System.err.println("diem thi : " + diemThi);
        diemHocKy = tongDiem / (double)tongHeSo;
//        System.err.println("tong diem : " + tongDiem);
//        System.err.println("tong he so : " + tongHeSo);
//        System.err.println("diem hoc ky : " + diemHocKy);
        diemTrungBinh = ((diemHocKy * 2) + diemThi) / 3;
//        System.err.println("diem trung binh : " + diemTrungBinh);
        return diemTrungBinh;
    }

    public static List<Double> chuyenListDiem(List<Double> listDiem) {
        for (int i = 0; i < listDiem.size(); i++) {
            if (listDiem.get(i) == -1) {
                listDiem.set(i, 0.0);
            }
        }
        return listDiem;
    }

    public static List<List<Double>> laydanhsachdiem(List<Double> listDiem, int size) {
        List<List<Double>> listDiems = new ArrayList<List<Double>>();
        int j = 0;
        int k = size;
        for (int i = 0; i < listDiem.size(); i += size) {
            List<Double> diems = new ArrayList<Double>();
            if (k <= listDiem.size()) {
                diems.addAll(listDiem.subList(j, k));
                listDiems.add(diems);
            }
            j += size;
            k += size;
        }
//        System.err.println(listDiems.size());
        return listDiems;
    }

    public static void main(String[] s) {
        List<Double> listDiem = new ArrayList<Double>();
        List<Integer> listHeSo = new ArrayList<Integer>();
        listDiem.add(5.0);
        listDiem.add(8.0);
        listDiem.add(10.0);
        listDiem.add(0.0);
        listHeSo.add(1);
        listHeSo.add(2);
        listHeSo.add(1);
        listHeSo.add(1);
        TinhDiemTrungBinh.tinhDiemTrungBinh(listDiem, listHeSo);

//        List<Double> listDiem1 = new ArrayList<Double>();
//        for (int i = 0; i < 65; i++) {
//            listDiem1.add(i + 0.0);
//        }
//        TinhDiemTrungBinh.laydanhsachdiem(listDiem1, 13);

//        List<Double> listDiem1 = new ArrayList<Double>();
//        listDiem1.add(2.0);
//        listDiem1.add(-1.0);
//        listDiem1.add(-1.0);
//        listDiem1.add(2.0);
//        List<Double> result = chuyenListDiem(listDiem1);
//        for (int i = 0; i < result.size(); i++) {
//            System.err.println(result.get(i));
//        }
    }
}
