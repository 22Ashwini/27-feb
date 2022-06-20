package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
	
	public static ExtentReports createReports() {
		ExtentSparkReporter htmlreport = new ExtentSparkReporter("extentReport.html");
		
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(htmlreport);
		reports.setSystemInfo("Regresssion", "Zerodha");
		reports.setSystemInfo("Browser", "Chrome");
		return reports;
	


}}

