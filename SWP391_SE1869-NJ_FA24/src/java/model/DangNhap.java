/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dal.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ktleg
 */
public class DangNhap {
    private String gmail, password;
    private int role;
     Connection cnn;
    Statement stm;//thực thi câu lệnh sql
    PreparedStatement pstm;//thực thi sql
    ResultSet rs; //lưu trữ và xử lý dữ liệu
    private void connect() {
        try{
         cnn = (new DBContext()).connection;
         if(cnn!=null){
             System.out.println("Connect success");
         }else{
             System.out.println("Connect fail");
         }
        }catch(Exception e){
            
        }
    }
    
    public DangNhap() {
        connect();
    }

    public DangNhap(String gmail, String password, int role) {
        this.gmail = gmail;
        this.password = password;
        this.role = role;
        connect();
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    // Phương thức để thực hiện chức năng đăng ký
    public boolean register() {
        String sql = "INSERT INTO Dangnhap (Gmail, Password, Role) VALUES (?, ?, ?)";
        try {
            pstm = cnn.prepareStatement(sql);
            pstm.setString(1, this.gmail);
            pstm.setString(2, this.password);
            pstm.setInt(3, this.role);

            int rowsInserted = pstm.executeUpdate(); // Thực thi câu lệnh SQL
            return rowsInserted > 0; // Nếu thêm thành công, trả về true

        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Nếu có lỗi, trả về false
        } finally {
            try {
                if (pstm != null) pstm.close();
                if (cnn != null) cnn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    // Phương thức để thực hiện chức năng đăng nhập
    public boolean login() {
        String sql = "SELECT * FROM Dangnhap WHERE Gmail = ? AND Password = ?";
        try {
            pstm = cnn.prepareStatement(sql);
            pstm.setString(1, this.gmail);
            pstm.setString(2, this.password);

            rs = pstm.executeQuery(); // Thực thi câu lệnh SQL và nhận kết quả

            // Nếu có ít nhất một bản ghi, đăng nhập thành công
            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Nếu có lỗi, trả về false
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (cnn != null) cnn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public boolean checkUser() {
        try {
            String sql = "SELECT * FROM Dangnhap WHERE Gmail = ? AND Password = ?";
            PreparedStatement pstm = cnn.prepareStatement(sql);
            pstm.setString(1, gmail);
            pstm.setString(2, password);
            ResultSet rs = pstm.executeQuery();

            return rs.next(); // Trả về true nếu có kết quả, tức là đăng nhập thành công
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public int getRoleByEmail() {
        try {
            String sql = "SELECT Role FROM Dangnhap WHERE Gmail = ?";
            PreparedStatement pstm = cnn.prepareStatement(sql);
            pstm.setString(1, gmail);
            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                return rs.getInt("Role");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0; // Trả về 0 nếu không tìm thấy vai trò
    }
}
