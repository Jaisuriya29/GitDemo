package com.qa.testscripts;

	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import com.qa.utility.ExcelUtility;

	public class TC_FlipkartLogin_001  extends TestBase {
		@Test(enabled=true,priority=0,dataProvider="getData")
		public void logIn(String Mobile, String Password) throws Throwable{

			flipkart1.getEmail_or_Mobile().sendKeys(Mobile);						//Login
			flipkart1.getpasswordTF().sendKeys(Password);
			flipkart1.getlogInBtn().click();
			Thread.sleep(4000);
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

