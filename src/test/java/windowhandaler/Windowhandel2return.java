package windowhandaler;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandel2return {

	public static void main(String[] args) {
		WebDriverManager .chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		 String Pwindow = driver.getWindowHandle();
		 System.out.println(Pwindow);
		 driver.findElement(By.xpath("//Input[@id='name']")).sendKeys("TEXt AT PARENT PAGE");
		 driver.findElement(By.xpath("//button[@class='whButtons']")).click();
		       Set<String> cWindow= driver.getWindowHandles();
		       
		       for(String str:cWindow) {
		    	   System.out.println(str);   
		       }
		       
		 
		 
		 
		
	}

}
