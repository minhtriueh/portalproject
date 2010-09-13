<%--
    Document   : phanlopchunhiem_laydslop
    Created on : Sep 1, 2010, 4:34:57 PM
    Author     : bon
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="result" value="${result}" scope="session"></c:set>
<c:choose>
    <c:when test="${result==true}">
        <c:out value="Phan Lop Thanh Cong!"></c:out>
    </c:when>
    <c:otherwise>
        <c:out value="Khong Thanh Cong"></c:out>
    </c:otherwise>
</c:choose>




