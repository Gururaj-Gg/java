<%-- 
    Document   : login
    Created on : 17 Jan, 2023, 2:30:02 PM
    Author     : mcacnj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String user="admin";
           String password="vcet123";
           String name=(request.getParameter("user")).trim();
           String pass=(request.getParameter("pass")).trim();
           if(name.equals(user)&&pass.equals(password))
           {
               %>
               <h1><center>welcome to main page
                       <p>user successfully loged in..</p>
                       <form action="direct.jsp">
                           <input type="submit" value="Get Error">
                       </form>
                       <p><a href="Home.jsp">Back</a></p></center></h1>
               <% }
else
{
%>
<h1><b><i>Invalid user</i></b></h1>
<%
           }
        %>
    </body>
</html>
