<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript">
    window.addEvent('domready', function(){
        $('sm').addEvent('click', function(){
            var tengiaovien=$('fm-form').tengiaovien.value;
            var cmnd=$('fm-form').cmnd.value    ;
            var chucvu=$('fm-form').chucvu.value    ;
            var quequan=$('fm-form').quequan.value  ;
            var log=$('log');
            var url=rootURL+'SearchGiaoVien';
            var data={'tengiaovien': tengiaovien,
                        'cmnd': cmnd,
                         'chucvu':chucvu,
                          'quequan':quequan
                        };
                        requestBasic(url,log,data);
                    });
               });
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
                        Thông tin tìm kiếm
                    </h2>
                </div>
                <div class="art-postcontent">
                    <!-- article-content -->
                    <form id="fm-form" method="post" action="SearchGiaoVien" >
                        <fieldset>
                            <legend>Thông Tin Cá Nhân</legend>
                            <div class="fm-opt">
                                <strong>
                                    <label>Họ Tên</label>
                                    <input name="tengiaovien" type="text" />
                                    <label>CMND Số</label>
                                    <input name="cmnd" type="text" />
                                </strong>
                            </div>
                            <div class="fm-opt">
                                <strong>
                                    <label>Chức vụ</label>
                                    <input name="chucvu" type="text" />
                                    <label>Quê quán</label>
                                    <input name="quequan" type="text" />
                                </strong>
                            </div>
                        </fieldset>
                        <div id="fm-submit" class="fm-req">
                            <input name="submit" value="Tìm Kiếm" type="button" id="sm" />
                            <input name="submit" value="Trở Lại" type="button" onclick="Back(1)"/>
                        </div>
                    </form>
                </div>
               
                <div class="cleared"></div>
            </div>
            <br>

            <div id="log">

                
            </div>
        </div>
    </div>
</div>




