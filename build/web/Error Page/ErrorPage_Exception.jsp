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
    <body style="background-image: url('image/blur-redblack.jpg'); 
          background-position: center;
          background-repeat: no-repeat;
          background-attachment: fixed;">

        <div id="all-content">
            <jsp:include page="header.html"/>

            <div class="content">
                <div class="body-content">
                    <h3>Something went wrong :(</h3>
                    <p>Please try again later or tell me what happened by <a href="mailto:tanluutrong2206@gmail.com">send</a> me an email</p>
                   
                </div>
                <jsp:include page="share-page.jsp"/>
            </div>
            <div class="footer">
                <a href="#">Created with Simplesite</a>
            </div>
        </div>
    </body>
</html>
