<%-- 
    Document   : AboutListProduct
    Created on : Jan 24, 2018, 8:50:11 PM
    Author     : tanlu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All of Cakes</title>
    </head>
    <body>

        <jsp:useBean id="splitPageBean" scope="request" class="com.Beans.SplitPageBean"/>
        <jsp:setProperty name="splitPageBean" property="page" param="page"/>
        
        <div id="all-content">
            <jsp:include page="header.jsp"/>

            <div class="content">
                <div class="body-content">
                    <t:forEach var="cake" items="${splitPageBean.cakes}">
                        <t:url value="About.jsp" var="detailCake">
                            <t:param name="cakeID" value="${cake.cakeID}"/>
                        </t:url>
                        <div class="items">
                            <img src="${cake.imagePath}" alt="${cake.title}" class="image-intro">
                            <div class="item-about">
                                <h4><a href="${detailCake}">${cake.title}</a></h4>
                                <div class="intro-para">
                                    <p>${cake.content}</p>
                                    <p>${cake.price}</p>
                                </div>
                            </div>
                        </div>
                    </t:forEach>

                    <div id="page-number">
                        <t:forEach var="number" begin="1" end="${splitPageBean.totalPages}">
                            <t:url var="link" value="AboutListProduct.jsp">
                                <t:param name="page" value="${number}"/>
                            </t:url>
                            <a href="${link}" class="link">${number}</a>
                        </t:forEach>
                    </div>
                    
                </div>
                <jsp:include page="share-page.jsp"/>
            </div>
            <div class="footer">
                <a href="#">Created with Simplesite</a>
            </div>
        </div>
    </body>
    <script type="text/javascript">disableCurrentSplitPage();</script>
</html>
