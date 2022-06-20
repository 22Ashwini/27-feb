package Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import POJO.Browser1;
import POM.ZerodhaSignupPage;
import Utility.Parametrization1;
import Utility.Screenshot;
@Listeners(TestListners.class)
public class SignuppageTest extends BaseTest {
	//WebDriver driver;
	@BeforeMethod
	public void browser() {
		driver=Browser1.openBrowser();
	}
	@Test
	 
	public void entervalidmobileno() throws IOException, InterruptedException {
		ZerodhaSignupPage zerodhasignuppage = new ZerodhaSignupPage(driver);
		zerodhasignuppage.clickonsignup();
	Screenshot.takescreenshot(driver, "xyz");

		
		
		
	
		Set<String> ab= driver.getWindowHandles();
		Iterator<String> i = ab.iterator();
		while (i.hasNext()) 
		{
			String add = i.next();
			driver.switchTo().window(add);
			String curranttitle= driver.getTitle();
			
			if (curranttitle.equals("Signup and open a Zerodha trading and demat account online and start investing – Zerodha")) 
			{
				String mobino=Parametrization1.getData( 3, 1);
			      zerodhasignuppage.entermobileno(mobino);
			      }
			}	 
		
		zerodhasignuppage.clickoncontinue();
		
		zerodhasignuppage.clickonabout();
		zerodhasignuppage.clickonproduct();
       
		zerodhasignuppage.clickonNRIacc();
		driver.quit();
		driver.close();
		
		
	}

}
