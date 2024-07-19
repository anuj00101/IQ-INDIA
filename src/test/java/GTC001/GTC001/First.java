package GTC001.GTC001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver(); 
		
		//driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("http://altoro.testfire.net/login.jsp");
//	//	Thread.sleep(1000);
//		driver.findElement(By.id("uid")).sendKeys("jsmith");
//		//Thread.sleep(1000);
//		driver.findElement(By.id("passw")).sendKeys("demo1234");
//		//Thread.sleep(1000);
//		driver.findElement(By.name("btnSubmit")).click();
//	//	Thread.sleep(1000);
//		driver.findElement(By.linkText("Transfer Fund")).click();	
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("ayushhh1230");
	//	Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("zmzmzm10");
		
	//	Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
		
		driver.findElement(By.xpath("//div[text()='Not now']")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"mount_0_0_za\"]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/section/main/div/div/div/div/div")).click();
		
		
						
	}
}
