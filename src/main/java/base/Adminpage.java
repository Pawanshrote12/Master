package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Adminpage {
	
	
	WebDriver driver;
	By Admin = By.xpath("//a[@id='menu_admin_viewAdminModule']");
	By Job = By.id("menu_admin_Job");
	By Workshifts = By.xpath("//a[@id='menu_admin_workShift']");
	By Workshift_title = By.linkText("Work Shifts");

	public Adminpage(WebDriver driver)
	{
		this.driver=driver;
	}
	 public  void Admin()
	 {
		 Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(Admin)).build().perform();
			
	 }
	 
	 public void Job()
	 {
		 Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(Job)).build().perform();
			
	 }
	 
	 public WebElement Workshifts()
	 {
		return driver.findElement(Workshifts);
	 }
	 
	 public WebElement Workshift_title()
	 {
		return driver.findElement(By.id("Workshift_title"));
	 }
	 
	 
	
}
