package com.report;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utels.CommonMethods;

public class ReportPage extends CommonMethods{
	
	
	
	@FindBy(id = "menu_core_viewDefinedPredefinedReports")
	public WebElement reportPage;
	
	@FindBy(id = "btnAdd")
	public WebElement addButtom;
	
	@FindBy(id = "report_report_name")
	public WebElement reportName;
	
	@FindBy(id = "report_criteria_list")
	public WebElement reportList;
	
	@FindBy(xpath = "//fieldset[@id='criteria_fieldset']/ol/li[2]/select")
	public WebElement reportComparision;
	
	@FindBy(id = "report_display_groups")
	public WebElement reportGroups;
	
	@FindBy(id = "report_display_field_list")
	public WebElement repottField;
	
	@FindBy(id = "btnAddConstraint")
	public WebElement btnDiplayedGroup;
	
	@FindBy(xpath = "//input[contains(@id,'display_group_12')]")
	public WebElement checkBox;
	
	@FindBy(id = "btnAddConstraint")
	public WebElement AddConstraint;
	
	@FindBy(id="btnSave")
	public WebElement reportSaveBTN;
	
	@FindBy(id = "employee_name_empName")
	public WebElement empName;
	
	public ReportPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	public void navigateToReports() {
		
		click(dashboard.PIM);
		click(report.reportPage);
		wait(2);
		click(report.addButtom);
		
//		click(report.reportName);
//		click(report.reportList);
//		click(report.reportComparision);
//		click(report.reportGroups);
//		click(report.repottField);
	}
}
	
	
	
	
	


