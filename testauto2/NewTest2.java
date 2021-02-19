package testauto2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest2 {
  @Test (groups= {"Regression"}) 
  public void f() {
	  System.out.println ("This is from test method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println ("This is from before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println ("This is from after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println ("This is from before class method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println ("This is from after class method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println ("This is from before test method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println ("This is from after test  method");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println ("This is from before suite method");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println ("This is from after suite method");
  }

}
