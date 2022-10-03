package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pages.LogIn_or_SignUp_Page;
import pages.create_new_account_page;

public class verify_user_can_createnewaccount {
	
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		LogIn_or_SignUp_Page logIn_or_SignUp_Page = new LogIn_or_SignUp_Page(driver);
		logIn_or_SignUp_Page.clickoncreatenewaccount();

		create_new_account_page create_new_account_page = new create_new_account_page(driver);
		Thread.sleep(2000);
		create_new_account_page.sendfirstname("priya");
		create_new_account_page.sendsurname("tayade");
		create_new_account_page.sendmobilenooremailaddress("kadukar@gmail.com");
		Thread.sleep(2000);
	   	create_new_account_page.sendreentersendmobilenooremailaddress("kadukar@gmail.com");
		Thread.sleep(2000);
		create_new_account_page.sendnewpassword("abcd12345");
	//	create_new_account_page.clickondate("10");
		boolean result =create_new_account_page.Custom();
	//	boolean result =create_new_account_page.clickonCustom();
		Assert.assertFalse(result,"custom not selected but shows selected");
		Thread.sleep(2000);
		create_new_account_page.clickoncanclecreatenewaccountpopup();

}
}