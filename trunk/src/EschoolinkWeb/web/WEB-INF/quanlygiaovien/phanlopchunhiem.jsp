<%-- 
    Document   : phanlopchunhiem
    Created on : Sep 1, 2010, 3:27:04 PM
    Author     : bon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">



<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page import="org.netbeans.xml.schema.eschoolinkobject.GiaoVien"%>
<%@page import="org.netbeans.xml.schema.eschoolinkobject.GiaoVien"%>
<%@page import="java.util.List"%>
<script type="text/javascript" src="../mootools.js"></script>
<script type="text/javascript" src="../script.js"></script>
<script type="text/javascript">
    function test(control){
        var tenkhoi=control.value;
       
        var url=rootURL+'LayDanhSachLop';
        new Request.HTML({
            method:'get',
            url:url,
            data:{
                'tenkhoilop':tenkhoi
            },
            onRequest:function(){
            },
            update:$('tlog')

        }).send();
        
    };
    function sender(){
        alert("SDFDSF"+rootURL);
        var id_lop=$('s-fm-form').id_lop.value;
        var id_giaovien=$('s-fm-form').id_giaovien.value;
        var url=rootURL+'PhanLopChuNhiem';
       alert(url);
       new Request({
            method:'get',
            url:url,
            data:{
                'id_lop':id_lop,
                'id_giaovien':id_giaovien
                 },
            onSuccess: function(responseText, responseXML) {
                alert(responseText);
              }


        }).send();

        
    };
</script>
<div>
     <div class="fm-opt">
                    <!-- article-content -->
                    <form id="s-fm-form" method="get" action="PhanLopChuNhiem" >
                        <table border="1">
                            <tr>
                                <td>ID</td>
                                <td>Tên Giáo Viên</td>
                                <td>Số CMND</td>
                                <td>Chức Vụ</td>
                                <td style="border-right-width:0px">Chọn Khối</td>
                                <td style="border-right-width:0px">Chọn Lớp</td>
                            </tr>
                            <tr>
                                <td><%=request.getParameter("id_giaovien")%></td>
                                <td><%=request.getParameter("tengiaovien")%></td>
                                <td><%=request.getParameter("cmnd")%></td>
                                <td><%=request.getParameter("chucvu")%></td>
                                <td>
                                    <select name="khoilop" onchange="test(this)" style="width:100%">
                                        <option value="---">---</option>
                                        <option value="10">Khối10</option>
                                        <option value="11">Khối11</option>
                                        <option value="12">Khối12</option>
                                    </select>
                                </td>

                                <td>
                                    <span id="tlog">

                                        <c:set var="list" value="${danhsachlop}"></c:set>

                                        <select name="id_lop" style="width:100%">
                                            <c:forEach var="item" items="${danhsachlop}">
                                                <option value="<c:out value="${item.id}"/>"><c:out value="${item.tenLop}"/></option>
                                            </c:forEach>
                                        </select>
                                    </span>
                                </td>

                            </tr>
                        </table>

                        <div id="fm-submit" class="fm-req">
                            <input name="submit" value="Phân Lớp" type="button" onclick="sender()"/>
                            <input type="hidden" value="<%=request.getParameter("id_giaovien")%>" name="id_giaovien">
                            <input name="submit" value="Trở Lại" type="button" onclick="Back(1)"/>
                        </div>
                    </form>
                </div>
          </div>
           
      

