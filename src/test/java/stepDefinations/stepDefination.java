package stepDefinations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import base.Baseclss;
import base.Leavepage;
import base.Loginpage;
import base.Recruitmentpage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefination extends Baseclss{
	
	Loginpage lp;
	Leavepage lph;
	Recruitmentpage recu;

	  @Given("^Navigate to url$")
	    public void navigate_to_url() throws Throwable {
		
			  driver=initialiseBrowser(getProperties("browserName"));
			  driver.get(getProperties("URL"));
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
			
	    }

	    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	    	
	    	 lp = new Loginpage(driver);
				lp.username(strArg1);
				lp.password(strArg2);
				lp.loginclick();
	    	
	    	
	    	
	    	
	    	
	    	
	    }

	    @Then("^Click on leave button$")
	    public void click_on_leave_button() throws Throwable {
           lph = new Leavepage(driver);
	    	
	    	lph.leavebutton();
	    	
	    	
	    }

	    @Then("^Verify holiday page title$")
	    public void verify_holiday_page_title() throws Throwable {
	    	Assert.assertTrue(lph.holidaytitle().isDisplayed());
	    }

	    @Then("^Click on recruitment button$")
	    public void click_on_recruitment_button() throws Throwable {
	    	recu = new Recruitmentpage(driver);
	    	recu.Recruitmentbuttonbutton();
	    	
	    }

	    @And("^Click on configure$")
	    public void click_on_configure() throws Throwable {
	    	lph.leaveconfigure();
	    	
	    }

	    @And("^Click on holidays$")
	    public void click_on_holidays() throws Throwable {
	    	lph.leaveconfigureHolidays().click();
	    }

	    @And("^Click on Vaccancy$")
	    public void click_on_vaccancy() throws Throwable {
	    	recu.vaccancies().click();
	    }
// adding some changes

}
