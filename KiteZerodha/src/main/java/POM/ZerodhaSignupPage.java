package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignupPage {
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;
	@FindBy(xpath="//input[@name='mobile']")private WebElement mobile;
	@FindBy(xpath = "//button[@type=\"submit\"]")private WebElement continu;
	@FindBy(xpath = "//a[text()='Want to open an NRI account?']")private WebElement NRIacc;
	@FindBy(xpath = "//a[text()='About']")private WebElement about;
	@FindBy(xpath = "//a[text()='Products']")private WebElement product;

  public ZerodhaSignupPage (WebDriver driver) {
	  PageFactory.initElements(driver, this);
  }
  public void clickonsignup() {
	  signup.click();
  }
  public void entermobileno(String mob) {
	  mobile.sendKeys(mob);
  }
  public void clickoncontinue() {
	  continu.click();
  }
  public void clickonNRIacc() {
	  NRIacc.click();
  }
  public void clickonabout() {
	  about.click();
  }
     public void clickonproduct() {
	  product.click();
   }
}
