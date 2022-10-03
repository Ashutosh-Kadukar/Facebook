package pack1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LogIn_or_SignUp_Page;
import pages.Messenger_page;

public class verify_language_change_to_marathi {
	
public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		LogIn_or_SignUp_Page logIn_or_SignUp_Page = new LogIn_or_SignUp_Page(driver);
	//	logIn_or_SignUp_Page.captureScreenshot(driver, 1001);
		String data = logIn_or_SignUp_Page.getDataFromExcelSheet("Result Sheet", 3, 1);
		System.out.println(data);
		logIn_or_SignUp_Page.clickonforgottenpassword();
		//logIn_or_SignUp_Page.clickonmarathi(1);
		//logIn_or_SignUp_Page.clickonloginpagebottomlist(18);
		//logIn_or_SignUp_Page.clickonloginelement("ashutosh@gmail.com", 0);
}
}