package pack1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.Utility;
import pages.LogIn_or_SignUp_Page;
import pages.Messenger_page;
import pages.rooms_page;

public class TestNG_verify_rooms_page {
	
	private WebDriver driver ;
	private LogIn_or_SignUp_Page logIn_or_SignUp_Page ;
	private Messenger_page messenger_page ;
	private rooms_page rooms_page ;
	private int TestID ;
	
	@Parameters ("browser")	
	@BeforeTest
	public void LaunchBrowser(String BrowserName)
	{
		if(BrowserName.equals("Chrome"))
		{
		    System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		}
		if(BrowserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Velocity\\automation\\selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void createPomObjects()
	{
		logIn_or_SignUp_Page = new LogIn_or_SignUp_Page(driver);
		messenger_page = new Messenger_page(driver);
		rooms_page = new rooms_page(driver);
	}
	@BeforeMethod
	public void OpenRoomsPage() throws IOException
	{
	    driver.get("https://www.facebook.com/"); 
		logIn_or_SignUp_Page.clickonmessenger();
		messenger_page.clickonrooms(1);	 
	}
	@Test
	public void Verify_ReturnToMessenger_button() throws IOException, InterruptedException
	{
		TestID = 3001 ;
		String title = driver.getTitle();
		Assert.assertEquals(title, "rooms page", "title is wrong");
		rooms_page.clickonreturntomessenger();
	}
	@Test 
	public void Verify_VisitToHelpCenter_button() throws IOException, InterruptedException
	{
		TestID = 3002 ;
		rooms_page.clickonvisitourhelpcentre();
		String url = driver.getCurrentUrl();
		Assert.assertNotEquals(url, "www.messenger.com","url is wrong");
		Thread.sleep(2000);
	}
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.captureScreenshot(driver, TestID);
		}
	}
	@AfterClass
	public void removeObjects()
	{
		logIn_or_SignUp_Page = null ;
		messenger_page = null ;
		rooms_page = null ;
		
	}
	@AfterTest
	public void closedBrowser()
	{
		driver.quit();
		driver = null ;
		System.gc();
	}

}
