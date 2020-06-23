package com.hrms.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.utels.CommonMethods;
import com.hrms.utels.ConfigsReader;

public class LoginTest extends CommonMethods{
	
	
	

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

	@Test(groups = {"smoke"})
	public void validAdminLogin() {
		//LoginPageElements login = new LoginPageElements();
		LoginPageElements login = new LoginPageElements();
		test.info("Entering to HRMS credentials");
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);

		DashboardPageElements db = new DashboardPageElements();
		//DashboardPageElements dashboard = new DashboardPageElements();
		String expectedUser="Welcome Admin";
		Object dashboard;
		//String actualUser=dashboard.welcome.getText();
		test.info("Veryfuing welcome admin is diplayed");
		String actualUser1=db.welcome.getText();
		Assert.assertEquals(actualUser1, expectedUser, "Admin is NOT Logged in");
		Assert.assertTrue(actualUser1.contains(ConfigsReader.getProperty("username")));
	}

	@Test(groups = {"regression"})
	public void invalidPasswordLogin() {
		test.info("Entering to HRMS credentials");

		LoginPageElements login = new LoginPageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "uiuguig");
		click(login.loginBtn);
		test.info("verifying error message is diplayed");
		String expected="Invalid credentials";
		Assert.assertEquals(login.errorMsg.getText(), expected, "Error message text is not matched");
	}

	@Test(groups = {"regression"})
	public void emptyUsernameLogin() {
		test.info("Entering to HRMS credentials");

		LoginPageElements login = new LoginPageElements();
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);

		test.info("verifying error message is diplayed");

		String expected="Username cannot be empty";

		Assert.assertEquals(login.errorMsg.getText(), expected, "Error message text is not matched");
	}

	
	

}
