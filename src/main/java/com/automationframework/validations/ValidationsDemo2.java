package com.automationframework.validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationsDemo2 {
	
	//isEnabled
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.get("https://github.com/password_reset");
		
		WebElement forgotpassword=driver.findElement(By.xpath("//input[contains(@value,'Send password')]"));
		
		if(forgotpassword.isEnabled()) {
			
			forgotpassword.click();
			
			System.out.println("successfully clicked on forgot password button");
		}
		else {
			System.out.println("forgot password button is not enabled");
		}
	}
	
	

}
