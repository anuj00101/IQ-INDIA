package GTC001.GTC001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewvcPractice {
	
	public static void main(String[] args) throws InterruptedException {
		
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.get("http://altoro.testfire.net/");
	driver.findElement(By.xpath("//a[@id='LoginLink']/child::font")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr/td[2]/input")).sendKeys("jsmith");
	//driver.findElement(By.name("uid")).sendKeys("jsmith");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id=\"passw\"]")).sendKeys("demo1234");
	//driver.findElement(By.id("passw")).sendKeys("demo1234");
	Thread.sleep(2000);
	driver.findElement(By.name("btnSubmit")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("LinkHeader3")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//html/body/table/tbody/tr[2]/td[2]/div/h2/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//html/body/div/form/table/tbody/tr/td[2]/a[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[2]/td[2]/input")).clear();
	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[2]/td[2]/input")).sendKeys("anuj");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[3]/td[2]/input")).sendKeys("anujgupta2398@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[4]/td[2]/input")).sendKeys("xyz");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[5]/td[2]/textarea")).sendKeys("aaaaaaaaaaaaaa");
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[6]/td[2]/input[2]")).click();
	
//	driver.navigate().back();
//	
//	driver.navigate().back();
//	
//	driver.navigate().back();
//	
//	driver.navigate().back();
//	
//	driver.navigate().back();
	
	
	
	//driver.close();
	
	
	
	}

}
