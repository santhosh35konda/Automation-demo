package Test.AutomationFramework.seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActionsDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in");
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		WebElement gmaillink=driver.findElement(By.xpath("(//a[@target='_top'])[3]"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(gmaillink).click().perform();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
