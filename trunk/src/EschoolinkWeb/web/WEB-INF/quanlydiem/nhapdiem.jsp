<%--
    Document   : nhapdiem
    Created on : 21-08-2010, 22:36:53
    Author     : nguyentanmo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<script type="text/javascript" language="JavaScript">

    function check(form) {
        var checkGia=/([1-9])/;
         if(form.diemnhap.value<=0){
            alert("Điểm Phải Lớn Hơn 0");
            return false;
        }
        else if (!checkGia.test(form.diemnhap.value)|| isNaN(form.diemnhap.value) && form.diemnhap.value!=null){
            alert("Điểm Phải Là Số");
            return false;
        }
    }
</script>

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
                                Nhập Điểm
                            </h2>
                        </div>
                        <!-- luu session -->
                        <c:set value="${monhocs}" var="monhocs" scope="session"></c:set>
                        <c:set value="${tenlops}" var="tenlops" scope="session"></c:set>
                        <c:set value="${chitietdiems}" var="chitietdiems" scope="session"></c:set>

                        <!-- bat dau thong tin -->
                        <form action="LuuDiem" method="post" onsubmit="return check(this);">
                            <div class="art-postcontent">
                                Môn Học:<c:out value="${monhoc}"></c:out>
                                Lớp:<c:out value="${lop}"></c:out>
                                Học Kỳ <c:out value="${hocky}"></c:out>
                                <p>
                                <div id="fm-submit" class="fm-req">
                                    <input type="submit" value="Lưu Điểm">
                                </div>
                            </div>
                            <p>
                                <!-- ket thuc thong tin -->

                                <!-- bat dau bang -->
                            <div>
                                <table class="myTable" style="width:930px">
                                    <thead>
                                        <tr>
                                            <td width="30" align="center">STT</td>
                                            <td width="130" align="center">Ho Ten</td>
                                            <c:forEach var="cotdiem" items="${cotdiems}">
                                                <td width="30">
                                                    <c:out value="${cotdiem.kyhieu}-${cotdiem.lan}"></c:out>
                                                </td>
                                            </c:forEach>
                                                <td width="40">TBHK</td>
                                        </tr>
                                    </thead>
                                    <tbody>

                                        <!-- hien thi danh sach hoc sinh va danh sach diem cua hoc sinh -->
                                        <c:forEach var="chitietdiem" items="${chitietdiems}">
                                            <tr>
                                                <td align="center"><c:out value="${chitietdiem.sothutu}"></c:out></td>
                                                <td width="130">
                                                    <c:out value="${chitietdiem.hovaten}"></c:out>
                                                    <c:out value="${chitietdiem.ten}"></c:out>
                                                </td>
                                                <c:forEach var="chitiet" items="${chitietdiem.diem}">
                                                    <c:if test="${chitiet!=-1}">
                                                        <td>
                                                            <input type="text" name="diemnhap" size="1" value="${chitiet}">
                                                        </td>
                                                    </c:if>
                                                    <c:if test="${chitiet==-1}">
                                                        <td>
                                                            <input type="text" name="diemnhap" size="1" value="">
                                                        </td>
                                                    </c:if>
                                                </c:forEach>
                                                <td>
                                                    <fmt:formatNumber value="${chitietdiem.diemtrungbinh}" maxFractionDigits="2" minFractionDigits="1"></fmt:formatNumber>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                    <!-- ket thuc hien thi danh sach hoc sinh va danh sach diem cua hoc sinh -->
                                </table>
                                <!-- luu tat ca cac bien iddiem -->
                                <c:forEach var="chitietdiem" items="${chitietdiems}">
                                    <c:forEach var="chitietid" items="${chitietdiem.idDiem}">
                                        <input type="hidden" name="iddiemnhap" value="${chitietid}">
                                    </c:forEach>
                                </c:forEach>
                                <c:forEach var="chitietdiem" items="${chitietdiems}">
                                    <input type="hidden" name="idchitietsodiem" value="${chitietdiem.idChitietsodiem}">
                                </c:forEach>
                            </div>
                            <!-- ket thuc bang -->
                        </form>
                        <div class="cleared"></div>
                    </div>
                    <div class="cleared"></div>
                </div>
            </div>
        </div>
    </body>
</html>
