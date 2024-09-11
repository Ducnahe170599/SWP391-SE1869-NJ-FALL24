<%-- 
    Document   : Login
    Created on : Sep 11, 2024, 9:39:21 AM
    Author     : ktleg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="login" method="post">
            <h4 style="border-bottom: 1px;">Apartment Management Login</h4>
            <table>
                <tr>
                    <td>Username: </td>
                    <td><input type="text" size="25" name="username"></td>
                </tr>
                <br>
                <tr>
                    <td>Password: </td>
                    <td><input type="password" size="25" name="password"></td>
                </tr>
                <tr style="text-align: center">
                    <td><input type="submit" value="Login"></td>
                </tr>
            </table>
        </form>
        <p>${error}</p>
    </body>
</html>
