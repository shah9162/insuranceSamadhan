package com.admin.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomerAdmin {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
//		 open URl
		 driver.get("https://insa-admin-xsd8.vercel.app/");
		 
//			Login 
			driver.manage().window().maximize();
			driver.findElement(By.id("adminEmail")).sendKeys("ravi@insurancesamadhan.com");
			driver.findElement(By.id("adminPassword")).sendKeys("Sana@2006");
			driver.findElement(By.id("adminLoginBtn")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.id("tooltip_switch")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("navLinkSideBar")).click();
//			Thread.sleep(2000);
			System.out.println("open sidebar");
			
			
//			Scroll page to Customer
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement customer = driver.findElement(By.id("customer"));
			js.executeScript("arguments[0].scrollIntoView();", customer);
			Thread.sleep(2000);
			customer.click();
			
			
			WebElement search = driver.findElement(By.id("customerSearchKeyword"));
			search.sendKeys("jdksnrjksmeksk@gmail.com");
			Thread.sleep(2000);
			WebElement serbtn = driver.findElement(By.xpath("//button[@id='customerBtnSearch']"));
			serbtn.click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//tbody/tr[1]/th[1]/a[1]/div[1]/span[1]/img[1]")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.id("comRow0")).click();
			driver.findElement(By.xpath("//button[normalize-space()='Invoice Raised']")).click();
			driver.findElement(By.xpath("(//*[@name='GSTNo'])")).sendKeys("gstno123");
			Thread.sleep(2000);
			
			
			WebElement type = driver.findElement(By.xpath("(//*[@name='discountType'])"));
			type.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			Select distype = new Select(type);
			distype.selectByVisibleText("Percentage");
			
			driver.findElement(By.xpath("(//*[@name='invoiceRaisedName'])")).sendKeys("faiz");
			driver.findElement(By.xpath("(//*[@name='invoiceRaisedAddress'])")).sendKeys("Model town Delhi");
			driver.findElement(By.xpath("//input[@placeholder='Enter Discount Number']")).sendKeys("10");
			
			driver.findElement(By.id("CalcInvoice")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("comRow0")).click();
			driver.findElement(By.xpath("//button[normalize-space()='Invoice Raised']")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("generateAnnexure")).click();
			System.out.println("Download Annexsure");
			
			driver.findElement(By.xpath("//i[@class='simple-icon-close']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.id("comRow0")).click();
			driver.findElement(By.xpath("//button[normalize-space()='Invoice Raised']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Generate Invoice']")).click();
			
			System.out.println("Generate Invoice");
			
			
//			driver.close();
			
			
			
		 
	}
	

}
