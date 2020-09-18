package Parameter;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class DemoA {
	@Test
	@Parameters("city")
	public void  place (String city) {
	Reporter.log("The name of the city is" + city,true);

}}
