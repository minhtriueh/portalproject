<%-- 
    Document   : sendmessage
    Created on : 06-09-2010, 11:52:08
    Author     : sanchikaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                                                    Gửi câu hỏi!
                                                </h2>
                                            </div>
                                            <div class="art-postcontent">
                                                <!-- article-content -->
                                                <form id="sendForm" class="myform" method="post" action="sendmessage" >
                                                <p>
                                                <label>Tên sinh viên: </label>
                                                <input id="name" type="text" name="name" />
                                                </p>

                                                <p>
                                                <label>Mã số sv: </label>
                                                <input id="code" type="text" name="code" />
                                                </p>

                                                <p>
                                                <label>Nội dung câu hỏi: </label>
                                                <textarea id="mess" name="mess" cols="41" rows="3"></textarea>
                                                </p>
                                                <p>
                                                    <input type="button" value="Send" class="bt" onclick="sendMessageForm($('sendForm'))"/>
                                                </p>

                                            </form>
                                                <div id="logMessSending">

                                                </div>
                                                <!-- /article-content -->
                                            </div>
                                            <div class="cleared"></div>
                            </div>

                            		<div class="cleared"></div>
                                </div>
                            </div>

                        </div>
