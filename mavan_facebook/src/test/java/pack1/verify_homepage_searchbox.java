 package pack1;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.LogIn_or_SignUp_Page;
import pages.header;
import pages.homepage;

public class verify_homepage_searchbox {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		LogIn_or_SignUp_Page logIn_or_SignUp_Page = new LogIn_or_SignUp_Page(driver);
		//logIn_or_SignUp_Page.logintoapplication("9096032026", "ashu12345");
		logIn_or_SignUp_Page.sendusername("9096032026");
		logIn_or_SignUp_Page.sendpassword("ashu12345");
		logIn_or_SignUp_Page.clickonlogin();
		Thread.sleep(3000);
		header header = new header(driver);
		header.clickonsearchbox("priya ghotkar yewale");
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement priyaghotkar =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='Priya Ghotkar Yewale'])[1]")));
        priyaghotkar.click();
//		WebElement priyaghotkar = driver.findElement(By.xpath("(//span[text()='Priya Ghotkar Yewale'])[1]"));
//		priyaghotkar.click();
		Thread.sleep(3000);
//		WebElement photos = driver.findElement(By.xpath("(//span[text()='Photos'])[3]"));
//		photos.click();
		
		//condition
        WebElement pp =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@data-imgperflogname='profileCoverPhoto']")));
		pp.click();
		//Thread.sleep(4000);
		// WebElement image =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div/div[4]/div/div/div/div[1]/div/div/div/div/div[3]/div/div[47]/div/div/a/img")));
		// image.click();
//		WebElement image = driver.findElement(By.xpath("(//div[@class='gt60zsk1 ez8dtbzv r227ecj6 g4qalytl']//div)[264]"));
//		image.click();
		 
		// JavascriptExecutor js = (JavascriptExecutor)driver;
//			//scroll until target element is not displayed
//			js.executeScript("arguments[0].scrollIntoView(true)", image);
//			
//			js.executeScript("window.scrollBy(0, -1000)");
//			Thread.sleep(2000);
//			image.click();

		
        }
}