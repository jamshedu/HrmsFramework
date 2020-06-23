package com.hrms.testbase;


import com.aventstack.extentreports.ExtentTest;
import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.EmployeeListElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.report.ReportPage;

public class PageInitializer extends BaseClass{
	
	public static LoginPageElements login;
	public static AddEmployeePageElements addEmp;
	public static DashboardPageElements dashboard;
	public static PersonalDetailsPageElements pdetails;
	public static EmployeeListElements empListElements;
	public static ReportPage report;
	
	public static void initialize() {
		empListElements=new EmployeeListElements();
		login=new LoginPageElements();
		dashboard=new DashboardPageElements();
		addEmp=new AddEmployeePageElements();
		pdetails=new PersonalDetailsPageElements();
		
		report=new ReportPage();
	}
	
	
}
