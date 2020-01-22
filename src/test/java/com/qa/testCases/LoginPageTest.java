package com.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestUtil;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		
	}	
	
	
	
	@Test
	public void demo() {
		System.out.println("hai");
	}
	
	@Test(dataProvider="getCRMTestData")
	public void loginTest(String urName, String pasword) {
		homePage=loginPage.login(urName, pasword);
		
	}
@DataProvider
	public Object[][] getCRMTestData() {
		
		Object data [][]=TestUtil.getTestData("contacts");
		return data;
		
	}	
	
//	@Test
//	public void loginTest() {
//	
//		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
