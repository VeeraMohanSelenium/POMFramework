package com.testingmasters.HRMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Pg301_PersonalDetails extends BasePage 
{
	public Pg301_PersonalDetails(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='Edit']")
	WebElement Btn_Edit;
	
	@FindBy(how=How.NAME,using="personal[txtEmpFirstName]")
	WebElement Edt_FirstName;
	@FindBy(how=How.XPATH,using=".//*[@id='personal_cmbNation']")
	WebElement Lnk_DropDown;
	@FindBy(how=How.XPATH,using=".//*[@id='personal_txtLicExpDate']")
	WebElement Lnk_SetCalenderDate;
	

	public void changeFirstName()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		weblib_clickElement(Btn_Edit);
		logEvent("Able to click on Edit Button", "Unable to click on Edit button", stepstatus,driver);
		
		weblib_setText(Edt_FirstName, elib_getdata("FirstName"));
		logEvent("Able to set first name", "Unable to set firstname", stepstatus,driver);
	}
	public  void DropDownSelect()
	{
		weblib_setOptionInSelect(Lnk_DropDown, "Greek");
		logEvent("Able to select the value", "Unable to Select the value", stepstatus,driver);
	}
	public void License_Expiry()
	{
		weblib_setDateinCalender(Lnk_SetCalenderDate, "");
		logEvent("Able to select License Expiry date", "Unable to Select License Expiry date", stepstatus,driver);
	}
}
