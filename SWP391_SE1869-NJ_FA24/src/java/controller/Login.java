package controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.DangNhap;

@WebServlet(name = "Login", urlPatterns = {"/login"})
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        HttpSession session = request.getSession(false)
        if (session != null) {
            session.invalidate(); // Đăng xuất người dùng nếu có phiên hoạt động
        }
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        DangNhap dangNhap = new DangNhap(email, password, 0); // Vai trò không cần thiết trong trường hợp này
        boolean isLoggedIn = dangNhap.checkUser();

        if (isLoggedIn) {
            HttpSession session = request.getSession();
            session.setAttribute("email", email);
            session.setAttribute("role", dangNhap.getRoleByEmail()); // Lấy vai trò từ cơ sở dữ liệu

            if (dangNhap.getRoleByEmail() == 1) {
                response.sendRedirect("customerHome.jsp"); // Chuyển hướng đến trang của khách hàng
            } else if (dangNhap.getRoleByEmail() == 2) {
                response.sendRedirect("employeeHome.jsp"); // Chuyển hướng đến trang của nhân viên
            }
        } else {
            request.setAttribute("error", "Đăng nhập thất bại. Vui lòng kiểm tra lại thông tin.");
            request.getRequestDispatcher("login.jsp").forward(request, response); // Hiển thị lỗi trên trang đăng nhập
        }
    }

    @Override
    public String getServletInfo() {
        return "Servlet để xử lý đăng nhập người dùng bằng email và mật khẩu.";
    }
}