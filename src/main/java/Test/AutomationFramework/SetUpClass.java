package Test.AutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUpClass {
	public static void main(String[] args) throws InterruptedException {
		
		//this old approach of setup
		
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		Thread.sleep(2000);
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://github.com");
		
	}

}
