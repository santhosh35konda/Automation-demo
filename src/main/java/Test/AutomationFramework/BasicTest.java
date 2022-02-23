package Test.AutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		//this is new approach of setup
		
		WebDriverManager.chromedriver().setup();//This will control your machine and check which version
		//he is using and in run time it download the required one
		
		Thread.sleep(3000); //3000 milliseconds means 3 seconds of time
		
		WebDriver driver=new ChromeDriver();//to initalize chrome
		Thread.sleep(3000);
		
		driver.manage().window().maximize();//to maximize window and open url
		Thread.sleep(3000);
		
		driver.get("http://facebook.com");//any application we can open by using this method....(driver.get)
	}

}
