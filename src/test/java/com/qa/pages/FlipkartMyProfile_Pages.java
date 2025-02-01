package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartMyProfile_Pages {
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
	
	//div[text()='My Profile']
	@FindBy(xpath="//div[text()='My Profile']")              //MyProfile
	WebElement MyProfile;

	public WebElement getMyProfile() {
		return MyProfile;
	}

	
	@FindBy(xpath="//div[@class='exehdJ' and text()='jai']")              //MyAccount
	WebElement MyAccount;

	public WebElement getMyAccount() {
		return MyAccount;
	}
	@FindBy(xpath="//div[@class='_3vhnxf' and text()='Wishlist']")
	WebElement Wishlist;
	
	public WebElement getWishlist() {
		return Wishlist;
	}
	
	 
	@FindBy(xpath="//span[@class='oKZoMV']")                  //edit name in personal information
	WebElement EditName;
	
	public WebElement getEditName() {
		return EditName;
	}
	
	@FindBy(xpath="//input[@name='firstName']")                   //first name field
	WebElement FirstName;
	
	public WebElement getFirstName() {
		return FirstName;
	}
	
	@FindBy(xpath="//input[@name='lastName']")                  //last name field
	WebElement LastName;
	
	public WebElement getLastName() {
		return LastName;
	}
	
	@FindBy(xpath="//button[@class='_2KpZ6l _3eVCfA' and text()='SAVE' ]")              //save button in personal information
	WebElement SaveNameButton;
	
	public WebElement getSaveNameButton() {
		return SaveNameButton;
	}
	
	@FindBy(xpath="//span[text()='Male']")                       // male radio button
	WebElement GenderRadioButton;
	
	public WebElement  getGenderRadioButton() {
		return  GenderRadioButton;
	}

	public FlipkartMyProfile_Pages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
