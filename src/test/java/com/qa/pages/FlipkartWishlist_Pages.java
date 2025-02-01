package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartWishlist_Pages {
	WebDriver driver;

	
	@FindBy(xpath="//div[@class='exehdJ' and text()='jai']")    //MyAccount
	WebElement MyAccount;

	public WebElement getMyAccount() {
		return MyAccount;
	}
	
	@FindBy(xpath="//div[@class='_3vhnxf' and text()='Wishlist']")
	WebElement Wishlist;
	
	public WebElement getWishlist() {
		return Wishlist;
	}
	@FindBy(name="q")
	WebElement SearchTF;
	public WebElement getSearchTF() {
		return SearchTF;
	}

					//*[@id="container"]/div/div[3]/div[1]/div[2]/div[2]/div/div[2]/div/a[1]
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[2]/div/a[1]")
	WebElement Product;
	public WebElement getProduct() {
		return Product;
	}
	
	/*@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[6]/div/div[1]/a/div/img[2]")
	WebElement canonCam;
	public WebElement getcanonCam() {
		return canonCam;
	}*/
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[3]/div")
	WebElement WishlistButton;
	
	public WebElement getWishlistButton() {
		return WishlistButton;
	}
	
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div[2]/a/div[2]/div[2]/div/span/img")
	WebElement DeleteButton;
	
	public WebElement getDeleteButton() {
		return DeleteButton;
	}
	
	@FindBy(xpath="//button[@class='_2KpZ6l _3S58wp']")
	WebElement YesRemoveLink;
	
	public WebElement getYesRemoveLink() {
		return YesRemoveLink;
	}
	
	
	@FindBy(xpath="//div[text()='Logout']")
	WebElement logOut;
	public WebElement getlogOut() {
		return logOut;
	}
	
	
	public FlipkartWishlist_Pages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	  
	


}
