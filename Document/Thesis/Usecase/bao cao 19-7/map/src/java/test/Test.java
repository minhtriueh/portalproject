/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Date;
import model.ChiTietHocBa;
import model.ChiTietSoDiem;
import model.CoSo;
import model.DanToc;
import model.Diem;
import model.GiaoVien;
import model.GiaoVienChuNhiem;
import model.HanhKiem;
import model.HieuTruong;
import model.HocBa;
import model.HocLuc;
import model.HocSinh;
import model.KhoiLop;
import model.LoaiDiem;
import model.Lop;
import model.MonHoc;
import model.NamHoc;
import model.SoDiem;
import model.SoDiemChuNhiem;
import model.ToBoMon;
import model.Truong;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author nguyentanmo
 */
public class Test {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();//bắt đầu

        Date d1 = new Date(1955, 1, 1);
        DanToc dt1 = new DanToc("kinh", false);
        DanToc dt2 = new DanToc("Bana", true);
        //luu dan toc
        session.saveOrUpdate(dt1);
        session.saveOrUpdate(dt2);

        MonHoc mh1 = new MonHoc("Toan");
        MonHoc mh2 = new MonHoc("Ly");
        MonHoc mh3 = new MonHoc("Hoa");
        MonHoc mh4 = new MonHoc("Van");
        MonHoc mh5 = new MonHoc("Su");
        MonHoc mh6 = new MonHoc("Dia");
        //luu mon hoc
        session.saveOrUpdate(mh1);
        session.saveOrUpdate(mh2);
        session.saveOrUpdate(mh3);
        session.saveOrUpdate(mh4);
        session.saveOrUpdate(mh5);
        session.saveOrUpdate(mh6);

        Diem diem1 = new Diem(8, 1);
        Diem diem2 = new Diem(9, 2);
        Diem diem3 = new Diem(7, 3);
        Diem diem4 = new Diem(10, 1);
        //luu diem
        session.saveOrUpdate(diem1);
        session.saveOrUpdate(diem2);
        session.saveOrUpdate(diem3);
        session.saveOrUpdate(diem4);

        LoaiDiem ld1 = new LoaiDiem("mieng", 1, "M");
        LoaiDiem ld2 = new LoaiDiem("15phut", 1, "15P");
        LoaiDiem ld3 = new LoaiDiem("1tiet", 2, "1T");
        LoaiDiem ld4 = new LoaiDiem("thi", 1, "TH");
        //them diem vao loai diem
        ld1.addDiem(diem1);
        ld1.addDiem(diem2);
        ld2.addDiem(diem1);
        ld2.addDiem(diem2);
        ld2.addDiem(diem3);
        ld3.addDiem(diem1);
        ld3.addDiem(diem4);
        ld4.addDiem(diem2);
        //luu loai diem
        session.saveOrUpdate(ld1);
        session.saveOrUpdate(ld2);
        session.saveOrUpdate(ld3);
        session.saveOrUpdate(ld4);

        HocSinh hs1 = new HocSinh("Nguyen Van A", d1, "nam", "28/19", "khong", "khong co", true, d1, true, d1, "khong co ghi chu", false);
        HocSinh hs2 = new HocSinh("Nguyen Van B", d1, "nam", "28/19", "khong", "khong co", true, d1, true, d1, "khong co ghi chu", false);
        //xet dan doc
        hs1.setDanToc(dt1);
        hs2.setDanToc(dt2);
        //luu hoc sinh
        session.saveOrUpdate(hs1);
        session.saveOrUpdate(hs2);

        ChiTietSoDiem ctsd1 = new ChiTietSoDiem();
        ChiTietSoDiem ctsd2 = new ChiTietSoDiem();
        //them loai diem vao chi tiet so diem
        ctsd1.addLoaiDiem(ld1);
        ctsd1.addLoaiDiem(ld2);
        ctsd1.addLoaiDiem(ld3);
        ctsd1.addLoaiDiem(ld4);
        //them hoc sinh vao chi tiet so diem
        ctsd1.setHocSinh(hs1);
        ctsd2.setHocSinh(hs2);
        //luu chitietsodiem
        session.saveOrUpdate(ctsd1);
        session.saveOrUpdate(ctsd2);


