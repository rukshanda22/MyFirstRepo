package testauto2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Anno1 {
  @Test
  public void f() {
	  System.out.println("This is from  test anno1 class f method");
  }
  
  @Test
  public void f1() {System.out.println("This is from test anno1 class f1 method");}
  
  @BeforeMethod
  public void g1() {
	  System.out.println("This is from before method anno1 class g1 method");
  }
  @AfterMethod
  public void g2() {
	  System.out.println("This is from after method anno1 class g2 method");
  }
  
}
