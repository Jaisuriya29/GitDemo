package com.qa.testscripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_FlipkartManageAddress extends TestBase{
	@Test
	public void main() throws InterruptedException {
		flipkart2.getEmail_or_Mobile().sendKeys("8838039861");						//Login
		flipkart2.getpasswordTF().sendKeys("Password");
		flipkart2.getlogInBtn().click();
		Thread.sleep(4000);
		System.out.println("hi");
		System.out.println("hi1");
		
		WebElement ele= flipkart3.getMyAccount();  //MyAccount
		act.moveToElement(ele).perform();
		Thread.sleep(3000);
		flipkart.getWishlist().click();
		Thread.sleep(3000);
		
		//flipkart3.getMyProfile().click();
		//Thread.sleep(5000);
		flipkart3.getManageInformationButton().click();
		Thread.sleep(6000);
		flipkart3.getAddAddressLink().click();
		Thread.sleep(3000);
	
	}
	
}
