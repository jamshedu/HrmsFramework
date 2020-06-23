package com.report;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.hrms.utels.CommonMethods;
import com.hrms.utels.ConfigsReader;

public class DefineReport extends CommonMethods {
	
	
	
	@Test
	public void report() {
		test.info("Entering valid credetilas to HRMS Application");
		//Entering HRMS
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		//naviget to reporPage.
		test.info("Navigate to report page");
		report.navigateToReports();
		
		sendText(report.reportName,"Valid Cridetials");
		selectDdValue(report.reportList, "Employee Name");
		click(report.AddConstraint);
		report.empName.sendKeys( "Rohani Sakhi",Keys.ENTER);
		selectDdValue(report.reportComparision, "Past Employees Only");
		
		
//		
//		selectDdValue(report.reportGroups, "Dependents ");
//		//sendText(report.repottField, "Nationality");
	}
	
	

}
