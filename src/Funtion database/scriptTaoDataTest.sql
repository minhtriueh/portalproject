-- Function: create_datatotest()

-- DROP FUNCTION create_datatotest();

CREATE OR REPLACE FUNCTION create_datatotest()
  RETURNS boolean AS
$BODY$
DECLARE 
id_khuvuc1 bigint;
id_khuvuc2 bigint;
id_khuvuc3 bigint;
id_khuvuc4 bigint;

idtinh1 bigint;
idtinh2 bigint;
idtinh3 bigint;
idtinh4 bigint;

id_quanhuyen1 bigint;
id_quanhuyen2 bigint;
id_quanhuyen3 bigint;
id_quanhuyen4 bigint;




id_dantoc1 bigint;
id_dantoc2 bigint;
id_dantoc3 bigint;

id_loaihs1 bigint;
id_loaihs2 bigint;

id_chedouutien1 bigint;
id_chedouutien2 bigint;
id_chedouutien3 bigint;
id_chedouutien4 bigint;

id_namhoc bigint;
id_truong bigint;
id_coso bigint;

id_khoilop12 bigint;
id_khoilop10 bigint;
id_khoilop11 bigint;

id_lop11a1 bigint;
id_lop11a2 bigint;
id_lop11a3 bigint;
id_lop11a4 bigint;
id_lop11a5 bigint;

id_lop10a1 bigint;
id_lop10a2 bigint;
id_lop10a3 bigint;
id_lop10a4 bigint;

id_lop12a1 bigint;
id_lop12a2 bigint;
id_lop12a3 bigint;
id_lop12a4 bigint;

id_hs1 bigint;
id_hs2 bigint;
id_hs3 bigint;
id_hs4 bigint;
id_hs5 bigint;
id_hs6 bigint;

mahs bigint;

--ntm 
id_tobomontoan bigint;
id_tobomonly bigint;
id_tobomonhoa bigint;
id_tobomonvan bigint;
id_tobomonsu bigint;
id_tobomondia bigint;
id_tobomonsinh bigint;
id_tobomonanh bigint;
--ntm
id_montoan bigint;
id_monly bigint;
id_monhoa bigint;
id_monvan bigint;
id_monsu bigint;
id_mondia bigint;
id_monsinh bigint;
id_monanh bigint;
--ntm
id_namhocmoi bigint;
--ntm
id_giaovien1 bigint;
id_giaovien2 bigint;
id_giaovien3 bigint;
id_giaovien4 bigint;
id_giaovien5 bigint;
id_giaovien6 bigint;
id_giaovien7 bigint;
id_giaovien8 bigint;
--ntm
id_giaovienchunhiem1 bigint;
id_giaovienchunhiem2 bigint;
id_giaovienchunhiem3 bigint;
id_giaovienchunhiem4 bigint;
id_giaovienchunhiem5 bigint;
id_giaovienchunhiem6 bigint;
id_giaovienchunhiem7 bigint;
id_giaovienchunhiem8 bigint;
--ntm
id_nguoidung1 bigint;
id_nguoidung2 bigint;
id_nguoidung3 bigint;
id_nguoidung4 bigint;
id_nguoidung5 bigint;
id_nguoidung6 bigint;
id_nguoidung7 bigint;
id_nguoidung8 bigint;
--ntm
id_loaidiem1 bigint;
id_loaidiem2 bigint;
id_loaidiem3 bigint;
id_loaidiem4 bigint;
--ntm
id_thoikhoabieu1 bigint;
id_thoikhoabieu2 bigint;
id_thoikhoabieu3 bigint;
id_thoikhoabieu4 bigint;
id_thoikhoabieu5 bigint;
id_thoikhoabieu6 bigint;
id_thoikhoabieu7 bigint;
id_thoikhoabieu8 bigint;
id_thoikhoabieu9 bigint;
id_thoikhoabieu10 bigint;
id_thoikhoabieu11 bigint;
id_thoikhoabieu12 bigint;
id_thoikhoabieu13 bigint;
id_thoikhoabieu14 bigint;
id_thoikhoabieu15 bigint;
id_thoikhoabieu16 bigint;
id_thoikhoabieu17 bigint;
id_thoikhoabieu18 bigint;
id_thoikhoabieu19 bigint;
id_thoikhoabieu20 bigint;
id_thoikhoabieu21 bigint;
id_thoikhoabieu22 bigint;
id_thoikhoabieu23 bigint;
id_thoikhoabieu24 bigint;
id_thoikhoabieu25 bigint;
id_thoikhoabieu26 bigint;
--ntm
id_sodiem1 bigint;
id_sodiem2 bigint;
id_sodiem3 bigint;
id_sodiem4 bigint;
id_sodiem5 bigint;
id_sodiem6 bigint;
id_sodiem7 bigint;
id_sodiem8 bigint;
id_sodiem9 bigint;
id_sodiem10 bigint;
id_sodiem11 bigint;
id_sodiem12 bigint;
id_sodiem13 bigint;
id_sodiem14 bigint;
id_sodiem15 bigint;
id_sodiem16 bigint;
id_sodiem17 bigint;
id_sodiem18 bigint;
id_sodiem19 bigint;
id_sodiem20 bigint;
id_sodiem21 bigint;
id_sodiem22 bigint;
id_sodiem23 bigint;
id_sodiem24 bigint;
id_sodiem25 bigint;
id_sodiem26 bigint;
id_sodiem27 bigint;
id_sodiem28 bigint;
id_sodiem29 bigint;
id_sodiem30 bigint;
id_sodiem31 bigint;
id_sodiem32 bigint;
id_sodiem33 bigint;
id_sodiem34 bigint;
id_sodiem35 bigint;
id_sodiem36 bigint;
id_sodiem37 bigint;
id_sodiem38 bigint;
id_sodiem39 bigint;
id_sodiem40 bigint;
id_sodiem41 bigint;
id_sodiem42 bigint;
id_sodiem43 bigint;
id_sodiem44 bigint;
id_sodiem45 bigint;
id_sodiem46 bigint;
id_sodiem47 bigint;
id_sodiem48 bigint;
id_sodiem49 bigint;
id_sodiem50 bigint;
id_sodiem51 bigint;
id_sodiem52 bigint;
id_sodiem53 bigint;
id_sodiem54 bigint;
id_sodiem55 bigint;
id_sodiem56 bigint;
id_sodiem57 bigint;
id_sodiem58 bigint;
id_sodiem59 bigint;
id_sodiem60 bigint;
id_sodiem61 bigint;
id_sodiem62 bigint;
id_sodiem63 bigint;
id_sodiem64 bigint;
id_sodiem65 bigint;
id_sodiem66 bigint;
id_sodiem67 bigint;
id_sodiem68 bigint;
id_sodiem69 bigint;
id_sodiem70 bigint;
id_sodiem71 bigint;
id_sodiem72 bigint;
id_sodiem73 bigint;
id_sodiem74 bigint;
id_sodiem75 bigint;
id_sodiem76 bigint;
id_sodiem77 bigint;
id_sodiem78 bigint;
id_sodiem79 bigint;
id_sodiem80 bigint;
id_sodiem81 bigint;
id_sodiem82 bigint;
id_sodiem83 bigint;
id_sodiem84 bigint;
id_sodiem85 bigint;
id_sodiem86 bigint;
id_sodiem87 bigint;
id_sodiem88 bigint;
id_sodiem89 bigint;
id_sodiem90 bigint;
id_sodiem91 bigint;
id_sodiem92 bigint;
id_sodiem93 bigint;
id_sodiem94 bigint;
id_sodiem95 bigint;
id_sodiem96 bigint;
id_sodiem97 bigint;
id_sodiem98 bigint;
id_sodiem99 bigint;
id_sodiem100 bigint;
id_sodiem101 bigint;
id_sodiem102 bigint;
id_sodiem103 bigint;
id_sodiem104 bigint;
--ntm
id_chitietsodiem1 bigint;
id_chitietsodiem2 bigint;
id_chitietsodiem3 bigint;
id_chitietsodiem4 bigint;
id_chitietsodiem5 bigint;
id_chitietsodiem6 bigint;
id_chitietsodiem7 bigint;
id_chitietsodiem8 bigint;
--ntm
id_diem1 bigint;
id_diem2 bigint;
id_diem3 bigint;
id_diem4 bigint;
id_diem5 bigint;
id_diem6 bigint;
id_diem7 bigint;
id_diem8 bigint;
id_diem9 bigint;
id_diem10 bigint;
id_diem11 bigint;
id_diem12 bigint;
id_diem13 bigint;


