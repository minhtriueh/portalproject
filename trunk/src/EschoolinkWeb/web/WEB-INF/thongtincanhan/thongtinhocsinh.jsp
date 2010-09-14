<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="org.netbeans.xml.schema.qlgv_eschoolinkobject.DanToc" %>
<%@page import="org.netbeans.xml.schema.qlgv_eschoolinkobject.ToBoMon" %>
<%@page import="java.util.List" %>
<%@page import="org.netbeans.xml.schema.qlgv_eschoolinkobject.GiaoVien" %>
<script type="text/javascript">
    window.addEvent('domready',function(){
       
        var namhoc=$('_namhoc')
       
        var button=$('lk');
        button.addEvent('click',function(){
            var url=rootURL+'XemHocBa_CN';
            var data={
                       'id_namhoc':namhoc.value
                     };
            var log=$('sd');
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
                        Thông Tin Học Sinh
                    </h2>
                </div>
                <div class="art-postcontent">
                    <!-- article-content -->
                    <form id="fm-form" method="post" action="TaoGiaoVien" name="iform" >
                        <fieldset>
                            <legend>Thông Tin Cá Nhân</legend>
                            <div class="fm-opt">

                                <table class="myTable" border="1">
                                    <tr>
                                        <td class="td1">Họ Tên Học Sinh</td>
                                        <td style="background-color:infobackground">${hs.hoVaTenLot} ${hs.ten}</td>
                                    </tr>
                                     <tr>
                                        <td class="td1">Ngày Sinh</td>
                                        <td style="background-color:infobackground">${hs.ngaySinh}</td>
                                    </tr>
                                     <tr>
                                        <td class="td1">Mã Học Sinh</td>
                                        <td style="background-color:infobackground">${hs.maSo}</td>
                                    </tr>
                                     <tr>
                                        <td class="td1">Giới Tính</td>
                                        <td style="background-color:infobackground">${hs.gioiTinh}</td>
                                    </tr>
                                     
                                     <tr>

                                        <td class="td1">Tôn Giáo</td>
                                        <td style="background-color:infobackground">${hs.tonGiao}</td>
                                    </tr>
                                       <tr>
                                        <td class="td1">Chỗ ở hiện tại</td>
                                        <td style="background-color:infobackground">${hs.soNha}</td>
                                    </tr>
                                    <tr>
                                        <td class="td1">Username</td>
                                        <td style="background-color:infobackground">${hs.nguoiDung.username}</td>
                                    </tr>
                                     <tr>
                                        <td class="td1">Password</td>
                                        <td style="background-color:infobackground">${hs.nguoiDung.password}</td>
                                    </tr>

                                </table>
                            </div>
                        </fieldset>

                    </form>
                </div>
                  <div class="art-postcontent">
                     <form id="fm-form2" method="post" action="" >
                        <fieldset>
                            <legend>Tra Cứu Học Bạ Của Quá Trình Học</legend>
                            <div class="fm-opt">
                                <table class="myTable">
                                    <thead>
                                    <tr>
                                        <td>
                                            Niên Khóa
                                        </td>
                                        
                                    </tr>
                                    </thead>
                                    <tr>
                                        <td>
                                            <select id="_namhoc" name="id_namhoc">
                                                <option value="-----">Chọn Niên Khóa</option>

                                                <c:forEach var="item" items="${dsnamhoc}">
                                                    <option value="${item.id}">
                                                        ${item.namTruoc}-${item.namSau}
                                                     
                                                    </option>
                                            </c:forEach>
                                             </select>
                                        </td>
                                        </tr>
                                </table>
                            </div>
                        </fieldset>
                        <div id="fm-submit" class="fm-req">
                            <input name="submit" value="Xem Học Bạ" type="button" id="lk" />
                            <input name="submit" value="Trở Lại" type="submit"/>
                        </div>
                    </form>
                   </div>
                                                <div class="art-postcontent">
                                                    <div class="fm-opt">
                                                        <div id="sd">


                                                        </div>

                                                    </div>

                                                </div>
                 <div class="cleared"></div>
            </div>

            <div class="cleared"></div>
        </div>
    </div>

</div>
