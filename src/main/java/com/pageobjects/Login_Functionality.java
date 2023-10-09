package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Login_Functionality extends TestBase {

	@FindBy(name = "emailid")

	WebElement User;

	@FindBy(id = "pword")

	WebElement pass;

	@FindBy(xpath = "//button[text()='Login']")

	WebElement login;

//	@FindBy(xpath = "//img[@class='rounded-circle']")
//
//	WebElement a;
//
//	@FindBy(xpath = "//a[@class='dropdown-item'][1]")
//
//	WebElement b;

	public Login_Functionality(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public HomePage validateLogin() throws Throwable {

		User.sendKeys(props.getProperty("username"));
		pass.sendKeys(props.getProperty("password"));
		login.click();
		Thread.sleep(2000);
//		a.click();
//		b.click();

		return new HomePage();
	}

}
