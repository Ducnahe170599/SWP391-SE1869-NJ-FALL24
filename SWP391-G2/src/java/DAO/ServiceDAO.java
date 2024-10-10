/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import model.Service;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguye
 */
public class ServiceDAO extends DBContext {

    public List<Service> getAllServices() {
        List<Service> services = new ArrayList<>();
        String query = "SELECT * FROM Service";
        try (Connection conn = this.connection; Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Service service = new Service(rs.getInt("ServiceID"),
                        rs.getString("Name"),
                        rs.getString("Type"),
                        rs.getDouble("Fee"),
                        rs.getString("Description"),
                        rs.getString("Img"),
                        rs.getString("Icon"));
                services.add(service);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi lấy danh sách dịch vụ: " + e.getMessage());
        }
        return services;
    }

    public void addService(Service service) {
        String query = "INSERT INTO Service(Name, Type, Fee, Description, Img, Icon) VALUES(?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setString(1, service.getName());
            ps.setString(2, service.getType());
            ps.setDouble(3, service.getFee());
            ps.setString(4, service.getDescription());
            ps.setString(5, service.getImg());
            ps.setString(6, service.getIcon());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Lỗi khi thêm dịch vụ: " + e.getMessage());
        }
    }

    public void updateService(Service service) {
        String query = "UPDATE Service SET Name=?, Type=?, Fee=?, Description=?, Img=?, Icon=? WHERE ServiceID=?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setString(1, service.getName());
            ps.setString(2, service.getType());
            ps.setDouble(3, service.getFee());
            ps.setString(4, service.getDescription());
            ps.setString(5, service.getImg());
            ps.setString(6, service.getIcon());
            ps.setInt(7, service.getServiceId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Lỗi khi cập nhật dịch vụ: " + e.getMessage());
        }
    }

    public void deleteService(int serviceID) {
        String query = "DELETE FROM Service WHERE ServiceID=?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, serviceID);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Lỗi khi xóa dịch vụ: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ServiceDAO serviceDAO = new ServiceDAO();

        // Thêm một vài dịch vụ mới để kiểm tra
//        Service service1 = new Service("Điện", "Utility", 100000.00, "Dịch vụ điện cho căn hộ", "img1.jpg", "icon1.png");
//        Service service2 = new Service("Nước", "Utility", 50000.00, "Dịch vụ nước cho căn hộ", "img2.jpg", "icon2.png");
//
//        serviceDAO.addService(service1);
//        serviceDAO.addService(service2);

        // Hiển thị danh sách tất cả các dịch vụ
        List<Service> services = serviceDAO.getAllServices();
        System.out.println("Danh sách dịch vụ:");
        for (Service service : services) {
            System.out.println(service);
        }
    }
}
