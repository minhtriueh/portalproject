<%-- 
    Document   : tongketdiemresult
    Created on : 12-09-2010, 14:03:41
    Author     : nguyentanmo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <link rel="stylesheet" href="StyleTable.css" type="text/css" media="screen" />
    </head>
    <body>
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
                                Tổng Kết Điểm
                            </h2>
                        </div>

                        <!-- bat dau thong tin -->
                        <div class="art-postcontent">
                            <form action="LuuDiemHocBa" method="post">
                                <div class="art-postcontent">
                                    <div id="fm-submit" class="fm-req" style="margin-left:60px">
                                        <input type="submit" value="Lưu Điểm Học Bạ">
                                        <a href="javascript:history.back(1)"><input type="submit" value="Tiếp Tục"></a>
                                    </div>
                                </div>
                                <br>
                                <table class="myTable" >
                                    <thead>
                                        <tr>
                                            <td align="center">STT</td>
                                            <td width="150" align="center">Họ Và Tên</td>
                                            <c:forEach var="monhoc" items="${listmonhocs}">
                                                <td width="50" align="center"><c:out value="${monhoc.tenmonhoc}"></c:out></td>
                                            </c:forEach>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="chitietdiem" items="${listchitietdiems}">
                                            <c:if test="${chitietdiem.sothutu%2==1}">
                                                <tr>
                                                    <td align="center"><c:out value="${chitietdiem.sothutu}"></c:out></td>
                                                    <td align="center">
                                                        <c:out value="${chitietdiem.hovaten}"></c:out>
                                                        <c:out value="${chitietdiem.ten}"></c:out>
                                                        <input type="hidden" name="idhocsinh" value="${chitietdiem.idhocsinh}">
                                                        <input type="hidden" name="diemtrungbinh" value="${chitietdiem.diemtrungbinh}">
                                                    </td>
                                                    <c:forEach var="diem" items="${chitietdiem.diem}">
                                                         <td><fmt:formatNumber value="${diem}" maxFractionDigits="2" minFractionDigits="1"></fmt:formatNumber></td>
                                                        <%--<td align="center"><c:out value="${diem}"></c:out></td>--%>
                                                    </c:forEach>
                                                </tr>
                                            </c:if>
                                            <c:if test="${chitietdiem.sothutu%2!=1}">
                                                <tr  class="tr1">
                                                    <td align="center"><c:out value="${chitietdiem.sothutu}"></c:out></td>
                                                    <td align="center">
                                                        <c:out value="${chitietdiem.hovaten}"></c:out>
                                                        <c:out value="${chitietdiem.ten}"></c:out>
                                                        <input type="hidden" name="idhocsinh" value="${chitietdiem.idhocsinh}">
                                                        <input type="hidden" name="diemtrungbinh" value="${chitietdiem.diemtrungbinh}">
                                                    </td>
                                                    <c:forEach var="diem" items="${chitietdiem.diem}">
                                                          <td><fmt:formatNumber value="${diem}" maxFractionDigits="2" minFractionDigits="1"></fmt:formatNumber></td>
                                                        <%--<td align="center"><c:out value="${diem}"></c:out></td>--%>
                                                    </c:forEach>
                                                </tr>
                                            </c:if>
                                        </c:forEach>
                                    </tbody>
                                </table>
                                <input type="hidden" name="lop" value="${lop}">
                                <input type="hidden" name="hocky" value="${hocky}">
                                <input type="hidden" name="namhoc" value="${namhoc}">
                            </form>
                        </div>

                        <!-- ket thuc thong tin -->

                        <div class="cleared"></div>
                    </div>
                    <div class="cleared"></div>
                </div>
            </div>
        </div>
    </body>
</html>



