package com.automationframework.radiobuttons;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		  
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		File ref=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File ref1=new File("G:\\Java Notes\\selenium screen shot.png");
		
		FileUtils.copyFile(ref, ref1);
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