        SoDiem sd1 = new SoDiem();
        SoDiem sd2 = new SoDiem();
        SoDiem sd3 = new SoDiem();
        SoDiem sd4 = new SoDiem();
        SoDiem sd5 = new SoDiem();
        SoDiem sd6 = new SoDiem();
        //them chi tiet so diem vao so diem
        sd1.addChiTietSoDiem(ctsd1);
        sd1.addChiTietSoDiem(ctsd2);
        //luu so diem
        session.saveOrUpdate(sd1);
        session.saveOrUpdate(sd2);
        session.saveOrUpdate(sd3);
        session.saveOrUpdate(sd4);
        session.saveOrUpdate(sd5);
        session.saveOrUpdate(sd6);

        //them mon hoc voi so diem
        mh1.setSoDiem(sd1);
        mh2.setSoDiem(sd2);
        mh3.setSoDiem(sd3);
        mh4.setSoDiem(sd4);
        mh5.setSoDiem(sd5);
        mh6.setSoDiem(sd6);

        HanhKiem hk1 = new HanhKiem("tot", "hanhkiem tot");
        HanhKiem hk2 = new HanhKiem("kha", "hanhkiem kha");
        HanhKiem hk3 = new HanhKiem("trungbinh", "hanhkiem trungbinh");
        HanhKiem hk4 = new HanhKiem("yeu", "hanhkiem yeu");
        HanhKiem hk5 = new HanhKiem("kem", "hanhkiem kem");
        //luu hanh kiem
        session.saveOrUpdate(hk1);
        session.saveOrUpdate(hk2);
        session.saveOrUpdate(hk3);
        session.saveOrUpdate(hk4);
        session.saveOrUpdate(hk5);

        HocLuc hl1 = new HocLuc("xuat sac", "hoc luc xuat sac", 10.0, 9.0, 6.5);
        HocLuc hl2 = new HocLuc("gioi", "hoc luc gioi", 8.9, 8.0, 6.5);
        HocLuc hl3 = new HocLuc("kha", "hoc luc kha", 7.0, 6.5, 5.0);
        HocLuc hl4 = new HocLuc("trungbinh", "hoc luc trungbinh", 6.4, 5.0, 5.0);
        HocLuc hl5 = new HocLuc("yeu", "hoc luc yeu", 4.9, 3.5, 3.5);
        HocLuc hl6 = new HocLuc("kem", "hoc luc kem", 3.5, 0.0, 0.0);
        //them hoc luc
        session.saveOrUpdate(hl1);
        session.saveOrUpdate(hl2);
        session.saveOrUpdate(hl3);
        session.saveOrUpdate(hl4);
        session.saveOrUpdate(hl5);
        session.saveOrUpdate(hl6);

        NamHoc nh1 = new NamHoc(1, 2009, 2010);
        NamHoc nh2 = new NamHoc(1, 2010, 2011);
        //luu nam hoc
        session.saveOrUpdate(nh1);
        session.saveOrUpdate(nh2);

        ChiTietHocBa cthb1 = new ChiTietHocBa();
        //luu chi tiet hoc ba
        session.saveOrUpdate(cthb1);
        //them hoc luc
        cthb1.setHocLuc(hl2);
        //them hanh kiem
        cthb1.setHanhKiem(hk1);
        //xet nam hoc
        cthb1.setNamHoc(nh1);
        //xet nhan xet
        cthb1.setNhanXet("hoc luc gioi hanh kiem tot");

        ChiTietHocBa cthb2 = new ChiTietHocBa();
        //luu chi tiet hoc ba
        session.saveOrUpdate(cthb2);
        //them hoc luc
        cthb2.setHocLuc(hl3);
        //them hanh kiem
        cthb2.setHanhKiem(hk1);
        //xet nam hoc
        cthb2.setNamHoc(nh1);
        //xet nhan xet
        cthb2.setNhanXet("hoc luc kha hanh kiem tot");

        ChiTietHocBa cthb3 = new ChiTietHocBa();
        //luu chi tiet hoc ba
        session.saveOrUpdate(cthb3);
        //them hoc luc
        cthb3.setHocLuc(hl3);
        //them hanh kiem
        cthb3.setHanhKiem(hk1);
        //xet nam hoc
        cthb3.setNamHoc(nh2);
        //xet nhan xet
        cthb3.setNhanXet("hoc luc kha hanh kiem tot");

        HocBa hb1 = new HocBa();
        HocBa hb2 = new HocBa();
        //luu hoc ba
        session.saveOrUpdate(hb1);
        session.saveOrUpdate(hb2);
        //them chi tiet hoc ba vao hoc ba
        hb1.addChiTietHocBa(cthb1);
        hb1.addChiTietHocBa(cthb3);
        hb2.addChiTietHocBa(cthb2);
        hb2.addChiTietHocBa(cthb3);

