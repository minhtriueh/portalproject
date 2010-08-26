<%-- 
    Document   : danhSachHuyenTheoTinh
    Created on : 24-08-2010, 21:54:08
    Author     : sanchikaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach items="${listHuyen}" var="item">
    <option value="${item.id}">${item.tenQuanHuyenThanhPho}</option>
</c:forEach>
