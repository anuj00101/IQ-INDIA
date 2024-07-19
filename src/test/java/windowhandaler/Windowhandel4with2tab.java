package windowhandaler;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandel4with2tab {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String Pwindow = driver.getWindowHandle();
		System.out.println(Pwindow);
		driver.findElement(By.xpath("//Input[@id='name']")).sendKeys("TEXt AT PARENT PAGE");
		driver.findElement(By.id("newWindowsBtn")).click();
		Set<String> cWindow = driver.getWindowHandles();

		for (String str : cWindow) {
			if (!str.equals(Pwindow)) {
				driver.switchTo().window(str);
				String title = driver.getTitle();
				System.out.println(title);
              driver.close();
			}
		}
      driver.switchTo().window(Pwindow);
      driver.findElement(By.xpath("//Input[@id='name']")).clear();
      driver.findElement(By.xpath("//Input[@id='name']")).sendKeys("TEXt AT PARENT PAGE CHILD AGAIN");
	//  driver.findElement(By.xpath("//button[@class='whButtons']")).click();

		
	}
}
