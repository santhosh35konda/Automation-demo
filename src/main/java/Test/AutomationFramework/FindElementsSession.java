package Test.AutomationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsSession {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
		
		driver.manage().window().maximize();
		
		WebElement linkpage=driver.findElement(By.tagName("a"));
		
		String text=linkpage.getText();
		
		System.out.println("first link of the page::" +text);
		
		Thread.sleep(2000);
		
		List<WebElement> linkofpage=driver.findElements(By.tagName("a"));
		
		for(WebElement link:linkofpage ) {
			
			String pagelinks=link.getText();
			
			System.out.println("links in google page is::" +pagelinks);
		}
			
		driver.close();
	}
}
