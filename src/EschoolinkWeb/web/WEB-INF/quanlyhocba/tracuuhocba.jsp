<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="org.netbeans.xml.schema.eschoolinkobject.HocSinh" %>
<%@page import="java.util.Map"%>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<script type="text/javascript">
    window.addEvent('domready',function(){
        var khoihoc= $('khoihoc')
        khoihoc.addEvent('change',function(){
            var log=$('log');
            var url=rootURL+'LayDanhSachLop';
            var data={'tenkhoilop':khoihoc.value};
            requestBasic(url,log,data);
           
        });
        var button=$('lk');
        button.addEvent('click',function(){
            var form=$('fm-form');
            var id_lop=form.id_lop.value;
            var url=rootURL+'SearchHocSinhHB';
            var data={'id_lop':id_lop};
            var log=$('sd');
            requestBasic(url, log, data);

        })
    })
    
</script>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
                        Tra Cứu Học Bạ
                    </h2>
                </div>
                <div class="art-postcontent">
                    <!-- article-content -->
                    <form id="fm-form" method="post" action="SearchHocSinhHB" >
                        <fieldset>
                            <legend>Thông Tin Tìm Kiếm</legend>
                            <div class="fm-opt">
                                <table>
                                    <tr>
                                        <td>
                                            Khối Lớp
                                        </td>
                                        <td>
                                            Lớp Học
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <select id="khoihoc" name="khoilop"  style="width:100%">
                                                <option value="-----">Chọn Khối Lớp</option>
                                                <option value="10">Khối 10</option>
                                                <option value="11">Khối 11</option>
                                                <option value="12">Khối 12</option>
                                            </select> 
                                        </td>  
                                        <td><span id="log">
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
                            </div>
                        </fieldset>
                        <div id="fm-submit" class="fm-req">
                            <input name="submit" value="Liệt Kê" type="button" id="lk" />
                            <input name="submit" value="Trở Lại" type="submit"/>
                        </div>
                    </form>
                </div>
                <div class="cleared"></div>
            </div>
            <br>
            <div class="art-post-inner art-article">
                <div id="sd">

                </div>
            </div>
        </div>
    </div>
</div>
