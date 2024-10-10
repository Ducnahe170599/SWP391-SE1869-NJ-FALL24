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

public class Residents {

    private int residentId;
    private Date registerDate;
    private int isOwner;
    private Date moveInDate;
    private int buildingId;

    // Constructor
    public Residents(int residentId, Date registerDate, int isOwner, Date moveInDate, int buildingId) {
        this.residentId = residentId;
        this.registerDate = registerDate;
        this.isOwner = isOwner;
        this.moveInDate = moveInDate;
        this.buildingId = buildingId;
    }

    // Getters and Setters
    public int getResidentId() {
        return residentId;
    }

    public void setResidentId(int residentId) {
        this.residentId = residentId;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public int getIsOwner() {
        return isOwner;
    }

    public void setIsOwner(int isOwner) {
        this.isOwner = isOwner;
    }

    public Date getMoveInDate() {
        return moveInDate;
    }

    public void setMoveInDate(Date moveInDate) {
        this.moveInDate = moveInDate;
    }

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    @Override
    public String toString() {
        return "Residents{" + "residentId=" + residentId + ", registerDate=" + registerDate + ", isOwner=" + isOwner + ", moveInDate=" + moveInDate + ", buildingId=" + buildingId + '}';
    }
}
