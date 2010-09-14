<%-- 
    Document   : xemsodiemcacmon
    Created on : Sep 2, 2010, 7:26:25 PM
    Author     : bon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="org.netbeans.xml.schema.eschoolinkobject.HocBa" %>
<%@page import="org.netbeans.xml.schema.eschoolinkobject.ChiTietSoDiem" %>
<%@page import="org.netbeans.xml.schema.eschoolinkobject.Diem" %>
<%@page import="org.netbeans.xml.schema.qlhb_eschoolinkobject.HocBaTungHK" %>
<%@page import="org.netbeans.xml.schema.eschoolinkobject.HocSinh" %>
<%@page import="org.netbeans.xml.schema.eschoolinkobject.NamHoc" %>
<%@page import="org.netbeans.xml.schema.eschoolinkobject.SoDiem" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page import="com.opensymphony.xwork2.ActionContext"%>



<div class="art-postcontent">
    <div class="fm-opt" >
        <form action="UpdateHanhKiem">
            <c:set var="shocba" value="${shocba}"></c:set>
            <c:set var="hs" value="${shocba.hocSinh}"></c:set>
            <c:set var="dshb" value="${shocba.hocBaTungHK}"></c:set>

            <c:forEach var="item" items="${dshb}">
                <table border="1" class="myTable">
                    
                    <tr>
                        <td rowspan="2" valign="middle" style="background-color:aqua;font-weight:bold">
                            Học Kỳ ${item.namHoc.hocKy}
                        </td>
                        <c:forEach var="sodiem" items="${item.diemTBMon}">
                            <td>${sodiem.tenSoDiem}</td>
                        </c:forEach>
                    </tr>
                    
                    <tr  style="background-color:infobackground">

                        <c:forEach var="sodiem2" items="${item.diemTBMon}">
                            <c:forEach var="chitiet" items="${sodiem2.chiTietSoDiem}">
                                <%--<c:forEach var="diem" items="${chitiet.diem}">--%>
                                <td style="background-color:infobackground"><fmt:formatNumber value="${chitiet.diemtrungbinh}" maxFractionDigits="2" minFractionDigits="1"></fmt:formatNumber></td>
                                <%--</c:forEach>--%>
                            </c:forEach>
                        </c:forEach>
                    </tr>
                </table>
            </c:forEach>
        </form>
    </div>
            <div class="fm-req" align="center">
        <input type="button" value="Trở Lại" onclick="Back(1)" style="background-color:buttonface">
    </div>
</div>