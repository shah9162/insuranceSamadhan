package com.admin.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {
	
			WebDriver ldriver;
	
	public LoginTest(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="adminEmail")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(id="adminPassword")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(id="adminLoginBtn")
	@CacheLookup
	WebElement btnLogin;
	
	public void setUserName(String uname) {
		txtUserName.clear();
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit() {
		btnLogin.click();
	}

}
