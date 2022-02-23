package com.automationframework.validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationsDemo {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.get("https://courses.letskodeit.com/practice");
		
		WebElement bmwradio=driver.findElement(By.id("bmwradio"));
		
		
		  if(bmwradio.isSelected()) {
		  
		  System.out.println("BMW already selected"); }
		  else { bmwradio.click();
		  System.out.println("now successfully clicked on bmw radio button"); }
		 
	}

}
