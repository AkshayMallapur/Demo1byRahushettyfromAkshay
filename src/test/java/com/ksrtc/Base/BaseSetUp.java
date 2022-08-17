package com.ksrtc.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ksrtc.pom.PNRPage;
import com.ksrtc.pom.PackagePage;
import com.ksrtc.pom.SignInPage;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseSetUp {
	public SignInPage signInPage;
    public PNRPage pnrEnquiryPage;
  	public PackagePage packagePage;
//	public CancelTicketsPage cancelticketspage;
//	public SearchForBuspage searchforbspg;
//	public StudentPassPage studenttPass;
	
//	public ScreenRdrPage screenrdrpage;
//	public KSTDCTourPage kstdcTourPage;
//	
	
	
  	
  	
	
	public WebDriver driver;
	
	@BeforeMethod
	public void loginAsValidUser() {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver(chromeOptions);
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		
//		
//		
    	signInPage=PageFactory.initElements(driver, SignInPage.class);
		
        pnrEnquiryPage=PageFactory.initElements(driver, PNRPage.class);
	
		packagePage=PageFactory.initElements(driver, PackagePage.class);
//		
//		cancelticketspage=PageFactory.initElements(driver, CancelTicketsPage.class);
//		
//		searchforbspg=PageFactory.initElements(driver, SearchForBuspage.class);
//		
//		studenttPass=PageFactory.initElements(driver, StudentPassPage.class);
//		
//		screenrdrpage=PageFactory.initElements(driver, ScreenRdrPage.class);
//		
//		kstdcTourPage=PageFactory.initElements(driver, KSTDCTourPage.class);
		
		
		

	}

	
@AfterMethod
public void TearDown()
{
   driver.quit();
	
}

}