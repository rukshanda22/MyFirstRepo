import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\17039\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.mynyl.newyorklife.com/VSCRegWebApp/registration/full");
		
		WebElement namebox = driver.findElement(By.id("personalInfoForm.lastName"));
		namebox.sendKeys("tttt");
		
		
		WebElement dob = driver.findElement(By.id("date_group"));
		String dobtext = dob.getText();
		System.out.println(dobtext);
		
		WebElement dobinbox = driver.findElement(By.cssSelector("#month"));
		dobinbox.sendKeys("10");
		
		WebElement ddin = driver.findElement(By.cssSelector("#date"));
		ddin.sendKeys("20");
		
		WebElement yyin = driver.findElement(By.cssSelector("#year"));
		yyin.sendKeys("1998");
		
		WebElement ssntext = driver.findElement(By.cssSelector("#personalInfoForm > div:nth-child(4) > div > div > label.nyl-formitem__label"));
		String ssn = ssntext.getText();
		System.out.println(ssn);
		
		WebElement ssnbox= driver.findElement(By.id("personalInfoForm.ssn.value"));
		ssnbox.sendKeys("1234");
		String ssnvalue = ssnbox.getAttribute("placeholder");
		System.out.println(ssnvalue);
		
		WebElement nextbutton = driver.findElement(By.cssSelector("#submitBtn"));
		String nexttext =nextbutton.getText();
		System.out.println(nexttext);
		
	}

}
