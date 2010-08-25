<%--
    Document   : tabledemo
    Created on : 19-08-2010, 14:41:35
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
                                                     Table demo
                                                </h2>
                                            </div>
                                            <div class="art-postcontent">
                                                <!-- article-content -->
                                                <form action="ajax_getHuyen" method="post">
                                                    <label>Tinh</label>
                                                    <select name="tinh" id="selecTinh">
                                                        <option value="1">Tay Ninh</option>
                                                        <option value="2">Binh Duong</option>
                                                        <option value="3">Tp Ho Chi Minh</option>
                                                    </select><br />
                                                     <label>Huyện</label>
                                                    <select name="tinh" id="selectHuyen">
                                                        <option></option>
                                                    </select>
                                                </form>

                                                <!-- /article-content -->
                                            </div>
                                            <div class="cleared"></div>
                            </div>

                            		<div class="cleared"></div>
                                </div>
                            </div>

                        </div>
<script type="text/javascript">
    window.addEvent('domready', function(){
        $('selecTinh').addEvent('change', function(){
            var idTinhIn=this.get('value');
            //goi ajax
            var log=$('selectHuyen');
            var url=rootURL+'ajax_getHuyen';
            var data={idTinh: idTinhIn};
            ajaxRequest(url,log,data);
        });
    });
</script>