package com.hospiol.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pageobjects.Login_Functionality;

public class prftest extends TestBase{
	
	Login_Functionality lg;
	
	public prftest() {
		
		super();
	}
	
	
@BeforeMethod
	
	public void initialize() {
		
		Setup();
		
		lg = new Login_Functionality(driver);
	}
	
	
	@Test(priority=1)
	
	public void verifylogin() {
		
		lg.validateLogin();
	
		
	}
	
	@Test(priority=2)
	public void p2() {
		
		
	}
	
	
}
