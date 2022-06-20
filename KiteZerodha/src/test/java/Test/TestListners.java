package Test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;


import Utility.Screenshot1;


public class TestListners extends BaseTest implements ITestListener{
	
	 public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+"Test has failed");}
//		 try {
//				Screenshot1.takescreenshot(driver, result.getName());
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		 }
	 
	 
		 
		
	 public void onTestFailure(ITestResult result) {
		 try {
				Screenshot1.takescreenshot(driver, result.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 
	 
	 
		
		
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"Test has Success");
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+"Tes has skipped");
	}
	

}
