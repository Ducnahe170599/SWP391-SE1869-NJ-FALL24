/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nguye
 */
public class Users {

    private int userId;
    private String username;
    private boolean gender;
    private String dateOfBirth;
    private String phoneNumber;
    private String address;
    private String email;
    private String password;
    private int roleId;
    private int residentId;
    private int staffId;

    // Constructor
    public Users(int userId, String username, boolean gender, String dateOfBirth, String phoneNumber, String address, String email, String password, int roleId, int residentId, int staffId) {
        this.userId = userId;
        this.username = username;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.password = password;
        this.roleId = roleId;
        this.residentId = residentId;
        this.staffId = staffId;
    }

    // Getters and Setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getResidentId() {
        return residentId;
    }

    public void setResidentId(int residentId) {
        this.residentId = residentId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }   

    @Override
    public String toString() {
        return "Users{" + "userId=" + userId + ", username=" + username + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", phoneNumber=" + phoneNumber + ", address=" + address + ", email=" + email + ", password=" + password + ", roleId=" + roleId + ", residentId=" + residentId + ", staffId=" + staffId + '}';
    }
}
