package pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotation2 {
	
	  @BeforeSuite
	  public void beforeSuite() 
	  {
	 	  System.out.println("beforeSuite - TestNG_Annotations2");
	  }
	  @BeforeTest
	  public void beforeTest() 
	  {
		  System.out.println("beforeTest - TestNG_Annotations2");
	  }
	  @BeforeClass
	  public void beforeClass() 
	  {
		  System.out.println("beforeClass - TestNG_Annotations2");
	  }
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		  System.out.println("beforeMethod - TestNG_Annotations2");
	  }
	  @Test
	  public void testA() 
	  {
		  System.out.println("testA - TestNG_Annotations2");
	  }
	  @AfterMethod
	  public void afterMethod() 
	  {
		  System.out.println("afterMethod - TestNG_Annotations2");
	  }
	  @AfterClass
	  public void afterClass() 
	  {
		  System.out.println("afterClass - TestNG_Annotations2");
	  }
	  @AfterTest
	  public void afterTest() 
	  {
		  System.out.println("afterTest - TestNG_Annotations2");
	  }
	  @AfterSuite
	  public void afterSuite() 
	  {
	 	  System.out.println("afterSuite - TestNG_Annotations2");
	  }

}
