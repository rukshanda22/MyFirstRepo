package testauto2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Anno2 {
 @BeforeClass
 public void bc1 () {
	 System.out.println("This is from Anno 2 class before class bc1 method");
 }
	
	@Test
  public void f2() {
	  System.out.println("This is from Anno 2 class test f2 method");
  }
	
	@AfterClass
	 public void ac1 () {
		 System.out.println("This is from Anno 2 class after class ac1 method");
	 }
}
