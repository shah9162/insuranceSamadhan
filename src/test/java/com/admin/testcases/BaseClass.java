package com.admin.testcases;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.admin.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public void Screenshot(WebDriver driver,String login) throws IOException {
		
		Date currentdate = new Date();
		String exactdate = currentdate.toString().replace(" ","-").replace(":","-");
		
		File screenshotFile= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile,new File(".//Screenshots/"+ login +exactdate +".png"));
		System.out.println("screen shot is taken");
		
	}
	
	public boolean isAlertPresent() {  //user defined method created to check alert present or not
		try {
			driver.switchTo().alert();
			return true;	
		}
		catch(Exception e) {
			return false;
		}
	}
	

	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL=readconfig.getapplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getpassword();
	public static WebDriver driver; 
	
    public static Logger logger;
    
   
    
    @Parameters("browser")
	@BeforeTest
	public void setUp(String br) {
//		public void setUp(String br) {
//    	System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
//    	 driver=new ChromeDriver(); 	
    	
//    	logger=Logger.getLogger("polobix");
//		PropertyConfigurator.configure("Log4j.properties");
		
    	
		if(br.equals("chrome")) {
//			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
	        driver=new ChromeDriver(options);	
	     }
		else if(br.equals("edge")) {
//			System.setProperty("webdriver.geco.driver",readconfig.)
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
//		else if(br.equals("ie")) {
//			System.setProperty("webdriver.ie.driver",readconfig.)
//			driver=new InternetExplorerDriver();
//    }
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		}
		
	@AfterTest
	public void tearDown() {
	
//		driver.quit();
	}
}
	


