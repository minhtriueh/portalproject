<%-- 
    Document   : header
    Created on : 18-08-2010, 16:27:18
    Author     : sanchikaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${sessionScope.userId}" var="idUser"></c:set>
<c:set value="${sessionScope.nhomQuyen}" var="quyen"></c:set>
<c:set value="${sessionScope.login}" var="login"></c:set>
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
        <div id="slogan-text" class="art-logo-text">${tentruong} ${idUser} ${quyen} </div>
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
            <a href="XemThoiKhoaBieu" ><span class="l"></span><span class="r"></span><span class="t">Xem thời khóa biểu</span></a>
        </li>
        <c:if test="${login==true}">
            <li>
                <a href="#"><span class="l"></span><span class="r"></span><span class="t">Quản lý</span></a>
                <ul>
                    <li><a href="#">Học sinh</a>
                        <ul>
                            <c:if test="${quyen=='admin'}">
                                <li><a href="TaoHocSinh">Thêm học sinh</a></li>
                            </c:if>
                            <li><a href="#">Tìm kiếm học sinh</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Giáo Viên</a>
                        <ul>
                            <c:if test="${quyen=='admin'}">
                                <li><a href="ThongTinBanDau">Thêm Giáo Viên</a></li>
                            </c:if>
                            <li><a href="index.jsp?module=quanlygiaovien&page=searchgiaovien">Tra Cứu Giáo Viên</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Học Bạ</a>
                        <ul>
                            <li><a href="index.jsp?module=quanlyhocba&page=tracuuhocba">Đánh Giá Học Lực-Hạnh Kiểm</a></li>
                            <li><a href="KhoiTaoTrangChinhSuaHocBa">Tra cứu và Chỉnh Sửa</a></li>
                        </ul>
                    </li>
                    <c:if test="${quyen=='admin'}">
                        <li><a href="#">Khởi tạo năm học mới</a></li>
                    </c:if>

                    <li><a href="#">Chủ nhiệm</a></li>
                    <li><a href="#">Sổ điểm môn học</a>
                        <ul>
                            <li><a href="BatDauNhapDiem">Nhập Điểm</a></li>
                            <li><a href="TongKetDiem">Tổng Kết Điểm</a></li>
                        </ul>
                    </li>
                </ul>
            </li>
        </c:if>

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


                <li><a href="#">Chủ nhiệm</a></li>
                <li><a href="#">Sổ điểm môn học</a>
                    <ul>
                        <li><a href="BatDauNhapDiem">Nhập Điểm</a></li>
                        <li><a href="TongKetDiem">Tổng Kết Điểm</a></li>
                    </ul>
                </li>


                <li>
                    <a href="#">Thời khóa biểu</a>
                    <ul>
                        <li><a href="TaoThoiKhoaBieu">Tạo thời khóa biểu</a></li>

                    </ul>
                </li>

                <li><a href="#">Thông tin khởi tạo</a>
                    <ul>
                        <li><a href="TaoTruong">Tạo trường</a></li>
                        <li><a href="TaoQuyen">Tạo quyền</a></li>
                        <li><a href="TaoNhom">Tạo nhóm</a></li>
                        <li><a href="TaoNamHoc">Tạo năm học</a></li>
                        <li><a href="TaoMonHoc">Tạo môn học</a></li>

                        <li><a href="TaoLop">Tạo lớp</a></li>
                        <li><a href="TaoKhoiLop">Tạo khối lớp</a></li>
                        <li><a href="TaoHocLuc">Tạo học lực</a></li>
                        <li> <a href="TaoHieuTruong">Tạo hiệu trưởng</a></li>
                        <li><a href="TaoHanhKiem">Tạo hạnh kiểm</a></li>

                        <li><a href="TaoDanToc">Tạo dân tộc</a></li>
                        <li><a href="TaoCoSo">Tạo cơ sở</a></li>
                        <li> <a href="TaoBoMon">Tạo bộ môn</a></li>





                    </ul>

                </li>


            </ul>
        </li>



        <li>


            <a href="#"><span class="l"></span><span class="r"></span><span class="t">Liên hệ</span></a>
        </li>
        <c:if test="${empty login || login==false}">
            <li>
                <a href="index.jsp?module=admin&page=login"><span class="l"></span><span class="r"></span><span class="t">Login</span></a>
            </li>
        </c:if>
        <c:if test="${login==true}">
            <li>
                <a href="logout"><span class="l"></span><span class="r"></span><span class="t">Logout</span></a>
            </li>
        </c:if>

    </ul>
</div>
