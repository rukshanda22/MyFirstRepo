import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newyorkco {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\17039\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.navigate().refresh();
		
		driver.get("https://www.nyandcompany.com/register/");
		driver.navigate().refresh();
		
		/*WebElement chkbox = driver.findElement(By.xpath("//*[@id=\"atg_store_registration\"]/section[2]/div[8]/div[3]/div/label/span"));
		chkbox.click();
		chkbox.click();
		
		WebElement ckbox = driver.findElement(By.xpath("//*[@id=\"atg_store_registration\"]/section[2]/div[8]/div[1]/div/label/span"));
		boolean cb= ckbox.isSelected();
		System.out.println(cb);
		ckbox.click();*/
		
		
       // WebElement dropbox = driver.findElement(By.xpath("//*[@id=\"atg_store_stateSelect\"]"));
       // dropbox.click();
        
        //Select state = new Select ( driver.findElement(By.xpath("//*[@id=\"atg_store_stateSelect\"]")));
        //state.selectByIndex(4);
        
       // Thread.sleep(20000);
        
        Select country = new Select ( driver.findElement(By.xpath("//*[@id=\"atg_store_countryNameSelect\"]")));
       // country.selectByIndex(2);
       // country.selectByVisibleText("Canada");
        country.selectByValue("CA");


	}

}
