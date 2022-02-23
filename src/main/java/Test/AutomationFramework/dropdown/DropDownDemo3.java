package Test.AutomationFramework.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		Thread.sleep(2000);
		
		WebElement selectcourse=driver.findElement(By.id("course"));
		
		Select courseselect = new Select(driver.findElement(By.id("course")));
		
		courseselect.selectByVisibleText("Python");

		WebElement selectedcourse = courseselect.getFirstSelectedOption();

		System.out.println(selectedcourse.getText());
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
