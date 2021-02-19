package Handles1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\17039\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://javascript.info/alert-prompt-confirm");
		
		WebElement calert = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/main/div[1]/article/div[2]/div[7]/div/div[1]/div[1]/a"));
		calert.click();
		
		Alert ca = driver.switchTo().alert();
		//Thread.sleep(100000);
		
		System.out.println(ca.getText());
		ca.dismiss();
		
		Alert ok = driver.switchTo().alert();
		
		
		System.out.println(ok.getText());
		ok.accept();
	

	}

}
