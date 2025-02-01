package com.qa.testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TC_FlipkartMyProfile extends TestBase {

	@Test
	public void login () throws InterruptedException {

		flipkart2.getEmail_or_Mobile().sendKeys("8838039861");						//Login
		flipkart2.getpasswordTF().sendKeys("Password");
		flipkart2.getlogInBtn().click();
		Thread.sleep(4000);
		
		WebElement ele= flipkart.getMyAccount();  //MyAccount
		act.moveToElement(ele).perform();
		Thread.sleep(3000);
		flipkart.getWishlist().click();
		Thread.sleep(3000);
		//flipkart2.getMyProfile().click();
		//Thread.sleep(5000);
		flipkart2.getEditName().click();
		WebElement edit=flipkart2.getEditName();
		Point loc = edit.getLocation();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();"+loc);
		
		Thread.sleep(5000);

		//flipkart2.getFirstName().sendKeys(FirstName);
		//flipkart2.getLastName().sendKeys(LastName);
		flipkart2.getGenderRadioButton();
		flipkart2.getSaveNameButton().click();

	}
 

/*	@DataProvider
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

	}*/
}
