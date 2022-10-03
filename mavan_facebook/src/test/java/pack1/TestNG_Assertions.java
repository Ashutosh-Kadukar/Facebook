package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LogIn_or_SignUp_Page;
import pages.create_new_account_page;

public class TestNG_Assertions {
	

	private WebDriver driver ;
	private LogIn_or_SignUp_Page logIn_or_SignUp_Page ;
	private create_new_account_page create_new_account ;
	private SoftAssert soft ;

	@BeforeClass
	public void LaunchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@BeforeMethod
	public void Verify_Login_and_CreateNewAccount() throws InterruptedException
	{
        driver.get("https://www.facebook.com/");
	    logIn_or_SignUp_Page = new LogIn_or_SignUp_Page(driver);
	    Thread.sleep(2000);
//	    String url = driver.getCurrentUrl();
//	    Assert.assertEquals(url, "https://www.facebook/", "url chukla");
	    soft = new SoftAssert();
	}
	@Test (enabled = false)
	public void Verify_Login_Credentials() throws InterruptedException
	{
		logIn_or_SignUp_Page.sendusername("xyz@gmail.com");
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);

//		Assert.assertEquals(url, "https://www.facebook/", "url chukla");
//		Reporter.log("Url Assertion Pass",true);
		
//		Assert.assertNotEquals(title, "Facebook – log in or sign up", "Title chukla");
//		Reporter.log("Title Assertion Pass",true);
		
//		boolean result = url.equals("www.facebook.com") ;
//		Assert.assertTrue(result , "url chukli");  //result true=>tc=>pass 
//		Reporter.log("assertion pass" , true);     //result false=>tc=>fail 
		
//		boolean result = title.equals("Facebook – log in or sign up");
//		Assert.assertFalse(result, "Title chukla");  //result true=>tc=>fail
//		Reporter.log("Assertion pass", true);        //result false=>tc=>pass 
		
//		Assert.fail(); //forcefully fail the test method
		
//	    logIn_or_SignUp_Page.sendpassword("12345");
//		Thread.sleep(2000);
//		logIn_or_SignUp_Page.clickonlogin();
//		Thread.sleep(2000);	
	}	
	@Test 
	public void Verify_CreateNewAccount_Button() throws InterruptedException
	{
		
		logIn_or_SignUp_Page.clickoncreatenewaccount();
		Thread.sleep(1000);
		String url = driver.getCurrentUrl();
		create_new_account = new create_new_account_page(driver);
		String text = create_new_account.sendfirstname("aniket");
		System.out.println(text);
		
//		soft.assertEquals(text, "First name" , "textbox text chukla");
		
		soft.assertNotEquals(url, "https://www.facebook.com/" , "url chukli bhau");
	
//		boolean result = url.equals("https://www.facebook.com/");
//		soft.assertTrue(result, "chukla n ga url");
//		soft.assertFalse(result, "abey chukla url");
		
//		soft.fail();
		
		Thread.sleep(1000);
		create_new_account.sendsurname("gadge");
		soft.assertAll();
	}
	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}
}
