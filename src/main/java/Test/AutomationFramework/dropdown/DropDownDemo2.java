package Test.AutomationFramework.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement courses=driver.findElement(By.id("course"));
		
		Select courseselect=new Select(courses);
		
		courseselect.selectByIndex(4);
		
		List<WebElement> eachcourse = courseselect.getOptions();
		
		for(WebElement course:eachcourse) {
			
		String printcourse= course.getText();
		
		System.out.println(printcourse);
				
		}
		Thread.sleep(2000);
		driver.close();
	}

}
