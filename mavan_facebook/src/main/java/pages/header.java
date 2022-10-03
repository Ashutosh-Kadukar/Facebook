package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Utility;

public class header extends Utility{
	
	//variable declaration
			@FindBy (xpath = "//a[@aria-label='Facebook']")
			private WebElement facebooklogo;
			@FindBy (xpath = "(//input[@aria-label='Search Facebook'])[1]")
			private WebElement searchbox;
			@FindBy (xpath = "//span[@class='om3e55n1'][1]")
			private WebElement home;
			@FindBy (xpath = "//span[@class='om3e55n1'][2]")
			private WebElement watchvideos;
			@FindBy (xpath = "//span[@class='om3e55n1'][3]")
			private WebElement marketplace;
			@FindBy (xpath = "//span[@class='om3e55n1'][4]")
			private WebElement groups;
			@FindBy (xpath = "//span[@class='om3e55n1'][5]")
			private WebElement gamings;
			@FindBy (xpath = "//div[@aria-label='Account controls and settings']//span[8]")
			private WebElement menu;
			@FindBy (xpath = "//div[@aria-label='Account controls and settings']//span[7]")
			private WebElement messenger;
			@FindBy (xpath = "//div[@aria-label='Account controls and settings']//span[3]")
			private WebElement notifications;
			@FindBy (xpath = "//div[@aria-label='Account controls and settings']//span[1]")
			private WebElement account;
			
	//variable initialization
			
			public header(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
	//variable use
			
			public void clickonfacebooklogo()
			{
				facebooklogo.click();
			}
			public void clickonsearchbox(String name) throws InterruptedException
			{
				Thread.sleep(8000);
				searchbox.click();
				searchbox.sendKeys(name);
				searchbox.sendKeys(Keys.ENTER);
			}
			public void clickonhome()
			{
				home.click();
			}
			public void clickonwatchvideos()
			{
				watchvideos.click();
			}
			public void clickonmarketplace()
			{
				marketplace.click();
			}
			public void clickongroups()
			{
				groups.click();
			}
			public void clickongamings()
			{
				gamings.click();
			}
			public void clickonmenu()
			{
				menu.click();
			}
			public void clickonmessenger()
			{
				messenger.click();
			}
			public void clickonhomenotifications()
			{
				notifications.click();
			}
			public void clickonaccount()
			{
				account.click();
			}

}
