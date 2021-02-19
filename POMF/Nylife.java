package POMF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nylife {

	public static  WebElement element1 ;
		
	
		
		public static WebElement fname(WebDriver driver) {
			element1 = driver.findElement(By.id("guideContainer-rootPanel-guidetextbox_copy___widget"));
			return element1;
		}
		public static WebElement lname(WebDriver driver) {
			element1 = driver.findElement(By.id("guideContainer-rootPanel-guidetextbox_copy_co___widget"));
			return element1;
		}
		public static WebElement emailbox(WebDriver driver) {
			element1 = driver.findElement(By.id("guideContainer-rootPanel-guideemail_copy___widget"));
			return element1;
		}
		public static WebElement qbox(WebDriver driver) {
			element1 = driver.findElement(By.id("guideContainer-rootPanel-guidetextbox_6218579___widget"));
			return element1;
		}

	}


