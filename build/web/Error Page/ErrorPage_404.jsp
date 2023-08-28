<%-- 
    Document   : ErrorPage
    Created on : Jan 22, 2018, 9:01:26 AM
    Author     : tanlu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page not found</title>
    </head>
    <body style="background-image: url('image/blur-redblack.jpg'); 
          background-position: center;
          background-repeat: no-repeat;
          background-attachment: fixed;">

        <jsp:useBean id="contact" scope="request" class="com.Models.AddressAndContactBean"/>

        <div id="all-content">
            <jsp:include page="header.html"/>

            <div class="content">
                <div class="body-content">
                    <h3>Page can not found :(</h3>
                    <p>Make sure you've got the right web address: <strong id="href"></strong></p>
                   
                </div>
                <jsp:include page="share-page.jsp"/>
            </div>
            <div class="footer">
                <a href="#">Created with Simplesite</a>
            </div>
        </div>
    </body>
    <script>
        document.getElementById('href').innerHTML = window.location.href;
            </script>
</html>
