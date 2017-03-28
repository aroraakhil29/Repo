package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegTest {

	SoftAssert softAssert;
	
	@Test
	public void doRegistrationTest(){
		
		softAssert = new SoftAssert();
		String actual1 = "xxx";
		String expected1 = "yyy";
		
		//Assert.assertEquals(actual1, expected1);
		//Assert.fail("Deliberately failing the test");
		softAssert.fail("Deliberately failing the test");
		softAssert.assertAll();
	}
	
	@Test
	public void isElementPresent(){
		softAssert = new SoftAssert();
		System.out.println("A");
		//Assert.assertTrue(2>3, "2 not greater than 3");
		softAssert.assertTrue(2>3, "2 not greater than 3");
		softAssert.assertTrue(2>4, "2 not greater than 4");
		softAssert.assertTrue(4>2, "4 not greater than 2");
		System.out.println("B");
		
		softAssert.assertAll();
	}
	
}
