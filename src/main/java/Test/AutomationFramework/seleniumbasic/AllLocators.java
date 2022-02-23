package Test.AutomationFramework.seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLocators {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.name("email")).sendKeys("santhoshkonda123@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("0123456789");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//driver.findElement(By.partialLinkText("password")).click();
		
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		//driver.findElement(By.name("login")).click();
		
		//String ref =driver.findElement(By.tagName("(//div)[19]")).getText();
		
		//System.out.println(ref);
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
