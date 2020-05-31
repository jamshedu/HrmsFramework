package com.hrms.testcase;

import com.hrms.testbase.BaseClass;

public class TestClass extends BaseClass{

	public static void main(String[] args) {
		
		setUp();
		String title=driver.getTitle();
		System.out.println(title);
		tearDown();


	}

}
