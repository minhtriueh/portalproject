<%-- 
    Document   : xemdiemresult
    Created on : 27-08-2010, 17:41:12
    Author     : nguyentanmo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="s" uri="/struts-tags" %>

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
                        Kết Quả
                    </h2>
                </div>

                <!-- bat dau thong tin -->
                <form action="LuuDiem" method="post">
                    <div class="art-postcontent">

                    </div>
                    <p>
                        <!-- ket thuc thong tin -->

                        <!-- bat dau bang -->
                    <div>
                        <table>
                            <tr>
                                <td>STT</td>
                                <td>Ho Va Ten</td>
                                <td>Mon Hoc</td>
                                <c:forEach var="cotdiem" items="${cotdiems}">
                                    <td>
                                        <c:out value="${cotdiem.kyhieu}-${cotdiem.lan}"></c:out>
                                    </td>
                                </c:forEach>
                                <td>TBHK</td>
                            </tr>

                            <!-- hien thi danh sach hoc sinh va danh sach diem cua hoc sinh -->
                            <!-- neu hoc sinh chon xem diem mot mon-->
                            <c:if test="${not empty chonmotmon}">
                                <tr>
                                    <td> <c:out value="1"></c:out></td>
                                    <td> <c:out value="${tenhocsinh}"></c:out></td>
                                    <td><c:out value="${monhoc}"></c:out></td>
                                    <c:forEach var="d" items="${diems}">
                                        <td>
                                            <c:if test="${d.diem!=-1}">
                                                <c:out value="${d.diem}"></c:out>
                                            </c:if>
                                            <c:if test="${d.diem==-1}">
                                                <c:out value=""></c:out>
                                            </c:if>
                                        </td>
                                    </c:forEach>
                                    <td><fmt:formatNumber value="${diemtrungbinh}" maxFractionDigits="2" minFractionDigits="1"></fmt:formatNumber></td>
                                </tr>
                            </c:if>
                            <!-- ket thuc neu hoc sinh chon xem diem mot mon-->

                            <!-- neu hoc sinh chon xem diem nhieu mon-->
                            <c:if test="${empty chonmotmon}">
                                <c:forEach var="chitietxemdiem" items="${listchitietxemdiems}">
                                    <tr>
                                        <td><c:out value="${chitietxemdiem.sothutu}"></c:out></td>
                                        <td><c:out value="${chitietxemdiem.hovaten}"></c:out></td>
                                        <td><c:out value="${chitietxemdiem.monhoc}"></c:out></td>
                                        <c:forEach var="diem" items="${chitietxemdiem.diem}">
                                            <td>
                                                <c:if test="${diem!=-1}">
                                                    <c:out value="${diem}"></c:out>
                                                </c:if>
                                                <c:if test="${diem==-1}">
                                                    <c:out value=""></c:out>
                                                </c:if>
                                            </td>
                                        </c:forEach>
                                        <td><fmt:formatNumber value="${chitietxemdiem.diemtrungbinh}" maxFractionDigits="2" minFractionDigits="1"></fmt:formatNumber></td>
                                    </tr>
                                </c:forEach>
                            </c:if>
                            <!-- ket thuc neu hoc sinh chon xem diem nhieu mon-->

                            <!-- ket thuc hien thi danh sach hoc sinh va danh sach diem cua hoc sinh -->
                        </table>

                    </div>
                    <!-- ket thuc bang -->
                </form>
                <div class="cleared"></div>
            </div>
            <div class="cleared"></div>
        </div>
    </div>
</div>