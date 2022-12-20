package org.test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunner {

	 WebDriver driver;
	@BeforeClass
	private void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@BeforeMethod
	private void beforeMethod() {
		Date d =new Date();
		System.out.println(d);
	}

	@Test
	private void test() {

		driver.get("https://demo.automationtesting.in/Register.html");		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("niranj");		
		WebElement button1 = driver.findElement(By.xpath("//input[@type='radio']"));
		button1.click();	
		WebElement button2 = driver.findElement(By.xpath("(//select[@type='text'])[3]"));
		button2.sendKeys("1996");	
	}

	@Test

	private void test1() {
		driver.get("https://www.facebook.com/");   
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("Niranj");     
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("7777");
		WebElement loginbutton = driver.findElement(By.xpath("//button[@name='login']"));
		loginbutton.click();

	}

	@AfterMethod
	private void afterMethod() {
		Date d =new Date();
		System.out.println(d);
	}
	@AfterClass
	private void afterClass() {
		driver.quit();

	}
}
