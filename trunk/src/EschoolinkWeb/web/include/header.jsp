<%-- 
    Document   : header
    Created on : 18-08-2010, 16:27:18
    Author     : sanchikaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<div class="art-header">
    <div class="art-header-png"></div>
    <div class="art-header-jpeg"></div>
    <script type="text/javascript" src="swfobject.js"></script>
    <div id="art-flash-area">
        <div id="art-flash-container">
            <object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" width="974" height="225" id="art-flash-object">
                <param name="movie" value="container.swf" />
                <param name="quality" value="high" />
                <param name="scale" value="default" />
                <param name="wmode" value="transparent" />
                <param name="flashvars" value="color1=0xFFFFFF&amp;alpha1=.70&amp;framerate1=24&amp;clip=images/flash.swf&amp;radius=4&amp;clipx=0&amp;clipy=-9&amp;initalclipw=900&amp;initalcliph=225&amp;clipw=974&amp;cliph=243&amp;width=974&amp;height=225&amp;textblock_width=0&amp;textblock_align=no" />
                <param name="swfliveconnect" value="true" />
                <!--[if !IE]>-->
                <object type="application/x-shockwave-flash" data="container.swf" width="974" height="225">
                    <param name="quality" value="high" />
                    <param name="scale" value="default" />
                    <param name="wmode" value="transparent" />
                    <param name="flashvars" value="color1=0xFFFFFF&amp;alpha1=.70&amp;framerate1=24&amp;clip=images/flash.swf&amp;radius=4&amp;clipx=0&amp;clipy=-9&amp;initalclipw=900&amp;initalcliph=225&amp;clipw=974&amp;cliph=243&amp;width=974&amp;height=225&amp;textblock_width=0&amp;textblock_align=no" />
                    <param name="swfliveconnect" value="true" />
                    <!--<![endif]-->
                    <div class="art-flash-alt"><a href="http://www.adobe.com/go/getflashplayer"><img src="http://www.adobe.com/images/shared/download_buttons/get_flash_player.gif" alt="Get Adobe Flash player" /></a></div>
                    <!--[if !IE]>-->
                </object>
                <!--<![endif]-->
            </object>
        </div>
    </div>
    <script type="text/javascript">swfobject.switchOffAutoHideShow();swfobject.registerObject("art-flash-object", "9.0.0", "expressInstall.swf");</script>
    <div class="art-logo">
        <h1 id="name-text" class="art-logo-name"><a href="#">ESchoolink</a></h1>
        <div id="slogan-text" class="art-logo-text">${tentruong} </div>
    </div>
</div>
<div class="art-nav">
    <div class="l"></div>
    <div class="r"></div>
    <ul class="art-menu">
        <li>
            <a href="index.action" class="active"><span class="l"></span><span class="r"></span><span class="t">Trang chủ</span></a>
        </li>
        <li>
            <a href="#"><span class="l"></span><span class="r"></span><span class="t">Thông Tin Cá Nhân</span></a>
            <ul>
                <li>
                    <a href="ThongTinGiaoVien">Thông Tin Giáo Viên</a>
                </li>
                <li>
                    <a href="ThongTinHocSinh">Thông Tin Học Sinh-Học Bạ</a>
                </li>
            </ul>
        </li>
        <li>
            <a href="#" ><span class="l"></span><span class="r"></span><span class="t">Tra cứu điểm</span></a>
            <ul>
                <li><a href="XemDiem">Xem Điểm</a></li>
            </ul>
        </li>
        <li>
            <a href="#" ><span class="l"></span><span class="r"></span><span class="t">Xem thời khóa biểu</span></a>
        </li>
        <li>
            <a href="#"><span class="l"></span><span class="r"></span><span class="t">Quản lý</span></a>
            <ul>
                <li><a href="#">Học sinh</a>
                    <ul>
                        <li><a href="TaoHocSinh">Thêm học sinh</a></li>
                        <li><a href="#">Tìm kiếm học sinh</a></li>
                    </ul>
                </li>
                <li><a href="#">Giáo Viên</a>
                    <ul>
                        <li><a href="ThongTinBanDau">Thêm Giáo Viên</a></li>
                        <li><a href="index.jsp?module=quanlygiaovien&page=searchgiaovien">Tra Cứu Giáo Viên</a></li>
                    </ul>
                </li>
                <li><a href="#">Học Bạ</a>
                    <ul>
                        <li><a href="index.jsp?module=quanlyhocba&page=tracuuhocba">Đánh Giá Học Lực-Hạnh Kiểm</a></li>
                        <li><a href="KhoiTaoTrangChinhSuaHocBa">Tra cứu và Chỉnh Sửa</a></li>
                    </ul>
                </li>

                <li><a href="#">Khởi tạo năm học mới</a></li>
                <li><a href="#">Chủ nhiệm</a></li>
                <li><a href="#">Sổ điểm môn học</a>
                    <ul>
                        <li><a href="BatDauNhapDiem">Nhập Điểm</a></li>
                        <li><a href="TongKetDiem">Tổng Kết Điểm</a></li>
                    </ul>
                </li>
            </ul>
        </li>
        <li>
            <a href="#"><span class="l"></span><span class="r"></span><span class="t">Liên hệ</span></a>
        </li>
    </ul>
</div>
