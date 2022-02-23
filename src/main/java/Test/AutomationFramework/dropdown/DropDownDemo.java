package Test.AutomationFramework.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		 
		 Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("santhosh");
		
		driver.findElement(By.name("lastname")).sendKeys("konda");
		
		driver.findElement(By.name("reg_email__")).sendKeys("konda123@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("123456789");
		
		 Thread.sleep(2000);
		
		WebElement day=driver.findElement(By.id("day"));
		
		Select dayselection=new Select(day);
		
		dayselection.selectByVisibleText("23");
		
		 Thread.sleep(3000);
		
		WebElement month=driver.findElement(By.id("month"));
		
		Select monthselection=new Select(month);
		
		monthselection.selectByValue("7");
		
		 Thread.sleep(3000);
		
		WebElement year=driver.findElement(By.id("year"));
		
		Select yearselection=new Select(year);
		
		yearselection.selectByVisibleText("2015");
		
	}

}
