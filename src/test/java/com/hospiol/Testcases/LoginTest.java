package com.hospiol.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pageobjects.Login_Functionality;
import com.pageobjects.Profile;

public class LoginTest extends TestBase {

	Login_Functionality lg;
	Profile profile;
	WebDriver driver ;

	public LoginTest() {

		super();
	}

//	@BeforeClass
//	
//	public void Run() {
//		
//		Setup();
//		
//		
//	}

	@BeforeMethod

	public void initialize() {

		lg = new Login_Functionality(driver);
		//profile = new Profile(driver);

	}

	@Test(priority = 1)

	public void verifylogin() throws Throwable {

		lg.validateLogin();

	}

//	@Test(priority=2)
//	public void verifyurl() throws Throwable {
//		
//		lg.validateLogin();
//		String url=driver.getTitle();
//		Assert.assertEquals("Empire Home Admin Panel", url);
//	}

	@Test(priority = 2)
	public void logout() throws Throwable {

		// lg.validateLogin();
		profile.prl();

	}

}
