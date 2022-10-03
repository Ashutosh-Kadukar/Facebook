package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LogIn_or_SignUp_Page;
import pages.Messenger_page;
import pages.rooms_page;

public class verify_visitourhelpcentre {
	
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		LogIn_or_SignUp_Page logIn_or_SignUp_Page = new LogIn_or_SignUp_Page(driver);
		logIn_or_SignUp_Page.clickonmessenger();
		
		Messenger_page messenger_page = new Messenger_page(driver);
		messenger_page.clickonrooms(1);
		
		rooms_page rooms_page = new rooms_page(driver);
		rooms_page.clickonvisitourhelpcentre();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		if(url.equals("https://www.messenger.com/help") && title.equals("Messenger Help Centre"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
}
}


