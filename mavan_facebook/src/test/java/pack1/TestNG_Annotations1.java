package pack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_Annotations1 {
 
  @BeforeSuite
  public void beforeSuite() 
  {
 	  System.out.println("beforeSuite - TestNG_Annotations1");
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("beforeTest - TestNG_Annotations1");
  }
  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("beforeClass - TestNG_Annotations1");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("beforeMethod - TestNG_Annotations1");
  }
  @Test
  public void test1() 
  {
	  System.out.println("test1 - TestNG_Annotations1");
  }
  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("afterMethod - TestNG_Annotations1");
  }
  @AfterClass
  public void afterClass() 
  {
	  System.out.println("afterClass - TestNG_Annotations1");
  }
  @AfterTest
  public void afterTest() 
  {
	  System.out.println("afterTest - TestNG_Annotations1");
  }
  @AfterSuite
  public void afterSuite() 
  {
 	  System.out.println("afterSuite - TestNG_Annotations1");
  }



}
