package testcases;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Baseclss;
import base.Leavepage;
import base.Loginpage;
import base.Recruitmentpage;

@Listeners(testcases.ListnerTest.class)

public class Testcaselogin2 extends Baseclss {
	
	
	Loginpage lp;
	Leavepage lph;
	Recruitmentpage recu;
	private static Logger log = LogManager.getLogger(Testcaselogin2.class.getName());
	
	 @BeforeMethod (groups = {"launchbrowser"}) 
	  public void launchBrowser() throws IOException{ 
		  driver=initialiseBrowser(getProperties("browserName"));
		  driver.get(getProperties("URL"));
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 lp = new Loginpage(driver);
		lp.username("Admin");
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
	Assert.assertTrue(lph.holidaytitle().isDisplayed());
				
	}
@Test (groups = {"bonding"}) 
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
