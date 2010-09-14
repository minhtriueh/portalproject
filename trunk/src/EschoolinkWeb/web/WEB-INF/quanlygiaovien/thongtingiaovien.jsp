<%-- 
    Document   : thongtingiaovien
    Created on : Sep 1, 2010, 2:06:50 PM
    Author     : bon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page import="org.netbeans.xml.schema.qlgv_eschoolinkobject.GiaoVien"%>
<%@page import="java.util.Map"%>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
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
                    <form id="fm-form" method="post" action="UpdateThongTinGiaoVien" >
                        <fieldset>
                            <legend>Thông Tin Cá Nhân</legend>
                            <div class="fm-opt">
                                <%
            Map sessions = ActionContext.getContext().getSession();
            GiaoVien gv = (GiaoVien) sessions.get("giaovien");
            String date = gv.getNgaySinh().toString();
            String hoten = gv.getTenGiaoVien();
            String cmnd = gv.getCmnd();
            String diachi = gv.getChoOHienTai();
            String quequan = gv.getQueQuan();
            String ngaysinh = gv.getNgaySinh().toString();
            String sodienthoai = gv.getSoDienThoai();
            String Email = gv.getEmail();
            String trinhdo = gv.getTrinhDoVanHoa();
            String tongiao = gv.getTonGiao();
            String chucvu = gv.getChucVu();
                                %>
                                <table>
                                    <tbody>
                                    <tr>
                                        <td style="background-color:aqua">Họ Tên</td>
                                        <td><input type="text" name="hoten" value="<%=hoten%>" style="background-color:silver"></td>
                                    </tr>
                                    <tr>
                                        <td style="background-color:aqua">CMND</td>
                                        <td><input type="text" name="cmnd" value="<%=cmnd%>" style="background-color:silver"></td>
                                    </tr>
                                    <tr>
                                        <td style="background-color:aqua">Địa Chỉ</td>
                                        <td><input type="text" name="diachi" value="<%=diachi%>" style="background-color:silver"></td>
                                    </tr>
                                    <tr>
                                        <td style="background-color:aqua">Quê Quán</td>
                                        <td><input type="text" name="quequan" value="<%=quequan%>" style="background-color:silver"></td>
                                    </tr>
                                    <tr>
                                        <td style="background-color:aqua">Ngày Sinh</td>
                                        <td><input type="text" name="ngaysinh" value="<%=ngaysinh%>" style="background-color:silver"></td>
                                    </tr>
                                    <tr>
                                        <td style="background-color:aqua">Số Điện Thoại</td>
                                        <td><input type="text" name="sodienthoai" value="<%=sodienthoai%>" style="background-color:silver"></td>
                                    </tr>
                                    <tr>
                                        <td style="background-color:aqua">Email</td>
                                        <td><input type="text" name="email" value="<%=Email%>" style="background-color:silver"></td>
                                    </tr>
                                    <tr>
                                        <td style="background-color:aqua">Trình Độ Văn Hóa</td>
                                        <td><input type="text" name="trinhdo" value="<%=trinhdo%>" style="background-color:silver"></td>
                                    </tr>
                                    <tr>
                                        <td style="background-color:aqua">Tôn Giáo</td>
                                        <td><input type="text" name="tongiao" value="<%=tongiao%>" style="background-color:silver"></td>
                                    </tr>
                                    <tr>
                                        <td style="background-color:aqua">Chức Vụ</td>
                                        <td><input type="text" name="chucvu" value="<%=chucvu%>" style="background-color:silver"></td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </fieldset>
                        <div id="fm-submit" class="fm-req">
                            <input name="submit" value="Cập Nhật" type="submit" />
                            <input name="submit" value="Trở Lại" type="button" onclick="Back(1)"/>
                        </div>
                    </form>
                </div>
                <div class="cleared"></div>
            </div>
            <div id="log"></div>
        </div>
    </div>
</div>

