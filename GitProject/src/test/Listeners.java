package test;

import javax.naming.spi.DirStateFactory.Result;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//iTestListener interface which implements Testng Listeners
//Also while execution we will have to say where listeners class is located to redirect in Listeners class
//After suite and Before Test in testng.xml
public class Listeners implements ITestListener{
	//This will execute on begging of test execution
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}
	//This will execute on End of test execution
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}
	
	//When test get Passed this method will get Executed
		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("I successfully executed Listeners Pass code");
		}
	
	//When test get Fail Execution will come below method and Execute as it listen Failure keyword
	@Override
	public void onTestFailure(ITestResult result) {
		//Screen Shot Code
		//Response if API is failed
		System.out.println("I Got executed Listeners fail code" + result.getName());
		//result.getName() is ues to get which test get failed
		//This is becaus we have ITestResult class by which we will get Test which is Executing
		
	}
	
	

}
