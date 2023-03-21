package com.admin.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadReport {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
//		open URl
		driver.get("https://insa-admin-xsd8.vercel.app/");
		
//		Login 
		driver.manage().window().maximize();
		driver.findElement(By.id("adminEmail")).sendKeys("ravi@insurancesamadhan.com");
		driver.findElement(By.id("adminPassword")).sendKeys("Sana@2006");
		driver.findElement(By.id("adminLoginBtn")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("tooltip_switch")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("navLinkSideBar")).click();
//		Thread.sleep(3000);
		
		
//		page scroll to report
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement report = driver.findElement(By.id("Report"));
		js.executeScript("arguments[0].scrollIntoView();", report);
		report.click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("userSecDrpDwn")).click();
		Thread.sleep(2000);
		
		//Find the date time picker control
		WebElement startdate= driver.findElement(By.id("userSecStDt"));
		startdate.sendKeys("01012023");
		
		WebElement enddate= driver.findElement(By.id("userSecEndDt"));
		enddate.sendKeys("31012023");
		
		Select selectstatus = new Select(driver.findElement(By.id("userSecStatus")));
		selectstatus.selectByVisibleText("True");
		
		Select selectgrp = new Select(driver.findElement(By.id("userSecGrp")));
		selectgrp.selectByVisibleText("User");
		driver.findElement(By.id("userSecSearchBtn")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.id("userSecDrpDwn")).click();
		Thread.sleep(3000);
		
//		Page Scroll to tat report
//		JavascriptExecutor js = (JavascriptExecutor) driver;w
		WebElement tat = driver.findElement(By.id("tatReportDrpDwn"));
		js.executeScript("arguments[0].scrollIntoView();", tat);
		tat.click();
		Thread.sleep(2000);
		
		WebElement strtdate = driver.findElement(By.id("tatRepStDt"));
		strtdate.sendKeys("01012023");
		
		WebElement endate = driver.findElement(By.id("tatRepEndDt"));
		endate.sendKeys("31012023");
		
		Select firststatus = new Select(driver.findElement(By.id("tatRepRepType")));
		firststatus.selectByVisibleText("Accept");
		
		Select secondstatus = new Select (driver.findElement(By.id("tatRepRepType2")));
		secondstatus.selectByVisibleText("IGMS");
		
		driver.findElement(By.id("tatRepDwnBtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("tatReportDrpDwn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("WhatsBotFollowRep")).click();
		Thread.sleep(2000);
		WebElement stdate = driver.findElement(By.id("bolFollowStaDt"));
		stdate.sendKeys("01012023");
		
		WebElement eddate = driver.findElement(By.id("botFollwEndDt"));
		eddate.sendKeys("31012023");
		
		driver.findElement(By.id("botFollowRepDwnBtn")).click();
		Thread.sleep(5000);
		
		
		
		driver.close();

	}

	
	

}
