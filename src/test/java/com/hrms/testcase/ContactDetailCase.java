package com.hrms.testcase;

import org.testng.annotations.Test;

import com.hrms.utels.CommonMethods;
import com.hrms.utels.ConfigsReader;
//14570
public class ContactDetailCase extends CommonMethods{
	
	
	@Test
	public void contacDatails() {
		login.login(ConfigsReader.getProperty("username"),ConfigsReader.getProperty("password"));
		empListElements.empPim.click();
		empListElements.empLIst.click();
		empListElements.empID.click();
		wait(2);
	    sendText(empListElements.empID, "14444");
		empListElements.empSearch.click();
		empListElements.empOrzu.click();
		//empListElements.empChecksBox.click();
		empListElements.empSaveBtn.click();
		sendText(empListElements.middleName, "O");
		sendText(empListElements.empOtherID, "22233");
		sendText(empListElements.empDriverLicens, "22gHb44");
		wait(2);
		sendText(empListElements.empDriverExpireDate, "2023-01-22");
		sendText(empListElements.empSSN, "333-23-1533");
		sendText(empListElements.empSINNumber, "333-44-5656");
	    empListElements.empFemale.click();
	    sendText(empListElements.empDOB, "1988-05-22");
	    sendText(empListElements.empNickname, "Ora");
	    sendText(empListElements.empMilitary, "Solger");
	    //empListElements.empNonSmoke.click();
	    
	    
	}
	
	
	

}
