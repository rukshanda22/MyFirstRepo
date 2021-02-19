import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Vote {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\17039\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.newyorklife.com/contact-us");
		
		//WebElement contactus = driver.findElement(By.xpath("//*[@id=\"main-nav\"]/nav[2]/div[2]/a"));
		
		//contactus.click();
		
		Thread.sleep(20000);
		
		WebElement fname = driver.findElement(By.xpath("//*[@id=\"guideContainer-rootPanel-guidetextbox_copy___label\"]"));
		String afname= fname.getText();
		String efname = "First Name*";
		
		String fncss = fname.getCssValue("display");
		System.out.println(fncss);
		
		Point fnlo = fname.getLocation();
		System.out.println("x coordinate is "+ fnlo.x);
		
		System.out.println(" y coordinate is "+ fnlo.y);
		if (afname.equals(efname)) {
			System.out.println("TC 1 is pass");
		}
		else
			{System.out.println("TC 1 fail");
				}
			
		WebElement fnamebox = driver.findElement(By.id("guideContainer-rootPanel-guidetextbox_copy___widget"));
		fnamebox.sendKeys("Tina");
		
		//Dimension fs=fnamebox.getSize();
		//System.out.println(fs.height);
		//System.out.println(fs.width);
		
		boolean fb=fnamebox.isDisplayed();
		
		if (fb) {System.out.println("TC is dispayed pass");
		
		}
		else 
             {System.out.println("TC is dispayed fail");
		
		}
		
		
		String fnvalue= fnamebox.getAttribute("aria-required");
		System.out.println(fnvalue);
		
		String tname = fnamebox.getTagName();
		System.out.println(tname);
		
		/*WebElement lname = driver.findElement(By.id("guideContainer-rootPanel-guidetextbox_copy_co___label"));
		String alnametext = lname.getText();
		String elname = "Last Name*";
		//System.out.println(alnametext);

		if (alnametext.equals(elname)) {
			System.out.println("TC 2 is pass");
		}
		else
			{System.out.println("TC 2 fail");
				}
		
		WebElement lnamebox = driver.findElement(By.id("guideContainer-rootPanel-guidetextbox_copy_co___widget"));
		lnamebox.sendKeys("Rahman");
		
		WebElement emailtext = driver.findElement(By.id("guideContainer-rootPanel-guideemail_copy___label"));
		String aemail = emailtext.getText();
		System.out.println(aemail);
		
		WebElement emailbox = driver.findElement(By.id("guideContainer-rootPanel-guideemail_copy___widget"));
		emailbox.sendKeys("tinarahman@hotmail.com");*/
		
		//Thread.sleep(20000);
		
	WebElement questext= driver.findElement(By.cssSelector("#guideContainer-rootPanel-guidetextbox_6218579___label"));
	String aques = questext.getText();
	System.out.println(aques);
	String eques = "Questions*";
	
	if (aques.equals(eques)) {
		System.out.println("TC 3  pass");
	}
	else
		{System.out.println("TC 3 fail");
			}
	
	WebElement qbox = driver.findElement(By.id("guideContainer-rootPanel-guidetextbox_6218579___widget"));
	qbox.sendKeys("what is this about?");
	
	WebElement subject = driver.findElement(By.id( "guideContainer-rootPanel-guidedropdownlist_19___label"));
	String asubject = subject.getText();
	System.out.println(asubject);
	String esubject = "Subject Line*";
	
	if (asubject.equals(esubject)) {
		System.out.println("TC 4  passed");
	}
	else
		{System.out.println("TC 4 fail");
			}
	
		WebElement dropbox = driver.findElement(By.xpath("//*[@id=\"guideContainer-rootPanel-guidedropdownlist_19___widget\"]"));
		
		String dbox = dropbox.getText();
		System.out.println(dbox);
		
		
		
	
	
	
	
	}
	
		
		
		

	}


