package com.admin.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.admin.pageObject.HI_Filtration;
import com.admin.pageObject.LoginTest;

public class HI_lead_Movement extends BaseClass {
	
	@Test	
	public void TC_Lead_movement() throws InterruptedException {
		HI_Filtration hf = new HI_Filtration(driver);
		LoginTest lt=new LoginTest(driver);
			driver.get(baseURL);
			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			lt.setUserName(username);
			lt.setPassword(password);
			lt.clickSubmit();
			try {
				Thread.sleep(2000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			hf.click_sidebar();
			hf.click_leads();
			hf.click_pending();
			hf.click_row();
			hf.click_filtrationbtn();
			Thread.sleep(2000);
			hf.lead_pin("123121");
			hf.lead_address("lead address");
//			driver.findElement(By.id("filterpin")).sendKeys("123456");
			WebElement sc=driver.findElement(By.id("filterrelation"));
			hf.HI_dropdown(sc, "Self");
			hf.lead_savebtn();
			hf.ph_dob("09092000");
			WebElement dob= driver.findElement(By.id("polholdergender"));
			hf.HI_dropdown(dob, "Male");
			WebElement state = driver.findElement(By.id("polholderstate"));
			hf.HI_dropdown(state, "Bihar");
			WebElement district = driver.findElement(By.id("polholderdistrict"));
			hf.HI_dropdown(district, "Gaya");
			hf.ph_pan("ASQWE1234C");
			WebElement income= driver.findElement(By.id("polholderincome"));
			hf.HI_dropdown(income, "1,50,000-3,00,000");
			WebElement education= driver.findElement(By.id("polholdereducation"));
			hf.HI_dropdown(education, "Graduate");
			Thread.sleep(2000);
			WebElement occupation= driver.findElement(By.id("polholderoccupation"));
			hf.HI_dropdown(occupation, "Farmer");
			hf.ph_address("patna");
			driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
			hf.ph_savebtn();

			//Complaint Details
			WebElement csubtype=driver.findElement(By.id("filtersubtype"));
			hf.HI_dropdown(csubtype, "Pre-Existing Disease");
			WebElement insu_comp = driver.findElement(By.id("filterinscomp"));
			hf.HI_dropdown(insu_comp, "L&T General Insurance Co. Ltd.");
			WebElement policy_type = driver.findElement(By.id("filterpoltype"));
			hf.HI_dropdown(policy_type, "Family");
			hf.cpolicy_no("7634573446");
			hf.cmember_id("mem121");
			WebElement patient_rel =driver.findElement(By.id("polholderrelationpat"));
			hf.HI_dropdown(patient_rel, "Son");
			hf.patient_name("patient");
			hf.hos_name("hospital");
			hf.claim_no("claim13");
			hf.sum_insured("63254");
			hf.claim_amount("41212");
			hf.date_hos("20012023");
			hf.date_dis("20012023");
			hf.date_rej("21012023");
			hf.problem("problem");
			hf.disease("disesase");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			hf.save();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			
			//upload doc
			hf.click_uploaddoc();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement poldoc = driver.findElement(By.name("PolicyDocHI"));
			js.executeScript("arguments[0].scrollIntoView();", poldoc);
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
//			hf.policy_doc("C:\\Users\\asus\\Documents\\upload doc");
			WebElement upload_btn =driver.findElement(By.xpath("//button[normalize-space()='Upload/Remove']"));
			js.executeScript("arguments[0].scrollIntoView();", upload_btn);
//			upload_btn.click();
		
		}

}
