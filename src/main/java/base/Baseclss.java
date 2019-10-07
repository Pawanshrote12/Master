package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Baseclss {

		public static  WebDriver driver;
		File file=new File("C:\\Users\\pawan.shrote\\eclipse-workspace\\Seleniumautomationframeworkfromscratch\\src\\main\\java\\base\\dataproperty");
		
		public String getProperties(String key) throws IOException {
		
			Properties prop=new Properties();
			FileInputStream fis=new FileInputStream(file);
			prop.load(fis);
			return prop.getProperty(key);
			
		}
		
	
		public WebDriver initialiseBrowser(String browserName) throws IOException {
			if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "D:\\Seleniumdrivers\\Chromedriverlatest\\chromedriver_win32\\chromedriver.exe");
				 driver=new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "D:\\Seleniumdrivers\\geckodriver_win64\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "D:\\Seleniumdrivers\\IEDriverServer\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();
			}
			return driver;
		    
		}
		
			
		public void getScreenshot(String methodname) throws IOException {
			 File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	         
				FileUtils.copyFile(file, new File("D:\\seleniumerrorscreenshot\\"+methodname+"scr.jpg"));
			 }
}