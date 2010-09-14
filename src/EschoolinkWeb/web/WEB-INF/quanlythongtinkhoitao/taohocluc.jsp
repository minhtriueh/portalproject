<%--
    Document   : taothoikhoabieu
    Created on : Aug 24, 2010, 9:12:46 PM
    Author     : GIN
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
                                                    Tạo học lực
                                                </h2>
                                            </div>
                                            <div class="art-postcontent">
                                                <!-- article-content -->
                                                 <form id="fm-form" method="post" action="TaoHocLuc_Result">
                                                    <fieldset>
                                                    <legend>Tạo học lực</legend>

                                                    <div class="fm-req">
                                                      <label>Tên học lực</label>
                                                      <input name="tenhocluc" type="text" />
                                                    </div>

                                                    <div class="fm-req">
                                                      <label>Điểm cận dưới</label>
                                                      <input name="diemcanduoi" type="text" />
                                                    </div>

                                                    <div class="fm-req">
                                                      <label>Điểm cận trên</label>
                                                      <input name="diemcantren" type="text" />
                                                    </div>

                                                    <div class="fm-req">
                                                      <label>Không có môn dưới</label>
                                                      <input name="khongcomonduoi" type="text" size="6" />
                                                    </div>

                                                    <br />
                                                    <div class="fm-req">
                                                      <label>Ghi chú</label>
                                                      <input name="ghichu" type="text" />
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
