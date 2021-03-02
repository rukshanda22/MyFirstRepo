



import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SFAaccountCreate {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aysha\\OneDrive\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.Salesforce.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("suren12385@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("NewPass@456");
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(3600);
		
		//driver.findElement(By.xpath("//span[@class='label']")).click(); // 1st way of finding xpath of create 
		//driver.findElement(By.xpath("(//span[contains(text(),'Create')])[3]")).click(); // 2nd way of finding xpath of create
		
		driver.findElement(By.xpath("//a[@title='Create Menu']/span")).click();
		
		driver.findElement(By.xpath("//span[@class='slds-align-middle']")).click();
		
		//driver.findElement(By.xpath("(//span[contains(text(),'User')])[1]")).click(); //another way of finding xpath of user
		
		// to deal with multiple object- this is how we write with for loop
		
		List<WebElement> browserOptions=driver.findElements(By.xpath("//span[@class='slds-align-middle']"));
		
		for(int i=0;i<browserOptions.size();i++) {
			String desitedText=browserOptions.get(i).getText();
			if(desitedText.equalsIgnoreCase("User")) {
				browserOptions.get(i).click();
				
				break;
			}
		}
	
			//below is the previous class coding, I didn't delete to have better understanding
		
		WebElement UserCreateFrame = driver.findElement(By.xpath("//iframe[@title='New User ~ Salesforce - Developer Edition']"));
		driver.switchTo().frame(UserCreateFrame);
		
		driver.findElement(By.id("name_firstName")).sendKeys("Aysha");
		driver.findElement(By.xpath("//img[@title='Call Center Lookup (New Window)']")).click();
		Thread.sleep(2000);
		
		Set<String> wins = driver.getWindowHandles();
		System.out.println("total windows r:"+wins.size());
		Iterator<String> iter = wins.iterator();
		
		String first = iter.next();
		String second = iter.next();
		driver.switchTo().window(second);
		Thread.sleep(800);
		
		WebElement frameNewWindow = driver.findElement(By.id("searchFrame"));
		driver.switchTo().frame(frameNewWindow);
		driver.findElement(By.id("1ksrch")).sendKeys("days");
		
	//	driver.switchTo().window(first);
		driver.switchTo().defaultContent();
		
		Thread.sleep(6800);
		driver.quit();
		
	}

}
