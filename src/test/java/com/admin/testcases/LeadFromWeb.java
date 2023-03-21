package com.admin.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadFromWeb {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		//open URL
				driver.get("https://stage.insurancesamadhan.com");
				
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//*[contains(@data-dismiss,'modal')]")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//div[@id='myCarousel']//li[1]")).click();
			    Thread.sleep(2000);
//			    driver.findElement(By.linkText("Contact Us")).click();
			    driver.findElement(By.xpath("/html[1]/body[1]/div[3]/a[1]/img[1]")).click();
				driver.findElement(By.xpath("//*[contains(@title,'This field is required')]")).sendKeys("Faiz");
				driver.findElement(By.xpath("//*[contains(@name,'email')]")).sendKeys("faiz321123@yopmail.com");
				driver.findElement(By.xpath("//*[contains(@name,'phone')]")).sendKeys("8587656789");
				Select drppolicy_type = new Select(driver.findElement(By.id("policy_type")));
				drppolicy_type.selectByVisibleText("Life Insurance");
//				Thread.sleep(2000);
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				Select drpcomplaint_type = new Select(driver.findElement(By.id("complaint_type")));
				drpcomplaint_type.selectByVisibleText("Misselling and Fraud sales");
				driver.findElement(By.id("problemStatement")).sendKeys("Problem solve");
//				driver.findElement(By.id("is-register-submit")).click();
				
				
//				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				
//				boolean bt=driver.getPageSource().contains("Cannot read property 'assign_to' of undefined");
//				System.out.println(bt);
//				
//				if (bt){
//					System.out.println("Test case is pass");
//				}
//				else {
//					System.out.println("Test case is fail");
				}
//				driver.close();
//				}


	

}
