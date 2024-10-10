/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {

    protected Connection connection;

    public DBContext() {
        try {
            // Edit URL , username, password to authenticate with your MS SQL Server
            String url = "jdbc:sqlserver://localhost:1433;databaseName=apartment;encrypt=false;";
            String username = "sa";
            String password = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        // Tạo đối tượng DBContext để kết nối với cơ sở dữ liệu
        DBContext dbContext = new DBContext();

        // Kiểm tra xem kết nối có thành công hay không
        if (dbContext.connection != null) {
            System.out.println("Kết nối thành công!");
        } else {
            System.out.println("Kết nối thất bại!");
        }

        // Thực hiện câu lệnh truy vấn đơn giản để kiểm tra kết nối
        try {
            if (dbContext.connection != null && !dbContext.connection.isClosed()) {
                System.out.println("Kết nối đang hoạt động.");

                // Đóng kết nối sau khi hoàn tất
                dbContext.connection.close();
                System.out.println("Đã đóng kết nối.");
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi kiểm tra hoặc đóng kết nối: " + e.getMessage());
        }

    }
}
