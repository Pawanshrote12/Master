package testcases;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

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

public class Testcaselogin extends Baseclss {
	
	
	Loginpage lp;
	Leavepage lph;
	Recruitmentpage recu;
	
	
	 @BeforeMethod 
	  public void launchBrowser() throws IOException{ 
		  driver=initialiseBrowser(getProperties("browserName"));
		  driver.get(getProperties("URL"));
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 lp = new Loginpage(driver);
		lp.username("Admin");
		lp.password("admin123");
		lp.loginclick();
	 }
	 

	 	 	 	 
@Test
public void verifyleaveconfigureholidays() throws InterruptedException

{
	lph = new Leavepage(driver);
	
	lph.leavebutton();
	lph.leaveconfigure();
	lph.leaveconfigureHolidays().click();
	Assert.assertTrue(lph.holidaytitle().isDisplayed());
				
	}
@Test 
public void verifyrecruitmentpage()
{
	recu = new Recruitmentpage(driver);
	recu.Recruitmentbuttonbutton();
	recu.vaccancies().click();	
	}
	
	
	
	
}
