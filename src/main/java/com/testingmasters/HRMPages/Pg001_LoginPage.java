package com.testingmasters.HRMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Pg001_LoginPage extends BasePage
{
	public Pg001_LoginPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='txtUsername']")
	WebElement Edt_Username;
	
	@FindBy(how=How.XPATH,using="//input[@id='txtPassword']")
	WebElement Edt_Password;
	
	@FindBy(how=How.XPATH,using="//input[@id='btnLogin']")
	WebElement Btn_Login;
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Welcome')]")
	WebElement Exit_Element;
	@FindBy(how=How.XPATH,using="")
	WebElement Mouse_Over;
	
	public void login()
	{
		weblib_setText(Edt_Username, "ankit3");
		logEvent("Able to enter username", "Unable to enter username", stepstatus,driver);
		
		weblib_setText(Edt_Password, "abcd1234");
		logEvent("Able to enter username", "Unable to enter username", stepstatus,driver);
		
		weblib_clickElement(Btn_Login);
		logEvent("Able to click on login", "Unable to click on login", stepstatus,driver);
	}
	
	public void launchApplication()
	{
		weblib_launchApplication(CommVar_BaseURL,driver);
		weblib_SetImplicitWait(10, driver);
		logEvent("Application Launched successfuly", "Unable to Launch Application", stepstatus,driver);
	}
	
	public void Exist()
	{
		weblib_exists(Exit_Element);
		logEvent("Element is exist", "Element is not exist", stepstatus,driver);
	}
	
public void weblib_Mouseover()
{
	weblib_mouseHover(Mouse_Over, driver);
	logEvent("Able to move on element", "Unable to move on element", stepstatus,driver);
}
	
}
