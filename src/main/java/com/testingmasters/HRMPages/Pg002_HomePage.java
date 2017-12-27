package com.testingmasters.HRMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Pg002_HomePage extends BasePage {
	public Pg002_HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[@id='welcome']")
	WebElement Lnk_LogoutExpand;

	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	WebElement Lnk_Logout;

	@FindBy(how = How.XPATH, using = "//b[text()='My Info']")
	WebElement Lnk_MyInfo;

	@FindBy(how = How.XPATH, using = "//b[text()='Performance']")
	WebElement Lnk_Performance;
	@FindBy(how = How.XPATH, using = "//a[@id='menu_time_viewTimeModule']/b")
	WebElement Lnk_Time;
	@FindBy(how = How.XPATH, using = "//b[@id='menu_time_Timesheets']")
	WebElement Lnk_TimeSheets;

	@FindBy(how = How.XPATH, using = "//b[text()='My Timesheets']")
	WebElement Lnk_MyTimeSheets;
	@FindBy(how = How.XPATH, using = "//b[@id='btnEdit']")
	WebElement Lnk_Edit;

	public void navigateToMyInfo() {
		weblib_clickElement(Lnk_MyInfo);
		logEvent("Able to click on MY Info Link", "Unable to click on MY Info Link", stepstatus, driver);
	}

	public void navigateToPerformance() {
		weblib_launchApplication(CommVar_BaseURL, driver);
		logEvent("Able to click on performance link", "Unable to click on performance link", stepstatus, driver);
	}

	public void logout() {
		weblib_clickElement(Lnk_LogoutExpand);
		weblib_clickElement(Lnk_Logout);
		logEvent("Logout is successful", "Logout is not successful", stepstatus, driver);
	}

	public void NavigateTOTime() {
		weblib_mouseHover(Lnk_Time, driver);
		logEvent("Able to navigate on Time link", "Unble to navigate on Time link", stepstatus, driver);
	}

	public void NavigateToTimesheets() {
		weblib_mouseHover(Lnk_TimeSheets, driver);
		logEvent("Able to navigate on TimeSheets link", "Unble to navigate on TimeSheets link", stepstatus, driver);
	}

	public void navigateToMyTimeSheets() {
		weblib_clickElement(Lnk_MyTimeSheets);
		logEvent("Able to click on MyTimeSheets Link", "Unable to click on MyTimeSheets Link", stepstatus, driver);
	}

	public void ClickEdit() {
		weblib_clickElement(Lnk_Edit);
		logEvent("Able to click on MY Info Link", "Unable to click on MY Info Link", stepstatus, driver);
	}
}
