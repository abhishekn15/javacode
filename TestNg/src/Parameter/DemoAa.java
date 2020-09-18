package Parameter;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoAa {
	@Test
	@Parameters({"city","area"})
	public void  place (String city,String area) {
	Reporter.log("The name of the city is" + city,true);
	Reporter.log("The name of the area is"+ area, true);

}}

