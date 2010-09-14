<%--
    Document   : xemhocba
    Created on : Sep 2, 2010, 6:56:34 AM
    Author     : bon
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="org.netbeans.xml.schema.qlhb_eschoolinkobject.HocBa" %>
<%@page import="org.netbeans.xml.schema.qlhb_eschoolinkobject.HocBaTungHK" %>
<%@page import="org.netbeans.xml.schema.qlhb_eschoolinkobject.NamHoc" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<script type="text/javascript">
    window.addEvent('domready',function(){

       $('xd').addEvent('click',function(){

           var data={};
            var url=rootURL+'XemSoDiem';
            var log=$('superlog');

        requestBasic(url, log, data);
        })
       
    })

</script>
      <div class="art-postcontent" id="superlog">
                    <!-- article-content -->
                    <div class="fm-opt" >
                                       

                                <c:set var="hocba" value="${hocba}"></c:set>
                                <c:set var="hs" value="${hocba.hocSinh}"></c:set>
                                <c:set var="dshb" value="${hocba.hocBaTungHK}"></c:set>
                                <table border="1" class="myTable">
                                   
                                    <c:forEach var="item" items="${dshb}">
                                        <thead>
                                        <tr>
                                            <td colspan="2">HK ${item.namHoc.hocKy} Năm Học ${item.namHoc.namTruoc}-${item.namHoc.namSau} Lớp:${item.lop.tenLop}</td>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td class="td1">Nhận Xét</td>
                                            <td style="background-color:infobackground">${item.nhanXet}</td>
                                        </tr>
                                        <tr>
                                            <td class="td1">Điểm Trung Bình</td>
                                            <td style="background-color:infobackground">${item.diemtrungbinhcanam}</td>
                                        </tr>
                                        <tr>
                                            <td class="td1">Hạnh Kiểm</td>
                                            <td style="background-color:infobackground">${item.hanhKiem.tenHanhKiem}</td>
                                        </tr>
                                        <tr>
                                            <td class="td1">Học Lực</td>
                                            <td style="background-color:infobackground">${item.hocLuc.tenHocLuc}</td>
                                        </tr>
                                        </tbody>
                                    </c:forEach>
                                </table>
                            </div>
                                <div class="fm-req" align="right">

                             <form action="XemSoDiem">
                                 <input type="button" value="Xem Điểm" id="xd" style="background-color:buttonshadow">
                            </form>
                        </div>
                   </div>
              