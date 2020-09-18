package DataProviders;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoB {
	@DataProvider
	public String [][] dataValues() {
	String[][] s= new String [3][3];
	s[0][0]="Abhishek";
	s[0][1]="Abhishek";
	s[1][0]="Abhishek";
	s[1][1]="Abhishek";
	s[2][1]="Abhishek";
	s[2][2]="Abhishek";
	
	return s;
	}
	@Test(dataProvider="dataValues")
	public void TestLogin(String user,String pass) {
		Reporter.log("The username is"+user,true);
		Reporter.log("The username is"+pass,true);
	}

}
