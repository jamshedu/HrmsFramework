package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactDaitails {
	
	
	@FindBy(xpath = "//a[text()='Personal Details']")
	public WebElement empPersonalDatails;
	
	@FindBy(xpath = "//input[@id='btnSave']")
	public WebElement empEdded;
	
	@FindBy(xpath = "//input[@id='personal_txtLicenNo']")
	public WebElement empDriverLicens;
	
	@FindBy(xpath = "//input[@id='personal_txtNICNo']")
	public WebElement empSSN;
	
	@FindBy(xpath = "//input[@id='personal_optGender_2']")
	public WebElement empFemale;
	
	@FindBy(xpath = "//input[@id='personal_optGender_1']")
	public WebElement empMale;
	
	@FindBy(xpath = "//select[@id='personal_cmbNation']")
	public WebElement empNatianality;
	
	@FindBy(xpath = "//input[@id='personal_txtEmpNickName']")
	public WebElement empNickname;
	
	@FindBy(xpath = "//input[@id='personal_txtMilitarySer']")
	public WebElement empMilitary;
	
	@FindBy(xpath = "//input[@id='personal_txtOtherID']")
	public WebElement empOtherID;
	
	
	

}
