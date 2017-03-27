

----------------Employee_Master --------------------

CREATE TABLE `employee` (
  `Employee_ID` int(10) NOT NULL AUTO_INCREMENT,
  `First_Name` varchar(100) NOT NULL,
  `Second_Name` varchar(100) NOT NULL,
  `Third_Name` varchar(100) DEFAULT NULL,
  `DOB` datetime DEFAULT NULL,
  `Join_Date` datetime DEFAULT NULL,
  `NIC_Num` varchar(15) DEFAULT NULL,
  `Contact_Home` varchar(20) DEFAULT NULL,
  `Contact_Mobile` varchar(20) DEFAULT NULL,
  `Contact_Other` varchar(20) DEFAULT NULL,
  `Add_Home_1` varchar(200) DEFAULT NULL,
  `Add_Other_1` varchar(200) DEFAULT NULL,
  `Employee_Type_ID` int(11) DEFAULT NULL,
  `Employee_Type_Eff_Date` datetime DEFAULT NULL,
  `Department_ID` int(10) DEFAULT NULL,
  `Department_Eff_Date` datetime DEFAULT NULL,
  `Resigned_Date` datetime DEFAULT NULL,
  `Active_Status` char(1) NOT NULL DEFAULT '1',
  `BasicSalary` double(10,2) NOT NULL,
  `Incentive` double(10,2) DEFAULT NULL,
  `Att_Allowance` double(10,2) DEFAULT NULL,
  `Created_Date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Updated_Date` datetime DEFAULT NULL,
  `Updated_User_ID` int(11) DEFAULT NULL,
  `Delete_Flag` char(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`Employee_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=latin1;


----------------- Department_Master ------------------------------------------

CREATE TABLE `Department_Master` (
  `Department_ID` int(10) NOT NULL AUTO_INCREMENT,
  `Department_Name` varchar(100) NOT NULL,
  `DepartmentHead_ID` int(10) NOT NULL, 
  `Active_Status` char(1) NOT NULL DEFAULT '1',
  `Created_Date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Updated_Date` datetime DEFAULT NULL,
  `Updated_User_ID` int(11) DEFAULT NULL,
  `Delete_Flag` char(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`Department_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=latin1;


-------------------Designation_Master ---------------------------

CREATE TABLE `Designation_Master` (
  `Designation_ID` int(10) NOT NULL AUTO_INCREMENT,
  `Designation_Name` varchar(100) NOT NULL,
  `Department_ID` int(10) NOT NULL, 
  `Active_Status` char(1) NOT NULL DEFAULT '1',
  `Created_Date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Updated_Date` datetime DEFAULT NULL,
  `Updated_User_ID` int(11) DEFAULT NULL,
  `Delete_Flag` char(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`Designation_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=latin1;



------ Employement_Type_Master ------------------------

CREATE TABLE `Employement_Type_Master` (
  `Employee_Type_ID` int(10) NOT NULL AUTO_INCREMENT,
  `Type_Name` varchar(100) NOT NULL,
  `Active_Status` char(1) NOT NULL DEFAULT '1',
  `Created_Date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Updated_Date` datetime DEFAULT NULL,
  `Updated_User_ID` int(11) DEFAULT NULL,
  `Delete_Flag` char(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`Employee_Type_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=latin1;



------------- Allowances_Master -------------------

CREATE TABLE `AllowanceCode_Master` (
  `Allowance_ID` int(10) NOT NULL AUTO_INCREMENT,
  `Desription` varchar(150) NOT NULL,
  `Allowance_Amount` double(10,2) NOT NULL,
  `Active_Status` char(1) NOT NULL DEFAULT '1',
  `Created_Date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Updated_Date` datetime DEFAULT NULL,
  `Updated_User_ID` int(11) DEFAULT NULL,
  `Delete_Flag` char(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`Allowance_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=latin1;



-------------Deduction_Master ----------------

CREATE TABLE `DeductionCode_Master` (
  `Deduction_ID` int(10) NOT NULL AUTO_INCREMENT,
  `Desription` varchar(150) NOT NULL,
  `Deduction_Amount` double(10,2) NOT NULL,
  `Active_Status` char(1) NOT NULL DEFAULT '1',
  `Created_Date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Updated_Date` datetime DEFAULT NULL,
  `Updated_User_ID` int(11) DEFAULT NULL,
  `Delete_Flag` char(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`Deduction_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=latin1;


------------------ Monthly_Allowances_Transaction --------------------------

CREATE TABLE `Monthly_Allowances_Transaction` (
  `AllowanceTran_ID` int(10) NOT NULL AUTO_INCREMENT,
  `Allowance_ID` int(10) NOT NULL,
  `Employee_ID` int(10) NOT NULL,
  `Tran_Date` datetime DEFAULT NULL,
  `Allowance_Amount` double(10,2) NOT NULL,  
  `Active_Status` char(1) NOT NULL DEFAULT '1',
  `Created_Date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Processed_User_ID` int(10) DEFAULT NULL,
  `Delete_Flag` char(1) NOT NULL DEFAULT '1',
  `Process_Flag` char(1) NOT NULL DEFAULT '0',	
  PRIMARY KEY (`AllowanceTran_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=latin1;



---------------------- Monthly_Deduction_Transaction -----------------------

CREATE TABLE `Monthly_Deduction_Transaction` (
  `DeductionTran_ID` int(10) NOT NULL AUTO_INCREMENT,
  `Deduction_ID` int(10) NOT NULL,
  `Employee_ID` int(10) NOT NULL,  
  `Tran_Date` datetime DEFAULT NULL,
  `Deduction_Amount` double(10,2) NOT NULL,
  `Active_Status` char(1) NOT NULL DEFAULT '1',
  `Created_Date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Processed_User_ID` int(11) DEFAULT NULL,
  `Process_Flag` char(1) NOT NULL DEFAULT '0',	
  PRIMARY KEY (`DeductionTran_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=latin1;



----------------- Monthly_Salary_Process_Detail --------------------------


CREATE TABLE `Monthly_Salary_Process_Detail` (
  `ProcessTran_ID` int(10) NOT NULL AUTO_INCREMENT,
  `ProcessDate` datetime DEFAULT NULL, 
  `Employee_ID` int(10) NOT NULL, 
  `Transaction_Type` varchar(10) NOT NULL,
  `Deduction_ID` int(10) NOT NULL,
  `Allowance_ID` int(10) NOT NULL,  
  `Trans_Amount` double(10,2) NOT NULL,  
  `Created_Date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Processed_User_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ProcessTran_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=latin1;




----------------- Monthly_Salary_Process_Summary  ---------------------

CREATE TABLE `Monthly_Salary_Process_Summary` (
  `ProcessSummary_ID` int(10) NOT NULL AUTO_INCREMENT,
  `ProcessDate` datetime DEFAULT NULL, 
  `ProcessMonth` varchar(10) DEFAULT NULL, 
  `Employee_ID` int(10) NOT NULL, 
  `Basic_Salary` double(10,2) NULL, 
  `Total_Allowance` double(10,2) NULL,
  `Total_Deduction` double(10,2) NULL,
  `Total_OverTimeAmount` double(10,2) NULL,
   Gross_Salary double(10,2) NULL,  
   EPF_Amount double(10,2) NULL,  
   ETF_Amount double(10,2) NULL,  
   Other_Allowances  double(10,2) NULL,  
   Net_Salary double(10,2) NULL, 
  PRIMARY KEY (`ProcessSummary_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=latin1;







