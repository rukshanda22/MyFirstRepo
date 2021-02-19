package testauto2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class NewPara {
  
	WebDriver driver;
	
	@Test
  @Parameters ( { "email2" , "pass"})
  public void f(String e, String p) {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\17039\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://ui.freecrm.com/");
		
		WebElement emailbox = driver.findElement(By.name("email"));
		emailbox.sendKeys(e);
		WebElement passbox = driver.findElement(By.name("password"));
		passbox.sendKeys(p);
		WebElement login = driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
		login.click();
		
  }
}
