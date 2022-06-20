package Test;

import java.io.IOException;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
import POM.ZerodhaHomePage;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization1;
import Utility.Report;
@Listeners(TestListners.class)

public class HomePageTest extends BaseTest {
	
	ExtentReports reports;
	ExtentTest test;
	
	
	//WebDriver driver;
	
	
	@BeforeMethod
	public void browser() {
		 driver=Browser1.openBrowser();
	}
	@BeforeTest
	public void extentreports() {
		reports=Report.createReports();
	}
	
	@Test
	 public void logintozrodhawithpinpage() throws IOException, InterruptedException {
		test=reports.createTest(" logintozrodhawithpinpage");
		 ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		 String username = Parametrization1.getData( 0, 1);
		 String password= Parametrization1.getData( 1, 1);
		 zerodhaloginpage.enteruserId(username);
		 zerodhaloginpage.enterpassword(password);
		 zerodhaloginpage.clickonlogin();
		 
		ZerodhaPinPage zerodhapinpage = new ZerodhaPinPage(driver);
		 String pinn= Parametrization1.getData( 2, 1);
		 
		 zerodhapinpage.enterpin(pinn);
		 
		 zerodhapinpage.clickonlogin();
		 
		ZerodhaHomePage zerodhaHomePage = new ZerodhaHomePage(driver);
		zerodhaHomePage.entercompany("Tata Motors");
		Thread.sleep(5000);
		zerodhaHomePage.clickonbuy(driver);
	}
	
	@AfterMethod
	public void closebrowser(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL,result.getName());
		}else 
			if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName());
		}
		    else {test.log(Status.SKIP, result.getName());}
	}
	
	
	
	@AfterTest
	public void flushreports() {
		reports.flush();
	}
		
		
		
		 
		 
		 
		
			
		 
	
}
