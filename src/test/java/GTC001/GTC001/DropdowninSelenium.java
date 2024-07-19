package GTC001.GTC001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdowninSelenium {

	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement we=driver.findElement(By.id("course"));
		Select sl=new Select(we);
	//Select by index	
//		sl.selectByIndex(1);
//		Thread.sleep(2000);
//		sl.selectByIndex(2);
//		Thread.sleep(2000);
//		sl.selectByIndex(3);
//		Thread.sleep(2000);
	
	// Select by value--------------
//		sl.selectByValue("select");
//		Thread.sleep(2000);
//		sl.selectByValue("java");
//		Thread.sleep(2000);
//		sl.selectByValue("net");
//		Thread.sleep(2000);
//		sl.selectByValue("python");
//		Thread.sleep(2000);
		
	//Select by visiblevalue------------
		
//		sl.selectByVisibleText("Select");
//		sl.selectByVisibleText("Java");
//		sl.selectByVisibleText("Dot Net");
//		sl.selectByVisibleText("Python");
		
		
		
		
		

	}
	
}
