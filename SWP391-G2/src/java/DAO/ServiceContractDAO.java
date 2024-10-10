/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Service;
import model.ServiceContract;

public class ServiceContractDAO extends DBContext {

    public List<ServiceContract> getAllServiceContracts() {
        List<ServiceContract> contracts = new ArrayList<>();
        String query = "SELECT * FROM ServiceContract";
        try (Connection conn = this.connection; Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                ServiceContract contract = new ServiceContract(
                        rs.getInt("ServiceContractID"),
                        rs.getInt("ApartmentID"),
                        rs.getInt("ServiceID"),
                        rs.getString("StartDate"), // Lấy ngày dưới dạng String
                        rs.getString("EndDate"), // Lấy ngày dưới dạng String
                        rs.getDouble("Amount")
                );
                contracts.add(contract);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi lấy danh sách hợp đồng: " + e.getMessage());
        }
        return contracts;
    }

    public void addServiceContract(ServiceContract contract) {
        String query = "INSERT INTO ServiceContract(ApartmentID, ServiceID, StartDate, EndDate, Amount) VALUES(?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, contract.getApartmentId());
            ps.setInt(2, contract.getServiceId());
            ps.setString(3, contract.getStartDate());  // Lưu ngày dưới dạng String
            ps.setString(4, contract.getEndDate());    // Lưu ngày dưới dạng String
            ps.setDouble(5, contract.getAmount());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Lỗi khi thêm hợp đồng: " + e.getMessage());
        }
    }

    public void updateServiceContract(ServiceContract contract) {
        String query = "UPDATE ServiceContract SET ApartmentID=?, ServiceID=?, StartDate=?, EndDate=?, Amount=? WHERE ServiceContractID=?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setInt(1, contract.getApartmentId());
            ps.setInt(2, contract.getServiceId());
            ps.setString(3, contract.getStartDate());  // Lưu ngày dưới dạng String
            ps.setString(4, contract.getEndDate());
            ps.setDouble(5, contract.getAmount());
            ps.setInt(6, contract.getServiceContractId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Lỗi khi cập nhật hợp đồng: " + e.getMessage());
        }
    }

    public void deleteServiceContract(int contractID) {
        String query = "DELETE FROM ServiceContract WHERE ServiceContractID=?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, contractID);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Lỗi khi xóa hợp đồng: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ServiceContractDAO serviceContractDAO = new ServiceContractDAO();

//         ServiceContract contract1 = new ServiceContract(1, 1, "2024-01-01", "2024-12-31", 1000000.00);
//        ServiceContract contract2 = new ServiceContract(2, 2, "2024-05-01", "2024-11-30", 2000000.00);
//
//        serviceContractDAO.addServiceContract(contract1);
//        serviceContractDAO.addServiceContract(contract2);
        List<ServiceContract> contracts = serviceContractDAO.getAllServiceContracts();
        System.out.println("Danh sách hợp đồng dịch vụ:");
        for (ServiceContract contract : contracts) {
            System.out.println(contract);

            // update và delete
//            ServiceContract updatedContract = new ServiceContract(
//                    1, // Mã căn hộ (ApartmentID)
//                    1, // Mã dịch vụ (ServiceID)
//                    "2024-01-01", // Ngày bắt đầu (StartDate)
//                    "2024-12-31", // Ngày kết thúc (EndDate)
//                    500000.00 // Số tiền (Amount)
//            );
//
//            
//            updatedContract.setServiceContractId(1);  // id = 1
//
//            // update
//            System.out.println("Cập nhật hợp đồng với ID = 1");
//            serviceContractDAO.updateServiceContract(updatedContract);
//            System.out.println("Hợp đồng đã được cập nhật thành công!");
//
//            //xoa
//            int contractIDToDelete = 2;  // Giả sử ServiceContractID = 2 cần xóa
//            System.out.println("Xóa hợp đồng với ID = " + contractIDToDelete);
//            serviceContractDAO.deleteServiceContract(contractIDToDelete);
//            System.out.println("Hợp đồng đã được xóa thành công!");

        }
    }
}
