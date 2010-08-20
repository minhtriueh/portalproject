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
	
	
	-- tao hoc sinh va xep lop
	FOR i IN 1..20 LOOP
		mahs:=20100000 + i;
		id_hs1:=create_hocsinh('', 'Nam', '', true, true, '1988-09-23', '2006-08-03', '2008-08-03', '443-khu pho 3', 'Nguyễn Duy ', 'Không', 0 , 0 , id_loaihs1 , id_chedouutien1 , id_khuvuc1 , idtinh1 , 0 , id_quanhuyen1 , id_dantoc1 , ''||mahs , ''||mahs , 'HoaThanhTayNinh' , id_quanhuyen1 , 0 , 0, idtinh1 , 'Chinh'||i , ''||mahs );
		PERFORM create_danhsachlop(id_hs1 , id_lop10a1 );
	END LOOP;
	FOR i IN 21..40 LOOP
		mahs:=20100000 + i;
		id_hs1:=create_hocsinh('', 'Nam', '', true, true, '1988-08-21', '2006-05-03', '2007-05-03', '443-khu pho 3', 'Nguyễn The', 'Không', 0 , 0 , id_loaihs1 , id_chedouutien1 , id_khuvuc1 , idtinh1 , 0 , id_quanhuyen1 , id_dantoc1 , ''||mahs , ''||mahs , 'HoaThanhTayNinh' , id_quanhuyen1 , 0 , 0, idtinh1 , 'Khoi'||i , ''||mahs );
		PERFORM create_danhsachlop(id_hs1 , id_lop10a2 );
	END LOOP;
	FOR i IN 41..60 LOOP
		mahs:=20100000 + i;
		id_hs1:=create_hocsinh('', 'Nam', '', true, true, '1988-10-09', '2006-07-03', '2007-05-03', '443-khu pho 3', 'Nguyễn Cang ', 'Không', 0 , 0 , id_loaihs1 , id_chedouutien1 , id_khuvuc1 , idtinh1 , 0 , id_quanhuyen1 , id_dantoc1 , ''||mahs , ''||mahs , 'HoaThanhTayNinh' , id_quanhuyen1 , 0 , 0, idtinh1 , 'Mai'||i , ''||mahs );
		PERFORM create_danhsachlop(id_hs1 , id_lop10a3 );
	END LOOP;
	
	RETURN true;
END;
    
$BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;
ALTER FUNCTION create_datatotest() OWNER TO postgres;
