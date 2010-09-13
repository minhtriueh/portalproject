<%-- 
    Document   : xacnhanmshs
    Created on : 27-08-2010, 14:37:46
    Author     : nguyentanmo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<c:set var="monhocs" value="${monhocs}" scope="session"></c:set>

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
                        Nhập thông tin xem điểm
                    </h2>
                </div>

                <!-- bat dau thong tin -->
                <form action="XemDiemResult" method="post">
                    <div class="art-postcontent">
                        <input type="hidden" name="lop" value="${lop}">
                        <input type="hidden" name="idhocsinh" value="${idhocsinh}">
                        Môn Học 
                        <select name="monhoc">
                            <option value="tatcacacmon" selected>Tất cả các môn</option>
                            <c:forEach var="mh" items="${monhocs}">
                                <option value="${mh.tenmonhoc}">
                                    <c:out value="${mh.tenmonhoc}"></c:out>
                                </option>
                            </c:forEach>
                        </select>
                        <c:forEach var="mh" items="${monhocs}">
                            <input type="hidden" name="mons" value="${mh.idMonhoc}">
                        </c:forEach>
                        <c:forEach var="mh" items="${monhocs}">
                            <input type="hidden" name="tenmonhocs" value="${mh.tenmonhoc}">
                        </c:forEach>
                        <input type="radio" name="hocky" value="1"> Học Kỳ 1
                        <input type="radio" name="hocky" value="2"> Học Kỳ 2
                        <div id="fm-submit" class="fm-req" style="margin-left:60px">
                            <input type="submit" value="Xem Điểm">
                        </div>
                    </div>
                </form>
                <!-- ket thuc thong tin -->

                <div class="cleared"></div>
            </div>
            <div class="cleared"></div>
        </div>
    </div>
</div>
