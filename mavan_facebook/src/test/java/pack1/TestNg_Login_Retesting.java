package pack1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Reusable.Base;
import Utils.Utility;
import pages.LogIn_or_SignUp_Page;
import pages.create_new_account_page;

public class TestNg_Login_Retesting {
	
	private WebDriver driver ;
	private LogIn_or_SignUp_Page logIn_or_SignUp_Page ;
	private create_new_account_page create_new_account ;
	private SoftAssert soft ;
	private int TestID ;
	
	@Parameters ("browser")
	@BeforeTest
	public void LaunchBrowser(String browserName) 
	{
		if(browserName.equals("Chrome"))
		{
			driver = Base.openchrome();
		}
		if(browserName.equals("Firefox"))
		{
			driver = Base.openFirefox();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@BeforeClass
	public void createPomObjects()
	{
		logIn_or_SignUp_Page = new LogIn_or_SignUp_Page(driver);
		create_new_account = new create_new_account_page(driver);
		soft = new SoftAssert();	
	}
	@BeforeMethod
	public void Verify_Login_and_CreateNewAccount() 
	{
        driver.get("https://www.facebook.com/");	
	}
	@Test (priority = 1 ,invocationCount = 3 )
	public void Verify_Login_Credentials() throws InterruptedException, IOException
	{
		TestID = 2001 ;
		for(int i=1;i<4;i++)
		{
		String data = Utility.getDataFromExcelSheet("Result Sheet", i, 0);
		logIn_or_SignUp_Page.sendusername(data);
		
		Thread.sleep(2000);
		for(int j=1;j<4;j++)
		{
		data = Utility.getDataFromExcelSheet("Result Sheet", 1, j);
		logIn_or_SignUp_Page.sendpassword(data);
		Thread.sleep(2000);
		logIn_or_SignUp_Page.clickonlogin();
		}		
		Thread.sleep(2000);
	    }
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
		create_new_account = null ;
		soft = null ;
	}
	@AfterTest
	public void afterClass()
	{
		driver.quit();
		driver = null ;
		System.gc();
	}

}
