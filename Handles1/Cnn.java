package Handles1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cnn {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\17039\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.cnn.com/account/register");
		String hphandle = driver.getWindowHandle();
		System.out.println(hphandle);
		
		/*WebElement afflink = driver.findElement(By.xpath("//*[@id=\"registration-page-content\"]/form/label/span/span/a"));
		afflink.click();
		
		String aftitle= "Affiliates | WarnerMedia Privacy Center";
		//String affurl = "https://www.warnermediaprivacy.com/affiliates/";
		
		Set<String> whs = driver.getWindowHandles();
		
		for (String wh : whs) {
			if (driver.switchTo().window(wh).getTitle().equals(aftitle));
			//if (driver.switchTo().window(wh).getCurrentUrl().equals(affurl));
			//System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
		}*/
		
		//driver.switchTo().window(hphandle);
		WebElement tc = driver.findElement(By.xpath("//*[@id=\"tos-text\"]/span/a[1]"));
		tc.click();
		
		String tcurl = "https://www.cnn.com/terms";
		
		Set<String> wh2=driver.getWindowHandles();
		for (String wht : wh2) {
			if (driver.switchTo().window(wht).getCurrentUrl().equals(tcurl));
			System.out.println(driver.getCurrentUrl());
		}
		
		WebElement text = driver.findElement(By.xpath("//*[@id=\"body-text\"]/div[1]/div[9]/div[7]/strong"));
	
		String et= "2. User Content and Conduct; Community Guidelines";
		
		String t = text.getText();
		System.out.println(t);
		
		
		if (et.equals(t)) {
			System.out.println("TC verify text passed");
			
		}
		else
		{
			System.out.println("TC verify text failed");}
		

	}

}
