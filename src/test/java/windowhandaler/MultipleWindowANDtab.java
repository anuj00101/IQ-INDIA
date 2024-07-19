package windowhandaler;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowANDtab {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		String bc=" ";
		String cm=" ";
		String xp=" ";
		String al=" ";
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String Pwindow = driver.getWindowHandle();
		System.out.println(Pwindow);
		driver.findElement(By.xpath("//Input[@id='name']")).sendKeys("TEXt AT PARENT PAGE");
		driver.findElement(By.id("newTabsWindowsBtn")).click();
		Set<String> cWindow = driver.getWindowHandles();

		for (String wid : cWindow) {
			if (!wid.equals(Pwindow)) {
				driver.switchTo().window(wid);
				Thread.sleep(2000);
				String title = driver.getTitle();
				
				if(title.contains("Basic Controls")) {
					bc=wid;
					System.out.println(bc);
				}else if(title.contains("Contact Me")) {
						cm=wid;
						System.out.println(cm);
				}else if (title.contains("XPath Practice"))	{
					xp=wid;
					System.out.println(xp);
				}else if(title.contains("AlertsDemo")) {
					al=wid;
					System.out.println(xp);
				}
				
			}
		}
		//working on Basic control
		driver.switchTo().window("bc");
		Thread.sleep(2000);
		String str1=driver.getTitle();
		System.out.println(str1);
		driver.close();
		
		//working on Contact Me
		driver.switchTo().window("cm");
		Thread.sleep(2000);
		String str2=driver.getTitle();
		System.out.println(str2);
	
		driver.close();
		
		//working on XPath Practice
		driver.switchTo().window("xp");
		Thread.sleep(2000);
		String str3=driver.getTitle();
		System.out.println(str3);
		
		driver.close();
		
		//working on AlertsDemo
		driver.switchTo().window("al");
		Thread.sleep(2000);
		String str4=driver.getTitle();
		System.out.println(str4);
	
		driver.close();
		
		
    	// Working on parent window	
      driver.switchTo().window(Pwindow);
      driver.findElement(By.xpath("//Input[@id='name']")).clear();
      driver.findElement(By.xpath("//Input[@id='name']")).sendKeys("TEXt AT PARENT PAGE CHILD AGAIN");
	//  driver.findElement(By.xpath("//button[@class='whButtons']")).click();

		
	}
}
