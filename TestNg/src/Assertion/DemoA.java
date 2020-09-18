package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
/*
 * Hard Assert- it is used for major and critical bug 
 */
public class DemoA {
	@Test
	public void CompareToString() {
		String exp="aks";
		String act="cks";
		Assert.assertEquals(act, exp);//it is used in place of if else statment where if it fails then the test also fails
		System.out.println("I it working as per user excepetion");//which don't happen in if else 
	}
     @Test
     public void CompareTwoNumbers() {
    	  int actual=10;
    	 int expected=10;
    	 Assert.assertEquals(actual,expected );
     }
     @Test 
     public void Test() {
    	 String actual="abhishek";
    	 String expected="abhishek";
    	 Assert.assertEquals(actual, expected);
    	 Assert.assertTrue(true);//if we do false it will fail the programe
    	 
     }
     @Test
     public void Test1() {
    	 String actual="abhishek";
    	 String expected="abhishek";
    	 Assert.assertEquals(actual, expected);
    	 Assert.assertFalse(false);//if we do true it will fail the programe
     }
   
}
