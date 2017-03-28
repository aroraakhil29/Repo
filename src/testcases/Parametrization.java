package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parametrization {

	@AfterMethod
	public void afterMethod(){
		System.out.println("---AfterMethod---");
	}
	
	@Test(dataProvider="getData")
	public void loginTest(
			String username,
			String password,
			String email,
			int pNumber){
		System.out.println("Logging in");
	}
	
	@DataProvider(parallel=true)
	public Object[][] getData(){
		Object[][] data = new Object[3][4];
		
		data[0][0] = "u1";
		data[0][1] = "p1";
		data[0][2] = "a@a.com";
		data[0][3] = 123;
		
		data[1][0] = "u1";
		data[1][1] = "p1";
		data[1][2] = "a@a.com";
		data[1][3] = 123;
		
		data[2][0] = "u1";
		data[2][1] = "p1";
		data[2][2] = "a@a.com";
		data[2][3] = 123;
		
		return data;
	}
}
