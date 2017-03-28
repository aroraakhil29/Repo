package testcases;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplicationTest {

	@BeforeTest
	public void beforeTest(){
		System.out.println("BeforeTest");
	}
	@AfterTest
	public void afterTest(){
		System.out.println("AfterTest");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("---BeforeMethod---");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("---AfterMethod---");
	}
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("BeforeSuite");
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("AfterSuite");
	}
	@Test(priority=1)
	public void doLogin(){
		System.out.println("Logging in");
		throw new SkipException("Skipping login");
	}
	
	@Test(priority=2, dependsOnMethods={"doLogin"})
	public void doPasswordChange(){
		System.out.println("Changing password");
	}
	
	@Test(priority=3, dependsOnMethods = {"doLogin", "doPasswordChange"})
	public void doLogout(){
		System.out.println("Logging out");
	}
}
