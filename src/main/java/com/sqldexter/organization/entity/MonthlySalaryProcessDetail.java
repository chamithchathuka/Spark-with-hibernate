package com.sqldexter.organization.entity;
// Generated Mar 26, 2017 5:05:05 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * MonthlySalaryProcessDetail generated by hbm2java
 */
public class MonthlySalaryProcessDetail  implements java.io.Serializable {


     private Integer processTranId;
     private Date processDate;
     private int employeeId;
     private String transactionType;
     private int deductionId;
     private int allowanceId;
     private double transAmount;
     private Date createdDate;
     private Integer processedUserId;

    public MonthlySalaryProcessDetail() {
    }

	
    public MonthlySalaryProcessDetail(int employeeId, String transactionType, int deductionId, int allowanceId, double transAmount, Date createdDate) {
        this.employeeId = employeeId;
        this.transactionType = transactionType;
        this.deductionId = deductionId;
        this.allowanceId = allowanceId;
        this.transAmount = transAmount;
        this.createdDate = createdDate;
    }
    public MonthlySalaryProcessDetail(Date processDate, int employeeId, String transactionType, int deductionId, int allowanceId, double transAmount, Date createdDate, Integer processedUserId) {
       this.processDate = processDate;
       this.employeeId = employeeId;
       this.transactionType = transactionType;
       this.deductionId = deductionId;
       this.allowanceId = allowanceId;
       this.transAmount = transAmount;
       this.createdDate = createdDate;
       this.processedUserId = processedUserId;
    }
   
    public Integer getProcessTranId() {
        return this.processTranId;
    }
    
    public void setProcessTranId(Integer processTranId) {
        this.processTranId = processTranId;
    }
    public Date getProcessDate() {
        return this.processDate;
    }
    
    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }
    public int getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getTransactionType() {
        return this.transactionType;
    }
    
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    public int getDeductionId() {
        return this.deductionId;
    }
    
    public void setDeductionId(int deductionId) {
        this.deductionId = deductionId;
    }
    public int getAllowanceId() {
        return this.allowanceId;
    }
    
    public void setAllowanceId(int allowanceId) {
        this.allowanceId = allowanceId;
    }
    public double getTransAmount() {
        return this.transAmount;
    }
    
    public void setTransAmount(double transAmount) {
        this.transAmount = transAmount;
    }
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public Integer getProcessedUserId() {
        return this.processedUserId;
    }
    
    public void setProcessedUserId(Integer processedUserId) {
        this.processedUserId = processedUserId;
    }




}


