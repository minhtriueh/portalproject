<%-- 
    Document   : danhgiahocluchanhkiem_result
    Created on : Sep 2, 2010, 9:02:58 PM
    Author     : bon
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="result" value="${kq}" scope="session"></c:set>
<c:choose>
    <c:when test="${kq==true}">
        <c:out value="Cap Nhat Thanh Cong"></c:out>
    </c:when>
    <c:otherwise>
        <c:out value="Khong Thanh Cong!"></c:out>
    </c:otherwise>
</c:choose>

