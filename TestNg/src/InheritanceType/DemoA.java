package InheritanceType;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA extends BaseClass {
	@Test
	public void end() {
		Reporter.log("programe has ended",true);
	}

}
