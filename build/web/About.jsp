<%-- 
    Document   : About
    Created on : Jan 17, 2018, 5:40:45 PM
    Author     : tanlu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
        <jsp:useBean id="cakesBean" scope="request" class="com.Beans.CakesBean"/>
        <jsp:setProperty name="cakesBean" property="cakeID" param="cakeID"/>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${cakesBean.speciCake.title}</title>
        <link rel="stylesheet" href="css/mycss.css">
    </head>
    <body>

        <div id="all-content">
            <jsp:include page="header.jsp"/>

            <div class="content">
                <div class="body-content">
                    <h3>${cakesBean.speciCake.title}</h3>
                    <div class="content-about">
                        <img alt="${cakesBean.speciCake.title}" src="${cakesBean.speciCake.imagePath}" class="image image-about">
                        <p style="margin-right: 10px;">${cakesBean.speciCake.content}</p>
                        <br>
                        <p class="price">Price: <strong>${cakesBean.speciCake.price}$</strong></p>
                    </div>

                </div>
                <jsp:include page="share-page.jsp"/>
            </div>
            <div class="footer">
                <a href="#">Created with Simplesite</a>
            </div>
        </div>
    </body>
</html>
