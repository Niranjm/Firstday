package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test

public class Facebook {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Mukilagan\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
	
	
    WebDriver driver=new ChromeDriver();
    
   driver.get("https://www.facebook.com/");
    
 //  WebElement username = driver.findElement(By.className("inputtext"));
    WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
    username.sendKeys("Niranj");
    
   WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
   password.sendKeys("7777");

   
   WebElement loginbutton = driver.findElement(By.xpath("//button[@name='login']"));
   loginbutton.click();
	
}
}