        //them hoc sinh voi hoc ba
        hs1.setHocBa(hb1);
        hs2.setHocBa(hb2);
        hb1.setHocSinh(hs1);
        hb2.setHocSinh(hs2);

        SoDiemChuNhiem sdcn = new SoDiemChuNhiem();
        //luu so diem chu nhiem
        session.saveOrUpdate(sdcn);

        //them so diem vao so diem chu nhiem
        sdcn.addSoDiem(sd1);
        sdcn.addSoDiem(sd2);
        sdcn.addSoDiem(sd3);
        sdcn.addSoDiem(sd4);
        sdcn.addSoDiem(sd5);
        sdcn.addSoDiem(sd6);

        //them chi tiet hoc ba vao so diem chu nhiem
        sdcn.addChiTietHocBa(cthb1);
        sdcn.addChiTietHocBa(cthb2);

        GiaoVien gv1 = new GiaoVien("Pham Van Tinh", d1, "nam", "123456789", d1, "HCM", "khong", "Ho Chi Minh", "HCM", "pvt@hcmuaf.edu.vn", "987654321", "khong co", "giao vien", "9/12", "tien si", "tot", d1, true, d1, true, d1);
        GiaoVien gv2 = new GiaoVien("Le Phi Hung", d1, "nam", "123456789", d1, "HCM", "khong", "Ho Chi Minh", "HCM", "lph@hcmuaf.edu.vn", "987654321", "khong co", "giao vien", "9/12", "thac si", "tot", d1, true, d1, true, d1);
        GiaoVien gv3 = new GiaoVien("Nguyen Duc Cong Song", d1, "nam", "123456789", d1, "HCM", "khong", "Ho Chi Minh", "HCM", "ndcs@hcmuaf.edu.vn", "987654321", "khong co", "giao vien", "9/12", "thac si", "tot", d1, true, d1, true, d1);
        GiaoVien gv4 = new GiaoVien("Mai Anh Tho", d1, "nu", "123456789", d1, "HCM", "khong", "Ho Chi Minh", "HCM", "mat@hcmuaf.edu.vn", "987654321", "khong co", "giao vien", "9/12", "thac si", "tot", d1, true, d1, true, d1);

        //luu giao vien
        session.saveOrUpdate(gv1);
        session.saveOrUpdate(gv2);
        session.saveOrUpdate(gv3);
        session.saveOrUpdate(gv4);

        //gan dan toc cho giao vien
        gv1.setDanToc(dt1);
        gv2.setDanToc(dt1);
        gv3.setDanToc(dt1);
        gv4.setDanToc(dt2);


        GiaoVienChuNhiem gvcn = new GiaoVienChuNhiem("Nguyen Duc Cong Song", d1, "nam", "123456789", d1, "HCM", "khong", "Ho Chi Minh", "HCM", "ndcs@hcmuaf.edu.vn", "987654321", "khong co", "giao vien", "9/12", "thac si", "tot", d1, true, d1, true, d1);
        //them giao vien chu nhiem
        session.saveOrUpdate(gvcn);
        gvcn.setDanToc(dt1);

        //them so diem chu nhiem cho giao vien chu nhiem
        gvcn.setSoDiemChuNhiem(sdcn);


        //them giao vien voi mon hoc
        gv1.addMonHoc(mh1);
        gv1.addMonHoc(mh2);
        gv1.addMonHoc(mh3);
        gv2.addMonHoc(mh4);
        gv3.addMonHoc(mh5);
        gv4.addMonHoc(mh6);

        ToBoMon tbm1 = new ToBoMon("tự nhiên");
        ToBoMon tbm2 = new ToBoMon("xã hội");
        //them mon hoc vao to bo mon
        tbm1.addMonHoc(mh1);
        tbm1.addMonHoc(mh2);
        tbm1.addMonHoc(mh3);
        tbm2.addMonHoc(mh4);
        tbm2.addMonHoc(mh5);
        tbm2.addMonHoc(mh6);
        //them giao vien vao to bo mon
        tbm1.addGiaoVien(gv1);
        tbm1.addGiaoVien(gv2);
        tbm2.addGiaoVien(gv3);
        tbm2.addGiaoVien(gv4);
        //luu mon hoc
        session.saveOrUpdate(tbm1);
        session.saveOrUpdate(tbm2);

