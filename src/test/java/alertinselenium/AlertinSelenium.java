package alertinselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertinSelenium {

	public static void main(String[] args) {
		WebDriverManager .chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		 
		 driver.findElement(By.id("promptBox")).click();
		 
		 Alert al=driver.switchTo().alert();
		 al.sendKeys("anujj aj");
		 al.accept();
		 //al.dismiss();
		
		 WebElement we=driver.findElement(By.xpath("//div[@id='output']"));
		 String str =we.getText();
		 System.out.println(str);
	}

}
