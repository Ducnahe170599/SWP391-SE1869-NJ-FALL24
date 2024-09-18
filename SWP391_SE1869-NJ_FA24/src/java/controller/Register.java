package controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DangNhap;

@WebServlet(name = "Register", urlPatterns = {"/register"})
public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        // Lấy dữ liệu từ form đăng ký
        String gmail = request.getParameter("gmail");
        String password = request.getParameter("password");
        int role = Integer.parseInt(request.getParameter("role"));

        // Tạo đối tượng DangNhap và thực hiện đăng ký
        DangNhap dangNhap = new DangNhap(gmail, password, role);
        boolean isRegistered = dangNhap.register();

        if (isRegistered) {
            // Đăng ký thành công, chuyển hướng đến trang đăng nhập
            response.sendRedirect("Login.jsp");
        } else {
            // Đăng ký thất bại, hiển thị thông báo lỗi
            request.setAttribute("error", "Đăng ký thất bại. Vui lòng thử lại.");
            request.getRequestDispatcher("Register.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        // Chuyển hướng đến trang đăng ký khi gửi yêu cầu GET
        request.getRequestDispatcher("Register.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Servlet để xử lý đăng ký người dùng.";
    }
}