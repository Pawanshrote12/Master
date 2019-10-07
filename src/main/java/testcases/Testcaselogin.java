package testcases;

import java.io.IOException;
import org.apache.logging.log4j.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Baseclss;
import base.Leavepage;
import base.Loginpage;
import base.Recruitmentpage;

@Listeners(testcases.ListnerTest.class)

public class Testcaselogin extends Baseclss{
	
	private static Logger log = LogManager.getLogger(Testcaselogin.class.getName());
	
	
	Loginpage lp;
	Leavepage lph;
	Recruitmentpage recu;
	ListnerTest lt;

	

	
	
	  
	@BeforeMethod(groups = {"launchbrowser"}) 
	 
	  public void launchBrowser() throws IOException, InterruptedException{ 
		 
		  driver=initialiseBrowser(getProperties("browserName"));
		  log.info("initilizing browser");
		  driver.manage().deleteAllCookies();
		  driver.get(getProperties("URL"));
		 log.info("url launched");
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 lp = new Loginpage(driver);

	 Thread.sleep(2000);
		lp.username("Admin");
		log.info("username entered");
		
		lp.password("admin123");
		lp.loginclick();
	 }
	 

	 	 	 	 
@Test(groups = {"Regression"}) 
public void verifyleaveconfigureholidays() throws InterruptedException

{
	lph = new Leavepage(driver);
	
	lph.leavebutton();
	lph.leaveconfigure();
	lph.leaveconfigureHolidays().click();
	try {
	Assert.assertTrue(lph.holidaytitle().isDisplayed());
	log.info("webpage displayed successfully");
	}
	catch (Exception e)
	{
		log.error("webpage not displayed successfully");
	}
				
	}

@Test(groups = {"bonding"}) 
public void verifyrecruitmentpage()
{
	recu = new Recruitmentpage(driver);
	recu.Recruitmentbuttonbutton();
	log.info("clicking pawan");
	log.info("clicking pawan2");
	
	try {
		recu.vaccancies().click();		
			log.info("vaccancies clicked successfully");
	}
	catch (Exception e)
	{
		log.error("vaccancies not clicked successfully");
	}
			
	

	}












	
}
	
	
	
	

