package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test

public class Amazon2 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search.sendKeys("Basketball");
	
	WebElement button = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	button.click();
	

	
	
}
}