        Lop l1 = new Lop("6A1", 31);
        Lop l2 = new Lop("6A2", 32);
        Lop l3 = new Lop("6A3", 33);
        Lop l4 = new Lop("7A1", 31);
        Lop l5 = new Lop("7A2", 32);
        Lop l6 = new Lop("8A1", 31);
        Lop l7 = new Lop("9A1", 31);
        Lop l8 = new Lop("10A1", 31);
        Lop l9 = new Lop("11A1", 31);
        Lop l10 = new Lop("12A1", 31);
        //luu lop
        session.saveOrUpdate(l1);
        session.saveOrUpdate(l2);
        session.saveOrUpdate(l3);
        session.saveOrUpdate(l4);
        session.saveOrUpdate(l5);
        session.saveOrUpdate(l6);
        session.saveOrUpdate(l7);
        session.saveOrUpdate(l8);
        session.saveOrUpdate(l9);
        session.saveOrUpdate(l10);

        //them hoc sinh cho lop
        l1.addHocSinh(hs1);
        l1.addHocSinh(hs2);

        //them giao vien voi lop
        gv1.addLop(l1);
        gv1.addLop(l2);
        gv1.addLop(l3);
        gv1.addLop(l4);
        gv1.addLop(l5);
        gv2.addLop(l6);
        gv2.addLop(l7);
        gv2.addLop(l8);
        gv3.addLop(l9);
        gv4.addLop(l10);

        //them giao vien chu nhiem vao lop
        l1.setGiaoVienChuNhiem(gvcn);

        //them mon hoc cho lop
        l1.addMonHoc(mh1);
        l1.addMonHoc(mh2);
        l1.addMonHoc(mh3);
        l1.addMonHoc(mh4);
        l1.addMonHoc(mh5);
        l1.addMonHoc(mh6);
        l2.addMonHoc(mh1);
        l2.addMonHoc(mh2);
        l2.addMonHoc(mh3);

        KhoiLop kl6 = new KhoiLop("6");
        KhoiLop kl7 = new KhoiLop("7");
        KhoiLop kl8 = new KhoiLop("8");
        KhoiLop kl9 = new KhoiLop("9");
        KhoiLop kl10 = new KhoiLop("10");
        KhoiLop kl11 = new KhoiLop("11");
        KhoiLop kl12 = new KhoiLop("12");
        //them lop cho khoi lop
        kl6.addLop(l1);
        kl6.addLop(l2);
        kl6.addLop(l3);
        kl7.addLop(l4);
        kl7.addLop(l5);
        kl8.addLop(l6);
        kl9.addLop(l7);
        kl10.addLop(l8);
        kl11.addLop(l9);
        kl12.addLop(l10);
        //them khoi lop
        session.saveOrUpdate(kl6);
        session.saveOrUpdate(kl7);
        session.saveOrUpdate(kl8);
        session.saveOrUpdate(kl9);
        session.saveOrUpdate(kl10);
        session.saveOrUpdate(kl11);
        session.saveOrUpdate(kl12);

        CoSo c1 = new CoSo("coSo1", "thu duc", d1, 1234567890, "hcmuaf.edu.vn", "co so thanh pho hcm");
        CoSo c2 = new CoSo("coSo2", "gia lai", d1, 1234567890, "hcmuaf.edu.vn", "co so gia lai");
        //them to bo mon
        c1.addToBoMon(tbm1);
        c1.addToBoMon(tbm2);
        //them khoi lop
        c1.addKhoiLop(kl6);
        c1.addKhoiLop(kl7);
        c1.addKhoiLop(kl8);
        c1.addKhoiLop(kl9);
        c1.addKhoiLop(kl10);
        c1.addKhoiLop(kl11);
        c1.addKhoiLop(kl12);
        //them co so
        session.saveOrUpdate(c1);
        session.saveOrUpdate(c2);

        HieuTruong ht = new HieuTruong("Bui Cat Tuyen", d1, "nam", "123456789", d1, "HCM", "khong", "Ho Chi Minh", "HCM", "buicattuyen@hcmuaf.edu.vn", "987654321", "khong co", "hieu truong", "9/12", "dai hoc", "tot", d1, true, d1, true, d1);
        Truong truong = new Truong("dai hoc nong lam", "linh trung thu duc", d1, "cong lap", 1234567890, "hcmuaf.edu.vn", "day la truong dai hoc nong lam thanh pho ho chi minh");
        truong.setHieuTruong(ht);
        //them co so cho truong
        truong.addCoSo(c1);
        truong.addCoSo(c2);
        //luu hieu truong
        session.saveOrUpdate(ht);
        //luu truong
        session.saveOrUpdate(truong);


        session.getTransaction().commit();//kết thúc
    }
}



