<%-- 
    Document   : Find
    Created on : Jan 25, 2018, 4:09:26 PM
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

        <jsp:useBean id="contact" scope="request" class="com.Beans.AddressAndContactBean"/>

        <div id="all-content">
            <jsp:include page="header.jsp"/>

            <div class="content">
                <div class="body-content">
                    <h3>Find Maria's Cafe</h3>
                    <div class="find-infor">
                        <div class="col">
                            <h4>Adress and contact:</h4>
                            <p>${contact.addressAndContacts.get(0).address}</p>
                            <p><br></p>
                            <p>Phone: ${contact.addressAndContacts.get(0).phone}</p>
                            <p>Email: ${contact.addressAndContacts.get(0).email}</p>
                        </div>
                        <div class="col">
                            <h4>Adress and contact:</h4>
                            <p>Phone: ${contact.addressAndContacts.get(0).phone}</p>
                            <p>Email: ${contact.addressAndContacts.get(0).email}</p>
                            <p>Phone: ${contact.addressAndContacts.get(0).phone}</p>
                            <p>Email: ${contact.addressAndContacts.get(0).email}</p>
                        </div>
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
