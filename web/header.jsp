<%-- 
    Document   : header
    Created on : Mar 3, 2018, 9:09:36 PM
    Author     : tanlu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Header</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/mycss.css" rel="stylesheet">
        <script src="script/myscript.js"></script>

    </head>

    <body>
        <div class="container">
            <div class="title-container">
                <div class="title">Maria Bagnarelli's Cafe</div>
                <div class="subtitle">Welcome to my website</div>
            </div>

        </div>
        <div id="nav-bar">
            <a href="Home.jsp" id="home">Home</a>
            <a href="AboutListProduct.jsp" id="about">About my Cakes</a>
            <a href="Find.jsp" id="find">Find Maria's Cafe</a>
        </div>
    </body>

    <script type="text/javascript">
        decorateNavBar();
    </script>

</html>
