package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
/*
 * Soft Assert-it is used for minor bugs where test case should be passed
 */
public class DemoB {
	
	@Test
	public void compareToString() {
		String exp="aks";
		String act="eks";
		System.out.println("Here we start comparing ToString");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(act,exp);
		System.out.println("The test is working as per exception");
		sa.assertAll();//if we don't use this it will  not fail the Test
	}

}
