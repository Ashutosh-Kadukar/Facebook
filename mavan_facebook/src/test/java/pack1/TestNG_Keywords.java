package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LogIn_or_SignUp_Page;
import pages.Messenger_page;
import pages.rooms_page;

public class TestNG_Keywords {
	@BeforeClass 
	public void beforeClass()
	{
		System.out.println("beforeClass");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}	
	@Test (priority = 0, invocationCount = 2, timeOut = 3000)
	public void test1()
	{
		System.out.println("test 1");
		//Assert.fail();
	}
	@Test (priority = 3, dependsOnMethods = {"test1"})
	public void test2(	)
	{
		System.out.println("test 2");
	}
	@Test (enabled = false)
	public void test3()
	{
		System.out.println("test3");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
	}
}


