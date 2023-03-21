package com.admin.testcases;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lead_Links {
	public static WebDriver  driver;

	public static void main(String[] args) throws InterruptedException, IOException {
//		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();	
		
		
		
//		open URL
		driver.get("https://admin-portal-red.vercel.app/app/");
		
		
//		implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Login Admin Panel
		driver.manage().window().maximize();
		driver.findElement(By.id("adminEmail")).sendKeys("satyam.tiwari@insurancesamadhan.com");
		driver.findElement(By.id("adminPassword")).sendKeys("123456");
		driver.findElement(By.id("adminLoginBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("navLinkSideBar")).click();
		Thread.sleep(3000);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
    	System.out.println(links.size());
    	
//    	String path = "C:\\Users\\asus\\eclipse-workspace\\admin\\src\\test\\java\\com\\admin\\testData\\BrokenLink.xlsx";
    
    	
    	
        for(int i=0; i<links.size();i++) {
    		WebElement elements = links.get(i);
    		String url=elements.getAttribute("href");
    		System.out.println(url);
//    		XLUtils.getCellData(path,"Sheet1", 1,i );
//    		XLUtils.setCellData(path, "Sheet1", i, 1, url);
    		}
    	    System.out.println("Links end");

	}

}




