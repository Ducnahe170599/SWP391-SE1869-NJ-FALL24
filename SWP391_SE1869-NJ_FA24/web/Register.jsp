<%-- 
    Document   : Register
    Created on : Sep 18, 2024, 9:45:21 PM
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
        <h2>Form Đăng ký</h2>
    <form action="register" method="post">
        <label for="gmail">Gmail:</label>
        <input type="email" id="gmail" name="gmail" required><br>

        <label for="password">Mật khẩu:</label>
        <input type="password" id="password" name="password" required><br>

        <label for="role">Vai trò:</label>
        <select id="role" name="role" required>
            <option value="1">Khách hàng</option>
            <option value="2">Nhân viên</option>
        </select><br>

        <input type="submit" value="Đăng ký">
    </form>

    <p>Bạn đã có tài khoản? <a href="Login.jsp">Đăng nhập</a></p>
    </body>
</html>
