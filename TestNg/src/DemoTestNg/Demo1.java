package DemoTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void A() {
		
		Reporter.log("hai");
		
	}
	@Test
	public void D() {
		
		Reporter.log("hhai");
		
	}
	@Test 
	public void C() {
		Reporter.log("how are you");
	}
	@Test
	public void B() {
		Reporter.log("bye", true);
	}
	

}
