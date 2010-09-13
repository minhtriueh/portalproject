<%-- 
    Document   : searchgiaovien_result
    Created on : Sep 1, 2010, 1:28:04 PM
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
<script type="text/javascript">
     function sendrequest(form){
              var id_giaovien=form.id_giaovien.value;
              var tengiaovien=form.tengiaovien.value;
              var cmnd=form.cmnd.value;
              var chucvu=form.cmnd.value;
              var url=rootURL+'GoiTrangPhanLop';
              var data={'id_giaovien':id_giaovien,
                           'tengiaovien':tengiaovien,
                            'cmnd':cmnd,
                              'chucvu':chucvu
                                };
                 var log=$('sublog');
                requestBasic(url, log, data)
                 }
    </script>


        <div id="sublog">
             <div class="fm-opt">
            <%
                    List<GiaoVien> ds = (List<GiaoVien>) request.getAttribute("danhsachgiaovien");
                    if (ds != null)
                        request.setAttribute("danhsachgiaovien", ds);
                    else {
            %>
            Không Tìm Thấy (Sorry,Not found)
            <%}%>
            <c:set var="clistgiaovien" value="${listgiaovien}"></c:set>

            <c:if test="${clistgiaovien!=null}">


                <table border="1" class="art-article">
                    <tr>
                        <td>ID</td>
                        <td>Tên Giáo Viên</td>
                        <td>Số CMND</td>
                        <td>Chức Vụ</td>
                        <td>Xem Thông Tin</td>
                        <td>Xấp Lớp</td>
                    </tr>
                    <c:forEach var="item" items="${listgiaovien}">
                        <tr>

                            <td>${item.id}</td>
                            <td>${item.tenGiaoVien}</td>
                            <td>${item.cmnd}</td>
                            <td>${item.chucVu}</td>
                            <td>
                                <div id="fm-submit" class="fm-req">
                                <form id="fm-form" method="post" action="TraCuuGiaoVien">
                                    <input type="submit" value="Xem">
                                    <input type="hidden" name="id_giaovien" value="${item.id}">
                                </form>
                                </div>
                            </td>
                            <td>
                                <div id="fm-submit" class="fm-req">
                                    <form id="subform" action="index.jsp?module=quanlygiaovien&page=phanlopchunhiem" method="post">
                                        <input type="button" value="Chọn" onclick="sendrequest(this.form)" >
                                    <input type="hidden" id="id_giaovien" name="id_giaovien" value="${item.id}">
                                    <input type="hidden" name="tengiaovien" value="${item.tenGiaoVien}">
                                    <input type="hidden" name="cmnd" value="${item.cmnd}">
                                    <input type="hidden" name="chucvu" value="${item.chucVu}">
                                </form>
                                    </div>
                            </td>
                        </tr>
                    </c:forEach>

                </table>

            </c:if>

        </div>
    
</div>