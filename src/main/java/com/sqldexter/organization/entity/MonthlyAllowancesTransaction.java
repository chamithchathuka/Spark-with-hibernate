package com.sqldexter.organization.entity;
// Generated Mar 26, 2017 5:05:05 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * MonthlyAllowancesTransaction generated by hbm2java
 */
public class MonthlyAllowancesTransaction  implements java.io.Serializable {


     private Integer allowanceTranId;
     private int allowanceId;
     private int employeeId;
     private Date tranDate;
     private double allowanceAmount;
     private char activeStatus;
     private Date createdDate;
     private Integer processedUserId;
     private char deleteFlag;
     private char processFlag;

    public MonthlyAllowancesTransaction() {
    }

	
    public MonthlyAllowancesTransaction(int allowanceId, int employeeId, double allowanceAmount, char activeStatus, Date createdDate, char deleteFlag, char processFlag) {
        this.allowanceId = allowanceId;
        this.employeeId = employeeId;
        this.allowanceAmount = allowanceAmount;
        this.activeStatus = activeStatus;
        this.createdDate = createdDate;
        this.deleteFlag = deleteFlag;
        this.processFlag = processFlag;
    }
    public MonthlyAllowancesTransaction(int allowanceId, int employeeId, Date tranDate, double allowanceAmount, char activeStatus, Date createdDate, Integer processedUserId, char deleteFlag, char processFlag) {
       this.allowanceId = allowanceId;
       this.employeeId = employeeId;
       this.tranDate = tranDate;
       this.allowanceAmount = allowanceAmount;
       this.activeStatus = activeStatus;
       this.createdDate = createdDate;
       this.processedUserId = processedUserId;
       this.deleteFlag = deleteFlag;
       this.processFlag = processFlag;
    }
   
    public Integer getAllowanceTranId() {
        return this.allowanceTranId;
    }
    
    public void setAllowanceTranId(Integer allowanceTranId) {
        this.allowanceTranId = allowanceTranId;
    }
    public int getAllowanceId() {
        return this.allowanceId;
    }
    
    public void setAllowanceId(int allowanceId) {
        this.allowanceId = allowanceId;
    }
    public int getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public Date getTranDate() {
        return this.tranDate;
    }
    
    public void setTranDate(Date tranDate) {
        this.tranDate = tranDate;
    }
    public double getAllowanceAmount() {
        return this.allowanceAmount;
    }
    
    public void setAllowanceAmount(double allowanceAmount) {
        this.allowanceAmount = allowanceAmount;
    }
    public char getActiveStatus() {
        return this.activeStatus;
    }
    
    public void setActiveStatus(char activeStatus) {
        this.activeStatus = activeStatus;
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
    public char getDeleteFlag() {
        return this.deleteFlag;
    }
    
    public void setDeleteFlag(char deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
    public char getProcessFlag() {
        return this.processFlag;
    }
    
    public void setProcessFlag(char processFlag) {
        this.processFlag = processFlag;
    }




}

