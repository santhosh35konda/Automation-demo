package Test.AutomationFramework.seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActionsDemo1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		
		String actualURL=driver.getCurrentUrl();
		
		if(expectedURL.equals(actualURL)) {
		
		System.out.println("santhosh successfully logged in");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//b[text()='Admin']")))
		      .moveToElement(driver.findElement(By.xpath("//a[.='Organization']")))
		      .moveToElement(driver.findElement(By.id("menu_admin_viewLocations"))).click().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("searchLocation[name]")).sendKeys("hyderabad");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("btnSave")).click();
		
		System.out.println("santhosh successfully searched for hyderabad location");
		
	}
	
	else {
		System.out.println("santhosh failed to login");
	}
	
	Thread.sleep(2000);
	
	driver.close();
		
	}
	
}
