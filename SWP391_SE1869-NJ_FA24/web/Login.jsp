<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
</head>
<body>
    <h2>Apartment Management Login</h2>
    <form action="login" method="post">
        <table>
            <tr>
                <td>Email:</td>
                <td><input type="email" size="25" name="email" required></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" size="25" name="password" required></td>
            </tr>
            <tr style="text-align: center">
                <td colspan="2"><input type="submit" value="Login"></td>
            </tr>
        </table>
    </form>
    <p style="color: red;"><%= request.getAttribute("error") %></p>
</body>
</html>