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
                                <table border="1">
                                   <tr><td colspan="2"></td></tr>
                                    <c:forEach var="item" items="${dshb}">
                                        <tr>
                                            <td colspan="2">HK ${item.namHoc.hocKy} Năm Học ${item.namHoc.namTruoc}-${item.namHoc.namSau} Lớp:${item.lop.tenLop}</td>
                                        </tr>
                                        <tr>
                                            <td>Nhận Xét</td>
                                            <td>${item.nhanXet}</td>
                                        </tr>
                                        <tr>
                                            <td>Điểm Trung Bình</td>
                                            <td>${item.diemtrungbinhcanam}</td>
                                        </tr>
                                        <tr>
                                            <td>Hạnh Kiểm</td>
                                            <td>${item.hanhKiem.tenHanhKiem}</td>
                                        </tr>
                                        <tr>
                                            <td>Học Lực</td>
                                            <td>${item.hocLuc.tenHocLuc}</td>
                                        </tr>

                                    </c:forEach>
                                </table>
                            </div>
                         <div id="fm-submit" class="fm-req">

                             <form action="XemSoDiem">
                                 <input type="button" value="Xem Điểm" id="xd">
                            </form>
                        </div>
                   </div>
              