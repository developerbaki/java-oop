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
        <jsp:useBean id="kisi" scope="session" class="veri.Kisi" />
        <jsp:setProperty name="kisi" property="isim" />
        <jsp:setProperty name="kisi" property="sifre" />

        <!--JSP IF implementation.-->
        <%
            if ((kisi.isim != null) && (kisi.sifre != null))
                if (kisi.sifreKontrol()) {

        %>
        <p>Welcome, <%=kisi.isim%></p>
        <%
            kisi.KullanıcıListesi();
        } else {

        %> 
        <p style="color:red;">Bilgiler Yanlış</p>
        <a href="http://localhost:8080/WebApplication4/">Tekrar Deneyiniz</a>
        <%                }
        %>


    </body>
</html>
