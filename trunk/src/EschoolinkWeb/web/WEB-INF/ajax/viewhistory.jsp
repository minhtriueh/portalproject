<%-- 
    Document   : viewhistory
    Created on : 06-09-2010, 21:07:24
    Author     : sanchikaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach items="${list}" var="item">
             <div class="messageItem">
                <div class="line">Name : ${item.hoVaTen}</div>
                <div class="line">Code : ${item.MSSV}</div>
                <div class="line">Date time : ${item.time}</div>
                <div class="line">Message:</div>
                <div class="line">
                    <span class="mess">
                        ${item.message}
                    </span>
                </div>
                <div class="line">Process:</div>
                <div class="line">
                    <table class="myTable">
                        <thead>
                        <tr>
                            <td>Nơi xử lý</td>
                            <td width="100" >Trạng thái</td>
                            <td>Ghi chú</td>
                            
                        </tr>
                        </thead>

                        <tbody>
                            <c:forEach items="${item.historyProcessItem}" var="hisItem">
                                <tr>
                                <td>
                                    <c:if test="${hisItem.place == 'Secretary'}">
                                        Văn phòng đoàn
                                    </c:if>
                                    <c:if test="${hisItem.place == 'Manager'}">
                                        Phòng giáo vụ
                                    </c:if>
                                    <c:if test="${hisItem.place == 'Teacher'}">
                                        Trưởng khoa
                                    </c:if>
                                </td>
                                <td align="center">
                                    <c:if test="${hisItem.state == 'wait'}">
                                        <img width="20" src="images/loading4.gif" />
                                    </c:if>
                                    <c:if test="${hisItem.state == 'forward'}">
                                        Chuyển
                                    </c:if>
                                    <c:if test="${hisItem.state == 'feedback'}">
                                        Trả lời
                                    </c:if>
                                </td>
                                <td align="center">${hisItem.note}</td>
                                
                                </tr>
                            </c:forEach>


                        </tbody>
                    </table>
                </div>
            </div>
        </c:forEach>
