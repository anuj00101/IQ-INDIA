package GTC001.GTC001;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class HyrNewclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='container']/child::input")).sendKeys("anuj");
	 // driver.findElement(By.xpath("//a[contains(text(),'Sign in into account')]")).click();
	}

}
