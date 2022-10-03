package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LogIn_or_SignUp_Page;
import pages.Messenger_page;
import pages.rooms_page;

public class verify_returntomessenger_button {
	
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		LogIn_or_SignUp_Page logIn_or_SignUp_Page = new LogIn_or_SignUp_Page(driver);
		logIn_or_SignUp_Page.clickonmessenger();
		
		Messenger_page messenger_page = new Messenger_page(driver);
		messenger_page.clickonrooms(1);
		//messenger_page.clickonfeatures(2);
		rooms_page rooms_page = new rooms_page(driver);
		rooms_page.clickonreturntomessenger();
		
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		if(url.equals("https://www.messenger.com/") && title.equals("Messenger"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
}
}