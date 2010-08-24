<%-- 
    Document   : TaoHocSinh
    Created on : 18-08-2010, 20:57:02
    Author     : sanchikaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<div class="art-layout-cell art-content">
                            <div class="art-post">
                                <div class="art-post-tl"></div>
                                <div class="art-post-tr"></div>
                                <div class="art-post-bl"></div>
                                <div class="art-post-br"></div>
                                <div class="art-post-tc"></div>
                                <div class="art-post-bc"></div>
                                <div class="art-post-cl"></div>
                                <div class="art-post-cr"></div>
                                <div class="art-post-cc"></div>
                                <div class="art-post-body">
                            <div class="art-post-inner art-article">
                                            <div class="art-postmetadataheader">
                                                <h2 class="art-postheader">
                                                    <img src="images/postheadericon.png" width="26" height="26" alt="postheadericon" />
                                                    Khởi tạo học sinh
                                                </h2>
                                            </div>
                                            <div class="art-postcontent">
                                                <!-- article-content -->
                                                 <form id="fm-form" method="post" action="TaoHocSinh_result" enctype="multipart/form-data">
                                                    <fieldset>
                                                    <legend>Thông tin học sinh</legend>
                                                    <div class="fm-req">
                                                      <label>Họ và tên lót:</label>
                                                      <input name="hoVaTenLot" type="text" />
                                                    </div>
                                                    <div class="fm-req">
                                                      <label >Tên:</label>
                                                      <input name="ten" type="text" />
                                                    </div>
                                                    <div class="fm-req">
                                                      <label>Ngày sinh:</label>
                                                      <input name="ngaySinh" type="text" />
                                                    </div>
                                                    <div class="fm-req">
                                                      <label>Giới tính:</label>
                                                      <select name="gioiTinh">
                                                      	<option value="Nam">Nam</option>
                                                      	<option value="Nữ">Nữ</option>
                                                      </select>                                                      
                                                    </div>
                                                    <div class="fm-req">
                                                      <label>Tôn giáo:</label>
                                                      <input name="tonGiao" type="text" />
                                                    </div>
                                                    <div class="fm-opt">
                                                      <label>Hình ảnh:</label>
                                                      <input name="upload" type="file" />
                                                    </div>
                                                    <div class="fm-req">
                                                      <label>Loại học sinh:</label>
                                                      <select name="idLoaihocsinh">
                                                      	<option value="">---</option>                                                      	
                                                      </select> 
                                                    </div>
                                                    <div class="fm-req">
                                                      <label>Chế độ ưu tiên:</label>
                                                      <select name="idChedouutien">
                                                      	<option value="">---</option>                                                      	
                                                      </select> 
                                                    </div>
                                                    <div class="fm-opt">
                                                      <label>Ghi chú:</label>
                                                      <textarea rows="5" cols="10" name="ghiChu"></textarea>
                                                    </div>
                                                    </fieldset>
                                                    
                                                    <fieldset>
                                                    	<legend>Thông tin nơi ở</legend>
                                                    	<div class="fm-req">
	                                                      <label>Nơi ở hiện tại:</label>
	                                                      <input name="diaChiNhaO" type="text"/>
	                                                    </div>
	                                                    <div class="fm-req">
	                                                      <label>Quận/Huyện:</label>
	                                                      <select name="idQuanhuyenthanhpho">
	                                                      	<option value="">----</option>                                                      	
	                                                      </select>                                                      
	                                                    </div>
	                                                    <div class="fm-req">
	                                                      <label>Tỉnh/Thành phố:</label>
	                                                      <select name="idTinh">
	                                                      	<option value="">----</option>                                                      	
	                                                      </select>                                                      
	                                                    </div>
                                                    </fieldset>
                                                    
                                                    <fieldset>
                                                    	<legend>Thông tin quê quán</legend>
                                                    	<div class="fm-req">
	                                                      <label>Quê quán:</label>
	                                                      <input name="quequan" type="text"/>
	                                                    </div>
	                                                    <div class="fm-req">
	                                                      <label>Quận/Huyện:</label>
	                                                      <select name="idQuanhuyenthanhphoQq">
	                                                      	<option value="">----</option>                                                      	
	                                                      </select>                                                      
	                                                    </div>
	                                                    <div class="fm-req">
	                                                      <label>Tỉnh/Thành phố:</label>
	                                                      <select name="idTinhQq">
	                                                      	<option value="">----</option>                                                      	
	                                                      </select>                                                      
	                                                    </div>
                                                    </fieldset>
	
                                                    <fieldset>
                                                    	<legend>Thông tin Đoàn/Đội</legend>
                                                    	<div class="fm-req">
	                                                      <label>Có vào Đội:</label>
	                                                       <select name="ketNapDoi">
	                                                      	<option value="true">Có</option> 
	                                                      	<option value="false">Không</option>                                                      	
	                                                      </select>                                                 
	                                                    </div>
	                                                    <div class="fm-opt">
	                                                      <label>Ngày vào Đội:</label>
	                                                       <input name="ngayVaoDoi" type="text">
	                                                    </div>
	                                                    <div class="fm-req">
	                                                      <label>Có vào Đoàn:</label>
	                                                       <select name="ketNapDoan">
	                                                      	<option value="true">Có</option> 
	                                                      	<option value="false">Không</option>                                                      	
	                                                      </select>                                                 
	                                                    </div>
	                                                    <div class="fm-opt">
	                                                      <label>Ngày vào Đoàn:</label>
	                                                       <input name="ngayVaoDoan" type="text">
	                                                    </div>
                                                    </fieldset>
                                                    
                                                    <fieldset>
                                                    	<legend>Thông tin thành phần gia đình </legend>
                                                    	<div class="fm-req">
	                                                      <label>Họ và tên Cha:</label>
	                                                      <input name="ten_tpgd" type="text"/>                                                 
	                                                    </div>
	                                                    	<input name="quanHe" value="cha con" style="display: none;"/>
	                                                    <div class="fm-opt">
	                                                      <label>Ngày Sinh:</label>
	                                                      <input name="ngaySinh_tpgd" type="text"/>                                                 
	                                                    </div>
	                                                    <div class="fm-opt">
	                                                      <label>Nghề nghiệp:</label>
	                                                      <input name="ngheNghiep_tpgd" type="text"/>                                                 
	                                                    </div>
	                                                    
	                                                    <div class="fm-req">
	                                                      <label>Họ và tên Mẹ:</label>
	                                                      <input name="ten_tpgd" type="text"/>                                                 
	                                                    </div>
	                                                    	<input name="quanHe" value="cha con" style="display: none;"/>
	                                                    <div class="fm-opt">
	                                                      <label>Ngày Sinh:</label>
	                                                      <input name="ngaySinh_tpgd" type="text"/>                                                 
	                                                    </div>
	                                                    <div class="fm-opt">
	                                                      <label>Nghề nghiệp:</label>
	                                                      <input name="ngheNghiep_tpgd" type="text"/>                                                 
	                                                    </div>
                                                    </fieldset>
                                                    <div id="fm-submit" class="fm-req">
                                                      <input name="Submit" value="Submit" type="submit" />

                                                    </div>
                                                  </form>
                                               
                                                <!-- /article-content -->
                                            </div>
                                            <div class="cleared"></div>
                            </div>

                            		<div class="cleared"></div>
                                </div>
                            </div>

                        </div>
