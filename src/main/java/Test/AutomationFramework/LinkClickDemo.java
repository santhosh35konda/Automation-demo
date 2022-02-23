package Test.AutomationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkClickDemo { 
	//find element and find elements
	
	public void googleLinkClick(String clickablelink) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		
		for(WebElement link : alllinks) {
		
		System.out.println("Expected link::" +clickablelink);
		
		String googlepagelinks = link.getText();
		
		System.out.println("actual link::" +googlepagelinks);
		
		
		if(googlepagelinks.equalsIgnoreCase(clickablelink)){
			link.click();
			break;
		}
	}
}
	
	public static void main(String[] args) throws InterruptedException {
		LinkClickDemo ref = new LinkClickDemo();
		
		ref.googleLinkClick("About");
	}
//		WebElement gmailLink=driver.findElement(By.linkText("Gmail"));
//		
//		gmailLink.click();
//		
//		Thread.sleep(2000);
//		
//		driver.close();
		
	}
	
