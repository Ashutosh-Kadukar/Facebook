package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.Utility;

public class Messenger_page extends Utility {
	private WebDriver driver ;
	private Actions act ;
	private WebDriverWait wait ;
	@FindBy (xpath = "//header[@aria-label='Header']//a")
	private List<WebElement> header;
	
	public Messenger_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver ;
		act = new Actions(driver);
		wait = new WebDriverWait(driver, 10);
	}
	
	public void clickonrooms(int a)
	{
		act.moveToElement(header.get(a)).click().perform();
	}
	public void clickonfeatures(int a)
	{
		wait.until(ExpectedConditions.visibilityOf(header.get(a)));
		header.get(a).click();
	}
	public void clickondesktopapp(int a)
	{
		header.get(a).click();
	}
	public void clickonprivacyandsafety(int a)
	{
		header.get(a).click();
	}

}
