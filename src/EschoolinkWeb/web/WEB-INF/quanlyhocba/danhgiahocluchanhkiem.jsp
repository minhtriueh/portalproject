<%-- 
    Document   : danhgiahocluchanhkiem
    Created on : Sep 2, 2010, 8:17:38 PM
    Author     : bon
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="org.netbeans.xml.schema.qlhb_eschoolinkobject.HanhKiem" %>
<%@page import="org.netbeans.xml.schema.qlhb_eschoolinkobject.HocLuc" %>
<%@page import="org.netbeans.xml.schema.qlhb_eschoolinkobject.HocBa" %>
<%@page import="org.netbeans.xml.schema.qlhb_eschoolinkobject.HocBaTungHK" %>
<%@page import="org.netbeans.xml.schema.qlhb_eschoolinkobject.NamHoc" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<script type="text/javascript">
    function capnhathanhkiem(form){
        var nhanxet=form.nhanxet.value;
        alert(nhanxet);
        var id_hanhkiem=form.id_hanhkiem.value;
        var id_hocluc=form.id_hocluc.value;
        var stt=form.stt.value;
        var url=rootURL+'DanhGiaHanhKiemVaHocLuc'
        var data={
                    'nhanxet':nhanxet,
                    'id_hanhkiem':id_hanhkiem,
                    'id_hocluc':id_hocluc,
                    'stt':stt
                    };
         new Request({
            method:'get',
            url:url,
            data:data,
            onSuccess: function(responseText, responseXML) {
                alert(responseText);
              }
        }).send();           
        
    }
    
</script>



<div class="art-postcontent">
    <div class="fm-opt">
        <%Map sessions = ActionContext.getContext().getSession();
                HocBa hocba = (HocBa) sessions.get("shocba");
                System.out.print(hocba);
                List<HocBaTungHK> listhocbatunghk = hocba.getHocBaTungHK();
        %>
        <c:set var="stt" value="0"></c:set>
        <c:set var="shocba" value="${shocba}"></c:set>
        <c:set var="hs" value="${shocba.hocSinh}"></c:set>
        <c:set var="dshb" value="${shocba.hocBaTungHK}"></c:set>

        <c:forEach var="item" items="${dshb}">
            <form action="DanhGiaHanhKiemVaHocLuc">
                <table>
                    <tr>
                        <td colspan="2"> HK ${item.namHoc.hocKy} Năm Học ${item.namHoc.namTruoc}-${item.namHoc.namSau} Lớp:${item.lop.tenLop}</td>
                    </tr>
                    <tr>
                        <td>Nhận Xét</td>
                        <td>
                            <input type="text" name="nhanxet" value=" ${item.nhanXet}">
                        </td>
                    </tr>
                    <tr>
                        <td>Điểm Trung Bình</td>
                        <td>${item.diemtrungbinhcanam}</td>
                    </tr>
                    <tr>
                        <td>Hạnh Kiểm</td>
                        <td>
                            <select name="id_hanhkiem">
                                <option value="${item.hanhKiem.id}">
                                    ${item.hanhKiem.tenHanhKiem}
                                </option>
                                <c:forEach var="itee" items="${listhk}">
                                <option value="${itee.id}">
                                    ${itee.tenHanhKiem}
                                </option>
                                </c:forEach>

                            </select>

                        </td>
                    </tr>
                    <tr>
                        <td>Học Lực</td>
                        <td>
                            <select name="id_hocluc">
                                <option value="${item.hocLuc.id}">
                                    ${item.hocLuc.tenHocLuc}
                                </option>
                                <c:forEach var="iteee" items="${listhl}">
                                <option value="${iteee.id}">${iteee.tenHocLuc}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                </table>
                <div id="fm-submit" class="fm-req">
                    <input type="button" value="Lưu Lại" onclick="capnhathanhkiem(this.form)">
                    <input type="hidden" name="stt" value="${stt}">
                </div>
            </form>
            <c:set var="stt" value="${stt+1}"></c:set>
        </c:forEach>
    </div>

</div>
