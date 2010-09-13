<%-- 
    Document   : tongketdiemresult
    Created on : 12-09-2010, 14:03:41
    Author     : nguyentanmo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Table 2</title>
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
                            <table class="myTable" >
                                <thead>
                                    <tr>
                                        <td>STT</td>
                                        <td width="100">Họ Và Tên</td>
                                        <c:forEach var="monhoc" items="${listmonhocs}">
                                            <td width="50"><c:out value="${monhoc.tenmonhoc}"></c:out></td>
                                        </c:forEach>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="chitietdiem" items="${listchitietdiems}">
                                        <c:if test="${chitietdiem.sothutu%2==1}">
                                            <c:out value="${chitietdiem.sothutu}"></c:out>
                                        </c:if>
                                        <tr>
                                            <td><c:out value="${chitietdiem.sothutu}"></c:out></td>
                                            <td><c:out value="${chitietdiem.hovaten}"></c:out></td>
                                            <c:forEach var="diem" items="${chitietdiem.diem}">
                                                <td><c:out value="${diem}"></c:out></td>
                                            </c:forEach>
                                        </tr>
                                    </c:forEach>
                                    <tr>
                                        <td>1</td>
                                        <td>Nguyen duy chinh</td>
                                        <td align="center">23-09-1988</td>
                                        <td>Tay Ninh</td>
                                    </tr>
                                    <tr class="tr1">
                                        <td>2</td>
                                        <td>Nguyen duy chinh</td>
                                        <td align="center">23-09-1988</td>
                                        <td>Tay Ninh</td>
                                    </tr>
                                    <tr>
                                        <td >3</td>
                                        <td class="td1">Nguyen duy chinh</td>
                                        <td align="center">23-09-1988</td>
                                        <td>Tay Ninh</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                        <h1>Tổng Kết Điểm Result!</h1>

                        <!-- ket thuc thong tin -->

                        <div class="cleared"></div>
                    </div>
                    <div class="cleared"></div>
                </div>
            </div>
        </div>
    </body>
</html>



