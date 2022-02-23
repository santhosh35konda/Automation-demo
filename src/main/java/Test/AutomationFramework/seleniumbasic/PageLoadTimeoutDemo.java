package Test.AutomationFramework.seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadTimeoutDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
