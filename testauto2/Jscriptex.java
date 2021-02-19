package testauto2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jscriptex {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\17039\\Downloads\\chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	  driver.get("https://ui.freecrm.com/");
      
      
      
     // WebElement link1 = driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
      
       JavascriptExecutor js = (JavascriptExecutor)driver;
     // js.executeScript("arguments[0].click();", link1);
      
      WebElement fgpwd = driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/div[1]"));
      js.executeScript("arguments[0].click();", fgpwd);
      
      WebElement ebox = driver.findElement(By.name("email"));
      
      js.executeScript("document.getElementsByName('email')[0].value='test@test.com';");
      
      WebElement psw = driver.findElement(By.name("password"));
      js.executeScript("document.getElementsByName('password')[0].value='asdfgh';");
      
     // Unable to locate element and perform action
      js.executeScript("document.querySelector('#ui > div > div > form > div > div.ui.fluid.large.blue.submit.button').click();");
      
      js.executeScript("document.getElementsByClassName('ui fluid large blue submit button')[0].click();");
      
  }
}
