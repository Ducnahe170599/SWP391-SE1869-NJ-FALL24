/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nguye
 */
public class Apartments {

    private int apartmentId;
    private String apartmentNumber;
    private int buildingId;
    private String departmentType;
    private double price;
    private int floor;
    private int status;
    private int owner;

    // Constructor
    public Apartments(int apartmentId, String apartmentNumber, int buildingId, String departmentType, double price, int floor, int status, int owner) {
        this.apartmentId = apartmentId;
        this.apartmentNumber = apartmentNumber;
        this.buildingId = buildingId;
        this.departmentType = departmentType;
        this.price = price;
        this.floor = floor;
        this.status = status;
        this.owner = owner;
    }

    // Getters and Setters
    public int getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public String getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(String departmentType) {
        this.departmentType = departmentType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Apartments{" + "apartmentId=" + apartmentId + ", apartmentNumber=" + apartmentNumber + ", buildingId=" + buildingId + ", departmentType=" + departmentType + ", price=" + price + ", floor=" + floor + ", status=" + status + ", owner=" + owner + '}';
    }
}
