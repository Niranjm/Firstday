package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

public LoginPage() {
	PageFactory.initElements(driver,this);
}
@FindBy(id="username")
private WebElement txtusername;

@FindBy(id="password")
private WebElement password;

@FindBy(id="login")
private WebElement button;

@FindBy(id="location")
private WebElement loc;

@FindBy(id="hotels")
private WebElement hotel;

@FindBy(id="room_type")
private WebElement room;

@FindBy(id="adult_room")
private WebElement adult;
	
@FindBy(id="Submit")
private WebElement buton;

@FindBy(id="radiobutton_0")
private WebElement radio;

@FindBy(id="continue")
private WebElement cont;

@FindBy(id="first_name")
private WebElement fname;

@FindBy(id="last_name")
private WebElement lname;

@FindBy(id="address")
private WebElement address;

@FindBy(id="cc_num")
private WebElement cardnum;

@FindBy(id="cc_type")
private WebElement ctype;

@FindBy(id="cc_exp_month")
private WebElement expmon;

@FindBy(id="cc_exp_year")
private WebElement expyear;

@FindBy(id="cc_cvv")
private WebElement cvv;
 
@FindBy(id="book_now")
private WebElement booknow;

@FindBy(xpath="(//input[@type='text'])[16]")
private WebElement attribute;


 


public WebElement getAttribute() {
	return attribute;
}

public WebElement getLoc() {
	return loc;
}

public WebElement getHotel() {
	return hotel;
}

public WebElement getRoom() {
	return room;
}

public WebElement getAdult() {
	return adult;
}

public WebElement getButon() {
	return buton;
}

public WebElement getRadio() {
	return radio;
}

public WebElement getCont() {
	return cont;
}

public WebElement getFname() {
	return fname;
}

public WebElement getLname() {
	return lname;
}

public WebElement getAdd() {
	return add;
}
@FindBy(id="address")
private WebElement add;


public WebElement getTxtusername() {
	return txtusername;
}

public WebElement getPassword() {
	return password;
}

public WebElement getButton() {
	return button;
}

public WebElement getAddress() {
	return address;
}

public WebElement getCardnum() {
	return cardnum;
}

public WebElement getCtype() {
	return ctype;
}

public WebElement getExpmon() {
	return expmon;
}

public WebElement getExpyear() {
	return expyear;
}

public WebElement getCvv() {
	return cvv;
}

public WebElement getBooknow() {
	return booknow;
}



}
