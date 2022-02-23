package Test.AutomationFramework.seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActionsDoubleClick {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(2000);
		
		WebElement doubleclickbutton=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions action= new Actions(driver);
		
		action.doubleClick(doubleclickbutton).perform();
		
		Alert alert=driver.switchTo().alert();
		
		//String alertareatext=alert.getText();
		
		//System.out.println(alertareatext);
		
		Thread.sleep(2000);
		
		alert.accept();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
