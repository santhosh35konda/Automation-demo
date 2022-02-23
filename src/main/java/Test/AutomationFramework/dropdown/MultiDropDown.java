package Test.AutomationFramework.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement ides=driver.findElement(By.id("ide"));
		
		Select idenames=new Select (ides);
		
		idenames.selectByIndex(0);
		
		Thread.sleep(2000);
		
		idenames.selectByValue("ij");
		
		Thread.sleep(2000);
		
		idenames.selectByVisibleText("Visual Studio");
		
		Thread.sleep(2000);
		
		idenames.selectByIndex(3); 
		
		Thread.sleep(2000);
		
		List<WebElement> allselectedoptions = idenames.getAllSelectedOptions();

		System.out.println("List of selected options are::");
		for (WebElement options : allselectedoptions) {
			String data = options.getText();
			System.out.println(data);

		//idenames.deselectAll();
		
		//Thread.sleep(2000);

		//driver.close();
		}
	}
}
