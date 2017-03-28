package common_dataProviders;

import org.testng.annotations.Test;

public class SampleTestCases {

	//multiple tests - same data - same dataprovider
	//multiple tests - different data - same dataprovider
	@Test(dataProvider="sameDataProider", dataProviderClass=Data_Provider.class)
	public void testA(String u, String p){
		System.out.println("Executing TestA");
	}
	
	@Test(dataProvider="sameDataProider", dataProviderClass=Data_Provider.class)
	public void testB(String u, String p){
		System.out.println("Executing TestB");
	}
	
	@Test(dataProvider="differentDataProvider", dataProviderClass=Data_Provider.class)
	public void testC(String a, String b){
		System.out.println("Executig TestC");
	}
	
	@Test(dataProvider="differentDataProvider", dataProviderClass=Data_Provider.class)
	public void testD(String c, String d, int e){
		System.out.println("Executing TestD");
	}
	
}
