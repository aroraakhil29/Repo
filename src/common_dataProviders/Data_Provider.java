package common_dataProviders;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data_Provider {

	@DataProvider(name="passwordDataProider", parallel=true)
	public static Object[][] getPasswordData(){
		Object[][] data = new Object[3][4];
		
		data[0][0] = "u1";
		data[0][1] = "p1";
		data[0][2] = "a@a.com";
		data[0][3] = 123;
		
		data[1][0] = "u2";
		data[1][1] = "p2";
		data[1][2] = "a@a.com";
		data[1][3] = 123;
		
		data[2][0] = "u3";
		data[2][1] = "p3";
		data[2][2] = "a@a.com";
		data[2][3] = 123;
		
		return data;
	}
	
	@DataProvider(name="loginDataProider")
	public static Object[][] getLoginData(){
		Object[][] data = new Object[3][3];
		
		data[0][0] = "u1";
		data[0][1] = "p1";
		data[0][2] = 123;
		
		data[1][0] = "u2";
		data[1][1] = "p2";
		data[1][2] = 123;
		
		data[2][0] = "u3";
		data[2][1] = "p3";
		data[2][2] = 123;
		
		return data;
	}
	
	@DataProvider(name="sameDataProider")
	public static Object[][] getSameData(){
		Object[][] data = new Object[2][2];
		
		data[0][0] = "u1";
		data[0][1] = "p1";
		
		data[1][0] = "u2";
		data[1][1] = "p2";

		
		return data;
	}
	
	@DataProvider(name="differentDataProvider")
	public static Object[][] getDifferentData(Method m){
		
		Object[][] data = null;
		if(m.getName().equals("testC")){
			
			data = new Object[2][2];
			data[0][0]="a1";
			data[0][1]="b1";
			
			data[1][0]="a2";
			data[1][1]="b2";
					
		}
		
		else if(m.getName().equals("testD")){
			data = new Object[2][3];
			data[0][0]="c1";
			data[0][1]="d1";
			data[0][2]=123;
			
			data[1][0]="c2";
			data[1][1]="d2";
			data[1][2]=456;
		}
		
		return data;
		
	}
}
