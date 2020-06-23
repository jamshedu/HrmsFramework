package com.hrms.testcase;

import org.testng.annotations.Test;

import com.hrms.utels.CommonMethods;
import com.hrms.utels.ConfigsReader;
//14570
public class ContactDetailCase extends CommonMethods{
	
	
	@Test
	public void contacDatails() {
		login.login(ConfigsReader.getProperty("username"),ConfigsReader.getProperty("password"));
		dashboard.navigateToAddEmployee();
		
		
	}
	
	
	

}
