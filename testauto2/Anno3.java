package testauto2;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Anno3 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String e, String p) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\17039\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://ui.freecrm.com/");
		
		//WebElement emailbox = driver.findElement(By.name("email"));
		POMF.Loginor.emailfield(driver).sendKeys(e);
		//WebElement passbox = driver.findElement(By.name("password"));
		POMF.Loginor.passfield(driver).sendKeys(p);
		//WebElement login = driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
		//login.click();
		
  }


	
 /* @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };*/
  
  @DataProvider(name="dp")
  public Object[][] dp1() {
    return new Object[][] {
       { "email1", "abcd" },
       { "email2111", "bggg" },
    };
  }
}
