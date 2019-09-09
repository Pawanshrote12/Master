package base;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage extends Baseclss {

	WebDriver driver;
	Properties prop;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username = By.id("txtUsername");
	By password = By.id("txtPassword");
	By loginbutton = By.id("btnLogin");
	

	
	public WebElement username(String usernm)
	{
		driver.findElement(username).sendKeys(usernm);
		return null;
				
	}
	
	public WebElement password(String Pass)
	{
		driver.findElement(password).sendKeys(Pass);
		return null;
				
	}
	
	public void loginclick()
	{
		driver.findElement(loginbutton).click();
	}
	
	
	
	
	
}
