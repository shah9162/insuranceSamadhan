package com.admin.testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.admin.utilities.XLUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserVerifyLink {
public static WebDriver  driver;
	
	public static void main (String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        
////		open URL
//		driver.get(" https://insa-admin-xsd8.vercel.app/");
//		
////		Login Admin Panel
//		driver.findElement(By.id("adminEmail")).sendKeys("ravi@insurancesamadhan.com");
//		driver.findElement(By.id("adminPassword")).sendKeys("Sana@2006");
//		driver.findElement(By.id("adminLoginBtn")).click();
//		Thread.sleep(3000);
		
		
//		implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String path ="C:/Users/asus/eclipse-workspace/admin/src/test/java/com/admin/testData/faiz ki excel.xlsx";
		int rownum=XLUtils.getRowCount(path,"User");
		System.out.println(rownum);
		for(int i=1; i<=rownum;i++) {
			String linkUrl=XLUtils.getCellData(path, "User",i,0);
			System.out.println(linkUrl);
			try
	        {
	            URL url = new URL(linkUrl);

	            //Now we will be creating url connection and getting the response code
	            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
	            httpURLConnect.setConnectTimeout(5000);
	            httpURLConnect.connect();
	           int http=httpURLConnect.getResponseCode();
	           String https =String.valueOf(http);
	            if(http>=400)
	            {
	            	System.out.println(linkUrl+" - "+http+" - "+httpURLConnect.getResponseMessage()+" - is a broken link");
	            	XLUtils.setCellData(path,"User",i,1,https);
	            	XLUtils.setCellData(path,"User",i,2,httpURLConnect.getResponseMessage());
	            }    
	       
	            //Fetching and Printing the response code obtained
	            else{
	                System.out.println(linkUrl+" - "+http+" - "+httpURLConnect.getResponseMessage()+" - is a Active link");
	                XLUtils.setCellData(path,"User",i,1,https);
	            	XLUtils.setCellData(path,"USer",i,2,httpURLConnect.getResponseMessage());
	            }
	        }
			catch (Exception e) {
	      }
		}
    	
		System.out.println("Links end");
		
	}
	

}
