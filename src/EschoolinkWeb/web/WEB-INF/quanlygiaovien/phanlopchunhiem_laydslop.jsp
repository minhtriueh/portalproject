<%-- 
    Document   : phanlopchunhiem_laydslop
    Created on : Sep 1, 2010, 4:34:57 PM
    Author     : bon
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">



<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page import="org.netbeans.xml.schema.qlgv_eschoolinkobject.GiaoVien"%>
<%@page import="org.netbeans.xml.schema.qlgv_eschoolinkobject.GiaoVien"%>
<%@page import="java.util.List"%>
<script type="text/javascript" src="../mootools.js"></script>
<script type="text/javascript" src="../script.js"></script>

<span>
    <c:set var="list" value="${danhsachlop}"></c:set>

    <select name="id_lop" style="width:100%">
        <c:forEach var="item" items="${danhsachlop}">
            <option value="<c:out value="${item.id}"/>"><c:out value="${item.tenLop}"/></option>
        </c:forEach>
    </select>

</span>

