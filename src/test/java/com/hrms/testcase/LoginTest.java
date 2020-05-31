package com.hrms.testcase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.utels.CommonMethods;
import com.hrms.utels.ConfigsReader;

public class LoginTest extends CommonMethods{
	
	
	
	@BeforeMethod
	public void openBrowser() {
		setUp();
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
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
	public void validAdminLogin() {
		//LoginPageElements login = new LoginPageElements();
		LoginPageElements login = new LoginPageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);

		DashboardPageElements db = new DashboardPageElements();
		//DashboardPageElements dashboard = new DashboardPageElements();
		String expectedUser="Welcome Admin";
		Object dashboard;
		//String actualUser=dashboard.welcome.getText();
		String actualUser1=db.welcome.getText();
		AssertJUnit.assertEquals(actualUser1, expectedUser, "Admin is NOT Logged in");
		AssertJUnit.assertTrue(actualUser1.contains(ConfigsReader.getProperty("username")));
	}

	@Test
	public void invalidPasswordLogin() {
		LoginPageElements login = new LoginPageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "uiuguig");
		click(login.loginBtn);

		String expected="Invalid credentials";
		AssertJUnit.assertEquals(login.errorMsg.getText(), expected, "Error message text is not matched");
	}

	@Test(enabled=true)
	public void emptyUsernameLogin() {
		LoginPageElements login = new LoginPageElements();
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);

		String expected="Username cannot be empty";

		AssertJUnit.assertEquals(login.errorMsg.getText(), expected, "Error message text is not matched");
	}

	
	

}
