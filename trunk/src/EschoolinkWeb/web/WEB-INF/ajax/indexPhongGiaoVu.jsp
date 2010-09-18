<%--
    Document   : indexDoanKhoa
    Created on : 07-09-2010, 13:10:34
    Author     : sanchikaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach items="${list}" var="item">
                <div class="item">
                <div class="line">
                    Tên sinh viên: ${item.message.hoVaTen} - ${item.message.MSSV}
                </div>
                <div class="line">
                    <blockquote>
                        <p>
                            ${item.message.message}
                        </p>
                    </blockquote>
                </div>
                <div class="line"> </div>
                <div class="line">
                    Trả lời:
                </div>
                <div class="line">
                    <textarea class="textarea" name="noiDung" value="" ></textarea>
                </div>
                <div class="line">
                    <input class="bt" alt="${item.message.id} ${item.id}" type="button" value="Chuyển tiếp">
                    <input class="bt" alt="${item.message.id} ${item.id}" type="button" value="Trả lời">
                </div>
                </div>
            </c:forEach>
<script>
    window.addEvent('domready', function(){

         processMessage('manager');

    });
</script>
