package POMF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginor {

	public static WebElement element;
	
	public static WebElement emailfield (WebDriver driver) {
		element = driver.findElement(By.name("email"));
		return element;
	}
	public static WebElement passfield (WebDriver driver) {
		element = driver.findElement(By.name("password"));
		return element;
	}

}
