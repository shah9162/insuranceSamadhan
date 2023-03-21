package com.admin.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Filtration_Form_Health {
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 
//		 open URL
		 driver.manage().window().maximize();
		 driver.get("https://admin-portal-red.vercel.app/");
		 
//		 login
		 driver.findElement(By.id("adminEmail")).sendKeys("satyam.tiwari@insurancesamadhan.com");
		 driver.findElement(By.id("adminPassword")).sendKeys("123456");
		 driver.findElement(By.id("adminLoginBtn")).click();
		 Thread.sleep(2000);
		 
		 
		 driver.findElement(By.id("navLinkSideBar")).click();
		 driver.findElement(By.id("leads")).click();
		 driver.findElement(By.xpath("//ul[@class='d-block nav']//li[1]//a[1]")).click();
		 Thread.sleep(2000);
			
		 driver.findElement(By.id("leadSearchByMailInput")).sendKeys("first543@yopmail.com");
		 driver.findElement(By.id("leadSearchBymailBtn")).click();
		 Thread.sleep(2000);
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement nextbtn = driver.findElement(By.xpath("//a[normalize-space()='next >']"));
		 js.executeScript("arguments[0].scrollIntoView();", nextbtn);
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//span[@id='actions-row-0']//div")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[@id='leadFiltrationForm']//img")).click();
		 Thread.sleep(2000);
		 
		 
//		 Lead Details tab
		 driver.findElement(By.xpath("//input[@name='filterAddress']")).sendKeys("address");
		 driver.findElement(By.xpath("//input[@name='filterPin']")).sendKeys("123456");
		 Select filterRelation= new Select (driver.findElement(By.xpath("//select[@name='filterRelation']")));
		 filterRelation.selectByVisibleText("Self");
		 driver.findElement(By.xpath("//div[@class='col']//button[@type='button'][normalize-space()='Save']")).click();
		 Thread.sleep(1000);
		 
//		 Policy Holder Details tab
		 driver.findElement(By.id("navLink2")).click();
		 Thread.sleep(2000);
//		 WebElement dob =driver.findElement(By.id("//input[@id='filterDob']"));
//		 dob.sendKeys("09012010");
		 Select gender = new Select(driver.findElement(By.id("polHolderGender")));
		 gender.selectByVisibleText("Male");
		 Select state = new Select(driver.findElement(By.id("polHolderState")));
		 state.selectByVisibleText("Bihar");
		 Select district = new Select (driver.findElement(By.id("polHolderDistrict")));
		 district.selectByVisibleText("Gaya");
		 Select income = new Select (driver.findElement(By.id("polHolderIncome")));
		 income.selectByVisibleText("3,00,000-5,00,000");
		 Select edu = new Select(driver.findElement(By.xpath("//select[@name='polHolderEducation']")));
		 edu.selectByVisibleText("12th Pass");
		 Select occupation = new Select (driver.findElement(By.xpath("//select[@name='polHolderOccupation']")));
		 occupation.selectByVisibleText("Armed Forces");
		 
//		 driver.findElement(By.id("polHolderAddress")).sendKeys("address");
		 driver.findElement(By.xpath("//div[@class='tab-pane active']//button[@type='button'][normalize-space()='Save']")).click();
		 Thread.sleep(2000);
		 
//		 JavascriptExecutor j = (JavascriptExecutor) driver;
//		 js.executeScript("window.scrollBy(0,300)");
//		 js.executeScript("window.scrollBy(0,-8000)");
		 
//		 Complaint Details tab
		 Select compy = new Select(driver.findElement(By.xpath("//select[@id='filterInsComp']")));
		 compy.selectByVisibleText("Cigna TTK Health Insurance Co. Ltd.");
		 Select policytype = new Select(driver.findElement(By.id("filterPolType")));
		 policytype.selectByVisibleText("Family");
		 driver.findElement(By.id("filterPolNum")).sendKeys("63475634235");
		 Select policyrel = new Select(driver.findElement(By.id("polHolderRelationPat")));
		 policyrel.selectByVisibleText("Son");
		 driver.findElement(By.id("polHolderPatName")).sendKeys("patient");
		 driver.findElement(By.id("polHospitalName")).sendKeys("hospital");
		 driver.findElement(By.id("filterClaimNumber")).sendKeys("claim432");
		 driver.findElement(By.id("filterSumInsured")).sendKeys("54321");
		 driver.findElement(By.id("filterClaimAmount")).sendKeys("1234");
		 WebElement hospdate =  driver.findElement(By.id("filterDOH"));
		 hospdate.sendKeys("21022023");
		 WebElement disdate =driver.findElement(By.id("filterDOD"));
		 disdate.sendKeys("21022023");
		 WebElement comdate = driver.findElement(By.id("filterLCIC"));
		 driver.findElement(By.id("filterProblemStatement")).sendKeys("problm");
		 driver.findElement(By.id("polHolderDisease")).sendKeys("discharge");
		 Thread.sleep(2000);
		 
//		 save button
		 driver.findElement(By.id("save")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[normalize-space()='Final Submit']")).click();
		 
		 
		 driver.close();

	}

}
