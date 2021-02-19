import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\17039\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.geico.com");
		
		WebElement ins = driver.findElement(By.xpath("//*[@id=\"header-left-links\"]/ul[1]/li[1]/a"));
		//ins.click();
		boolean instext = ins.isDisplayed();
		System.out.println(instext);
		
		if (instext) {
			System.out.println("TC 1 insurance text displayed passed");}
		else
		{System.out.println("TC 1 insurance text displayed failed");}
		
		WebElement glogo = driver.findElement(By.cssSelector("#header-middle-links > a"));
		String logotext = glogo.getAttribute("title");
		String elogotext = "GEICO Homepage";
		System.out.println(logotext);
		
		if (logotext.equals(elogotext)) {
			System.out.println("TC logo displayed passed");
		}
		else {System.out.println("TC logo displayed failed");
		}
		
		/*WebElement arrow = driver.findElement(By.xpath("//*[@id=\"header-left-links\"]/ul[1]/li[1]/a/span[1]"));
		boolean adisplay = arrow.isDisplayed();
		System.out.println(adisplay);
		
		arrow.click();
		if (adisplay) {
			System.out.println("TC arrow  displayed passed");}
		else
		{System.out.println("TC arrow  displayed failed");}*/
		
		WebElement renter = driver.findElement(By.xpath("//*[@id=\"quoteForm\"]/div[2]/div[1]/div[4]"));
		renter.click();
		
		WebElement rent = driver.findElement(By.id("icon-text"));
		boolean renter2 = rent.isDisplayed();
		System.out.println(renter2);
		
		
		if (renter2) {
			System.out.println("TC display change with renters click passed");}
		else
		{System.out.println("TC display change with renters click  failed");}
		
		
		
		
		
		
		
		
		
		
		

	}

}
