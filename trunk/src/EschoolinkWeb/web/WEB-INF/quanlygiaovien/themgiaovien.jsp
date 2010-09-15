<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="org.netbeans.xml.schema.qlgv_eschoolinkobject.DanToc" %>
<%@page import="org.netbeans.xml.schema.qlgv_eschoolinkobject.ToBoMon" %>
<%@page import="java.util.List" %>
<script type="text/javascript">
    window.addEvent('domready',function(){
        var button=$('sm');
        var listform=document.iform;
        button.addEvent('click',function(event){
            var result=false;
            for(var i=0;i<listform.length;i++)
            {
                if(isNull(listform[i].value))
                {
                    alert(i)
                    result=true;
                    break;
                }
            }
            if(result==true) {
                event.stop();
                alert("vui lòng điền đầy đủ các thông tin");
            }
            else
            {
                if(!IsNumeric(listform.sodienthoai.value)|!IsNumeric(listform.cmnd.value)){
                    event.stop();
                    alert("Số điện thoại hoặc cmnd không đúng định dạng");
                }
            }
        });
        var ketnapdoan=$('knd');
        ketnapdoan.addEvent('change',function(){
            if(ketnapdoan.value=='false'){
                $('nvd').disabled=true;
                $('tvd').disabled=true;
                $('navd').disabled=true;
            }else {
                $('nvd').disabled=false;
                $('tvd').disabled=false;
                $('navd').disabled=false;
            }
        });
        var ketnapdang=$('knd1');
        ketnapdang.addEvent('change',function(){
            if(ketnapdang.value=='false'){
                $('nvd1').disabled=true;
                $('tvd1').disabled=true;
                $('navd1').disabled=true;
            }else{
                $('nvd1').disabled=false;
                $('tvd1').disabled=false;
                $('navd1').disabled=false;
            }
        });





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
                        Thêm Giáo Viên
                    </h2>
                </div>
                <div class="art-postcontent">
                    <!-- article-content -->
                    <form id="fm-form" method="post" action="TaoGiaoVien" name="iform" enctype="multipart/form-data" >
                        <fieldset>
                            <legend>Thông Tin Cá Nhân</legend>
                            <div class="fm-opt">
                                <label>Họ Tên</label>
                                <input name="tengiaovien" type="text" />
                            </div>
                            <div class="fm-opt">
                                <label>CMND Số</label>
                                <input name="cmnd" type="text" />
                            </div>
                            <div class="fm-opt">
                                <label>Nơi Cấp</label>
                                <input name="noicap" type="text"/>
                            </div>
                            <div class="fm-opt">
                                <label>Ngày Cấp</label>
                                <strong>
                                    <select name="ngaycap">
                                        <c:forEach var="i" begin="1" end="31">
                                            <option value="<c:out value="${i}"></c:out>"><c:out value="${i}"></c:out></option>
                                        </c:forEach>
                                    </select>
                                    <select name="thangcap">
                                        <c:forEach var="j" begin="1" end="12">
                                            <option value="<c:out value="${j}"></c:out>"><c:out value="${j}"></c:out></option>
                                        </c:forEach>
                                    </select>
                                    <select name="namcap">
                                        <c:forEach var="x" begin="1988" end="2010">
                                            <option value="<c:out value="${x}"></c:out>"><c:out value="${x}"></c:out></option>
                                        </c:forEach>
                                    </select>

                                </strong>
                            </div>
                            <div class="fm-opt">
                                <label>Ngày Sinh</label>
                                <strong>
                                    <select name="ngaysinh">
                                        <c:forEach var="i" begin="1" end="31">
                                            <option value="<c:out value="${i}"></c:out>"><c:out value="${i}"></c:out></option>
                                        </c:forEach>
                                    </select>
                                    <select name="thangsinh">
                                        <c:forEach var="j" begin="1" end="12">
                                            <option value="<c:out value="${j}"></c:out>"><c:out value="${j}"></c:out></option>
                                        </c:forEach>
                                    </select>
                                    <select name="namsinh">
                                        <c:forEach var="x" begin="1988" end="2010">
                                            <option value="<c:out value="${x}"></c:out>"><c:out value="${x}"></c:out></option>
                                        </c:forEach>
                                    </select>

                                </strong>
                            </div>
                            <div class="fm-opt">
                                <label>Ngày Vào Trường</label>
                                <strong>
                                    <select name="ngayvaotruong">
                                        <c:forEach var="i" begin="1" end="31">
                                            <option value="<c:out value="${i}"></c:out>"><c:out value="${i}"></c:out></option>
                                        </c:forEach>
                                    </select>
                                    <select name="thangvaotruong">
                                        <c:forEach var="j" begin="1" end="12">
                                            <option value="<c:out value="${j}"></c:out>"><c:out value="${j}"></c:out></option>
                                        </c:forEach>
                                    </select>
                                    <select name="namvaotruong">
                                        <c:forEach var="x" begin="1988" end="2010">
                                            <option value="<c:out value="${x}"></c:out>"><c:out value="${x}"></c:out></option>
                                        </c:forEach>
                                    </select>

                                </strong>
                            </div>
                            <div class="fm-opt">
                                <label>Trình Độ Văn Hóa</label>
                                <input name="trinhdovanhoa" type="text" />
                            </div>
                            <div class="fm-opt">
                                <label>Hình Ảnh</label>
                                <input name="upload" type="file" />
                            </div>
                            <div class="fm-opt">
                                <label for="fm-state">Giới Tính</label>
                                <select name="gioitinh">
                                    <option value="Nam">Nam</option>
                                    <option value="Nu">Nữ</option>
                                </select>
                            </div>

                            <div class="fm-opt">
                                <label for="fm-state">Trình Độ Học Vấn</label>
                                <select name="trinhdodaotao">
                                    <option value="cao dang">Cao Đẳng</option>
                                    <option value="dai hoc">Đại Học</option>
                                    <option value="cao hoc">Cao Học</option>
                                </select>
                            </div>
                            <div class="fm-opt">
                                <label for="fm-state">Kết Nạp Đoàn</label>
                                <span>
                                    <select id="knd" name="ketnapdoan">
                                        <option value="true">Rồi</option>
                                        <option value="false">Chưa</option>
                                    </select>
                                    Ngày Kết Nạp
                                    <select name="ngayvaodoan" id="nvd">
                                        <c:forEach var="i" begin="1" end="31">
                                            <option value="<c:out value="${i}"></c:out>"><c:out value="${i}"></c:out></option>
                                        </c:forEach>
                                    </select>
                                    <select name="thangvaodoan" id="tvd">
                                        <c:forEach var="j" begin="1" end="12">
                                            <option value="<c:out value="${j}"></c:out>"><c:out value="${j}"></c:out></option>
                                        </c:forEach>
                                    </select>
                                    <select name="namvaodoan" id="navd">
                                        <c:forEach var="x" begin="1988" end="2010">
                                            <option value="<c:out value="${x}"></c:out>"><c:out value="${x}"></c:out></option>
                                        </c:forEach>
                                    </select>
                                </span>
                            </div>
                            <div class="fm-opt">
                                <label for="fm-state">Kết Nạp Đảng</label>
                                <span>
                                    <select name="ketnapdang" id="knd1">
                                        <option value="true">Rồi</option>
                                        <option value="false">Chưa</option>
                                    </select>
                                    Ngày Kết Nạp
                                    <select name="ngayvaodang" id="nvd1">
                                        <c:forEach var="i" begin="1" end="31">
                                            <option value="<c:out value="${i}"></c:out>"><c:out value="${i}"></c:out></option>
                                        </c:forEach>
                                    </select>
                                    <select name="thangvaodang" id="tvd1">
                                        <c:forEach var="j" begin="1" end="12">
                                            <option value="<c:out value="${j}"></c:out>"><c:out value="${j}"></c:out></option>
                                        </c:forEach>
                                    </select>
                                    <select name="namvaodang" id="navd1">
                                        <c:forEach var="x" begin="1988" end="2010">
                                            <option value="<c:out value="${x}"></c:out>"><c:out value="${x}"></c:out></option>
                                        </c:forEach>
                                    </select>
                                </span>
                            </div>

                        </fieldset>

                        <fieldset>
                            <legend>Địa chỉ thường trú </legend>
                            <div class="fm-opt">
                                <label>Quê quán</label>
                                <input name="quequan" type="text" />
                            </div>
                            <div class="fm-opt">
                                <label>Chỗ ở hiện tại</label>
                                <input name="choohientai" type="text" />
                            </div>
                            <div class="fm-opt">
                                <label for="fm-state">Tỉnh/Thành Phố</label>
                                <select id="tinh" name="tinh">
                                    <option value="Binh Duong">Bình Dương</option>
                                    <option value="Dong Nai">Đồng Nai</option>
                                    <option value="Lam Dong">Lâm Đồng</option>
                                </select>
                            </div>
                        </fieldset>
                        <fieldset>
                            <legend>Thông Tin Khác</legend>
                            <div class="fm-req">
                                <label>Số Điện Thoại:</label>
                                <input name="sodienthoai" type="text" title="Enter Phone Number in xxx-xxx-xxxx format" />
                            </div>
                            <div class="fm-req">
                                <label>Email:</label>
                                <input id="email" name="email" type="text" tabindex="" />
                            </div>
                            <div class="fm-req">
                                <label>Chức vụ</label>
                                <input name="chucvu" type="text" tabindex="" />
                            </div>
                            <div class="fm-req">
                                <label>Tôn Giáo</label>
                                <input name="tongiao" type="text" tabindex="" />
                            </div>
                            <div class="fm-opt">
                                <label for="fm-state">Dân Tộc</label>
                                <select name="id_dantoc">
                                    <c:forEach var="item" items="${dsdantoc}">
                                        <option value="${item.id}">${item.tenDanToc}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="fm-opt">
                                <label for="fm-state">Tổ Bộ Môn</label>
                                <select name="id_tobomon">
                                    <c:forEach var="item" items="${dstobomon}">
                                        <option value="${item.id}">${item.tenBoMon}</option>
                                    </c:forEach>
                                </select>
                            </div>

                        </fieldset>

                        <div id="fm-submit" class="fm-req">
                            <input name="submit" value="Lưu" type="submit" id="sm"/>
                            <input name="submit" value="Hủy" onclick="Back(1)" type="button"/>
                        </div>
                    </form>
                </div>
                <div class="cleared"></div>
            </div>

            <div class="cleared"></div>
        </div>
    </div>

</div>
