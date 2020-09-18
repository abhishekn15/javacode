package Listnerslearning;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerDemoExample  implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("The test case Start "+result.getName());	
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("The test case S uccess "+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("The test case fail"+result.getName());
		
	}

	public void onTest(ITestResult result) {
		System.out.println("The test case Skipped"+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
	
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	

}
