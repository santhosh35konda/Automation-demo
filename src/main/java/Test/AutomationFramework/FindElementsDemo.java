package Test.AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		Thread.sleep(3000);
		
		WebElement Usernametextbox=driver.findElement(By.id("txtUsername"));
		
		Usernametextbox.sendKeys("Admin");
		Thread.sleep(3000);
		
		WebElement Passwordtextbox=driver.findElement(By.name("txtPassword"));
		
		Passwordtextbox.sendKeys("admin123");
		Thread.sleep(2000);
		
		WebElement loginbuttonbox=driver.findElement(By.className("button"));
		
		loginbuttonbox.click();
		
		String expected="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		
		String actual=driver.getCurrentUrl();
		
		//System.out.println("my expected url is::"+expected);
		
		if (actual.equals(expected)){
			System.out.println("peter loggined in successfully");
		}

		else {
			System.out.println("peter failed to loggined inn");
		}
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
