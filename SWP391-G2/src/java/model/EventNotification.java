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

public class EventNotification {
    private int eventId;
    private int residentId;
    private Date notificationDate;
    private int status;

    // Constructor
    public EventNotification(int eventId, int residentId, Date notificationDate, int status) {
        this.eventId = eventId;
        this.residentId = residentId;
        this.notificationDate = notificationDate;
        this.status = status;
    }

    // Getters and Setters
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getResidentId() {
        return residentId;
    }

    public void setResidentId(int residentId) {
        this.residentId = residentId;
    }

    public Date getNotificationDate() {
        return notificationDate;
    }

    public void setNotificationDate(Date notificationDate) {
        this.notificationDate = notificationDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "EventNotification{" + "eventId=" + eventId + ", residentId=" + residentId + ", notificationDate=" + notificationDate + ", status=" + status + '}';
    }
    
}

