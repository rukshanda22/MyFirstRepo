package handsOn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Profile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:\\Users\\17039\\AppData\\Local\\Google\\Chrome\\User Data\\");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\17039\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.linkedin.com/feed/");
		
		//Thread.sleep(8500);
		//driver.quit();
		

	}

}
