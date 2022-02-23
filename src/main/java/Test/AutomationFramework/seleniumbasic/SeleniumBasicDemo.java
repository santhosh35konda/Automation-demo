package Test.AutomationFramework.seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasicDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		WebElement ref1=driver.findElement(By.id("name"));
		
		ref1.sendKeys("mr.training");
		
		Thread.sleep(2000);
		
		ref1.clear();
		
		//Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		ref1.sendKeys("selenium batch");
		
		//Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.close();
	}

}
