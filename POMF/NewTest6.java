package POMF;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest6 {
  WebDriver driver;
	@Test(dataProvider= "dp1")

	  
	  public void f(String e, String p) throws IOException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\17039\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		  
		 // System.setProperty("webdriver.chrome.driver", "C:\\Users\\17039\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   // driver= new ChromeDriver();
		driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.get("https://ui.freecrm.com/");
			
			WebElement emailbox = driver.findElement(By.name("email"));
			emailbox.sendKeys(e);
			WebElement passbox = driver.findElement(By.name("password"));
			passbox.sendKeys(p);
			
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        //FileUtils.copyFile(scrFile, new File("C:\\Users\\17039\\Desktop\\screenshot\\page.png"));
	       FileHandler.copy(scrFile, new File("C:\\Users\\17039\\Desktop\\screenshot\\page.png"));
	       // FileHandler.copy (scrFile, new File("C:\\Users\\17039\\Desktop\\screenshot\\page.png"));
			
	  }
	  
	@DataProvider(name="dp1")
	  public String [][] dp() throws IOException{
		  Td1 edata = new Td1();
		  String filePath = System.getProperty("user.dir")+ "\\testdata";
		  return edata.readExcel(filePath, "Book1.xlsx", "Sheet1");
	  
	 
	}

	
	
	
	}
	

  
