package Test.AutomationFramework.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiDropDown2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement apple=driver.findElement(By.id("ide"));
		
		Select cherry=new Select(apple);
		
		cherry.selectByIndex(3);
		
		Thread.sleep(2000);
		
		cherry.selectByValue("ec");
		
		Thread.sleep(2000);
		
		cherry.selectByVisibleText("Visual Studio");
		
		List<WebElement> litchi = cherry.getAllSelectedOptions();
		
		System.out.println("list of selected options are::");
		
		for(WebElement kiwi:litchi) {
			
			String root=kiwi.getText();
			
			System.out.println(root);
			
			//Thread.sleep(2000);
			
			//driver.close();
			
		}
	}

}
