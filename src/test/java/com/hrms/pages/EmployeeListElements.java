package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmployeeListElements {
	
	@FindBy(xpath = "//input[@id='empsearch_employee_name_empName']")
	public WebElement empName;
	
	@FindBy(xpath = "empsearch_id")
	public WebElement empID;
	
	@FindBy(xpath = "//select[@id='empsearch_employee_status']")
	public WebElement empStatus;
	
	@FindBy(xpath = "//select[@id='empsearch_termination']")
	public WebElement empEnclude;
	
	@FindBy(xpath = "//input[@id='empsearch_supervisor_name']")
	public WebElement empSupervisor;
	
	@FindBy(xpath = "//select[@id='empsearch_job_title']")
	public WebElement empJobTitle;
	
	@FindBy(xpath = "//select[@id='empsearch_sub_unit']")
	public WebElement empSubUnit;
	
	@FindBy(xpath = "//input[@id='searchBtn']")
	public WebElement empSearch;
	
	@FindBy(xpath = "btnAdd")
	public WebElement empAdd;
	
	@FindBy(xpath = "btnDelete")
	public WebElement empDeletBtn;
	
	@FindBy(xpath = "//tr[@class='odd']/td/input")
	public WebElement empChecksBox;
	
	
	
	public EmployeeListElements() {
	PageFactory.initElements(BaseClass.driver, this);
	
	}
		
	

}
