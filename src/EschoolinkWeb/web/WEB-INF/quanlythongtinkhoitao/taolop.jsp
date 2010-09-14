<%--
    Document   : taothoikhoabieu
    Created on : Aug 24, 2010, 9:12:46 PM
    Author     : GIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="org.netbeans.xml.schema.eschoolinkobject.*" %>
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
                        Tạo khối lớp
                    </h2>
                </div>
                <div class="art-postcontent">
                    <!-- article-content -->
                    <form id="fm-form" method="post" action="TaoLop_Result">
                        <fieldset>
                            <legend>Tạo lớp</legend>

                            <div class="fm-req">
                                <label>Tên lớp </label>
                                <input name="tenlop" type="text" />
                            </div>
                            <div class="fm-req">
                                <label>Sĩ số lớp</label>
                                <input name="sisolop" type="text" />
                            </div>
                            <div class="fm-req">
                                <label>Năm học</label>
                                <select name="id_namhoc">
                                    <c:forEach var="item" items="${dsnamhoc}">
                                        <option value="${item.id}">${item.namTruoc} - ${item.namSau}</option>
                                    </c:forEach>
                                </select>
                            </div>

                            <div class="fm-req">
                                <label>Thời khóa biểu</label>
                                <select name="id_thoikhoabieu">
                                    <c:forEach var="item" items="${dsthoikhoabieu}">
                                        <option value="${item.idThoiKhoaBieu}">${item.idLop}</option>
                                    </c:forEach>
                                </select>
                            </div>

                            <div class="fm-req">
                                <label>Giáo viên chủ nhiệm</label>
                                <select name="id_gvcn">
                                    <c:forEach var="item" items="${dsgvcn}">
                                        <option value="${item.id_gvcn}">${item.GiaoVien.tenGiaoVien}</option>
                                    </c:forEach>
                                </select>
                            </div>

                            <div class="fm-req">
                                <label>Khối lớp</label>
                                <select name="id_khoilop">
                                    <c:forEach var="item" items="${dskhoilop}">
                                        <option value="${item.id}">${item.tenKhoi}</option>
                                    </c:forEach>
                                </select>
                            </div>



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
