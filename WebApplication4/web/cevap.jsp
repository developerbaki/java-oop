<%-- 
    Document   : cevap
    Created on : Nov 22, 2018, 2:08:44 PM
    Author     : baki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:useBean id="ilkCekirdek" scope="session" class="veri.Kisi" />
        <jsp:setProperty name="ilkCekirdek" property="isim" />
        Merhaba
        <jsp:getProperty name="ilkCekirdek" property="isim" />
        Siteme Hos Geldin
    </body>
</html>
