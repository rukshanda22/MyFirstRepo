package testauto2;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;

public class NewYork {
  WebDriver driver;
	@Test(dataProvider = "dp2")
  public void f(String fn, String ln, String e, String q) throws IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\17039\\Downloads\\chromedriver.exe");
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.newyorklife.com/contact-us");
		
		//WebElement fname = driver.findElement(By.id("guideContainer-rootPanel-guidetextbox_copy___widget"));
		POMF.Nylife.fname(driver).sendKeys(fn);
		//WebElement lname = driver.findElement(By.id("guideContainer-rootPanel-guidetextbox_copy_co___widget"));
		POMF.Nylife.lname(driver).sendKeys(ln);
		//WebElement emailbox = driver.findElement(By.id("guideContainer-rootPanel-guideemail_copy___widget"));
		POMF.Nylife.emailbox(driver).sendKeys(e);
		//WebElement qbox = driver.findElement(By.id("guideContainer-rootPanel-guidetextbox_6218579___widget"));
		POMF.Nylife.qbox(driver).sendKeys(q);
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(scrFile, new File("C:\\Users\\17039\\Desktop\\screenshot\\page.png"));
       FileHandler.copy(scrFile, new File("C:\\Users\\17039\\Desktop\\screenshot\\ny.png"));
  }

 /* @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };*/
	@DataProvider(name="dp2")
	  public Object[][] dp1() {
	    return new Object[][] {
	       { "Tina", "Rahman","email@gmail.com","how are you?" },
	       { "ruk", "dd","hshshs" ,"what is this ?"},
	       {"abby", "wwywy","email112", "what are your doing",},
	       {"ababa","sgsgs","emailssss","where are you ?",},
	    };
  }
}
