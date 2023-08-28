<%-- 
    Document   : ErrorPage_Exception
    Created on : Jan 28, 2018, 11:03:31 PM
    Author     : tanlu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Something went wrong</title>
    </head>
    <body>

        <div id="all-content">
            <jsp:include page="header.jsp"/>

            <div class="content">
                <div class="body-content">
                    <h3>Something went wrong :(</h3>
                    <p>Please try again later or tell me what happened by <a href="mailto:tanluutrong2206@gmail.com" style="text-decoration: underline; padding: 0; margin: 0">send</a> me an email</p>
                </div>
            </div>
            <div class="footer">
                <a href="#">Created with Simplesite</a>
            </div>
        </div>
    </body>
</html>
