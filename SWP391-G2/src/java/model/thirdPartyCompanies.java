/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nguye
 */
public class thirdPartyCompanies {

    private int thirdPartyId;
    private String companyName;
    private String serviceType;
    private String contact;
    private String address;
    private int staffId;

    // Constructor
    public thirdPartyCompanies(int thirdPartyId, String companyName, String serviceType, String contact, String address, int staffId) {
        this.thirdPartyId = thirdPartyId;
        this.companyName = companyName;
        this.serviceType = serviceType;
        this.contact = contact;
        this.address = address;
        this.staffId = staffId;
    }

    // Getters and Setters
    public int getThirdPartyId() {
        return thirdPartyId;
    }

    public void setThirdPartyId(int thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    @Override
    public String toString() {
        return "thirdPartyCompanies{" + "thirdPartyId=" + thirdPartyId +
                ", companyName=" + companyName + ", serviceType=" + serviceType +
                ", contact=" + contact + ", address=" + address + ", staffId=" + staffId + '}';
    }

}
