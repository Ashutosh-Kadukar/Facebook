package Reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver openchrome()
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\V\\automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 return driver ;
	}
	public static WebDriver openFirefox()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\V\\automation\\selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver ;
	}
	

}
