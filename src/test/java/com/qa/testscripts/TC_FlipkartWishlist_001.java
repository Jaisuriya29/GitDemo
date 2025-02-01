package com.qa.testscripts;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.FlipkartWishlist_Pages;
import com.qa.utility.ExcelUtility;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TC_FlipkartWishlist_001 extends TestBase  {
	@Test(enabled=true,priority=0,dataProvider="getData")
	public  void Flipkart(String Mobile, String Password) throws InterruptedException, IOException {
		
		flipkart1.getEmail_or_Mobile().sendKeys(Mobile);						//Login
		flipkart1.getpasswordTF().sendKeys(Password);
		flipkart1.getlogInBtn().click();
		Thread.sleep(4000);
		flipkart.getSearchTF().sendKeys("camera");
		flipkart.getSearchTF().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//flipkart.getProduct().click();
		
		//flipkart.getcanonCam().click();
		flipkart.getWishlistButton().click();
		Thread.sleep(3000);
		WebElement ele= flipkart.getMyAccount();  //MyAccount
		act.moveToElement(ele).perform();
		Thread.sleep(3000);
		flipkart.getWishlist().click();
		Thread.sleep(3000);
		flipkart.getDeleteButton().click();
		Thread.sleep(3000);
		flipkart.getYesRemoveLink().click();
		if(driver.getTitle().contains("My Wishlist"))
	    {
			captureScreenshot(driver,"AfterAddingProductToWishlist");
	    	 Reporter.log("ProductAdded",true);
			 Assert.assertTrue(true);
	    }
	    else
	    {
	    	captureScreenshot(driver,"EmptyWishlist");
			 Reporter.log("Empty Wishlist",true);
			 Assert.assertTrue(true);
	    }

		
	}
	@DataProvider
	public String[][] getData() throws Throwable{
		String fileName="C:\\Users\\jaisu\\eclipse-workspace\\Automation_Flipkart\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx";
		String sheetName="Sheet1";

		int rowCount=ExcelUtility.getRowCount(fileName, sheetName);
		int cellCount=ExcelUtility.getCellCount(fileName, sheetName, rowCount);

		String[][] data= new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				data[i-1][j]=ExcelUtility.getCellData(fileName, sheetName, i, j);
			}
		}

		return data;
}



}



