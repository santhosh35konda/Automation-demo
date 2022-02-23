package com.automationframework.radiobuttons;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonsDemo {
	
	
	public void radiobutton(String cartype) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.get("https://courses.letskodeit.com/practice");
		
		List<WebElement>  typesofcars=driver.findElements(By.xpath("//div[@id='radio-btn-example']//label/input"));
		
		for(WebElement cars:typesofcars) {
			
			System.out.println(cars.getAttribute("id"));
			
			if(cars.getAttribute("id").equalsIgnoreCase(cartype));{
				
				cars.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		RadioButtonsDemo demo=new RadioButtonsDemo();
		
		demo.radiobutton("hondaradio");
	}

}
