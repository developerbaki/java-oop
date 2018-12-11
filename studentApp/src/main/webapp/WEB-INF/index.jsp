<%-- 
    Document   : index
    Created on : Dec 10, 2018, 6:18:41 PM
    Author     : baki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>studentApp</title>
    </head>
    <body>
        <jsp:forward page="/StudentServlet.do?action=listStudent"></jsp:forward>
    </body>
</html>
