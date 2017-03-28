package common_dataProviders;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest {

	
	@AfterMethod
	public void afterMethod(){
		System.out.println("---AfterMethod---");
	}
	
	@Test(dataProviderClass=Data_Provider.class, dataProvider="loginDataProider")
	public void loginTest(
			String username,
			String password,
			int pNumber){
		System.out.println("Logging in");
	}
}
