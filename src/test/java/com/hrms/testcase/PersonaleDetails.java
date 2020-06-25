package com.hrms.testcase;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrms.utels.CommonMethods;

public class PersonaleDetails extends CommonMethods{
	
	@FindBy(xpath = "//input[@id='btnSave']")
	public WebElement editButton;
	
	@FindBy(xpath = "//input[@name='personal[txtEmpFirstName]']")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@id='personal_txtEmpMiddleName']")
	public WebElement middleName;
	
	@FindBy(xpath = "//input[@id='personal_txtEmpLastName']")
     public WebElement  lastName;
	
	@FindBy(xpath = "//input[@id='personal_txtEmployeeId']")
	public WebElement empID;
	
	
}
