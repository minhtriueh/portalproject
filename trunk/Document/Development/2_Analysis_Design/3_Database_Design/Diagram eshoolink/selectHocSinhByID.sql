SELECT 
  hocsinh.tenhocsinh, 
  hocsinh.gioitinh, 
  hocsinh.ngaysinh, 
  hocsinh.sonha, 
  hocsinh.tongiao, 
  hocsinh.hinhanh, 
  hocsinh.ghichu AS ghichuhocsinh, 
  hocsinh.ketnapdoan, 
  hocsinh.ketnapdoi, 
  hocsinh.ngayvaodoan, 
  hocsinh.ngayvaodoi, 
  tinh.tentinh, 
  quanhuyenthanhpho.tenquanhuyenthanhpho, 
  xaphuongthitran.tenxaphuongthitran, 
  thonxom.tenthonxom, 
  loaihocsinh.mota AS motaloaihocsinh, 
  loaihocsinh.tenloaihocsinh, 
  chedouutien.chuthich AS chuthichchedouutien, 
  chedouutien.phantramduocgiam, 
  chedouutien.tenchedouutien, 
  nguoidung.ngaytao, 
  nguoidung."password", 
  nguoidung.username, 
  khuvuc.mota AS "motaKhuVuc", 
  khuvuc.tenkhuvuc, 
  dantoc.dantocthieuso, 
  dantoc.tendantoc, 
  lop.tenlop, 
  lop.sisolop, 
  quequan.id_quequan
FROM 
  public.hocsinh, 
  public.lop, 
  public.nguoidung, 
  public.loaihocsinh, 
  public.chedouutien, 
  public.dantoc, 
  public.khuvuc, 
  public.tinh, 
  public.quequan, 
  public.thonxom, 
  public.xaphuongthitran, 
  public.quanhuyenthanhpho
WHERE 
  hocsinh.id_quequan = quequan.id_quequan AND
  hocsinh.id_thonxom = thonxom.id_thonxom AND
  hocsinh.id_loaihocsinh = loaihocsinh.id_loaihocsinh AND
  hocsinh.id_chedouutien = chedouutien.id_chedouutien AND
  hocsinh.id_nguoidung = nguoidung.id_nguoidung AND
  hocsinh.id_khuvuc = khuvuc.id_khuvuc AND
  hocsinh.id_tinh = tinh.id_tinh AND
  hocsinh.id_xaphuongthitran = xaphuongthitran.id_xaphuongthitran AND
  hocsinh.id_quanhuyenthanhpho = quanhuyenthanhpho.id_quanhuyenthanhpho AND
  hocsinh.id_dantoc = dantoc.id_dantoc AND
  hocsinh.id_lop = lop.id_lop AND
  hocsinh.id_hocsinh = 1;
