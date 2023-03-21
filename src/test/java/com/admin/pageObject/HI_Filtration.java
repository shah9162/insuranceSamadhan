package com.admin.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HI_Filtration {
	
WebDriver ldriver;
	
	public HI_Filtration(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="navLinkSideBar")
	@CacheLookup
	WebElement sidebar;
	
	@FindBy(id="leads")
	@CacheLookup
	WebElement leads;
	//HI_Filtration lp = new HI_Filtration()
	
	
	@FindBy(xpath="//ul[@class='d-block nav']//li[1]//a[1]")
	@CacheLookup
	WebElement pending;
	
	@FindBy(xpath="//p[normalize-space()='Lead Hi']")
	@CacheLookup
	WebElement leadrow;
	
	@FindBy(id="leadFiltrationForm")
	@CacheLookup
	WebElement filtrationbtn;
	
	@FindBy(id="filteraddress")
	@CacheLookup
	WebElement leadaddress;
	
	@FindBy(id="filterpin")
	@CacheLookup
	WebElement leadpin;
	
	@FindBy(id="filterrelation")
	@CacheLookup
	WebElement leadrelation;
	
	@FindBy(id="filtercomptype")
	@CacheLookup
	WebElement leadcomplanit;
	
	@FindBy(id="saveleaddetails")
	@CacheLookup
	WebElement leadsavebtn;
	
	@FindBy(id="polholdername")
	@CacheLookup
	WebElement phname;
	
	@FindBy(id="polholderemail")
	@CacheLookup
	WebElement phemail;
	
	@FindBy(id="polholderphone")
	@CacheLookup
	WebElement phmobile;
	
	@FindBy(id="filterdob")
	@CacheLookup
	WebElement phdob;
	
	@FindBy(id="polholderpin")
	@CacheLookup
	WebElement phpin;
	
	@FindBy(id="polholdergender")
	@CacheLookup
	WebElement phgender;
	
	@FindBy(id="polholderstate")
	@CacheLookup
	WebElement phstate;
	
	@FindBy(id="polHolderDistrict")
	@CacheLookup
	WebElement phdistrict;
	
	@FindBy(id="polholderpan")
	@CacheLookup
	WebElement phpan;
	
	@FindBy(id="polholderincome")
	@CacheLookup
	WebElement phincome;
	
	@FindBy(id="polholdereducation")
	@CacheLookup
	WebElement pheducation;
	
	@FindBy(id="polholderoccupation")
	@CacheLookup
	WebElement phoccupation;
	
	@FindBy(id="polholderaddress")
	@CacheLookup
	WebElement phaddress;
	
	@FindBy(id="savepolholderdetails")
	@CacheLookup
	WebElement phsavebtn;
	
	@FindBy(id="filtersubtype")
	@CacheLookup
	WebElement csubtype;
	
	@FindBy(id="filterinscomp")
	@CacheLookup
	WebElement cinsurancecom;
	
	@FindBy(id="filterpoltype")
	@CacheLookup
	WebElement cpolicytype;
	
	@FindBy(id="filterpolnum")
	@CacheLookup
	WebElement cpolicyno;
	
	@FindBy(id="filtermemcernumber")
	@CacheLookup
	WebElement cmemberid;
	
	@FindBy(id="polholderrelationpat")
	@CacheLookup
	WebElement crelation;
	
	@FindBy(id="polholderpatname")
	@CacheLookup
	WebElement cpatientname;
	
	@FindBy(id="polhospitalname")
	@CacheLookup
	WebElement hosname;
	
	@FindBy(id="filterclaimnumber")
	@CacheLookup
	WebElement claimno;
	
	@FindBy(id="filtersuminsured")
	@CacheLookup
	WebElement suminsured;
	
	@FindBy(id="filterclaimamount")
	@CacheLookup
	WebElement claimamount;
	
	@FindBy(id="filterdoh")
	@CacheLookup
	WebElement datehos;
	
	@FindBy(id="filterdod")
	@CacheLookup
	WebElement datedis;
	
	@FindBy(id="filterdor")
	@CacheLookup
	WebElement daterej;
	
	@FindBy(id="filterproblemstatement")
	@CacheLookup
	WebElement cproblem;
	
	@FindBy(id="polholderdisease")
	@CacheLookup
	WebElement cdisease;
	
	@FindBy(id="save")
	@CacheLookup
	WebElement csave;
	
	//upload doc
	@FindBy(xpath="//div[@class='collapse show']//button[@id='UD-btn']//img")
	@CacheLookup
	WebElement uploaddoc;
	
	@FindBy(xpath="//input[@name='PolicyDocHI']")
	@CacheLookup
	WebElement policydoc;
	
	public void click_sidebar() {
		sidebar.click();
	}
	
	
	public void click_leads() {
		leads.click();
	}
	
	public void click_pending() {
		pending.click();
	}
	
	public void click_row() {
		leadrow.click();
	}
	
	public void click_filtrationbtn() {
		filtrationbtn.click();
	}
	
	public void lead_address(String str) {
		leadaddress.clear();
		leadaddress.sendKeys(str);
	}
	
	public void lead_pin(String str) {
//		leadpin.clear();
		leadpin.sendKeys(str);
	}
	
	public void HI_dropdown(WebElement str,String st) {
		Select sc = new Select(str);
		sc.selectByVisibleText(st);
	}
	
	public void lead_savebtn() {
		leadsavebtn.click();
	}
	
	public void ph_name(String str) {
		phname.clear();
		phname.sendKeys(str);
	}
	
	public void ph_email(String str) {
		phemail.clear();
		phemail.sendKeys(str);
	}
	
	public void ph_mobile(String str) {
		phmobile.clear();
		phmobile.sendKeys(str);
	}
	
	public void ph_dob(String str) {
		phdob.clear();
		phdob.sendKeys(str);
	}
	
	public void ph_pin(String str) {
		phpin.clear();
		phpin.sendKeys(str);
	}
	
	public void ph_gender(String str) {
		phgender.clear();
		phgender.sendKeys(str);
	}
	
	public void ph_state(String str) {
		phstate.clear();
		phstate.sendKeys(str);
	}
	
	public void ph_district(String str) {
		phdistrict.clear();
		phdistrict.sendKeys(str);
	}
	
	public void ph_pan(String str) {
		phpan.clear();
		phpan.sendKeys(str);
	}
	
	public void ph_income(String str) {
		phincome.clear();
		phincome.sendKeys(str);
	}
	
	public void ph_edu(String str) {
		pheducation.clear();
		pheducation.sendKeys(str);
	}
	
	public void ph_occupation(String str) {
		pheducation.clear();
		pheducation.sendKeys(str);
	}
	
	public void ph_address(String str) {
		phaddress.clear();
		phaddress.sendKeys(str);
	}
	
	public void ph_savebtn() {
		phsavebtn.click();
	}
	
	public void csub_type(String str) {
		csubtype.sendKeys(str);
	}
	
	public void cinsu_com(String str) {
		cinsurancecom.sendKeys(str);
	}
	
	public void cpolicy_type(String str) {
		cpolicytype.clear();
		cpolicytype.sendKeys(str);
	}
	
	public void cpolicy_no(String num) {
		cpolicyno.clear();
		cpolicyno.sendKeys(num);
	}
	
	public void cmember_id(String str) {
		cmemberid.clear();
		cmemberid.sendKeys(str);
	}
	
	public void patient_relation(String str) {
		crelation.clear();
		crelation.sendKeys(str);
	}
	
	public void patient_name(String str) {
		cpatientname.clear();
		cpatientname.sendKeys(str);
	}
	
	public void hos_name(String str) {
		hosname.clear();
		hosname.sendKeys(str);
	}
	
	public void claim_no(String str) {
		claimno.clear();
		claimno.sendKeys(str);
	}
	
	public void sum_insured(String num) {
		suminsured.clear();
		suminsured.sendKeys(num);
	}
	
	public void claim_amount(String num) {
		claimamount.clear();
		claimamount.sendKeys(num);
	}
	
	public void date_hos(String str) {
		datehos.clear();
		datehos.sendKeys(str);
	}
	
	public void date_dis(String str) {
		datedis.clear();
		datedis.sendKeys(str);
	}
	
	public void date_rej(String str) {
		daterej.clear();
		daterej.sendKeys(str);
	}
	
	public void problem(String str) {
		cproblem.clear();
		cproblem.sendKeys(str);
	}
	
	public void disease(String str) {
		cdisease.clear();
		cdisease.sendKeys(str);
	}
	
	public void save() {
		csave.click();
	}
	
	public void click_uploaddoc() {
		uploaddoc.click();
	}
	
	public void policy_doc(String str) {
		policydoc.sendKeys(str);
	}

}
