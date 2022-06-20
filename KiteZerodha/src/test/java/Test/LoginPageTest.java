package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POJO.Browser1;
import POM.ZerodhaLoginPage;
import Utility.Parametrization1;
import Utility.Report;
@Listeners(TestListners.class)

public class LoginPageTest extends BaseTest {
	ExtentReports reports;
	ExtentTest test;
	
	//WebDriver driver;
	
	@BeforeTest
	public void extentreports() {
		reports=Report.createReports();
	}
	
	@BeforeMethod
	public void browser() {
		  driver =Browser1.openBrowser();
	}
	
	@Test
	public void loginwithvalidcredentialstest() throws IOException {
		test=reports.createTest("loginwithvalidcredentialstes");
		ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		String userId= Parametrization1.getData( 0, 1);
		String password=Parametrization1.getData(1, 1);
		zerodhaloginpage.enteruserId(userId);
		zerodhaloginpage.enterpassword(password);
	    zerodhaloginpage.clickonlogin();
	    }
	@Test
	public void forgotpasswordlnkTest() {
		test=reports.createTest("forgotpasswordlnkTest");
		ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		zerodhaloginpage.clickonforgotpassword();
		}
    @Test
    public void signuplinkTest() {
    	test= reports.createTest("signuplinkTest");
		ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		zerodhaloginpage.clickonlogin();

    }
    @AfterMethod
    public void closebrowser(ITestResult result) {
    	if(result.getStatus()==ITestResult.FAILURE) {
    		test.log(Status.FAIL, result.getName());
    	}else if(result.getStatus()==ITestResult.SUCCESS) {
    		test.log(Status.PASS,result.getName());
    	}else {
    		test.log(Status.SKIP, result.getName());
    	}
    	}
    
    	@AfterTest
    	public void flushReport() {
    		reports.flush();
    	}
    	
    

	
	
		
	
    
    
}

