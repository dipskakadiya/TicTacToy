<%-- 
    Document   : result
    Created on : Apr 16, 2013, 4:20:41 AM
    Author     : sai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><% if(request.getAttribute("result")!=null){
            out.print(request.getAttribute("result"));
        }else{%>Game Continue<%}%></h1>
    </body>
</html>
