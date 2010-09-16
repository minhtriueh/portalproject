<%-- 
    Document   : taothoikhoabieu
    Created on : Aug 24, 2010, 9:12:46 PM
    Author     : GIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@taglib prefix="s" uri="/struts-tags" %>
<%@page import="org.netbeans.xml.schema.thoikhoabieu_eschoolinkobject.ThoiKhoaBieu" %>
<%@page import="org.netbeans.xml.schema.thoikhoabieu_eschoolinkobject.ChiTietThoiKhoaBieu" %>
<%@page import="java.util.List" %>
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
                        Thời khóa biểu
                    </h2>
                </div>
                <div class="art-postcontent">
                    <!-- article-content -->

                    <fieldset>
                        <legend>Thông tin thời khóa biểu</legend>
                        <center>
                            <font size="2">Lớp <b><font color="red" size="4">${tenlop}</font></b>
                                - Học kỳ <font color="blue" size="4"><b>${hocky}</b></font></font>

                        <br /><br />

                        <table class="myTable" style="width:350px">
                            <%
                            ThoiKhoaBieu thoikhoabieu = (ThoiKhoaBieu) request.getAttribute("thoikhoabieu");
                List<ChiTietThoiKhoaBieu> ct = thoikhoabieu.getChiTietThoiKhoaBieu();
            int i = 0;
            for (int j = 2; j < 8; j++) {

                            %>
                            <thead>

                                <tr>
                                    <td colspan="3"> Thứ <%=j%></td>
                                </tr>
                               
                            </thead>
                                
                            <tbody>
                                <tr class="tr1">
                                    <td style="text-align:center"> Tiết </td>
                                    <td style="text-align:center"> Môn Học </td>
                                    <td style="text-align:center"> Giáo Viên</td>
                                </tr>
                                <%

                for (; i < ct.size(); i++) {
                    if (ct.get(i).getThu() == j) {
                                %>
                                <tr>
                                    <td style="text-align:center"><%=ct.get(i).getTietThuMay()%></td>
                                    <td style="text-align:center"><%=ct.get(i).getMonhoc().getTenMonHoc()%></td>
                                    <td style="text-align:center"><%=ct.get(i).getGiaovien().getTenGiaoVien()%></td>
                                </tr>
                                <%  } else
                        break;
                                 }
                                %>

                            </tbody>

                            <% }%>
                        </table>
                        </center>
                    </fieldset>


                    <!-- /article-content -->
                </div>
                <div class="cleared"></div>
            </div>

            <div class="cleared"></div>
        </div>
    </div>

</div>
