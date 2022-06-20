package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ZerodhaForgotPage {
	
    @FindBy(xpath ="//label[@for='radio-31']")private WebElement forgotuserID;
	@FindBy(xpath ="(//input[@type='text'])[1]")private WebElement pan;
	@FindBy(xpath ="//label[@for='radio-36']")private WebElement sms;
	@FindBy(xpath ="(//input[@type='text'])[2]")private WebElement mobileno;
	@FindBy(xpath ="(//a[@href='/'])[2]")private WebElement backtologin;

	
	
public ZerodhaForgotPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
public void clickonforgotuserID() {
	forgotuserID.click();
}
public void enterpan(String pann) {
	pan.sendKeys(pann);
}
public void clickonsms() {
	sms.click();
}
public void entermobileno(String no) {
	mobileno.sendKeys(no);
}
public void clickonbacktologin() {
	backtologin.click();
}














}



















