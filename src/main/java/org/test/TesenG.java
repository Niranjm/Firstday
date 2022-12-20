package org.test;

import java.io.IOException;
import java.util.Date;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TesenG extends LoginPage  {
	WebDriver driver;


	@BeforeClass
	private void BeforeClass() {
		launchBrowser("chrome");

	}
	@AfterClass
	private void AfterClass() {
		quit();


		System.out.println("project completed");
	}
	@BeforeMethod
	private void BeforeMethod() {
		Date d =new Date();
		System.out.println(d);
	}
	@AfterMethod
	private void aftermaethod() {
		Date d =new Date();
		System.out.println(d);

	}
	@Test
	private void test1() throws InterruptedException, IOException {
		UrlLaunch("https://adactinhotelapp.com/");
	FullScreen();
	
		LoginPage l=new LoginPage();
		sendkeys(l.getTxtusername(),"niranjniranj");
		
		sendkeys(l.getPassword(),"niranj7114");
		Click(l.getButton());
		DropDown(l.getLoc(),3);
		DropDown(l.getHotel(), 4);
		DropDown(l.getRoom(), 3);
		DropDown(l.getAdult(), 2);
		Click(l.getButon());
		Click(l.getRadio());
		Click(l.getCont());
		sendkeys(l.getFname(),"niranj");
		sendkeys(l.getLname(),"niranj");
		sendkeys(l.getAddress(),"NorthKorea");
		sendkeys(l.getCardnum(),"1234567890123456");
		DropDown(l.getCtype(),2);
		DropDown(l.getExpmon(), 6);
		DropDown(l.getExpyear(),5);
		sendkeys(l.getCvv(),"777");
		Click(l.getBooknow());
		Thread.sleep(10000);
		getettribute(l.getAttribute(),"value");
		System.out.println(getettribute(l.getAttribute(),"value"));
	}

	
	
	
	

}




