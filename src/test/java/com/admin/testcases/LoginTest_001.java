package com.admin.testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.admin.pageObject.LoginTest;

public class LoginTest_001 extends BaseClass{
	
	@Test
	public void logintest() throws IOException, InterruptedException {
		
		System.out.println("before login" +driver.getCurrentUrl());
		driver.get(baseURL);
		
		LoginTest lt=new LoginTest(driver);
		lt.setUserName(username);
		lt.setPassword(password);
		lt.clickSubmit();
		Thread.sleep(2000);
		System.out.println("after login" + driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().contains("//insa-admin-xsd8.vercel.app/app/dashboard")) {
			Assert.assertTrue(true);
		}
		else {
			Screenshot(driver,"loginTest");
			Assert.assertTrue(false);
			
		}
		
		
	}

}
