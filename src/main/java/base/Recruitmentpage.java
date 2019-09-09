package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Recruitmentpage {

	WebDriver driver;
	By Recruitmentbuttonbutton = By.id("menu_recruitment_viewRecruitmentModule");
	By Vaccancies = By.id("menu_recruitment_viewJobVacancy");
	By systemuser = By.xpath("//a[@class='toggle tiptip']");
	
	public Recruitmentpage(WebDriver driver)
	{
		this.driver=driver;
	}
	 public void Recruitmentbuttonbutton()
	 {
		 Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(Recruitmentbuttonbutton)).build().perform();
			
	 }
	 public WebElement vaccancies()
	 {
		 return driver.findElement(Vaccancies);
	 }
	 
	 public WebElement systemuser()
	 {
		 return driver.findElement(systemuser);
	 } 
	
	 
}
