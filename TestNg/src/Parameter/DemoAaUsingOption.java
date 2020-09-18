package Parameter;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoAaUsingOption {

	@Test
	@Parameters({"city","area"})
	public void  place (@Optional("Mandaya")String city,@Optional ("Rp road") String area) {
	Reporter.log("The name of the city is" + city,true);
	Reporter.log("The name of the area is"+ area, true);

	
	
	
	
	
	}
	
	
}
