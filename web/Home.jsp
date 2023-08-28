<%-- 
    Document   : Home
    Created on : Jan 15, 2018, 4:16:46 PM
    Author     : tanlu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Maria Cafe - Home</title>
    </head>
    <body>
        <jsp:useBean id="cakesBean" scope="request" class="com.Beans.CakesBean"/>
        <jsp:useBean id="openingHourBean" scope="request" class="com.Beans.OpeningHoursBean"/>
        <jsp:useBean id="selfDescriptionBean" scope="request" class="com.Beans.SelfDescriptionBean"/>
        <jsp:useBean id="addressAndContactBean" scope="request" class="com.Beans.AddressAndContactBean"/>

        <div id="all-content">
            <jsp:include page="header.jsp"/>
            <div class="content">
                <div class="body-content">
                    <div class="self-description">
                        <div class="bound-self-image">
                            <img alt="${selfDescriptionBean.selfDescriptions.title}" src="${selfDescriptionBean.selfDescriptions.imagePath}" class="self-image" />
                        </div>
                        <div class="self-description-content">
                            <div class="self-description-title">${selfDescriptionBean.selfDescriptions.title}</div>
                            <p>${selfDescriptionBean.selfDescriptions.content}</p>
                        </div>
                    </div>
                    <div class="items">
                        <t:forEach var="cake" items="${cakesBean.top2Cakes}">
                            <div class="cake">
                                <div>
                                    <img alt="${cake.title}" src="${cake.imagePath}" class="image" />
                                </div>
                                <div class="item-content">
                                    <h4>${cake.title}</h4>
                                    <p>${cake.content}</p>
                                </div>
                            </div>
                        </t:forEach>
                    </div>

                    <div class="visit-invite">
                        <h4>Visit my Cafe</h4>
                        <p>${addressAndContactBean.addressAndContacts.get(0).description}</p>
                        <p>${addressAndContactBean.addressAndContacts.get(0).address}</p>
                        <p>Phone: ${addressAndContactBean.addressAndContacts.get(0).phone}</p>
                    </div>

                    <div class="sign-box">
                        Kind regards
                        <div class="sign">
                            <i>${selfDescriptionBean.selfDescriptions.sign}</i>
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
