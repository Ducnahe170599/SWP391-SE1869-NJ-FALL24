/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nguye
 */


public class ServiceContract {

    private int serviceContractId;
    private int apartmentId;
    private int serviceId;
    private String startDate;
    private String endDate;
    private double amount;

     public ServiceContract(){
         
     }
     
      public ServiceContract(int apartmentId, int serviceId, String startDate, String endDate, double amount) {
        this.apartmentId = apartmentId;
        this.serviceId = serviceId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
    }
     
    //chuadung
    public ServiceContract(int serviceContractId, int apartmentId, int serviceId, String startDate, String endDate, double amount) {
        this.serviceContractId = serviceContractId;
        this.apartmentId = apartmentId;
        this.serviceId = serviceId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
    }

    // Getters and Setters
    public int getServiceContractId() {
        return serviceContractId;
    }

    public void setServiceContractId(int serviceContractId) {
        this.serviceContractId = serviceContractId;
    }

    public int getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ServiceContract{" + "serviceContractId=" + serviceContractId + ", apartmentId=" + apartmentId + ", serviceId=" + serviceId + ", startDate=" + startDate + ", endDate=" + endDate + ", amount=" + amount + '}';
    }
}
