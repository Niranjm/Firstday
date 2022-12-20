package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test

public class DemoAuto {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
			username.sendKeys("niranj");
			
			WebElement button1 = driver.findElement(By.xpath("//input[@type='radio']"));
		button1.click();
		
		WebElement button2 = driver.findElement(By.xpath("(//select[@type='text'])[3]"));
		button2.sendKeys("1996");
		
		
		
	}
}
