package com.automationframework.validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationsDemo3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		WebElement createaccount=driver.findElement(By.xpath("(//a[@role='button'])[3]"));
		
		if(createaccount.isEnabled()) {
			
			createaccount.click();
			
			System.out.println("clicked on create account");
		}
		else {
			System.out.println("failed to click on create account");
		}
		
		  Thread.sleep(2000);
		  
		  driver.close();
		 
	}

}
