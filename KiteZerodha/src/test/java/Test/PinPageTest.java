package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser1;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization1;
@Listeners(TestListners.class)

public class PinPageTest extends BaseTest {
	//WebDriver driver;
	
	@BeforeMethod
	 public void browser() {
		 driver =Browser1.openBrowser();
	 }
	 @Test
	 public void logintozrodhawithpinpage() throws IOException, InterruptedException {
		 ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		 String username = Parametrization1.getData( 0, 1);
		 String password= Parametrization1.getData( 1, 1);
		 zerodhaloginpage.enteruserId(username);
		 zerodhaloginpage.enterpassword(password);
		 zerodhaloginpage.clickonlogin();
		 
		 Thread.sleep(3000);
		ZerodhaPinPage zerodhapinpage = new ZerodhaPinPage(driver);
		 String pinn= Parametrization1.getData( 2, 1);
		 
		 zerodhapinpage.enterpin(pinn);
		 
		 zerodhapinpage.clickonlogin();
	 }
       @Test
       public void demo() {
    	   System.out.println("hi");
       }
       
}