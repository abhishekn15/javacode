package Parameter;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoB {
	@Test
	@Parameters({"name"})
	public void Descrption(String name) {
		Reporter.log("the name is"+name,true);
	}

}
