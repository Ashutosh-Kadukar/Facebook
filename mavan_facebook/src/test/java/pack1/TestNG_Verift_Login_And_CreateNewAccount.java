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
import org.testng.asserts.SoftAssert;

import Utils.Utility;
import pages.LogIn_or_SignUp_Page;
import pages.create_new_account_page;


public class TestNG_Verift_Login_And_CreateNewAccount {

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
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\\\Velocity\\\\automation\\\\selenium\\\\geckodriver-v0.31.0-win64\\\\geckodriver.exe");
			driver = new FirefoxDriver();
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
	@Test (priority = 1 )
	public void Verify_Login_Credentials() throws InterruptedException, IOException
	{
		TestID = 2001 ;
		String data = Utility.getDataFromExcelSheet("Result Sheet", 1, 0);
		logIn_or_SignUp_Page.sendusername(data);
		logIn_or_SignUp_Page.captureScreenshot(driver, TestID);
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		soft.assertNotEquals(url, "www.fb.com", "login url wrong");
		data = Utility.getDataFromExcelSheet("Result Sheet", 1, 1);
		logIn_or_SignUp_Page.sendpassword(data);
		Thread.sleep(2000);
		logIn_or_SignUp_Page.clickonlogin();
		Thread.sleep(2000);
		soft.assertAll();
	}
	@Test  (priority = 2 )
	public void Verify_CreateNewAccount_Button() throws InterruptedException, IOException
	{
		TestID = 2002 ;
		logIn_or_SignUp_Page.clickoncreatenewaccount();
		Thread.sleep(2000);
		String data = Utility.getDataFromExcelSheet("Result Sheet", 1, 2);
		create_new_account.sendfirstname(data);
		Thread.sleep(2000);
		data = Utility.getDataFromExcelSheet("Result Sheet", 1, 3);
		create_new_account.sendsurname(data);
		Thread.sleep(2000);
		data = Utility.getDataFromExcelSheet("Result Sheet", 1, 0);
		create_new_account.sendmobilenooremailaddress(data);
		Thread.sleep(2000);
		data = Utility.getDataFromExcelSheet("Result Sheet", 1, 0);
		create_new_account.sendreentersendmobilenooremailaddress(data);
		Thread.sleep(2000);
		data = Utility.getDataFromExcelSheet("Result Sheet", 1, 1);
		create_new_account.sendnewpassword(data);
		Thread.sleep(2000);
		create_new_account.clickondate("15");
		Thread.sleep(2000);
		create_new_account.clickonmonth("Jun");
		Thread.sleep(2000);
		create_new_account.clickonyear("2018");
		Thread.sleep(2000);
		create_new_account.clickonmale();
		Thread.sleep(2000);
		create_new_account.clickonCustom();
		String title = driver.getTitle();
		Assert.assertEquals(title, "create account", "title is wrong");
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
