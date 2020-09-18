package Grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB {

@Test(groups="m")	
public void m1() {
	Reporter.log("m1 is executed",true);
}
	
@Test(groups="n")
public void n1() {
	Reporter.log("n1 is executed",true);	
}
@Test(groups="m")
public void m2() {
	Reporter.log("m2 is executed",true);	
}
	
@Test(groups="n")
public void n2() {
	Reporter.log("n2 is executed",true);	
}	
	
@Test(groups="n")
public void n3() {
	Reporter.log("n3 is executed",true);	
}
	
	
	
	
	
	
}
