package com.sqldexter.organization.entity;
// Generated Mar 26, 2017 5:05:05 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * MonthlySalaryProcessSummary generated by hbm2java
 */
public class MonthlySalaryProcessSummary  implements java.io.Serializable {


     private Integer processSummaryId;
     private Date processDate;
     private String processMonth;
     private int employeeId;
     private Double basicSalary;
     private Double totalAllowance;
     private Double totalDeduction;
     private Double totalOverTimeAmount;
     private Double grossSalary;
     private Double epfAmount;
     private Double etfAmount;
     private Double otherAllowances;
     private Double netSalary;

    public MonthlySalaryProcessSummary() {
    }

	
    public MonthlySalaryProcessSummary(int employeeId) {
        this.employeeId = employeeId;
    }
    public MonthlySalaryProcessSummary(Date processDate, String processMonth, int employeeId, Double basicSalary, Double totalAllowance, Double totalDeduction, Double totalOverTimeAmount, Double grossSalary, Double epfAmount, Double etfAmount, Double otherAllowances, Double netSalary) {
       this.processDate = processDate;
       this.processMonth = processMonth;
       this.employeeId = employeeId;
       this.basicSalary = basicSalary;
       this.totalAllowance = totalAllowance;
       this.totalDeduction = totalDeduction;
       this.totalOverTimeAmount = totalOverTimeAmount;
       this.grossSalary = grossSalary;
       this.epfAmount = epfAmount;
       this.etfAmount = etfAmount;
       this.otherAllowances = otherAllowances;
       this.netSalary = netSalary;
    }
   
    public Integer getProcessSummaryId() {
        return this.processSummaryId;
    }
    
    public void setProcessSummaryId(Integer processSummaryId) {
        this.processSummaryId = processSummaryId;
    }
    public Date getProcessDate() {
        return this.processDate;
    }
    
    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }
    public String getProcessMonth() {
        return this.processMonth;
    }
    
    public void setProcessMonth(String processMonth) {
        this.processMonth = processMonth;
    }
    public int getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public Double getBasicSalary() {
        return this.basicSalary;
    }
    
    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public Double getTotalAllowance() {
        return this.totalAllowance;
    }
    
    public void setTotalAllowance(Double totalAllowance) {
        this.totalAllowance = totalAllowance;
    }
    public Double getTotalDeduction() {
        return this.totalDeduction;
    }
    
    public void setTotalDeduction(Double totalDeduction) {
        this.totalDeduction = totalDeduction;
    }
    public Double getTotalOverTimeAmount() {
        return this.totalOverTimeAmount;
    }
    
    public void setTotalOverTimeAmount(Double totalOverTimeAmount) {
        this.totalOverTimeAmount = totalOverTimeAmount;
    }
    public Double getGrossSalary() {
        return this.grossSalary;
    }
    
    public void setGrossSalary(Double grossSalary) {
        this.grossSalary = grossSalary;
    }
    public Double getEpfAmount() {
        return this.epfAmount;
    }
    
    public void setEpfAmount(Double epfAmount) {
        this.epfAmount = epfAmount;
    }
    public Double getEtfAmount() {
        return this.etfAmount;
    }
    
    public void setEtfAmount(Double etfAmount) {
        this.etfAmount = etfAmount;
    }
    public Double getOtherAllowances() {
        return this.otherAllowances;
    }
    
    public void setOtherAllowances(Double otherAllowances) {
        this.otherAllowances = otherAllowances;
    }
    public Double getNetSalary() {
        return this.netSalary;
    }
    
    public void setNetSalary(Double netSalary) {
        this.netSalary = netSalary;
    }




}

