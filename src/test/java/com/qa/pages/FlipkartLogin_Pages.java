package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLogin_Pages {
	WebDriver driver;
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	WebElement Email_or_Mobile;
	public WebElement getEmail_or_Mobile() {
		return Email_or_Mobile;
	}
	
	
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	WebElement passwordTF;
	public WebElement getpasswordTF() {
		return passwordTF;
	}
	
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement logInBtn;
	public WebElement getlogInBtn() {
		return logInBtn;
	}
	
	@FindBy(xpath="//div[text()='My Account']")
	WebElement myAccount;
	public WebElement getmyAccount() {
		return myAccount;
	}
	
	@FindBy(xpath="//div[text()='Logout']")
	WebElement logOut;
	public WebElement getlogOut() {
		return logOut;
	}
	public FlipkartLogin_Pages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}

