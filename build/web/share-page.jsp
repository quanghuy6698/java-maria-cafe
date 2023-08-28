<%-- 
    Document   : share-page
    Created on : Jan 24, 2018, 8:30:24 PM
    Author     : tanlu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
        <jsp:useBean id="sharePageBean" scope="request" class="com.Beans.SharePageBean"/>
        <div class="share-content">
            <div class="side-bar">
                <div class="share-box">
                    <div class="heading">
                        <h4>Share this page</h4>
                    </div>
                    <div>
                        <ul id="share-host">
                            <t:forEach var="sharePage" items="${sharePageBean.sharePages}">
                                <li><a href="${sharePage.link}">Share on ${sharePage.host}</a></li>
                            </t:forEach>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
