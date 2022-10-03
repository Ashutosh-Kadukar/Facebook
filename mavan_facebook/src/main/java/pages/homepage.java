package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Utility;

public class homepage extends Utility {
	
	//variable declaration
	@FindBy (xpath = "(((//div[@class='alzwoclg cqf1kptm cgu29s5g om3e55n1'])[1]//div)//li)[1]")
	private WebElement profile;
	@FindBy (xpath = "(((//div[@class='alzwoclg cqf1kptm cgu29s5g om3e55n1'])[1]//div)//li)[2]")
	private WebElement friends;
	@FindBy (xpath = "(((//div[@class='alzwoclg cqf1kptm cgu29s5g om3e55n1'])[1]//div)//li)[3]")
	private WebElement groups;
	@FindBy (xpath = "(((//div[@class='alzwoclg cqf1kptm cgu29s5g om3e55n1'])[1]//div)//li)[4]")
	private WebElement marketplace;
	@FindBy (xpath = "(((//div[@class='alzwoclg cqf1kptm cgu29s5g om3e55n1'])[1]//div)//li)[5]")
	private WebElement watch;
	@FindBy (xpath = "(((//div[@class='alzwoclg cqf1kptm cgu29s5g om3e55n1'])[1]//div)//li)[6]")
	private WebElement memories;
	@FindBy (xpath = "(//div[contains(@class,'alzwoclg jl2a5g8c jcxyg2ei ')]//span)[1]")
	private WebElement stories;
	@FindBy (xpath = "(//div[contains(@class,'alzwoclg jl2a5g8c jcxyg2ei ')]//span)[2]")
	private WebElement reels;
	@FindBy (xpath = "(//div[contains(@class,'alzwoclg jl2a5g8c jcxyg2ei ')]//span)[3]")
	private WebElement rooms;
	@FindBy (xpath = "(//div[contains(@class,'alzwoclg jl2a5g8c jcxyg2ei ')]//span)[65]")
	private WebElement createstory;
	@FindBy (xpath = "(//div[@aria-label='Create a post']//div)[6]")
	private WebElement whatsonyourmind;
	@FindBy (xpath = "(//div[@aria-label='Create a post']//div)[9]")
	private WebElement livevideo;
	@FindBy (xpath = "(//div[@aria-label='Create a post']//div)[12]")
	private WebElement photosorvideo;
	@FindBy (xpath = "(//div[@aria-label='Create a post']//div)[15]")
	private WebElement feelingsoractivity;
	
	//variable initialization
	
	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//variable use
	
	public void clickonprofile()
	{
		profile.click();
	}
	public void clickonfriends()
	{
		friends.click();
	}
	public void clickongroups()
	{
		groups.click();
	}
	public void clickonmarketplace()
	{
		marketplace.click();
	}
	public void clickonwatch()
	{
		watch.click();
	}
	public void clickonmemories()
	{
		memories.click();
	}
	public void clickonstories()
	{
		stories.click();
	}
	public void clickonreels()
	{
		reels.click();
	}
	public void clickonrooms()
	{
		rooms.click();
	}
	public void clickoncreatestory()
	{
		createstory.click();
	}
	public void sendwhatsonyourmind()
	{
		whatsonyourmind.click();
	}
	public void clickonlivevideo()
	{
		livevideo.click();
	}
	public void clickonphotosorvideo()
	{
		photosorvideo.click();
	}
	public void clickonfeelingsoractivity()
	{
		feelingsoractivity.click();
	}

	



}
