package org.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

class BaseClass {
	public static WebDriver driver;
	public static WebDriver ChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;
	}
	public static  void UrlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void quit() {
		driver.quit();      
	}

	public static void Times(int a) {
		driver.manage().timeouts().implicitlyWait(a,TimeUnit.SECONDS);

	}
	public  void	 sendkeys(WebElement e,String value) {
		e.sendKeys(value);
	}
	public static void Click(WebElement e) {
		e.click();
	}
	public static String gettext(WebElement e) {
		String text=e.getText();
		return text;
	}
	public static String getettribute(WebElement e,String value) {
		String attribute=e.getAttribute(value);
		return attribute;

	}
	public static void moveToElements(WebElement e) {
		Actions a =new Actions(driver);
		a.moveToElement(e).perform();
	}
	public static  void Draganddrop(WebElement src,WebElement dest) {
		Actions a =new Actions(driver);
		a.dragAndDrop(src, dest );

	}
	public static void FullScreen() throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src= tk.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\hp\\eclipse-workspace\\Mavenstarts\\ScreenShot\\test11.png");
		FileUtils.copyFile(src, dest);


	}
	public static void ScreenShot(WebElement e ) throws IOException {
		File src=e.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\hp\\eclipse-workspace\\Mavenstarts\\ScreenShot\\mar.png");
		FileUtils.copyFile(src, dest);

	}
	public static void DropDown(WebElement e,int i) {
		Select s=new Select(e);
		s.selectByIndex(i);

	}

	public static WebDriver launchBrowser(String bname) {

		if(bname.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		else if (bname.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();

		}
		return driver;
		
		}
	
}

