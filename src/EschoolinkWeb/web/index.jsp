<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="m" value="${param.module}"></c:set>
<c:set var="p" value="${param.page}.jsp"></c:set>
<c:set value="${param.l}" var="left"></c:set>
<c:set value="${param.r}" var="right"></c:set>
<html>
<head>
    <title>Eschoolink</title>
    <link rel="stylesheet" href="style.css" type="text/css" media="screen" />
    <!--[if IE 6]><link rel="stylesheet" href="style.ie6.css" type="text/css" media="screen" /><![endif]-->
    <!--[if IE 7]><link rel="stylesheet" href="style.ie7.css" type="text/css" media="screen" /><![endif]-->
    <script type="text/javascript" src="script.js"></script>
    <!--css form -->
    <link rel="stylesheet" href="Demo/form/cssform.css" type="text/css" media="screen" />
    <!--
    <script type="text/javascript" src="Demo/form/cssform.js"></script> -->

    <!--css table -->
    <link rel="stylesheet" href="StyleTable.css" type="text/css" media="screen" />

    <!--script thu vien mootools -->
    <script type="text/javascript" src="mootools.js"></script>
    <script type="text/javascript" src="myscript.js"></script>
</head>
<body>
<div id="art-page-background-glare">
        <div id="art-page-background-glare-image"></div>
    </div>
    <div id="art-main">
        <div class="art-sheet">
            <div class="art-sheet-tl"></div>
            <div class="art-sheet-tr"></div>
            <div class="art-sheet-bl"></div>
            <div class="art-sheet-br"></div>
            <div class="art-sheet-tc"></div>
            <div class="art-sheet-bc"></div>
            <div class="art-sheet-cl"></div>
            <div class="art-sheet-cr"></div>
            <div class="art-sheet-cc"></div>
            <div class="art-sheet-body">
                <c:import url="include/header.jsp"></c:import>
                <div class="art-content-layout">
                    <div class="art-content-layout-row">
                        <!--neu khong co gia param l thi include cot left mac dinh-->
                        <c:if test="${empty left}">
                            <c:import url="include/left.jsp"></c:import>
                        </c:if>
                        <!--neu khong co param l khac 'no' thi include cot trang left khac-->
                        <c:if  test="${not empty left} && ${left != 'no'}  ">
                            <c:import url="include/${left}.jsp"></c:import>
                        </c:if>
                        <!--neu khong co gia param module thi include content.jsp-->
                        <c:if test="${empty m}">
                            <c:import url="include/content.jsp"></c:import>
                        </c:if>
                        <c:if test="${not empty m}">
                            <c:import url="WEB-INF/${m}/${p}"></c:import>                                                     
                        </c:if>
                        <!--neu khong co gia param r thi include cot right mac dinh-->
                        <c:if test="${empty right}">
                            <c:import url="include/right.jsp"></c:import>
                        </c:if>
                        <!--neu co gia param r khac 'no' thi include cot right khac-->
                        <c:if test="${not empty right} && ${right != 'no'} ">
                            <c:import url="include/${right}.jsp"></c:import>
                        </c:if>
                    </div>
                </div>
                <div class="cleared"></div>
                <c:import url="include/footer.jsp"></c:import>
        		<div class="cleared"></div>
            </div>
        </div>
        <div class="cleared"></div>
        <c:import url="include/copyright.jsp"></c:import>
    </div>

</body>
</html>
