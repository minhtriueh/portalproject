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
            var url=rootURL+'XemSoDiemCacMon';
            var log=$('superlog');
            
        requestBasic(url, log, data);
        })
        $('dg').addEvent('click',function(){
          
             var data={};
            var url=rootURL+'DanhGiaHanhKiemVaHocLuc';
            var log=$('superlog');
            requestBasic(url, log, data);
        })
    })
    
</script>


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
                        Chi Tiết Học Bạ
                    </h2>
                </div>
                <div class="art-postcontent" id="superlog">
                    <!-- article-content -->
                    <div class="fm-opt" >
                                        <%Map sessions = ActionContext.getContext().getSession();
                                            HocBa hocba = (HocBa) sessions.get("shocba");
                                            List<HocBaTungHK> listhocbatunghk = hocba.getHocBaTungHK();

                                        %>

                                <c:set var="shocba" value="${shocba}"></c:set>
                                <c:set var="hs" value="${shocba.hocSinh}"></c:set>
                                <c:set var="dshb" value="${shocba.hocBaTungHK}"></c:set>
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
                             
                             <form action="XemSoDiemCacMon">
                                 <input type="button" value="Xem Điểm" id="xd">
                           
                                 <input type="button" value="Đánh Giá" id="dg">
                            </form>
                        </div>
                   </div>
                <div class="cleared"></div>
            </div>
           
        </div>
    </div>
</div>
<div>
</div>
