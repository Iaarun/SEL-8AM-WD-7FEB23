package testNgScripts;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" STARTS");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" FAILS");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" PASS");
	}

}
