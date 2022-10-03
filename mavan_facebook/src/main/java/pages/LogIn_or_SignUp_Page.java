package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Utility;

public class LogIn_or_SignUp_Page extends Utility {
	private WebDriver driver ;
	private Actions act ;
	//variable declaration
	@FindBy (xpath = "//input[@id='email']")
	private WebElement username;
	@FindBy (xpath = "//input[@id='pass']")
	private WebElement password;
	@FindBy (xpath = "//button[@name='login']")
	private WebElement loginbutton;
	
	@FindAll({ @FindBy (xpath = "//input[@id='email']"),
		@FindBy (xpath = "//input[@id='pass']"),
		@FindBy (xpath = "//button[@name='login']")})
	    private List<WebElement> loginelement;
	
	@FindBy (xpath = "//a[text()='Forgotten password?']")
	private WebElement forgottenpassword;
	@FindBy (xpath = "(//a[@role='button'])[2]")
	private WebElement createnewaccount;
	@FindBy (xpath = "//div[@id='reg_pages_msg']")
	private WebElement createapageforcelebritybrandorbusiness;
	@FindBy (xpath = "(//div[@id='pageFooter']//li)[1]")
	private WebElement English;
	@FindBy (xpath = "(//div[@id='pageFooter']//li)[2]")
	private WebElement marathi;
	@FindBy (xpath = "(//div[@id='pageFooter']//li)[3]")
	private WebElement hindi;
	@FindBy (xpath = "(//div[@id='pageFooter']//li)[13]")
	private WebElement signup;
	@FindBy (xpath = "(//div[@id='pageFooter']//li)[14]")
	private WebElement login;
	@FindBy (xpath = "(//div[@id='pageFooter']//li)[15]")
	private WebElement messenger;
	@FindBy (xpath = "(//div[@id='pageFooter']//li)[16]")
	private WebElement facebooklite;
	@FindBy (xpath = "(//div[@id='pageFooter']//li)[17]")
	private WebElement watch;
	@FindBy (xpath = "(//div[@id='pageFooter']//li)[18]")
	private WebElement places;
	@FindBy (xpath = "(//div[@id='pageFooter']//li)[19]")
	private WebElement games;
	@FindBy (xpath = "(//div[@id='pageFooter']//li)[20]")
	private WebElement marketplace;
	@FindBy (xpath = "(//div[@id='pageFooter']//li)[21]")
	private WebElement facebookpay;
	@FindBy (xpath = "(//div[@id='pageFooter']//li)[22]")
	private WebElement oculus;
	@FindBy (xpath = "(//div[@id='pageFooter']//li)[23]")
	private WebElement portal;
	@FindBy (xpath = "(//div[@id='pageFooter']//li)[24]")
	private WebElement instagram;
	
	@FindAll({ @FindBy(xpath = "(//div[@id='pageFooter']//li)[17]"),
		@FindBy (xpath = "//div[@id='pageFooter']//li"),
		@FindBy (xpath = "//div[@id='pageFooter']//li"),
		@FindBy (xpath = "//div[@id='pageFooter']//li")}) 
	    private List<WebElement> loginpagebottomlist;
	
	@FindBy (xpath = "//div[@id='pageFooter']//li")
	private List<WebElement> loginpagefooter;
	 
	
	//variable initialization
	public LogIn_or_SignUp_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	    this.driver = driver ;
	    act = new Actions(driver);
	}
	
	//variable use - webelement actions
	
	public void sendusername(String name)
	{
		username.sendKeys(name);	
	}
	public void sendpassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickonloginbutton() 
	{
		loginbutton.click();
	}
	public void clickonforgottenpassword() 
	{
		act.moveToElement(forgottenpassword).click().build().perform();
	}
	public void clickoncreatenewaccount() 
	{
		createnewaccount.click();
	}
	public void clickoncreateapageforcelebritybrandorbusiness() 
	{
		createapageforcelebritybrandorbusiness.click();
	}
	public void clickonEnglish() 
	{
		English.click();
	}
	public void clickonmarathi() 
	{
		marathi.click();
	}
	public void clickonhindi() 
	{
		hindi.click();
	}
	public void clickonsignup() 
	{
		signup.click();
	}
	public void clickonlogin() 
	{
		login.click();
	}
	public void clickonmessenger() 
	{
		messenger.click();
	}
	public void clickonfacebooklite() 
	{
		facebooklite.click();
	}
	public void clickonwatch() 
	{
		watch.click();
	}
	public void clickonplaces() 
	{
		places.click();
	}
	public void clickongames() 
	{
		games.click();
	}
	public void clickonmarketplace() 
	{
		marketplace.click();
	}
	public void clickonfacebookpay() 
	{
		facebookpay.click();
	}
	public void clickonoculus() 
	{
		oculus.click();
	}
	public void clickonportal() 
	{
		portal.click();
	}
	public void clickoninstagram() 
	{
		instagram.click();
	}
	public void clickonEnglish(int a) 
	{
		loginpagefooter.get(a).click();
	}
	public void clickonmarathi(int a) 
	{
		loginpagefooter.get(a).click();
	}
	public void clickonhindi(int a) 
	{
		loginpagefooter.get(a).click();
	}
	
	//or
	
	public void logintoapplication(String name, String pass) throws InterruptedException
	{
		username.sendKeys(name);
		password.sendKeys(pass);
		Thread.sleep(2000);
		loginbutton.click();
	}
	
	public void clickonloginpagebottomlist(int a) 
	{
		loginpagebottomlist.get(a).click();
	}
	
	public void clickonloginelement(String name , int a ) 
	{
		loginelement.get(a).sendKeys(name);
	}


}
