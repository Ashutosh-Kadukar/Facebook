package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utils.Utility;

public class create_new_account_page extends Utility {
	private WebDriver driver ;
	private Select s ;
	
	//variable declaration
		@FindBy (xpath = "//input[@aria-label='First name']")
		private WebElement firstname;
		@FindBy (xpath = "//input[@aria-label='Surname']")
		private WebElement surname;
		@FindBy (xpath = "//input[@name='reg_email__']")
		private WebElement mobilenooremailaddress;
		@FindBy (xpath = "//input[@aria-label='Re-enter email address']")
		private WebElement reentermobilenooremailaddress;
		@FindBy (xpath = "//input[@aria-label='New password']")
		private WebElement newpassword;
		@FindBy (xpath = "//select[@aria-label='Day']")
		private WebElement date;
		@FindBy (xpath = "//select[@aria-label='Month']")
		private WebElement month;
		@FindBy (xpath = "//select[@aria-label='Year']")
		private WebElement year;
		@FindBy (xpath = "//label[text()='Female']")
		private WebElement female;
		@FindBy (xpath = "//label[text()='Male']")
		private WebElement male;
		@FindBy (xpath = "//label[text()='Custom']")
		public WebElement Custom;
		@FindBy (xpath = "//a[text()='Learn more']")
		private WebElement learnmore;
		@FindBy (xpath = "//a[text()='Terms']")
		private WebElement terms;
		@FindBy (xpath = "//a[text()='Privacy Policy']")
		private WebElement privacypolicy;
		@FindBy (xpath = "//a[text()='Cookies Policy']")
		private WebElement cookiespolicy;
		@FindBy (xpath = "(//button[@type='submit'])[2]")
		private WebElement signup;
		@FindBy (xpath = "//img[@class='_8idr img']")
		private WebElement canclecreatenewaccountpopup;
		
		//variable initialization
		
		public create_new_account_page(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			this.driver = driver;
		}
		
		public String sendfirstname(String name)
		{
			firstname.sendKeys(name);
			String text = firstname.getAttribute("placeholder");
			return text;
		}
		public void sendsurname(String name)
		{
			surname.sendKeys(name);
		}
		public void sendmobilenooremailaddress(String name) 
		{
			mobilenooremailaddress.sendKeys(name);
		}
		public void sendreentersendmobilenooremailaddress(String name) 
		{
			reentermobilenooremailaddress.sendKeys(name);
		}
		public void sendnewpassword(String name) 
		{
			newpassword.sendKeys(name);				
		}
		public void clickondate(String a) 
		{
			date.click();
		    s = new Select(date);
			s.selectByValue(a);
			date.click();
		}
		public void clickonmonth(String b) 
		{
			month.click();
			s = new Select(month);
			s.selectByIndex(5);
			month.click();
		}
		public void clickonyear(String c) 
		{
			year.click();
			s = new Select(year);
			s.selectByValue(c);
			year.click();
		}
		public void clickonmfemale() 
		{
			female.click();
		}
		public void clickonmale() 
		{
			male.click();
		}
		public boolean Custom() 
		{
			boolean result  = Custom.isSelected();
			return result;
		}
		public boolean clickonCustom() throws InterruptedException 
		{	
			Custom.click();
			Thread.sleep(2000);
			boolean result = Custom.isSelected();
			return result;
		}
		public void clickonlearnmore() 
		{
			learnmore.click();
		}
		public void clickonterms() 
		{
			terms.click();
		}
		public void clickonprivacypolicy() 
		{
			privacypolicy.click();
		}
		public void clickoncookiespolicy() 
		{
			cookiespolicy.click();
		}
		public void clickonsignup() 
		{
			signup.click();
		}
		public void clickoncanclecreatenewaccountpopup() 
		{
			canclecreatenewaccountpopup.click();
		}

}
