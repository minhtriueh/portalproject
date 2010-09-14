<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="org.netbeans.xml.schema.qlgv_eschoolinkobject.DanToc" %>
<%@page import="org.netbeans.xml.schema.qlgv_eschoolinkobject.ToBoMon" %>
<%@page import="java.util.List" %>
<%@page import="org.netbeans.xml.schema.qlgv_eschoolinkobject.GiaoVien" %>
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
                        Thông Tin Giáo Viên
                    </h2>
                </div>
                <div class="art-postcontent">
                    <!-- article-content -->
                    <form id="fm-form" method="post" action="index.jsp" name="iform" >
                        <fieldset>
                            <legend>Thông Tin Cá Nhân</legend>
                            <div class="fm-opt">
                                
                                <table class="myTable" border="1">
                                    <tr>
                                        <td class="td1">Tên Giáo Viên</td>
                                        <td style="background-color:infobackground">${gv.tenGiaoVien}</td>
                                    </tr>
                                     <tr>
                                        <td class="td1">Ngày Sinh</td>
                                        <td style="background-color:infobackground">${gv.ngaySinh}</td>
                                    </tr>
                                     <tr>
                                        <td class="td1">CMND</td>
                                        <td style="background-color:infobackground">${gv.cmnd}</td>
                                    </tr>
                                     <tr>
                                        <td class="td1">Ngày Cấp</td>
                                        <td style="background-color:infobackground">${gv.ngayCap}</td>
                                    </tr>
                                     <tr>
                                        <td class="td1">Nơi Cấp</td>
                                        <td style="background-color:infobackground">${gv.noiCap}</td>
                                    </tr>
                                     <tr>
                                        <td class="td1">Tôn Giáo</td>
                                        <td style="background-color:infobackground">${gv.tonGiao}</td>
                                    </tr>
                                     <tr>
                                        <td class="td1">Quê Quán</td>
                                        <td style="background-color:infobackground">${gv.queQuan}</td>
                                    </tr>
                                     <tr>
                                        <td class="td1">Chỗ ở hiện tại</td>
                                        <td style="background-color:infobackground">${gv.choOHienTai}</td>
                                    </tr>
                                     <tr>
                                        <td class="td1">Email</td>
                                        <td style="background-color:infobackground">${gv.email}</td>
                                    </tr>
                                     <tr>
                                        <td class="td1">Số Điện Thoại</td>
                                        <td style="background-color:infobackground">${gv.soDienThoai}</td>
                                    </tr>
                                     <tr>
                                        <td class="td1">Chức Vụ</td>
                                        <td style="background-color:infobackground">${gv.chucVu}</td>
                                    </tr>
                                     <tr>
                                        <td class="td1">Trình Độ Văn Hóa</td>
                                        <td style="background-color:infobackground">${gv.trinhDoVanHoa}</td>
                                    </tr>
                                     
                                     <tr>
                                        <td class="td1">Username</td>
                                        <td style="background-color:infobackground">${gv.nguoiDung.username}</td>
                                    </tr>
                                     <tr>
                                        <td class="td1">Password</td>
                                        <td style="background-color:infobackground">${gv.nguoiDung.password}</td>
                                    </tr>

                                </table>
                            </div>
                        </fieldset>

                        <div id="fm-submit" class="fm-req">
                            <input name="submit" value="Về Trang Chủ" type="submit"/>
                        </div>
                    </form>
                </div>
                <div class="cleared"></div>
            </div>

            <div class="cleared"></div>
        </div>
    </div>

</div>
