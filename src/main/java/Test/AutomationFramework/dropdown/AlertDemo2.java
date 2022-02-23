package Test.AutomationFramework.dropdown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//Thread.sleep(2000);
		
		driver.findElement(By.id("promptBox")).click();
		
		Alert ref = driver.switchTo().alert();
		
		//Thread.sleep(2000);
		
		ref.sendKeys("mr training");
		
		ref.accept();
		
		//Thread.sleep(2000);  ////////working very speed
		
		driver.close();
		
		
	}

}
