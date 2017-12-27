package com.testingmasters.TestScriptDefinitions;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.testingmasters.HRMPages.Pg001_LoginPage;
import com.testingmasters.HRMPages.Pg002_HomePage;
import com.testingmasters.HRMPages.Pg301_PersonalDetails;
import com.testingmasters.library.BaseClass;

public class Module1 extends BaseClass
{
  @Test
  public void TC101() 
  {
	  Pg001_LoginPage objLoginPage = new Pg001_LoginPage(driver);
	  Pg002_HomePage objHomePage = new Pg002_HomePage(driver);
	  Pg301_PersonalDetails objPersonalDetails = new Pg301_PersonalDetails(driver);
	  
	  objLoginPage.launchApplication();
	  objLoginPage.login();
	  objHomePage.navigateToMyInfo();
	  objPersonalDetails.changeFirstName();
	  objHomePage.logout();
  }
  
  @Test
  public void TC102() 
  {
	  Pg001_LoginPage objLoginPage = new Pg001_LoginPage(driver);
	  Pg002_HomePage objHomePage = new Pg002_HomePage(driver);
	  Pg301_PersonalDetails objPersonalDetails = new Pg301_PersonalDetails(driver);
		  
	  objLoginPage.launchApplication();
	  objLoginPage.login();
	  objHomePage.navigateToMyInfo();
	  objPersonalDetails.changeFirstName();
	  objHomePage.logout();
  }
  @Test
  public void TC103()
  {
	  Pg001_LoginPage objLoginPage = new Pg001_LoginPage(driver);
	  Pg002_HomePage objHomePage = new Pg002_HomePage(driver);
	  Pg301_PersonalDetails objPersonalDetails = new Pg301_PersonalDetails(driver);
		
	  objLoginPage.launchApplication();
	  objLoginPage.login();
	  objLoginPage.Exist();
	  objHomePage.NavigateTOTime();
	  objHomePage.NavigateToTimesheets();
	  objHomePage.navigateToMyTimeSheets();
	  objHomePage.ClickEdit();
	  objHomePage.logout();
	  
	  
  }
}
