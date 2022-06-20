package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser1;
import POM.ZerodhaForgotPage;
import POM.ZerodhaLoginPage;
import Utility.Parametrization1;

public class ForgotpageTest {
	WebDriver driver;
	@BeforeMethod
	public void browser() {
		driver =Browser1.openBrowser();
	}
  @Test
  public void forgotidtest() throws InterruptedException, IOException  {
	  ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
	  zerodhaloginpage.clickonforgotpassword();
	  Thread.sleep(5000);
	  ZerodhaForgotPage zerodhaforgotpage =new ZerodhaForgotPage(driver);
	  
	  zerodhaforgotpage.clickonforgotuserID();
	  
	  String pan =Parametrization1.getData( 3, 1);
	 
	  zerodhaforgotpage.enterpan(pan);
	  
	  zerodhaforgotpage.clickonsms();
	  String mobile =Parametrization1.getData( 4, 1);
	  zerodhaforgotpage.entermobileno(mobile);
	
	  zerodhaforgotpage.clickonbacktologin();
  }
}
