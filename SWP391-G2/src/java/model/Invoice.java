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

public class Invoice {
    private int invoiceId;
    private int apartmentId;
    private double amount;
    private Date issueDate;
    private Date dueDate;
    private int status;
    private Date transactionDate;

    // Constructor
    public Invoice(int invoiceId, int apartmentId, double amount, Date issueDate, Date dueDate, int status, Date transactionDate) {
        this.invoiceId = invoiceId;
        this.apartmentId = apartmentId;
        this.amount = amount;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.status = status;
        this.transactionDate = transactionDate;
    }

    // Getters and Setters
    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public int getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public String toString() {
        return "Invoice{" + "invoiceId=" + invoiceId + ", apartmentId=" + apartmentId + ", amount=" + amount + ", issueDate=" + issueDate + ", dueDate=" + dueDate + ", status=" + status + ", transactionDate=" + transactionDate + '}';
    }
    
}

