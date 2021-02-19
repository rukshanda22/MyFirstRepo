package testauto2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test (groups= {"Regression","Reg1"})
  public void f() {
	  System.out.println("This is from NewTest");
  }
  
  @Test (groups= {"Regression"})
  public void f1() {
	  int a=12;
			 if (a>=18) {System.out.println("TC1 is pass");
			 Reporter.log("TC1 is pass");
			 
			 }
			 else 
			 {System.out.println("TC2 is fail");
			 Reporter.log("TC2 is fail");}
			 
  }
}
