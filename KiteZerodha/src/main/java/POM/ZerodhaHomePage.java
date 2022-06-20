package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaHomePage {
	@FindBy(xpath="//input[@type='text']")private WebElement search;
	@FindBy(xpath = " (//span[text()='TATAMOTORS'])[1]")private List<WebElement> tata;
	@FindBy(xpath="//button[@class='button-blue buy']")private WebElement buy;

	//@FindBy(xpath = " (//span[text()='TATAMOTORS'])[1]")private WebElement tata;
	
	

	
	
	public ZerodhaHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void entercompany( String com) {
		search.sendKeys(com);
	}
	public void  clickonbuy(WebDriver driver) throws InterruptedException {
	Actions obj = new Actions(driver);
	Thread.sleep(3000);
	obj.moveToElement((WebElement) tata).perform();
	
	obj.click(buy);
	obj.perform();
	

		
		
	}
	
	
	
	
	
} 
