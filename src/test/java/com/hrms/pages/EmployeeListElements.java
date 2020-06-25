package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmployeeListElements {
	
	
	@FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
	public WebElement empPim;
	
	@FindBy(xpath = "//a[@id='menu_pim_viewEmployeeList']")
	public WebElement empLIst;
	
	@FindBy(xpath = "//input[@id='empsearch_employee_name_empName']")
	public WebElement empName;
	
	@FindBy(xpath = "//input[@id='empsearch_id']")
	public WebElement empID;
	
	@FindBy(xpath = "//a[text()='Orzu']")
	public WebElement empOrzu;
	
	@FindBy(xpath = "//input[@id='btnSave']")
	public WebElement empSaveBtn;
	
	@FindBy(xpath = "//input[@id='personal_txtOtherID']")
	public WebElement empOtherID;
	
	@FindBy(xpath = "//input[@id='personal_txtEmpMiddleName']")
	public WebElement middleName;
	
	@FindBy(xpath = "//input[@id='personal_txtLicenNo']")
	public WebElement empDriverLicens;
	
	@FindBy(xpath = "//input[@id='personal_txtLicExpDate']")
	public WebElement empDriverExpireDate;
	
	@FindBy(xpath = "//input[@id='personal_txtNICNo']")
	public WebElement empSSN;
	
	@FindBy(xpath = "//input[@id='personal_txtSINNo']")
	public WebElement empSINNumber;
	
	@FindBy(xpath = "//input[@id='personal_optGender_2']")
	public WebElement empFemale;
	
	@FindBy(xpath = "//input[@id='personal_optGender_1']")
	public WebElement empMale;
	
	@FindBy(xpath = "//select[@id='personal_cmbNation']")
	public WebElement empNatianality;
	
	@FindBy(xpath = "//input[@id='personal_txtEmpNickName']")
	public WebElement empNickname;
	
	@FindBy(xpath = "//input[@id='personal_chkSmokeFlag']")
	public WebElement empNonSmoke;
	
	@FindBy(xpath = "//input[@id='personal_txtMilitarySer']")
	public WebElement empMilitary;
	
	@FindBy(xpath = "//input[@id='personal_DOB']")
	public WebElement empDOB;
	
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
