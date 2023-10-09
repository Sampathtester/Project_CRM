package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Profile extends TestBase{
	
	
	@FindBy(xpath="//img[@class='rounded-circle']")
	
	WebElement a;
	
	
	@FindBy(xpath="//a[text()=' Signout']")
	
	WebElement b;
	
	public Profile(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void prl() throws Throwable {
		
		Thread.sleep(2000);
		a.click();
		b.click();
		
	
		
	}
	

}
