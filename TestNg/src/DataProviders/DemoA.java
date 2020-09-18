package DataProviders;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoA {
	@DataProvider
	public String [][] dataValues(){
		String [][]s=new String [2][2];
		s[0][0]="Abhishek";
		s[0][1]="qsp123";
		s[1][0]="Singh";
		s[1][1]="asp123";
		
		return s;
		
	}
	@Test(dataProvider="dataValues")
	public void test_LoginPage(String un,String psd) {
		Reporter.log("The user name is "+un,true);
		Reporter.log("The user name is "+psd,true);
	}

}
