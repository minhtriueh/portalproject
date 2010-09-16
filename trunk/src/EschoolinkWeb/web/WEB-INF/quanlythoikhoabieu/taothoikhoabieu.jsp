<%-- 
    Document   : taothoikhoabieu
    Created on : Aug 24, 2010, 9:12:46 PM
    Author     : GIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="org.netbeans.xml.schema.eschoolinkobject.*" %>
<%@page import="org.netbeans.xml.schema.qlgv_eschoolinkobject.*" %>
<%@page import="org.netbeans.xml.schema.loaidiem.*" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

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
                        Tạo thời khóa biểu
                    </h2>
                </div>
                <div class="art-postcontent">
                    <!-- article-content -->
                    <form id="fm-form" method="post" action="TaoThoiKhoaBieu_Result">
                        <fieldset>
                            <legend>Thông tin thời khóa biểu</legend>

                            <div class="fm-req">
                                <label>Chọn lớp</label>
                                <select name="id_lop">
                                    <c:forEach var="item" items="${dslop}">
                                        <option value="${item.id}">${item.tenLop}</option>
                                    </c:forEach>
                                </select>
                            </div>

                            <div class="fm-req">
                                <label>Học kỳ</label>
                                <select name="hocky">
                                    <option value="1">Học kỳ 1</option>
                                    <option value="2">Học kỳ 2</option>
                                </select>
                            </div>

                            <input type="hidden" value="1" name="idNamHoc">


                        </fieldset>


                        <fieldset>
                            <legend>Chi tiết thời khóa biểu</legend>


                            <label> Thứ 2</label>
                             <input type="hidden" name="thu2" value="2">
                            <input type="button" id="addbutton2" value="+">
                            <div id="Addchitiet2" align="center"></div>
                            <label> Thứ 3</label>
                            <input type="hidden" name="thu3" value="3">
                            <input type="button" id="addbutton3" value="+">
                            <div id="Addchitiet3" align="center"></div>
                            <label> Thứ 4</label>
                            <input type="hidden" name="thu4" value="4">
                            <input type="button" id="addbutton4" value="+">
                            <div id="Addchitiet4" align="center"></div>
                            <label> Thứ 5</label>
                            <input type="hidden" name="thu5" value="5">
                            <input type="button" id="addbutton5" value="+">
                            <div id="Addchitiet5" align="center"></div>
                            <label> Thứ 6</label>
                            <input type="hidden" name="thu6" value="6">
                            <input type="button" id="addbutton6" value="+">
                            <div id="Addchitiet6" align="center"></div>
                            <label> Thứ 7</label>
                            <input type="hidden" name="thu7" value="7">
                            <input type="button" id="addbutton7" value="+">
                            <div id="Addchitiet7" align="center"></div>
                        </fieldset>

                        <div id="fm-submit" class="fm-req">
                            <input name="Submit" value="Submit" type="submit" />

                        </div>
                    </form>

                    <!-- /article-content -->
                </div>
                <div class="cleared"></div>
            </div>

            <div class="cleared"></div>
        </div>
    </div>

</div>

<div id="copythu2" style="display:none" align="center">
    <span>
       
        <select name="monhoc2">
            <c:forEach var="item" items="${dsmonhoc}">
                <option value="${item.idMonhoc}">${item.tenmonhoc}</option>

            </c:forEach>
        </select>
        <select name="giaovien2">
            <c:forEach var="item" items="${dsgiaovien}">
                <option value="${item.id}">${item.tenGiaoVien}</option>

            </c:forEach>
        </select>
    </span>
</div>

<div id="copythu3" style="display:none" align="center">
     <span>
        <select name="monhoc3">
            <c:forEach var="item" items="${dsmonhoc}">
                <option value="${item.idMonhoc}">${item.tenmonhoc}</option>

            </c:forEach>
        </select>
        <select name="giaovien3">
            <c:forEach var="item" items="${dsgiaovien}">
                <option value="${item.id}">${item.tenGiaoVien}</option>

            </c:forEach>
        </select>
    </span>
</div>

<div id="copythu4" style="display:none" align="center">
    <span>

        <select name="monhoc4">
            <c:forEach var="item" items="${dsmonhoc}">
                <option value="${item.idMonhoc}">${item.tenmonhoc}</option>

            </c:forEach>
        </select>
        <select name="giaovien4">
            <c:forEach var="item" items="${dsgiaovien}">
                <option value="${item.id}">${item.tenGiaoVien}</option>

            </c:forEach>
        </select>
    </span>
</div>

<div id="copythu5" style="display:none" align="center">
    <span>
        <select name="monhoc5">
            <c:forEach var="item" items="${dsmonhoc}">
                <option value="${item.idMonhoc}">${item.tenmonhoc}</option>

            </c:forEach>
        </select>
        <select name="giaovien5">
            <c:forEach var="item" items="${dsgiaovien}">
                <option value="${item.id}">${item.tenGiaoVien}</option>

            </c:forEach>
        </select>
    </span>
</div>

<div id="copythu6" style="display:none" align="center">
    <span>
        <select name="monhoc6">
            <c:forEach var="item" items="${dsmonhoc}">
                <option value="${item.idMonhoc}">${item.tenmonhoc}</option>

            </c:forEach>
        </select>
        <select name="giaovien6">
            <c:forEach var="item" items="${dsgiaovien}">
                <option value="${item.id}">${item.tenGiaoVien}</option>

            </c:forEach>
        </select>
    </span>
</div>

<div id="copythu7" style="display:none" align="center">
    <span>
        <select name="monhoc7">
            <c:forEach var="item" items="${dsmonhoc}">
                <option value="${item.idMonhoc}">${item.tenmonhoc}</option>

            </c:forEach>
        </select>
        <select name="giaovien7">
            <c:forEach var="item" items="${dsgiaovien}">
                <option value="${item.id}">${item.tenGiaoVien}</option>

            </c:forEach>
        </select>
    </span>
</div>
<script type="text/javascript">
    window.addEvent('domready',function(){
        $('addbutton2').addEvent('click',function (){
            var newLock=new Element('div',{'class':'lock'});
            newLock.innerHTML=$('copythu2').innerHTML;

            $('Addchitiet2').grab(newLock);


        })
        $('addbutton3').addEvent('click',function (){
            var newLock=new Element('div',{'class':'lock'});
            newLock.innerHTML=$('copythu3').innerHTML;

            $('Addchitiet3').grab(newLock);


        })
        $('addbutton4').addEvent('click',function (){
            var newLock=new Element('div',{'class':'lock'});
            newLock.innerHTML=$('copythu4').innerHTML;

            $('Addchitiet4').grab(newLock);


        })
        $('addbutton5').addEvent('click',function (){
            var newLock=new Element('div',{'class':'lock'});
            newLock.innerHTML=$('copythu5').innerHTML;

            $('Addchitiet5').grab(newLock);


        })
        $('addbutton6').addEvent('click',function (){
            var newLock=new Element('div',{'class':'lock'});
            newLock.innerHTML=$('copythu6').innerHTML;

            $('Addchitiet6').grab(newLock);


        })
        $('addbutton7').addEvent('click',function (){
            var newLock=new Element('div',{'class':'lock'});
            newLock.innerHTML=$('copythu7').innerHTML;

            $('Addchitiet7').grab(newLock);


        })

    })
</script>