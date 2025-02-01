package com.qa.testscripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.qa.pages.FlipkartLogin_Pages;
import com.qa.pages.FlipkartManageAddress_Pages;
import com.qa.pages.FlipkartMyProfile_Pages;
import com.qa.pages.FlipkartWishlist_Pages;
import com.qa.utility.ExcelUtility;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestBase {


	WebDriver driver = null;
	FlipkartWishlist_Pages flipkart;
	FlipkartLogin_Pages flipkart1;
	FlipkartMyProfile_Pages flipkart2;
	FlipkartManageAddress_Pages flipkart3;
	Actions act;
	SoftAssert softAssert;
	@Parameters("Browser")
	@BeforeClass
	public void setUp(String Browser) throws InterruptedException {


		if(Browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			WebDriverManager.edgedriver().setup();
		}else if(Browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}else if(Browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		flipkart=new FlipkartWishlist_Pages(driver);  
		flipkart1=new FlipkartLogin_Pages(driver);
		flipkart2=new FlipkartMyProfile_Pages(driver);
		flipkart3=new FlipkartManageAddress_Pages(driver);
		act=new Actions(driver);
		softAssert= new SoftAssert();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	
	}
	   

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);																					//Loging out
		/*WebElement myAcc=flipkart.getMyAccount();
		act.moveToElement(myAcc).perform();
		//Thread.sleep(2000);
		flipkart.getlogOut().click();
		driver.quit();*/
		driver.close();
	}
	//To add SS in extent report
		public void captureScreenshot(WebDriver driver, String tname) throws IOException {

			TakesScreenshot screenShot = (TakesScreenshot) driver;
			File Source = screenShot.getScreenshotAs(OutputType.FILE);
			String Dest = System.getProperty("user.dir") + "/Screenshots/" + tname + ".png";
			FileUtils.copyFile(Source, new File(Dest));
	
}
}




