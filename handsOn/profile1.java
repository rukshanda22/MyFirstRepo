package handsOn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class profile1 {

	public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("user-data-dir=C:\\Users\\17039\\AppData\\Local\\Google\\Chrome\\User Data\\");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\17039\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cnn.com/");
		
		Thread.sleep(8500);
		driver.quit();

	}

}
