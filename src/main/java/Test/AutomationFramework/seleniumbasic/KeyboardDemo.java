package Test.AutomationFramework.seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Thread.sleep(2000);
		
		Actions action= new Actions(driver);
		
		action.sendKeys(Keys.ESCAPE).perform();
		
		String getext=driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		System.out.println(getext);
		
		Thread.sleep(2000);
		
		driver.close(); 
	}

}
