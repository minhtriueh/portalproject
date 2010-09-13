<%-- 
    Document   : dshs_result
    Created on : Sep 1, 2010, 8:50:06 PM
    Author     : bon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="org.netbeans.xml.schema.eschoolinkobject.HocSinh" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page import="com.opensymphony.xwork2.ActionContext"%>



<div>
    <c:set var="danhsach" scope="session" value="${listhocsinh}"></c:set>
    <c:set var="i" value="<%=1%>"></c:set>
    <table border="1">
        <tr>
            <td>Số TT</td>
            <td>Mã Số Học Sinh</td>
            <td>Tên Học Sinh</td>
            <td>Số Nhà</td>
            <td></td>
        </tr>
        <c:forEach var="item" items="${danhsach}">
            <tr align="center">
                <td>${i}</td>
                <td>${item.id}</td>
                <td>${item.hoVaTenLot} ${item.ten}</td>
                <td>${item.soNha}</td>
                <td>
                    <div id="fm-submit" class="fm-req">
                        <form action="XemHocBa">
                            <input type="submit" value="Xem Học Bạ">
                            <input type="hidden" name="id_hocsinh" value="${item.id}">
                        </form>
                    </div>
                </td>
            </tr>
            <c:set var="i" value="${i+1}"></c:set>
        </c:forEach>
    </table>
</div>
