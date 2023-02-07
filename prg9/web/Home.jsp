<%-- 
    Document   : Home
    Created on : 17 Jan, 2023, 2:16:45 PM
    Author     : mcacnj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" autoFlush="true" language="java" import="java.util.Date" info="Student Information" session="true" isErrorPage="true" errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="login.jsp">
            <table>
                <tr>
                    <td>Enter Name:</td>
                    <td><input type="name" name="user"/></td>
                </tr>
                <tr>
                    <td>Enter Your Password:</td>
                    <td><input type="password" name="pass"/></td>
                </tr>
                <tr>
                   
                    <td><input type="submit" name="submit" value="login"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
