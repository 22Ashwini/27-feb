package POJO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser1 {
	
public static WebDriver openBrowser() {
	

System.setProperty("webdriver.chrome.driver","F:\\selenium\\Chromeexe\\chromedriver.exe");

	 WebDriver Driver = new ChromeDriver();
	 Driver.get("https://kite.zerodha.com/");
	 ChromeOptions options = new ChromeOptions();//class of Selenium
		options.addArguments("--disable-notifications");//to handle notification
	 
	 Driver.manage().window().maximize();
	 Driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	 return Driver;
	 
}
}
//"D:\Automation\ChroDriver\chromedriver.exe"