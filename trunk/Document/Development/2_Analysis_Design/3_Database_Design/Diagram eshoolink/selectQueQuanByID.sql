SELECT 
  quequan.quequan, 
  tinh.tentinh, 
  thonxom.tenthonxom, 
  xaphuongthitran.tenxaphuongthitran, 
  quanhuyenthanhpho.tenquanhuyenthanhpho
FROM 
  public.quequan, 
  public.thonxom, 
  public.tinh, 
  public.xaphuongthitran, 
  public.quanhuyenthanhpho
WHERE 
  quequan.id_tinh = tinh.id_tinh AND
  quequan.id_thonxom = thonxom.id_thonxom AND
  quequan.id_xaphuongthitran = xaphuongthitran.id_xaphuongthitran AND
  quequan.id_quanhuyenthanhpho = quanhuyenthanhpho.id_quanhuyenthanhpho AND
  quequan.id_quequan = 1;
