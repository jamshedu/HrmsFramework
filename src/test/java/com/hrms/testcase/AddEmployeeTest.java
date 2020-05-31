package com.hrms.testcase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.utels.CommonMethods;
import com.hrms.utels.ConfigsReader;

public class AddEmployeeTest extends CommonMethods {
	
	
//	@BeforeMethod
//	public void openBrowser() {
//		setUp();
//		initialize();
//	}
//
//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}

	@Test
	public void addEmployeePage() {
		//DashboardPageElements d=new DashboardPageElements();
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		dashboard.navigateToAddEmployee();
		sendText(addEmp.FirstName,"Bradd");
		sendText(addEmp.lastname,"Pitt");
		click(addEmp.cridentialsButtom);
		sendText(addEmp.creditUserName,"Jamshed88");
		sendText(addEmp.creditPassWord,"Jamshed9999$");
		sendText(addEmp.credReEnterPassWord, "Jamshed9999$");
		screenShotObject("screenshots/HRMS/james.png");
	}
		
		@Test
		public void addEmployeePage1() {
			//DashboardPageElements d=new DashboardPageElements();
			login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
			dashboard.navigateToAddEmployee();
			
			click(addEmp.cridentialsButtom);
			sendText(addEmp.creditUserName,"Jamshed88");
			sendText(addEmp.creditPassWord,"Jamshed9999$");
			sendText(addEmp.credReEnterPassWord, "Jamshed9999$");
			click(addEmp.buttonSave);
			
			String valueActual="Required";
			AssertJUnit.assertEquals(addEmp.reqFirstName.getText(), valueActual);
			AssertJUnit.assertEquals(addEmp.reqLastName.getText(), valueActual);
			screenShotObject("screenshots/HRMS/john.png");
			
			
			
			
			
			
		
		
//		sendText(addEmp.empFirstName, ConfigsReader.getProperty("employeeFirstname"));
//		sendText(addEmp.empLastName, ConfigsReader.getProperty("employeeLastname"));
//		sendText(addEmp.addPhoto, ConfigsReader.getProperty("filePath"));
//		waitAndClick(addEmp.saveEmp);
		
		//add assertion to verify that employee has been added successfully
		
		
	}
	
}
