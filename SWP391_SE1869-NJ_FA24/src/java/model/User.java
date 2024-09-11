/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dal.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ktleg
 */
public class User {
    private String username, password;
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
    
    public User() {
        connect();
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        connect();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkUser() {
        try {
            String sql = "select * from Users where Username=? and Password=?";
            pstm = cnn.prepareStatement(sql);
            pstm.setString(1, username);
            pstm.setString(2, password);
            rs = pstm.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (Exception e) {
            System.out.println("checkUser: " + e.getMessage());
        }
        return false;
    }
}
