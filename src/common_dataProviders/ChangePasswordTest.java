package common_dataProviders;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ChangePasswordTest {

	
	@AfterMethod
	public void afterMethod(){
		System.out.println("---AfterMethod---");
	}
	
	@Test(dataProviderClass=Data_Provider.class, dataProvider="passwordDataProider")
	public void changePasswordTest(
			String username,
			String password,
			String email,
			int pNumber){
		System.out.println("Logging in");
	}
}
