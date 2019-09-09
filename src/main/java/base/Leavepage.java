package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Leavepage {
	
	
	 WebDriver driver;
	
	
	 By Leavebutton = By.id("menu_leave_viewLeaveModule");
	 By leaveconfigure = By.id("menu_leave_Configure");
	 By leaveconfigureHolidays = By.id("menu_leave_viewHolidayList");
	 By holidaytitle = By.xpath("//a[@class='toggle tiptip']");
	 
	 
	 public Leavepage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 
	 public void leavebutton()
	 {
		 Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(Leavebutton)).build().perform();
	 }
	 
	public void leaveconfigure() throws InterruptedException
	{       Thread.sleep(2000);
			Actions b = new Actions(driver);
			b.moveToElement(driver.findElement(leaveconfigure)).build().perform();
		 		 
	 }
	
	public WebElement leaveconfigureHolidays()
	{
			return driver.findElement(leaveconfigureHolidays);
	 }
	
	public WebElement holidaytitle()
	{
		return driver.findElement(holidaytitle);
	}

	
	
	

}
