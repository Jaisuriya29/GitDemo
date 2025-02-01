package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartManageAddress_Pages {
	WebDriver driver;
	
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
	

	
	@FindBy(xpath="//div[@class='NS64GK _1MZ7_i']")
	WebElement ManageInformationButton;
	
	public WebElement getManageInformationButton() {
		return ManageInformationButton;
	}
	
	@FindBy(xpath="//*[contains(text(),'ADD A NEW ADDRESS')]")
	WebElement AddAddressLink;
	
	public WebElement getAddAddressLink() {
		return AddAddressLink;
	}
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/form/div/div[2]/div[1]/input")
	WebElement NameField;
	
	public WebElement getNameField() {
		return NameField;
	}
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/form/div/div[2]/div[2]/input")
	WebElement NumberField;
	
	public WebElement getNumberField() {
		return NumberField;
	}
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/form/div/div[2]/div[1]/input")
	WebElement PinCodeField;
	
	public WebElement getPinCodeField() {
		return PinCodeField;
	}
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/form/div/div[3]/div[2]/input")
	WebElement LocalityField;
	
	public WebElement getLocalityField() {
		return LocalityField;
	}
	
	@FindBy(xpath="//div[@class='GTbXbG _2kJObl']")
	WebElement AddressTextField;
	
	public WebElement getAddressTextField() {
		return AddressTextField;
	}
	
	@FindBy(xpath="//div[@class='GTbXbG _2kJObl']")
	WebElement CityTextField;
	
	public WebElement getCityTextField() {
		return CityTextField;
	}
	
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/form/div/div[6]/div[1]/input")
	WebElement OptionalLandMarkTextField;
	
	public WebElement getOptionalLandMarkTextField() {
		return OptionalLandMarkTextField;
	}
	
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/form/div/div[6]/div[2]/input")
	WebElement OptionalPhoneNumberTextField;
	
	public WebElement getOptionalPhoneNumberTextField() {
		return OptionalPhoneNumberTextField;
	}
	public FlipkartManageAddress_Pages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
