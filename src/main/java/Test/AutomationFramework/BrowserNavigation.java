package Test.AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNavigation {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("http://google.co.in");
		
		//Thread.sleep(3000);
		
		//driver.findElement(By.linkText("Gmail")).click();
		
		//if you use get method it wont go backward direction and its wont contain history
		
		
		driver.navigate().to("https://google.co.in");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Gmail")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
	}

}
