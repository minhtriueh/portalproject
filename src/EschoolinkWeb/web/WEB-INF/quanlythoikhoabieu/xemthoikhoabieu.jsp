<%-- 
    Document   : taothoikhoabieu
    Created on : Aug 24, 2010, 9:12:46 PM
    Author     : GIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                        Xem thời khóa biểu
                    </h2>
                </div>
                <div class="art-postcontent">
                    <!-- article-content -->
                    <form id="fm-form" method="post" action="XemThoiKhoaBieu_Result">
                        <br /><br />
                            <center>
                                <b>Chọn lớp &nbsp;</b>

                                <select name="tenlop">
                                    <c:forEach var="item" items="${dslop}">
                                        <option value="${item.tenLop}">&nbsp;&nbsp; ${item.tenLop} &nbsp;&nbsp;</option>
                                    </c:forEach>
                                </select>

                                &nbsp; &nbsp;

                                <b> Chọn học kỳ &nbsp;</b>
                                <select name="hocky">
                                    <option value="1">&nbsp; Học kỳ 1 &nbsp;&nbsp; </option>
                                    <option value="2">&nbsp; Học kỳ 2 &nbsp;&nbsp;</option>
                                </select>


                            </center>
                            
                        <br /><br /><br />



                        <div id="fm-submit" class="fm-req">
                            <input name="Submit" value="Xem" type="submit" />
                        </div>

                        
                        <br />
                        

                    </form>

                    <!-- /article-content -->
                </div>
                <div class="cleared"></div>
            </div>

            <div class="cleared"></div>
        </div>
    </div>

</div>
