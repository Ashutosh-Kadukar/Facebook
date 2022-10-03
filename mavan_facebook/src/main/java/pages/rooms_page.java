package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Utility;

public class rooms_page extends Utility{
	private WebDriver driver ;
	private Actions act ;
	
	@FindBy (xpath = "//a[text()=' Return to messenger.com ']")
	private WebElement returntomessenger;

	@FindBy (xpath = "//a[text()=' Visit our help center ']")
	private WebElement visitourhelpcentre;
	
	public rooms_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver ;
		act = new Actions(driver);
	}
	
	public void clickonreturntomessenger()
	{
		act.moveToElement(returntomessenger).click().perform();
		//returntomessenger.click();
	}
	public void clickonvisitourhelpcentre()
	{
		visitourhelpcentre.click();
	}

}
