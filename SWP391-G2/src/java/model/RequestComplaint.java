/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nguye
 */
import java.util.Date;

public class RequestComplaint {
    private int requestId;
    private int residentId;
    private String title;
    private String description;
    private int status;
    private Date dateRequested;
    private String type;
    private int thirdPartyId;
    private int staffId;

    // Constructor
    public RequestComplaint(int requestId, int residentId, String title, String description, int status, Date dateRequested, String type, int thirdPartyId, int staffId) {
        this.requestId = requestId;
        this.residentId = residentId;
        this.title = title;
        this.description = description;
        this.status = status;
        this.dateRequested = dateRequested;
        this.type = type;
        this.thirdPartyId = thirdPartyId;
        this.staffId = staffId;
    }

    // Getters and Setters
    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getResidentId() {
        return residentId;
    }

    public void setResidentId(int residentId) {
        this.residentId = residentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getDateRequested() {
        return dateRequested;
    }

    public void setDateRequested(Date dateRequested) {
        this.dateRequested = dateRequested;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getThirdPartyId() {
        return thirdPartyId;
    }

    public void setThirdPartyId(int thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    @Override
    public String toString() {
        return "RequestComplaint{" + "requestId=" + requestId + ", residentId=" + residentId + ", title=" + title + ", description=" + description + ", status=" + status + ", dateRequested=" + dateRequested + ", type=" + type + ", thirdPartyId=" + thirdPartyId + ", staffId=" + staffId + '}';
    }
    
}
