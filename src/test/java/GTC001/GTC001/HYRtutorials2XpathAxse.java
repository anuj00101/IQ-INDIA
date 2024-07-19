package GTC001.GTC001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HYRtutorials2XpathAxse {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='container']/child::input")).sendKeys("anuj");
	 // driver.findElement(By.xpath("//a[contains(text(),'Sign in into account')]")).click();
		
	  //driver.findElement(By.xpath("//a[starts-with(text(),'Sign in')]")).click();
		
    //  driver.findElement(By.xpath("//label[normalize-space(text()='First Name')][1]")).click();
	  driver.findElement(By.xpath("//div[@class='container']/child::input[1]")).sendKeys("Anuj");
		
	  driver.findElement(By.xpath("//label[text()='Last Name']/following-sibling::input[1]")).sendKeys("Gupta");
	  driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]")).sendKeys("Test@123");	
  //  driver.findElement(By.xpath("//div[@class='container']/child::div[2]/input")).sendKeys("202020");
	  driver.findElement(By.xpath("//div[@class='container']/descendant::input[4]")).sendKeys("2020");
	  driver.findElement(By.xpath("//div[@class='container']/child::input[4]")).sendKeys("202020");
	  Thread.sleep(1000);
	 // driver.findElement(By.xpath("//div[@class='container']/descendant::button[3]")).click();
	  //driver.findElement(By.xpath("//button[@class='btn'][2]")).click();
	 // driver.findElement(By.xpath("//td[text()='Canada']/preceding-sibling::td[2]/child::input")).click();
	  
	 // driver.findElement(By.xpath("//a[text()='Selenium Practice']")).click();
	  
	  WebElement we=driver.findElement(By.xpath("//ul[@id='nav1']/descendant::a[@href='#']"));
      we.click();
//	  Select sl=new Select(we);
//	  sl.selectByIndex(1);
	
	//driver.close();

	}

}
