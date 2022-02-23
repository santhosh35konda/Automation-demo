package com.automationframework.validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationsDemo4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.get("https://courses.letskodeit.com/practice");
		
		WebElement header=driver.findElement(By.xpath("//h1[text()='Practice Page']"));
		
		if(header.isDisplayed()) {
			String headertext=header.getText();
			System.out.println("Displayed text is::" +headertext);
		}
		else {
			System.out.println("unable to get text");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
