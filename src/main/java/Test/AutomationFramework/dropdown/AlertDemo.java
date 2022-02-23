package Test.AutomationFramework.dropdown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("cusid")).sendKeys("1234567890");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(2000);
		
		Alert pagealert = driver.switchTo().alert();
		
		String textinsidealert = pagealert.getText();
		
		System.out.println(textinsidealert);
		
		pagealert.dismiss();
		
		Thread.sleep(2000);
		
		driver.close();
		
	
	}

}
