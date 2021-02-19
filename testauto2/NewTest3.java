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

public class NewTest3 {
  @Test
  public void f() {
	  System.out.println("This is from f method Test annotation");
  }
  @BeforeMethod
  public void f1() {
	  System.out.println("This is from f1 method before Method annotation");
  }

  @AfterMethod
  public void f2() {
	  System.out.println("This is from f2n  method after method annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is from before class method annotation");
  }

  @AfterClass
  public void afterClass() {System.out.println("This is from after class  method after class annotation");
  }

  @BeforeTest
  public void beforeTest() {System.out.println("This is from before test method annotation");
  }

  @AfterTest
  public void afterTest() {System.out.println("This is from after test method annotation");
  }

  @BeforeSuite
  public void beforeSuite() {System.out.println("This is from before suite method annotation");
	  
  }

  @AfterSuite
  public void afterSuite() {System.out.println("This is from after suite method annotation");
  }

}