BEGIN
	
	--tao lop hoc
	id_namhoc:=create_namhoc(2010 , 2009 );
	id_truong:=create_truong('Hà Nội' , '0987665544' , 'Trường THPT Hai Bà Trưng (thành phố Huế) là một trong những ngôi trường lớn ở miền Trung và trên toàn quốc. ' , 'ban cong' ,CURRENT_DATE, 'Truong THPT Hai Bà Trưng' , 'www.THPTHAIBATRUNG.net' );
	id_coso:=create_coso('Hà Nội' , '089875656454' , 'Cơ sở chính' , CURRENT_DATE, 'Cơ sở chính' , 'www.THPTHAIBATRUNG.net' , id_truong );

	--tao khoi lop
	id_khoilop10:=create_khoilop('10' , id_coso );
	id_khoilop11:=create_khoilop('11' , id_coso );
	id_khoilop12:=create_khoilop('12' , id_coso );

	--tao lop 
	id_lop10a1:=create_lop(0 , '10a1' , id_khoilop10 , id_namhoc );
	id_lop10a2:=create_lop(0 , '10a2' , id_khoilop10 , id_namhoc );
	id_lop10a3:=create_lop(0 , '10a3' , id_khoilop10 , id_namhoc );
	id_lop10a4:=create_lop(0 , '10a4' , id_khoilop10 , id_namhoc );

	id_lop11a1:=create_lop(0 , '11a1' , id_khoilop11 , id_namhoc );
	id_lop11a2:=create_lop(0 , '11a2' , id_khoilop11 , id_namhoc );
	id_lop11a3:=create_lop(0 , '11a3' , id_khoilop11 , id_namhoc );
	id_lop11a4:=create_lop(0 , '11a4' , id_khoilop11 , id_namhoc );
	id_lop11a5:=create_lop(0 , '11a5' , id_khoilop11 , id_namhoc );

	id_lop12a1:=create_lop(0 , '12a1' , id_khoilop12 , id_namhoc );
	id_lop12a2:=create_lop(0 , '12a2' , id_khoilop12 , id_namhoc );
	id_lop12a3:=create_lop(0 , '12a3' , id_khoilop12 , id_namhoc );
	id_lop12a4:=create_lop(0 , '12a4' , id_khoilop12 , id_namhoc );

	--tao che do uu tien
	
	id_chedouutien1:=create_chedouutien('' , 20  , 'Con thương binh' );
	id_chedouutien2:=create_chedouutien('' , 40  , 'Con bệnh binh' );
	id_chedouutien3:=create_chedouutien('' , 30  , 'Gia đình chính sách' );
	id_chedouutien4:=create_chedouutien('' , 100  , 'Học sinh nghèo' );
	
	--tao loai hoc sinh
	id_loaihs1:=create_loaihocsinh('' , 'Hoc sinh bình thường' );
	id_loaihs2:=create_loaihocsinh('' , 'Học sinh cá biệt' );

	--tao 54 dan toc
	id_dantoc1:=create_dantoc(false , 'Kinh' );
	id_dantoc2:=create_dantoc(true , 'Tày' );
	PERFORM create_dantoc(true , 'Thái' );
	PERFORM create_dantoc(true , 'Mường' );
	PERFORM create_dantoc(true , 'Khmer' );
	PERFORM create_dantoc(true , 'Hoa' );
	PERFORM create_dantoc(true , 'Nùng' );
	PERFORM create_dantoc(true , 'Hmông' );
	PERFORM create_dantoc(true , 'Dao' );
	PERFORM create_dantoc(true , 'Giarai' );
	PERFORM create_dantoc(true , 'Êđê' );
	PERFORM create_dantoc(true , 'Chăm' );
	PERFORM create_dantoc(true , 'Sán Dìu' );
	PERFORM create_dantoc(true , 'Brâu' );
	PERFORM create_dantoc(true , 'Ơ đu' );
	PERFORM create_dantoc(true , 'Rơ Măm' );
	PERFORM create_dantoc(true , 'Chứt' );
	PERFORM create_dantoc(true , 'Bố Y' );
	PERFORM create_dantoc(true , 'Giáy' );
	PERFORM create_dantoc(true , 'Lào' );
	PERFORM create_dantoc(true , 'Lự' );
	PERFORM create_dantoc(true , 'Sán Chay' );
	PERFORM create_dantoc(true , 'Ba na' );
	PERFORM create_dantoc(true , 'Bru-Vân kiều');
	PERFORM create_dantoc(true , 'Chơ-ro' );
	PERFORM create_dantoc(true , 'Co' );
	PERFORM create_dantoc(true , 'Cơ-ho' );
	PERFORM create_dantoc(true , 'Cơ-tu' );
	PERFORM create_dantoc(true , 'Gié-triêng' );
	PERFORM create_dantoc(true , 'Hrê' );
	PERFORM create_dantoc(true , 'Kháng' );
	PERFORM create_dantoc(true , 'Khơ mú' );
	PERFORM create_dantoc(true , 'Mạ' );

	--tao 4 khu vuc
	id_khuvuc1:=create_khuvuc('' , 'KV1' );
	id_khuvuc2:=create_khuvuc('' , 'KV2' );
	id_khuvuc3:=create_khuvuc('' , 'KV3' );
	id_khuvuc4:=create_khuvuc('' , 'KV4' );

	--tao dia chi

	-- tao tinh thanh
	idtinh1:=create_tinh('Tay Ninh');
	idtinh2:=create_tinh('Binh duong');
	idtinh3:=create_tinh('Thành phố Hồ Chí Minh');
	PERFORM create_tinh('An Giang');
	PERFORM create_tinh('Bắc Giang');
	PERFORM create_tinh('Bắc Ninh');
	PERFORM create_tinh('Bắc Kạn');
	PERFORM create_tinh('Bạc Liêu');
	PERFORM create_tinh('Bến Tre');
	PERFORM create_tinh('Bình Định');
	PERFORM create_tinh('Bình Phước');
	PERFORM create_tinh('Bà Rịa-Vũng Tàu');
	PERFORM create_tinh('Bình Thuận');
	PERFORM create_tinh('Cần Thơ');
	PERFORM create_tinh('Cà Mau');
	PERFORM create_tinh('Cao Bằng');
	PERFORM create_tinh('Đắk Lắk');
	PERFORM create_tinh('Đồng Tháp');
	PERFORM create_tinh('Đồng Nai');
	PERFORM create_tinh('Đắk Nông');
	PERFORM create_tinh('Gia Lai');
	idtinh4:=create_tinh('Hà Nội');
	PERFORM create_tinh('Hưng Yên');
	PERFORM create_tinh('Hải Phòng');
	PERFORM create_tinh('Hà Nam');
	PERFORM create_tinh('Hải Dương');
	PERFORM create_tinh('Hà Tĩnh');
	PERFORM create_tinh('Hậu Giang');
	PERFORM create_tinh('Hòa Bình');
	PERFORM create_tinh('Hà Giang');
	PERFORM create_tinh('Kiên Giang');
	PERFORM create_tinh('Kon Tum');
	PERFORM create_tinh('Khánh Hòa');
	PERFORM create_tinh('Lào Cai');
	PERFORM create_tinh('Lai Châu');
	PERFORM create_tinh('Long An');
	PERFORM create_tinh('Lâm Đồng');
	PERFORM create_tinh('Lạng Sơn');
	PERFORM create_tinh('Nam Định');
	PERFORM create_tinh('Nghệ An');
	PERFORM create_tinh('Ninh Thuận');
	PERFORM create_tinh('Ninh Bình');
	PERFORM create_tinh('Phú Yên');
	PERFORM create_tinh('Phú Thọ');
	PERFORM create_tinh('Quảng Nam');
	PERFORM create_tinh('Quảng Ngãi');
	PERFORM create_tinh('Quảng Trị');
	PERFORM create_tinh('Quảng Bình');
	PERFORM create_tinh('Quảng Ninh');
	PERFORM create_tinh('Sơn La');
	PERFORM create_tinh('Sóc Trăng');
	PERFORM create_tinh('Thái Bình');
	PERFORM create_tinh('Thừa Thiên-Huế');
	PERFORM create_tinh('Thanh Hóa');
	PERFORM create_tinh('Tuyên Quang');
	PERFORM create_tinh('Trà Vinh');
	PERFORM create_tinh('Tiền Giang');
	PERFORM create_tinh('Thái Nguyên');
	PERFORM create_tinh('Tây Ninh');
	PERFORM create_tinh('Vĩnh Phúc');
	PERFORM create_tinh('Vĩnh Long');
	PERFORM create_tinh('Yên Bái');

	--tao huyen thuoc tinh Tay Ninh

	id_quanhuyen1:=createthanhpho('Bến Cầu' , idtinh1 );
	PERFORM createthanhpho('Dương Minh Châu' , idtinh1 );
	PERFORM createthanhpho('Tân Biên' , idtinh1 );
	PERFORM createthanhpho('Tân Châu' , idtinh1 );
	PERFORM createthanhpho('Châu Thành' , idtinh1 );
	PERFORM createthanhpho('Gò Dầu' , idtinh1 );
	PERFORM createthanhpho('Hòa Thành' , idtinh1 );
	PERFORM createthanhpho('Trảng Bàng' , idtinh1 );

	-- tao huyen thuoc tinh binh duong
	id_quanhuyen2:=createthanhpho('Bến Cát' , idtinh2 );
	PERFORM createthanhpho('Dĩ An' , idtinh2 );
	PERFORM createthanhpho('Dầu Tiếng' , idtinh2 );
	PERFORM createthanhpho('Phú Giáo' , idtinh2 );
	PERFORM createthanhpho('Thuận An' , idtinh2 );
	PERFORM createthanhpho('Tân Uyên' , idtinh2 );

	-- tao huyen thuoc tp ho chi minh	
	id_quanhuyen3:=createthanhpho('Quan I' , idtinh3 );
	PERFORM createthanhpho('Quan 2' , idtinh3 );
	PERFORM createthanhpho('Quan 5' , idtinh3 );
	PERFORM createthanhpho('Quan 9' , idtinh3 );
	PERFORM createthanhpho('Bình Chánh' , idtinh3 );
	PERFORM createthanhpho('Cần Giờ' , idtinh3 );
	PERFORM createthanhpho('Củ Chi' , idtinh3 );
	PERFORM createthanhpho('Hóc Môn' , idtinh3 );
	PERFORM createthanhpho('Nhà Bè' , idtinh3 );
	PERFORM createthanhpho('Phú Nhuận' , idtinh3 );

	-- tao huyen thuoc Ha noi
	id_quanhuyen4:=createthanhpho('Ba Vì' , idtinh4 );
	PERFORM createthanhpho('Chương Mỹ' , idtinh4 );
	PERFORM createthanhpho('Sóc Sơn' , idtinh4 );
	PERFORM createthanhpho('Từ Liêm' , idtinh4 );
	PERFORM createthanhpho('Đông Anh' , idtinh4 );
	PERFORM createthanhpho('Gia Lâm' , idtinh4 );
	PERFORM createthanhpho('Hoài Đức' , idtinh4 );
	PERFORM createthanhpho('Mê Linh' , idtinh4 );
	PERFORM createthanhpho('Mỹ Đức' , idtinh4 );
	
	--ntm tao to bo mon
	id_tobomontoan:=insert_tobomon('bo mon toan',id_coso);
	id_tobomonly:=insert_tobomon('bo mon ly',id_coso);
	id_tobomonhoa:=insert_tobomon('bo mon toan',id_coso);
	id_tobomonvan:=insert_tobomon('bo mon van',id_coso);
	id_tobomonsu:=insert_tobomon('bo mon su',id_coso);
	id_tobomondia:=insert_tobomon('bo mon dia',id_coso);
	id_tobomonsinh:=insert_tobomon('bo mon sinh',id_coso);
	id_tobomonanh:=insert_tobomon('bo mon anh',id_coso);
	
	--ntm tao mon hoc
	id_montoan:=insert_monhoc('Toan', id_tobomontoan);
	id_monly:=insert_monhoc('Ly', id_tobomontoan);
	id_monhoa:=insert_monhoc('Hoa', id_tobomontoan);
	id_monvan:=insert_monhoc('Van', id_tobomontoan);
	id_monsu:=insert_monhoc('Su', id_tobomontoan);
	id_mondia:=insert_monhoc('Dia', id_tobomontoan);
	id_monsinh:=insert_monhoc('Sinh', id_tobomontoan);
	id_monanh:=insert_monhoc('Anh', id_tobomontoan);
	
	--ntm tao nam hoc moi
	id_namhocmoi:=insert_namhocmoi(id_namhoc);
	
	--ntm tao nguoi dung
	id_nguoidung1:=themnguoidung('2010-08-03','sanh', 'sanh');
	id_nguoidung2:=themnguoidung('2010-08-03','minh', 'minh');
	id_nguoidung3:=themnguoidung('2010-08-03','danh', 'danh');
	id_nguoidung4:=themnguoidung('2010-08-03','phuong', 'phuong');
	id_nguoidung5:=themnguoidung('2010-08-03','xuan', 'xuan');
	id_nguoidung6:=themnguoidung('2010-08-03','toan', 'toan');
	id_nguoidung7:=themnguoidung('2010-08-03','tuan', 'tuan');
	id_nguoidung8:=themnguoidung('2010-08-03','giao', 'giao');
	
	--ntm tao giao vien
	id_giaovien1:=insertgiaovien('nong lam','giao vien','111111111','sanh@gmail.com','nam','',true,true,'1985-08-03','1970-08-03','1990-08-03','1980-08-03','1990-08-03','hcm','thu duc-hcm','0901111111','nguyen van sanh','tot','khong','dai hoc','dai hoc',id_nguoidung1,id_dantoc1,id_tobomontoan);
	id_giaovien2:=insertgiaovien('nong lam','giao vien','222222222','minh@gmail.com','nam','',true,true,'1985-08-03','1970-08-03','1990-08-03','1980-08-03','1990-08-03','hcm','thu duc-hcm','0902222222','nguyen van minh','tot','khong','dai hoc','dai hoc',id_nguoidung2,id_dantoc1,id_tobomonly);
	id_giaovien3:=insertgiaovien('nong lam','giao vien','333333333','danh@gmail.com','nam','',true,true,'1985-08-03','1970-08-03','1990-08-03','1980-08-03','1990-08-03','hcm','thu duc-hcm','0903333333','nguyen van danh','tot','khong','dai hoc','dai hoc',id_nguoidung3,id_dantoc1,id_tobomonhoa);
	id_giaovien4:=insertgiaovien('nong lam','giao vien','444444444','phuong@gmail.com','nu','',true,true,'1985-08-03','1970-08-03','1990-08-03','1980-08-03','1990-08-03','hcm','thu duc-hcm','0904444444','nguyen thi phuong','tot','khong','dai hoc','dai hoc',id_nguoidung4,id_dantoc1,id_tobomonvan);
	id_giaovien5:=insertgiaovien('nong lam','giao vien','555555555','xuan@gmail.com','nam','',true,true,'1985-08-03','1970-08-03','1990-08-03','1980-08-03','1990-08-03','hcm','thu duc-hcm','0905555555','nguyen van xuan','tot','khong','dai hoc','dai hoc',id_nguoidung5,id_dantoc1,id_tobomonsu);
	id_giaovien6:=insertgiaovien('nong lam','giao vien','666666666','toan@gmail.com','nam','',true,true,'1985-08-03','1970-08-03','1990-08-03','1980-08-03','1990-08-03','hcm','thu duc-hcm','0906666666','nguyen van toan','tot','khong','dai hoc','dai hoc',id_nguoidung6,id_dantoc1,id_tobomondia);
	id_giaovien7:=insertgiaovien('nong lam','giao vien','777777777','tuan@gmail.com','nam','',true,true,'1985-08-03','1970-08-03','1990-08-03','1980-08-03','1990-08-03','hcm','thu duc-hcm','0907777777','nguyen van tuan','tot','khong','dai hoc','dai hoc',id_nguoidung7,id_dantoc1,id_tobomonsinh);
	id_giaovien8:=insertgiaovien('nong lam','giao vien','888888888','giao@gmail.com','nu','',true,true,'1985-08-03','1970-08-03','1990-08-03','1980-08-03','1990-08-03','hcm','thu duc-hcm','0908888888','nguyen thi giao','tot','khong','dai hoc','dai hoc',id_nguoidung8,id_dantoc1,id_tobomonanh);
	
	--ntm tao giao vien chu nhiem
	id_giaovienchunhiem1:=insert_giaovienchunhiem(id_giaovien1);
	id_giaovienchunhiem2:=insert_giaovienchunhiem(id_giaovien2);
	id_giaovienchunhiem3:=insert_giaovienchunhiem(id_giaovien3);
	id_giaovienchunhiem4:=insert_giaovienchunhiem(id_giaovien4);
	id_giaovienchunhiem5:=insert_giaovienchunhiem(id_giaovien5);
	id_giaovienchunhiem6:=insert_giaovienchunhiem(id_giaovien6);
	id_giaovienchunhiem7:=insert_giaovienchunhiem(id_giaovien7);
	id_giaovienchunhiem8:=insert_giaovienchunhiem(id_giaovien8);
	
	--ntm tao giao vien lop
	PERFORM insert_giaovien_lop(id_giaovien1 , id_lop10a1);
	PERFORM insert_giaovien_lop(id_giaovien1 , id_lop10a2);
	PERFORM insert_giaovien_lop(id_giaovien1 , id_lop10a3);
	PERFORM insert_giaovien_lop(id_giaovien1 , id_lop10a4);
	PERFORM insert_giaovien_lop(id_giaovien1 , id_lop11a1);
	PERFORM insert_giaovien_lop(id_giaovien1 , id_lop11a2);
	PERFORM insert_giaovien_lop(id_giaovien1 , id_lop11a3);
	PERFORM insert_giaovien_lop(id_giaovien1 , id_lop11a4);
	PERFORM insert_giaovien_lop(id_giaovien1 , id_lop11a5);
	PERFORM insert_giaovien_lop(id_giaovien1 , id_lop12a1);
	PERFORM insert_giaovien_lop(id_giaovien1 , id_lop12a2);
	PERFORM insert_giaovien_lop(id_giaovien1 , id_lop12a3);
	PERFORM insert_giaovien_lop(id_giaovien1 , id_lop12a4);
	
	PERFORM insert_giaovien_lop(id_giaovien2 , id_lop10a1);
	PERFORM insert_giaovien_lop(id_giaovien2 , id_lop10a2);
	PERFORM insert_giaovien_lop(id_giaovien2 , id_lop10a3);
	PERFORM insert_giaovien_lop(id_giaovien2 , id_lop10a4);
	PERFORM insert_giaovien_lop(id_giaovien2 , id_lop11a1);
	PERFORM insert_giaovien_lop(id_giaovien2 , id_lop11a2);
	PERFORM insert_giaovien_lop(id_giaovien2 , id_lop11a3);
	PERFORM insert_giaovien_lop(id_giaovien2 , id_lop11a4);
	PERFORM insert_giaovien_lop(id_giaovien2 , id_lop11a5);
	PERFORM insert_giaovien_lop(id_giaovien2 , id_lop12a1);
	PERFORM insert_giaovien_lop(id_giaovien2 , id_lop12a2);
	PERFORM insert_giaovien_lop(id_giaovien2 , id_lop12a3);
	PERFORM insert_giaovien_lop(id_giaovien2 , id_lop12a4);
	
	PERFORM insert_giaovien_lop(id_giaovien3 , id_lop10a1);
	PERFORM insert_giaovien_lop(id_giaovien3 , id_lop10a2);
	PERFORM insert_giaovien_lop(id_giaovien3 , id_lop10a3);
	PERFORM insert_giaovien_lop(id_giaovien3 , id_lop10a4);
	PERFORM insert_giaovien_lop(id_giaovien3 , id_lop11a1);
	PERFORM insert_giaovien_lop(id_giaovien3 , id_lop11a2);
	PERFORM insert_giaovien_lop(id_giaovien3 , id_lop11a3);
	PERFORM insert_giaovien_lop(id_giaovien3 , id_lop11a4);
	PERFORM insert_giaovien_lop(id_giaovien3 , id_lop11a5);
	PERFORM insert_giaovien_lop(id_giaovien3 , id_lop12a1);
	PERFORM insert_giaovien_lop(id_giaovien3 , id_lop12a2);
	PERFORM insert_giaovien_lop(id_giaovien3 , id_lop12a3);
	PERFORM insert_giaovien_lop(id_giaovien3 , id_lop12a4);
	
	PERFORM insert_giaovien_lop(id_giaovien4 , id_lop10a1);
	PERFORM insert_giaovien_lop(id_giaovien4 , id_lop10a2);
	PERFORM insert_giaovien_lop(id_giaovien4 , id_lop10a3);
	PERFORM insert_giaovien_lop(id_giaovien4 , id_lop10a4);
	PERFORM insert_giaovien_lop(id_giaovien4 , id_lop11a1);
	PERFORM insert_giaovien_lop(id_giaovien4 , id_lop11a2);
	PERFORM insert_giaovien_lop(id_giaovien4 , id_lop11a3);
	PERFORM insert_giaovien_lop(id_giaovien4 , id_lop11a4);
	PERFORM insert_giaovien_lop(id_giaovien4 , id_lop11a5);
	PERFORM insert_giaovien_lop(id_giaovien4 , id_lop12a1);
	PERFORM insert_giaovien_lop(id_giaovien4 , id_lop12a2);
	PERFORM insert_giaovien_lop(id_giaovien4 , id_lop12a3);
	PERFORM insert_giaovien_lop(id_giaovien4 , id_lop12a4);
	
	PERFORM insert_giaovien_lop(id_giaovien5 , id_lop10a1);
	PERFORM insert_giaovien_lop(id_giaovien5 , id_lop10a2);
	PERFORM insert_giaovien_lop(id_giaovien5 , id_lop10a3);
	PERFORM insert_giaovien_lop(id_giaovien5 , id_lop10a4);
	PERFORM insert_giaovien_lop(id_giaovien5 , id_lop11a1);
	PERFORM insert_giaovien_lop(id_giaovien5 , id_lop11a2);
	PERFORM insert_giaovien_lop(id_giaovien5 , id_lop11a3);
	PERFORM insert_giaovien_lop(id_giaovien5 , id_lop11a4);
	PERFORM insert_giaovien_lop(id_giaovien5 , id_lop11a5);
	PERFORM insert_giaovien_lop(id_giaovien5 , id_lop12a1);
	PERFORM insert_giaovien_lop(id_giaovien5 , id_lop12a2);
	PERFORM insert_giaovien_lop(id_giaovien5 , id_lop12a3);
	PERFORM insert_giaovien_lop(id_giaovien5 , id_lop12a4);
	
	PERFORM insert_giaovien_lop(id_giaovien6 , id_lop10a1);
	PERFORM insert_giaovien_lop(id_giaovien6 , id_lop10a2);
	PERFORM insert_giaovien_lop(id_giaovien6 , id_lop10a3);
	PERFORM insert_giaovien_lop(id_giaovien6 , id_lop10a4);
	PERFORM insert_giaovien_lop(id_giaovien6 , id_lop11a1);
	PERFORM insert_giaovien_lop(id_giaovien6 , id_lop11a2);
	PERFORM insert_giaovien_lop(id_giaovien6 , id_lop11a3);
	PERFORM insert_giaovien_lop(id_giaovien6 , id_lop11a4);
	PERFORM insert_giaovien_lop(id_giaovien6 , id_lop11a5);
	PERFORM insert_giaovien_lop(id_giaovien6 , id_lop12a1);
	PERFORM insert_giaovien_lop(id_giaovien6 , id_lop12a2);
	PERFORM insert_giaovien_lop(id_giaovien6 , id_lop12a3);
	PERFORM insert_giaovien_lop(id_giaovien6 , id_lop12a4);
	
	PERFORM insert_giaovien_lop(id_giaovien7 , id_lop10a1);
	PERFORM insert_giaovien_lop(id_giaovien7 , id_lop10a2);
	PERFORM insert_giaovien_lop(id_giaovien7 , id_lop10a3);
	PERFORM insert_giaovien_lop(id_giaovien7 , id_lop10a4);
	PERFORM insert_giaovien_lop(id_giaovien7 , id_lop11a1);
	PERFORM insert_giaovien_lop(id_giaovien7 , id_lop11a2);
	PERFORM insert_giaovien_lop(id_giaovien7 , id_lop11a3);
	PERFORM insert_giaovien_lop(id_giaovien7 , id_lop11a4);
	PERFORM insert_giaovien_lop(id_giaovien7 , id_lop11a5);
	PERFORM insert_giaovien_lop(id_giaovien7 , id_lop12a1);
	PERFORM insert_giaovien_lop(id_giaovien7 , id_lop12a2);
	PERFORM insert_giaovien_lop(id_giaovien7 , id_lop12a3);
	PERFORM insert_giaovien_lop(id_giaovien7 , id_lop12a4);
	
	PERFORM insert_giaovien_lop(id_giaovien8 , id_lop10a1);
	PERFORM insert_giaovien_lop(id_giaovien8 , id_lop10a2);
	PERFORM insert_giaovien_lop(id_giaovien8 , id_lop10a3);
	PERFORM insert_giaovien_lop(id_giaovien8 , id_lop10a4);
	PERFORM insert_giaovien_lop(id_giaovien8 , id_lop11a1);
	PERFORM insert_giaovien_lop(id_giaovien8 , id_lop11a2);
	PERFORM insert_giaovien_lop(id_giaovien8 , id_lop11a3);
	PERFORM insert_giaovien_lop(id_giaovien8 , id_lop11a4);
	PERFORM insert_giaovien_lop(id_giaovien8 , id_lop11a5);
	PERFORM insert_giaovien_lop(id_giaovien8 , id_lop12a1);
	PERFORM insert_giaovien_lop(id_giaovien8 , id_lop12a2);
	PERFORM insert_giaovien_lop(id_giaovien8 , id_lop12a3);
	PERFORM insert_giaovien_lop(id_giaovien8 , id_lop12a4);
	
	--ntm tao giao vien mon
	PERFORM insert_giaovien_monhoc(id_giaovien1, id_montoan);
	PERFORM insert_giaovien_monhoc(id_giaovien2, id_monly);
	PERFORM insert_giaovien_monhoc(id_giaovien3, id_monhoa);
	PERFORM insert_giaovien_monhoc(id_giaovien4, id_monvan);
	PERFORM insert_giaovien_monhoc(id_giaovien5, id_monsu);
	PERFORM insert_giaovien_monhoc(id_giaovien6, id_mondia);
	PERFORM insert_giaovien_monhoc(id_giaovien7, id_monsinh);
	PERFORM insert_giaovien_monhoc(id_giaovien8, id_monanh);
	
	--ntm tao lop mon hoc
	PERFORM insert_lop_monhoc(id_lop10a1, id_montoan);
	PERFORM insert_lop_monhoc(id_lop10a1, id_monly);
	PERFORM insert_lop_monhoc(id_lop10a1, id_monhoa);
	PERFORM insert_lop_monhoc(id_lop10a1, id_monvan);
	PERFORM insert_lop_monhoc(id_lop10a1, id_monsu);
	PERFORM insert_lop_monhoc(id_lop10a1, id_mondia);
	PERFORM insert_lop_monhoc(id_lop10a1, id_monsinh);
	PERFORM insert_lop_monhoc(id_lop10a1, id_monanh);
	
	PERFORM insert_lop_monhoc(id_lop10a2, id_montoan);
	PERFORM insert_lop_monhoc(id_lop10a2, id_monly);
	PERFORM insert_lop_monhoc(id_lop10a2, id_monhoa);
	PERFORM insert_lop_monhoc(id_lop10a2, id_monvan);
	PERFORM insert_lop_monhoc(id_lop10a2, id_monsu);
	PERFORM insert_lop_monhoc(id_lop10a2, id_mondia);
	PERFORM insert_lop_monhoc(id_lop10a2, id_monsinh);
	PERFORM insert_lop_monhoc(id_lop10a2, id_monanh);
	
	PERFORM insert_lop_monhoc(id_lop10a3, id_montoan);
	PERFORM insert_lop_monhoc(id_lop10a3, id_monly);
	PERFORM insert_lop_monhoc(id_lop10a3, id_monhoa);
	PERFORM insert_lop_monhoc(id_lop10a3, id_monvan);
	PERFORM insert_lop_monhoc(id_lop10a3, id_monsu);
	PERFORM insert_lop_monhoc(id_lop10a3, id_mondia);
	PERFORM insert_lop_monhoc(id_lop10a3, id_monsinh);
	PERFORM insert_lop_monhoc(id_lop10a3, id_monanh);
	
	PERFORM insert_lop_monhoc(id_lop10a4, id_montoan);
	PERFORM insert_lop_monhoc(id_lop10a4, id_monly);
	PERFORM insert_lop_monhoc(id_lop10a4, id_monhoa);
	PERFORM insert_lop_monhoc(id_lop10a4, id_monvan);
	PERFORM insert_lop_monhoc(id_lop10a4, id_monsu);
	PERFORM insert_lop_monhoc(id_lop10a4, id_mondia);
	PERFORM insert_lop_monhoc(id_lop10a4, id_monsinh);
	PERFORM insert_lop_monhoc(id_lop10a4, id_monanh);
	
	PERFORM insert_lop_monhoc(id_lop11a1, id_montoan);
	PERFORM insert_lop_monhoc(id_lop11a1, id_monly);
	PERFORM insert_lop_monhoc(id_lop11a1, id_monhoa);
	PERFORM insert_lop_monhoc(id_lop11a1, id_monvan);
	PERFORM insert_lop_monhoc(id_lop11a1, id_monsu);
	PERFORM insert_lop_monhoc(id_lop11a1, id_mondia);
	PERFORM insert_lop_monhoc(id_lop11a1, id_monsinh);
	PERFORM insert_lop_monhoc(id_lop11a1, id_monanh);
	
	PERFORM insert_lop_monhoc(id_lop11a2, id_montoan);
	PERFORM insert_lop_monhoc(id_lop11a2, id_monly);
	PERFORM insert_lop_monhoc(id_lop11a2, id_monhoa);
	PERFORM insert_lop_monhoc(id_lop11a2, id_monvan);
	PERFORM insert_lop_monhoc(id_lop11a2, id_monsu);
	PERFORM insert_lop_monhoc(id_lop11a2, id_mondia);
	PERFORM insert_lop_monhoc(id_lop11a2, id_monsinh);
	PERFORM insert_lop_monhoc(id_lop11a2, id_monanh);
	
	PERFORM insert_lop_monhoc(id_lop11a3, id_montoan);
	PERFORM insert_lop_monhoc(id_lop11a3, id_monly);
	PERFORM insert_lop_monhoc(id_lop11a3, id_monhoa);
	PERFORM insert_lop_monhoc(id_lop11a3, id_monvan);
	PERFORM insert_lop_monhoc(id_lop11a3, id_monsu);
	PERFORM insert_lop_monhoc(id_lop11a3, id_mondia);
	PERFORM insert_lop_monhoc(id_lop11a3, id_monsinh);
	PERFORM insert_lop_monhoc(id_lop11a3, id_monanh);
	
	PERFORM insert_lop_monhoc(id_lop11a4, id_montoan);
	PERFORM insert_lop_monhoc(id_lop11a4, id_monly);
	PERFORM insert_lop_monhoc(id_lop11a4, id_monhoa);
	PERFORM insert_lop_monhoc(id_lop11a4, id_monvan);
	PERFORM insert_lop_monhoc(id_lop11a4, id_monsu);
	PERFORM insert_lop_monhoc(id_lop11a4, id_mondia);
	PERFORM insert_lop_monhoc(id_lop11a4, id_monsinh);
	PERFORM insert_lop_monhoc(id_lop11a4, id_monanh);
	
	PERFORM insert_lop_monhoc(id_lop11a5, id_montoan);
	PERFORM insert_lop_monhoc(id_lop11a5, id_monly);
	PERFORM insert_lop_monhoc(id_lop11a5, id_monhoa);
	PERFORM insert_lop_monhoc(id_lop11a5, id_monvan);
	PERFORM insert_lop_monhoc(id_lop11a5, id_monsu);
	PERFORM insert_lop_monhoc(id_lop11a5, id_mondia);
	PERFORM insert_lop_monhoc(id_lop11a5, id_monsinh);
	PERFORM insert_lop_monhoc(id_lop11a5, id_monanh);
	
	PERFORM insert_lop_monhoc(id_lop12a1, id_montoan);
	PERFORM insert_lop_monhoc(id_lop12a1, id_monly);
	PERFORM insert_lop_monhoc(id_lop12a1, id_monhoa);
	PERFORM insert_lop_monhoc(id_lop12a1, id_monvan);
	PERFORM insert_lop_monhoc(id_lop12a1, id_monsu);
	PERFORM insert_lop_monhoc(id_lop12a1, id_mondia);
	PERFORM insert_lop_monhoc(id_lop12a1, id_monsinh);
	PERFORM insert_lop_monhoc(id_lop12a1, id_monanh);
	
	PERFORM insert_lop_monhoc(id_lop12a2, id_montoan);
	PERFORM insert_lop_monhoc(id_lop12a2, id_monly);
	PERFORM insert_lop_monhoc(id_lop12a2, id_monhoa);
	PERFORM insert_lop_monhoc(id_lop12a2, id_monvan);
	PERFORM insert_lop_monhoc(id_lop12a2, id_monsu);
	PERFORM insert_lop_monhoc(id_lop12a2, id_mondia);
	PERFORM insert_lop_monhoc(id_lop12a2, id_monsinh);
	PERFORM insert_lop_monhoc(id_lop12a2, id_monanh);
	
	PERFORM insert_lop_monhoc(id_lop12a3, id_montoan);
	PERFORM insert_lop_monhoc(id_lop12a3, id_monly);
	PERFORM insert_lop_monhoc(id_lop12a3, id_monhoa);
	PERFORM insert_lop_monhoc(id_lop12a3, id_monvan);
	PERFORM insert_lop_monhoc(id_lop12a3, id_monsu);
	PERFORM insert_lop_monhoc(id_lop12a3, id_mondia);
	PERFORM insert_lop_monhoc(id_lop12a3, id_monsinh);
	PERFORM insert_lop_monhoc(id_lop12a3, id_monanh);
	
	PERFORM insert_lop_monhoc(id_lop12a4, id_montoan);
	PERFORM insert_lop_monhoc(id_lop12a4, id_monly);
	PERFORM insert_lop_monhoc(id_lop12a4, id_monhoa);
	PERFORM insert_lop_monhoc(id_lop12a4, id_monvan);
	PERFORM insert_lop_monhoc(id_lop12a4, id_monsu);
	PERFORM insert_lop_monhoc(id_lop12a4, id_mondia);
	PERFORM insert_lop_monhoc(id_lop12a4, id_monsinh);
	PERFORM insert_lop_monhoc(id_lop12a4, id_monanh);
	
	--ntm tao loai diem
	id_loaidiem1:=insert_loaidiem(1, 'M', 'Mieng');
	id_loaidiem2:=insert_loaidiem(1, '15P', '15 Phut');
	id_loaidiem3:=insert_loaidiem(2, '1T', '1 Tiet');
	id_loaidiem4:=insert_loaidiem(1, 'T', 'Thi');
	
	--ntm tao danh sach loai diem 4-3-5-1
	PERFORM insert_danhsachloaidiem(id_loaidiem1, 1);
	PERFORM insert_danhsachloaidiem(id_loaidiem1, 2);
	PERFORM insert_danhsachloaidiem(id_loaidiem1, 3);
	PERFORM insert_danhsachloaidiem(id_loaidiem1, 4);
	
	PERFORM insert_danhsachloaidiem(id_loaidiem2, 1);
	PERFORM insert_danhsachloaidiem(id_loaidiem2, 2);
	PERFORM insert_danhsachloaidiem(id_loaidiem2, 3);
	
	PERFORM insert_danhsachloaidiem(id_loaidiem3, 1);
	PERFORM insert_danhsachloaidiem(id_loaidiem3, 2);
	PERFORM insert_danhsachloaidiem(id_loaidiem3, 3);
	PERFORM insert_danhsachloaidiem(id_loaidiem3, 4);
	PERFORM insert_danhsachloaidiem(id_loaidiem3, 5);
	
	PERFORM insert_danhsachloaidiem(id_loaidiem4, 1);
	
	--ntm tao thoi khoa bieu
	id_thoikhoabieu1:=insert_thoikhoabieu(1, id_lop10a1, id_namhoc);
	id_thoikhoabieu2:=insert_thoikhoabieu(2, id_lop10a1, id_namhoc);
	id_thoikhoabieu3:=insert_thoikhoabieu(1, id_lop10a2, id_namhoc);
	id_thoikhoabieu4:=insert_thoikhoabieu(2, id_lop10a2, id_namhoc);
	id_thoikhoabieu5:=insert_thoikhoabieu(1, id_lop10a3, id_namhoc);
	id_thoikhoabieu6:=insert_thoikhoabieu(2, id_lop10a3, id_namhoc);
	id_thoikhoabieu7:=insert_thoikhoabieu(1, id_lop10a4, id_namhoc);
	id_thoikhoabieu8:=insert_thoikhoabieu(2, id_lop10a4, id_namhoc);
	id_thoikhoabieu9:=insert_thoikhoabieu(1, id_lop11a1, id_namhoc);
	id_thoikhoabieu10:=insert_thoikhoabieu(2, id_lop11a1, id_namhoc);
	id_thoikhoabieu11:=insert_thoikhoabieu(1, id_lop11a2, id_namhoc);
	id_thoikhoabieu12:=insert_thoikhoabieu(2, id_lop11a2, id_namhoc);
	id_thoikhoabieu13:=insert_thoikhoabieu(1, id_lop11a3, id_namhoc);
	id_thoikhoabieu14:=insert_thoikhoabieu(2, id_lop11a3, id_namhoc);
	id_thoikhoabieu15:=insert_thoikhoabieu(1, id_lop11a4, id_namhoc);
	id_thoikhoabieu16:=insert_thoikhoabieu(2, id_lop11a4, id_namhoc);
	id_thoikhoabieu17:=insert_thoikhoabieu(1, id_lop11a5, id_namhoc);
	id_thoikhoabieu18:=insert_thoikhoabieu(2, id_lop11a5, id_namhoc);
	id_thoikhoabieu19:=insert_thoikhoabieu(1, id_lop12a1, id_namhoc);
	id_thoikhoabieu20:=insert_thoikhoabieu(2, id_lop12a1, id_namhoc);
	id_thoikhoabieu21:=insert_thoikhoabieu(1, id_lop12a2, id_namhoc);
	id_thoikhoabieu22:=insert_thoikhoabieu(2, id_lop12a2, id_namhoc);
	id_thoikhoabieu23:=insert_thoikhoabieu(1, id_lop12a3, id_namhoc);
	id_thoikhoabieu24:=insert_thoikhoabieu(2, id_lop12a3, id_namhoc);
	id_thoikhoabieu25:=insert_thoikhoabieu(1, id_lop12a4, id_namhoc);
	id_thoikhoabieu26:=insert_thoikhoabieu(2, id_lop12a4, id_namhoc);
	
	--ntm tao chi tiet thoi khoa bieu
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu1);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu1);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu2);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu2);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu3);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu3);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu4);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu4);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu5);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu5);

	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu6);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu6);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu7);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu7);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu8);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu8);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu9);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu9);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu10);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu10);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu11);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu11);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu12);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu12);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu13);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu13);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu14);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu14);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu15);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu15);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu16);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu16);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu17);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu17);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu18);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu18);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu19);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu19);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu20);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu20);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu21);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu21);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu22);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu22);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu23);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu23);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu24);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu24);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu25);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu25);
	
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 2, 1, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 2, 2, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 2, 3, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 2, 4, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 3, 1, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 3, 2, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 3, 3, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 3, 4, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 3, 5, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,   5, 4, 1, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh, 5, 4, 2, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh,  5, 4, 3, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan,5, 5, 1, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,  5, 5, 2, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,  5, 5, 3, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan, 5, 5, 4, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien5 , id_monsu,  5, 5, 5, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien1 , id_montoan, 5, 6, 1, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien2 , id_monly,   5, 6, 2, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien3 , id_monhoa,   5, 6, 3, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien4 , id_monvan,  5, 6, 4, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien6 , id_monsu,  5, 7, 1, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien7 , id_monsinh,5, 7, 2, id_thoikhoabieu26);
	PERFORM insert_chitietthoikhoabieu(id_giaovien8 , id_monanh, 5, 7, 3, id_thoikhoabieu26);
	
	--ntm tao so diem
	id_sodiem1:=insert_sodiem(1, 'so diem toan hoc ky 1', id_giaovien1, id_namhoc, id_montoan, id_lop10a1);
	id_sodiem2:=insert_sodiem(1, 'so diem toan hoc ky 1', id_giaovien1, id_namhoc, id_montoan, id_lop10a2);
	id_sodiem3:=insert_sodiem(1, 'so diem toan hoc ky 1', id_giaovien1, id_namhoc, id_montoan, id_lop10a3);
	id_sodiem4:=insert_sodiem(1, 'so diem toan hoc ky 1', id_giaovien1, id_namhoc, id_montoan, id_lop10a4);
	id_sodiem5:=insert_sodiem(1, 'so diem toan hoc ky 1', id_giaovien1, id_namhoc, id_montoan, id_lop11a1);
	id_sodiem6:=insert_sodiem(1, 'so diem toan hoc ky 1', id_giaovien1, id_namhoc, id_montoan, id_lop11a2);
	id_sodiem7:=insert_sodiem(1, 'so diem toan hoc ky 1', id_giaovien1, id_namhoc, id_montoan, id_lop11a3);
	id_sodiem8:=insert_sodiem(1, 'so diem toan hoc ky 1', id_giaovien1, id_namhoc, id_montoan, id_lop11a4);
	id_sodiem9:=insert_sodiem(1, 'so diem toan hoc ky 1', id_giaovien1, id_namhoc, id_montoan, id_lop11a5);
	id_sodiem10:=insert_sodiem(1, 'so diem toan hoc ky 1', id_giaovien1, id_namhoc, id_montoan, id_lop12a1);
	id_sodiem11:=insert_sodiem(1, 'so diem toan hoc ky 1', id_giaovien1, id_namhoc, id_montoan, id_lop12a2);
	id_sodiem12:=insert_sodiem(1, 'so diem toan hoc ky 1', id_giaovien1, id_namhoc, id_montoan, id_lop12a3);
	id_sodiem13:=insert_sodiem(1, 'so diem toan hoc ky 1', id_giaovien1, id_namhoc, id_montoan, id_lop12a4);
	
	id_sodiem14:=insert_sodiem(1, 'so diem ly hoc ky 1', id_giaovien2, id_namhoc, id_monly, id_lop10a1);
	id_sodiem15:=insert_sodiem(1, 'so diem ly hoc ky 1', id_giaovien2, id_namhoc, id_monly, id_lop10a2);
	id_sodiem16:=insert_sodiem(1, 'so diem ly hoc ky 1', id_giaovien2, id_namhoc, id_monly, id_lop10a3);
	id_sodiem17:=insert_sodiem(1, 'so diem ly hoc ky 1', id_giaovien2, id_namhoc, id_monly, id_lop10a4);
	id_sodiem18:=insert_sodiem(1, 'so diem ly hoc ky 1', id_giaovien2, id_namhoc, id_monly, id_lop11a1);
	id_sodiem19:=insert_sodiem(1, 'so diem ly hoc ky 1', id_giaovien2, id_namhoc, id_monly, id_lop11a2);
	id_sodiem20:=insert_sodiem(1, 'so diem ly hoc ky 1', id_giaovien2, id_namhoc, id_monly, id_lop11a3);
	id_sodiem21:=insert_sodiem(1, 'so diem ly hoc ky 1', id_giaovien2, id_namhoc, id_monly, id_lop11a4);
	id_sodiem22:=insert_sodiem(1, 'so diem ly hoc ky 1', id_giaovien2, id_namhoc, id_monly, id_lop11a5);
	id_sodiem23:=insert_sodiem(1, 'so diem ly hoc ky 1', id_giaovien2, id_namhoc, id_monly, id_lop12a1);
	id_sodiem24:=insert_sodiem(1, 'so diem ly hoc ky 1', id_giaovien2, id_namhoc, id_monly, id_lop12a2);
	id_sodiem25:=insert_sodiem(1, 'so diem ly hoc ky 1', id_giaovien2, id_namhoc, id_monly, id_lop12a3);
	id_sodiem26:=insert_sodiem(1, 'so diem ly hoc ky 1', id_giaovien2, id_namhoc, id_monly, id_lop12a4);
	
	id_sodiem27:=insert_sodiem(1, 'so diem hoa hoc ky 1', id_giaovien3, id_namhoc, id_monhoa, id_lop10a1);
	id_sodiem28:=insert_sodiem(1, 'so diem hoa hoc ky 1', id_giaovien3, id_namhoc, id_monhoa, id_lop10a2);
	id_sodiem29:=insert_sodiem(1, 'so diem hoa hoc ky 1', id_giaovien3, id_namhoc, id_monhoa, id_lop10a3);
	id_sodiem30:=insert_sodiem(1, 'so diem hoa hoc ky 1', id_giaovien3, id_namhoc, id_monhoa, id_lop10a4);
	id_sodiem31:=insert_sodiem(1, 'so diem hoa hoc ky 1', id_giaovien3, id_namhoc, id_monhoa, id_lop11a1);
	id_sodiem32:=insert_sodiem(1, 'so diem hoa hoc ky 1', id_giaovien3, id_namhoc, id_monhoa, id_lop11a2);
	id_sodiem33:=insert_sodiem(1, 'so diem hoa hoc ky 1', id_giaovien3, id_namhoc, id_monhoa, id_lop11a3);
	id_sodiem34:=insert_sodiem(1, 'so diem hoa hoc ky 1', id_giaovien3, id_namhoc, id_monhoa, id_lop11a4);
	id_sodiem35:=insert_sodiem(1, 'so diem hoa hoc ky 1', id_giaovien3, id_namhoc, id_monhoa, id_lop11a5);
	id_sodiem36:=insert_sodiem(1, 'so diem hoa hoc ky 1', id_giaovien3, id_namhoc, id_monhoa, id_lop12a1);
	id_sodiem37:=insert_sodiem(1, 'so diem hoa hoc ky 1', id_giaovien3, id_namhoc, id_monhoa, id_lop12a2);
	id_sodiem38:=insert_sodiem(1, 'so diem hoa hoc ky 1', id_giaovien3, id_namhoc, id_monhoa, id_lop12a3);
	id_sodiem39:=insert_sodiem(1, 'so diem hoa hoc ky 1', id_giaovien3, id_namhoc, id_monhoa, id_lop12a4);
	
	id_sodiem40:=insert_sodiem(1, 'so diem van hoc ky 1', id_giaovien4, id_namhoc, id_monvan, id_lop10a1);
	id_sodiem41:=insert_sodiem(1, 'so diem van hoc ky 1', id_giaovien4, id_namhoc, id_monvan, id_lop10a2);
	id_sodiem42:=insert_sodiem(1, 'so diem van hoc ky 1', id_giaovien4, id_namhoc, id_monvan, id_lop10a3);
	id_sodiem43:=insert_sodiem(1, 'so diem van hoc ky 1', id_giaovien4, id_namhoc, id_monvan, id_lop10a4);
	id_sodiem44:=insert_sodiem(1, 'so diem van hoc ky 1', id_giaovien4, id_namhoc, id_monvan, id_lop11a1);
	id_sodiem45:=insert_sodiem(1, 'so diem van hoc ky 1', id_giaovien4, id_namhoc, id_monvan, id_lop11a2);
	id_sodiem46:=insert_sodiem(1, 'so diem van hoc ky 1', id_giaovien4, id_namhoc, id_monvan, id_lop11a3);
	id_sodiem47:=insert_sodiem(1, 'so diem van hoc ky 1', id_giaovien4, id_namhoc, id_monvan, id_lop11a4);
	id_sodiem48:=insert_sodiem(1, 'so diem van hoc ky 1', id_giaovien4, id_namhoc, id_monvan, id_lop11a5);
	id_sodiem49:=insert_sodiem(1, 'so diem van hoc ky 1', id_giaovien4, id_namhoc, id_monvan, id_lop12a1);
	id_sodiem50:=insert_sodiem(1, 'so diem van hoc ky 1', id_giaovien4, id_namhoc, id_monvan, id_lop12a2);
	id_sodiem51:=insert_sodiem(1, 'so diem van hoc ky 1', id_giaovien4, id_namhoc, id_monvan, id_lop12a3);
	id_sodiem52:=insert_sodiem(1, 'so diem van hoc ky 1', id_giaovien4, id_namhoc, id_monvan, id_lop12a4);
	
	id_sodiem53:=insert_sodiem(1, 'so diem su hoc ky 1', id_giaovien5, id_namhoc, id_monsu, id_lop10a1);
	id_sodiem54:=insert_sodiem(1, 'so diem su hoc ky 1', id_giaovien5, id_namhoc, id_monsu, id_lop10a2);
	id_sodiem55:=insert_sodiem(1, 'so diem su hoc ky 1', id_giaovien5, id_namhoc, id_monsu, id_lop10a3);
	id_sodiem56:=insert_sodiem(1, 'so diem su hoc ky 1', id_giaovien5, id_namhoc, id_monsu, id_lop10a4);
	id_sodiem57:=insert_sodiem(1, 'so diem su hoc ky 1', id_giaovien5, id_namhoc, id_monsu, id_lop11a1);
	id_sodiem58:=insert_sodiem(1, 'so diem su hoc ky 1', id_giaovien5, id_namhoc, id_monsu, id_lop11a2);
	id_sodiem59:=insert_sodiem(1, 'so diem su hoc ky 1', id_giaovien5, id_namhoc, id_monsu, id_lop11a3);
	id_sodiem60:=insert_sodiem(1, 'so diem su hoc ky 1', id_giaovien5, id_namhoc, id_monsu, id_lop11a4);
	id_sodiem61:=insert_sodiem(1, 'so diem su hoc ky 1', id_giaovien5, id_namhoc, id_monsu, id_lop11a5);
	id_sodiem62:=insert_sodiem(1, 'so diem su hoc ky 1', id_giaovien5, id_namhoc, id_monsu, id_lop12a1);
	id_sodiem63:=insert_sodiem(1, 'so diem su hoc ky 1', id_giaovien5, id_namhoc, id_monsu, id_lop12a2);
	id_sodiem64:=insert_sodiem(1, 'so diem su hoc ky 1', id_giaovien5, id_namhoc, id_monsu, id_lop12a3);
	id_sodiem65:=insert_sodiem(1, 'so diem su hoc ky 1', id_giaovien5, id_namhoc, id_monsu, id_lop12a4);
	
	id_sodiem66:=insert_sodiem(1, 'so diem dia hoc ky 1', id_giaovien6, id_namhoc, id_mondia, id_lop10a1);
	id_sodiem67:=insert_sodiem(1, 'so diem dia hoc ky 1', id_giaovien6, id_namhoc, id_mondia, id_lop10a2);
	id_sodiem68:=insert_sodiem(1, 'so diem dia hoc ky 1', id_giaovien6, id_namhoc, id_mondia, id_lop10a3);
	id_sodiem69:=insert_sodiem(1, 'so diem dia hoc ky 1', id_giaovien6, id_namhoc, id_mondia, id_lop10a4);
	id_sodiem70:=insert_sodiem(1, 'so diem dia hoc ky 1', id_giaovien6, id_namhoc, id_mondia, id_lop11a1);
	id_sodiem71:=insert_sodiem(1, 'so diem dia hoc ky 1', id_giaovien6, id_namhoc, id_mondia, id_lop11a2);
	id_sodiem72:=insert_sodiem(1, 'so diem dia hoc ky 1', id_giaovien6, id_namhoc, id_mondia, id_lop11a3);
	id_sodiem73:=insert_sodiem(1, 'so diem dia hoc ky 1', id_giaovien6, id_namhoc, id_mondia, id_lop11a4);
	id_sodiem74:=insert_sodiem(1, 'so diem dia hoc ky 1', id_giaovien6, id_namhoc, id_mondia, id_lop11a5);
	id_sodiem75:=insert_sodiem(1, 'so diem dia hoc ky 1', id_giaovien6, id_namhoc, id_mondia, id_lop12a1);
	id_sodiem76:=insert_sodiem(1, 'so diem dia hoc ky 1', id_giaovien6, id_namhoc, id_mondia, id_lop12a2);
	id_sodiem77:=insert_sodiem(1, 'so diem dia hoc ky 1', id_giaovien6, id_namhoc, id_mondia, id_lop12a3);
	id_sodiem78:=insert_sodiem(1, 'so diem dia hoc ky 1', id_giaovien6, id_namhoc, id_mondia, id_lop12a4);
	
	id_sodiem79:=insert_sodiem(1, 'so diem sinh hoc ky 1', id_giaovien7, id_namhoc, id_monsinh, id_lop10a1);
	id_sodiem80:=insert_sodiem(1, 'so diem sinh hoc ky 1', id_giaovien7, id_namhoc, id_monsinh, id_lop10a2);
	id_sodiem81:=insert_sodiem(1, 'so diem sinh hoc ky 1', id_giaovien7, id_namhoc, id_monsinh, id_lop10a3);
	id_sodiem82:=insert_sodiem(1, 'so diem sinh hoc ky 1', id_giaovien7, id_namhoc, id_monsinh, id_lop10a4);
	id_sodiem83:=insert_sodiem(1, 'so diem sinh hoc ky 1', id_giaovien7, id_namhoc, id_monsinh, id_lop11a1);
	id_sodiem84:=insert_sodiem(1, 'so diem sinh hoc ky 1', id_giaovien7, id_namhoc, id_monsinh, id_lop11a2);
	id_sodiem85:=insert_sodiem(1, 'so diem sinh hoc ky 1', id_giaovien7, id_namhoc, id_monsinh, id_lop11a3);
	id_sodiem86:=insert_sodiem(1, 'so diem sinh hoc ky 1', id_giaovien7, id_namhoc, id_monsinh, id_lop11a4);
	id_sodiem87:=insert_sodiem(1, 'so diem sinh hoc ky 1', id_giaovien7, id_namhoc, id_monsinh, id_lop11a5);
	id_sodiem88:=insert_sodiem(1, 'so diem sinh hoc ky 1', id_giaovien7, id_namhoc, id_monsinh, id_lop12a1);
	id_sodiem89:=insert_sodiem(1, 'so diem sinh hoc ky 1', id_giaovien7, id_namhoc, id_monsinh, id_lop12a2);
	id_sodiem90:=insert_sodiem(1, 'so diem sinh hoc ky 1', id_giaovien7, id_namhoc, id_monsinh, id_lop12a3);
	id_sodiem91:=insert_sodiem(1, 'so diem sinh hoc ky 1', id_giaovien7, id_namhoc, id_monsinh, id_lop12a4);
	
	id_sodiem92:=insert_sodiem(1, 'so diem anh hoc ky 1', id_giaovien8, id_namhoc, id_monanh, id_lop10a1);
	id_sodiem93:=insert_sodiem(1, 'so diem anh hoc ky 1', id_giaovien8, id_namhoc, id_monanh, id_lop10a2);
	id_sodiem94:=insert_sodiem(1, 'so diem anh hoc ky 1', id_giaovien8, id_namhoc, id_monanh, id_lop10a3);
	id_sodiem95:=insert_sodiem(1, 'so diem anh hoc ky 1', id_giaovien8, id_namhoc, id_monanh, id_lop10a4);
	id_sodiem96:=insert_sodiem(1, 'so diem anh hoc ky 1', id_giaovien8, id_namhoc, id_monanh, id_lop11a1);
	id_sodiem97:=insert_sodiem(1, 'so diem anh hoc ky 1', id_giaovien8, id_namhoc, id_monanh, id_lop11a2);
	id_sodiem98:=insert_sodiem(1, 'so diem anh hoc ky 1', id_giaovien8, id_namhoc, id_monanh, id_lop11a3);
	id_sodiem99:=insert_sodiem(1, 'so diem anh hoc ky 1', id_giaovien8, id_namhoc, id_monanh, id_lop11a4);
	id_sodiem100:=insert_sodiem(1, 'so diem anh hoc ky 1', id_giaovien8, id_namhoc, id_monanh, id_lop11a5);
	id_sodiem101:=insert_sodiem(1, 'so diem anh hoc ky 1', id_giaovien8, id_namhoc, id_monanh, id_lop12a1);
	id_sodiem102:=insert_sodiem(1, 'so diem anh hoc ky 1', id_giaovien8, id_namhoc, id_monanh, id_lop12a2);
	id_sodiem103:=insert_sodiem(1, 'so diem anh hoc ky 1', id_giaovien8, id_namhoc, id_monanh, id_lop12a3);
	id_sodiem104:=insert_sodiem(1, 'so diem anh hoc ky 1', id_giaovien8, id_namhoc, id_monanh, id_lop12a4);
	
	
	-- tao hoc sinh va xep lop || them chi tiet so diem || them diem
	FOR i IN 1..20 LOOP
		mahs:=20100000 + i;
		id_hs1:=create_hocsinh('', 'Nam', '', true, true, '1988-09-23', '2006-08-03', '2008-08-03', '443-khu pho 3', 'Nguyễn Duy ', 'Không', 0 , 0 , id_loaihs1 , id_chedouutien1 , id_khuvuc1 , idtinh1 , 0 , id_quanhuyen1 , id_dantoc1 , ''||mahs , ''||mahs , 'HoaThanhTayNinh' , id_quanhuyen1 , 0 , 0, idtinh1 , 'Chinh'||i , ''||mahs );
		PERFORM create_danhsachlop(id_hs1 , id_lop10a1 );
	-- ntm them chi tiet so diem
		id_chitietsodiem1:=insert_chitietsodiem(0.0, id_hs1, id_lop10a1, id_sodiem1);  -- so diem toan hoc ky 1
		id_chitietsodiem2:=insert_chitietsodiem(0.0, id_hs1, id_lop10a1, id_sodiem14); -- so diem ly hoc ky 1
		id_chitietsodiem3:=insert_chitietsodiem(0.0, id_hs1, id_lop10a1, id_sodiem27); -- so diem hoa hoc ky 1
		id_chitietsodiem4:=insert_chitietsodiem(0.0, id_hs1, id_lop10a1, id_sodiem40); -- so diem van hoc ky 1
		id_chitietsodiem5:=insert_chitietsodiem(0.0, id_hs1, id_lop10a1, id_sodiem53); -- so diem su hoc ky 1
		id_chitietsodiem6:=insert_chitietsodiem(0.0, id_hs1, id_lop10a1, id_sodiem66); -- so diem dia hoc ky 1
		id_chitietsodiem7:=insert_chitietsodiem(0.0, id_hs1, id_lop10a1, id_sodiem79); -- so diem sinh hoc ky 1
		id_chitietsodiem8:=insert_chitietsodiem(0.0, id_hs1, id_lop10a1, id_sodiem92); -- so diem anh hoc ky 1
	-- ntm them diem
		PERFORM insert_diem(7, id_loaidiem1, id_chitietsodiem1);
		PERFORM insert_diem(7, id_loaidiem1, id_chitietsodiem1);
		PERFORM insert_diem(7, id_loaidiem1, id_chitietsodiem1);
		PERFORM insert_diem(7, id_loaidiem1, id_chitietsodiem1);
		PERFORM insert_diem(7, id_loaidiem2, id_chitietsodiem1);
		PERFORM insert_diem(7, id_loaidiem2, id_chitietsodiem1);
		PERFORM insert_diem(7, id_loaidiem2, id_chitietsodiem1);
		PERFORM insert_diem(7, id_loaidiem3, id_chitietsodiem1);
		PERFORM insert_diem(7, id_loaidiem3, id_chitietsodiem1);
		PERFORM insert_diem(7, id_loaidiem3, id_chitietsodiem1);
		PERFORM insert_diem(7, id_loaidiem3, id_chitietsodiem1);
		PERFORM insert_diem(7, id_loaidiem3, id_chitietsodiem1);
		PERFORM insert_diem(7, id_loaidiem4, id_chitietsodiem1);
		
		
	END LOOP;
	FOR i IN 21..40 LOOP
		mahs:=20100000 + i;
		id_hs1:=create_hocsinh('', 'Nam', '', true, true, '1988-08-21', '2006-05-03', '2007-05-03', '443-khu pho 3', 'Nguyễn The', 'Không', 0 , 0 , id_loaihs1 , id_chedouutien1 , id_khuvuc1 , idtinh1 , 0 , id_quanhuyen1 , id_dantoc1 , ''||mahs , ''||mahs , 'HoaThanhTayNinh' , id_quanhuyen1 , 0 , 0, idtinh1 , 'Khoi'||i , ''||mahs );
		PERFORM create_danhsachlop(id_hs1 , id_lop10a2 );
	-- ntm them chi tiet so diem	
		id_chitietsodiem1:=insert_chitietsodiem(0, id_hs1, id_lop10a2, id_sodiem1);  -- so diem toan hoc ky 1
		id_chitietsodiem2:=insert_chitietsodiem(0, id_hs1, id_lop10a2, id_sodiem14); -- so diem ly hoc ky 1
		id_chitietsodiem3:=insert_chitietsodiem(0, id_hs1, id_lop10a2, id_sodiem27); -- so diem hoa hoc ky 1
		id_chitietsodiem4:=insert_chitietsodiem(0, id_hs1, id_lop10a2, id_sodiem40); -- so diem van hoc ky 1
		id_chitietsodiem5:=insert_chitietsodiem(0, id_hs1, id_lop10a2, id_sodiem53); -- so diem su hoc ky 1
		id_chitietsodiem6:=insert_chitietsodiem(0, id_hs1, id_lop10a2, id_sodiem66); -- so diem dia hoc ky 1
		id_chitietsodiem7:=insert_chitietsodiem(0, id_hs1, id_lop10a2, id_sodiem79); -- so diem sinh hoc ky 1
		id_chitietsodiem8:=insert_chitietsodiem(0, id_hs1, id_lop10a2, id_sodiem92); -- so diem anh hoc ky 1
	-- ntm them diem
		PERFORM insert_diem(8, id_loaidiem1, id_chitietsodiem1);
		PERFORM insert_diem(8, id_loaidiem1, id_chitietsodiem1);
		PERFORM insert_diem(8, id_loaidiem1, id_chitietsodiem1);
		PERFORM insert_diem(8, id_loaidiem1, id_chitietsodiem1);
		PERFORM insert_diem(8, id_loaidiem2, id_chitietsodiem1);
		PERFORM insert_diem(8, id_loaidiem2, id_chitietsodiem1);
		PERFORM insert_diem(8, id_loaidiem2, id_chitietsodiem1);
		PERFORM insert_diem(8, id_loaidiem3, id_chitietsodiem1);
		PERFORM insert_diem(8, id_loaidiem3, id_chitietsodiem1);
		PERFORM insert_diem(8, id_loaidiem3, id_chitietsodiem1);
		PERFORM insert_diem(8, id_loaidiem3, id_chitietsodiem1);
		PERFORM insert_diem(8, id_loaidiem3, id_chitietsodiem1);
		PERFORM insert_diem(8, id_loaidiem4, id_chitietsodiem1);
	END LOOP;
	FOR i IN 41..60 LOOP
		mahs:=20100000 + i;
		id_hs1:=create_hocsinh('', 'Nam', '', true, true, '1988-10-09', '2006-07-03', '2007-05-03', '443-khu pho 3', 'Nguyễn Cang ', 'Không', 0 , 0 , id_loaihs1 , id_chedouutien1 , id_khuvuc1 , idtinh1 , 0 , id_quanhuyen1 , id_dantoc1 , ''||mahs , ''||mahs , 'HoaThanhTayNinh' , id_quanhuyen1 , 0 , 0, idtinh1 , 'Mai'||i , ''||mahs );
		PERFORM create_danhsachlop(id_hs1 , id_lop10a3 );
	-- ntm them chi tiet so diem	
		id_chitietsodiem1:=insert_chitietsodiem(0, id_hs1, id_lop10a3, id_sodiem1);  -- so diem toan hoc ky 1
		id_chitietsodiem2:=insert_chitietsodiem(0, id_hs1, id_lop10a3, id_sodiem14); -- so diem ly hoc ky 1
		id_chitietsodiem3:=insert_chitietsodiem(0, id_hs1, id_lop10a3, id_sodiem27); -- so diem hoa hoc ky 1
		id_chitietsodiem4:=insert_chitietsodiem(0, id_hs1, id_lop10a3, id_sodiem40); -- so diem van hoc ky 1
		id_chitietsodiem5:=insert_chitietsodiem(0, id_hs1, id_lop10a3, id_sodiem53); -- so diem su hoc ky 1
		id_chitietsodiem6:=insert_chitietsodiem(0, id_hs1, id_lop10a3, id_sodiem66); -- so diem dia hoc ky 1
		id_chitietsodiem7:=insert_chitietsodiem(0, id_hs1, id_lop10a3, id_sodiem79); -- so diem sinh hoc ky 1
		id_chitietsodiem8:=insert_chitietsodiem(0, id_hs1, id_lop10a3, id_sodiem92); -- so diem anh hoc ky 1
	-- ntm them diem
		PERFORM insert_diem(9, id_loaidiem1, id_chitietsodiem1);
		PERFORM insert_diem(9, id_loaidiem1, id_chitietsodiem1);
		PERFORM insert_diem(9, id_loaidiem1, id_chitietsodiem1);
		PERFORM insert_diem(9, id_loaidiem1, id_chitietsodiem1);
		PERFORM insert_diem(9, id_loaidiem2, id_chitietsodiem1);
		PERFORM insert_diem(9, id_loaidiem2, id_chitietsodiem1);
		PERFORM insert_diem(9, id_loaidiem2, id_chitietsodiem1);
		PERFORM insert_diem(9, id_loaidiem3, id_chitietsodiem1);
		PERFORM insert_diem(9, id_loaidiem3, id_chitietsodiem1);
		PERFORM insert_diem(9, id_loaidiem3, id_chitietsodiem1);
		PERFORM insert_diem(9, id_loaidiem3, id_chitietsodiem1);
		PERFORM insert_diem(9, id_loaidiem3, id_chitietsodiem1);
		PERFORM insert_diem(9, id_loaidiem4, id_chitietsodiem1);
	END LOOP;
	
	RETURN true;
END;
    
$BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;
ALTER FUNCTION create_datatotest() OWNER TO postgres;

