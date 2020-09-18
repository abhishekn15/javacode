package DemoTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB {// here by default TestNg will run in alphabetic order so we have to set priotiy
	
	@Test(priority=1)
	public void A() 
		{
			Reporter.log("How are you",true);
		}
		@Test(priority=0)
			public void B() 
		{
				Reporter.log("hi",true);
		}
			@Test(priority=2)
				public void C() 
	   {
					Reporter.log("bye",true);
        }
			@Test
			public void Aa() {
				Reporter.log("hi my name is abhishek",true);
			}
			
		
	   }
	
	

