package com.ksrtc.pom;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static com.ksrtc.Generic.GenericClass.*;
public class PNRPage {
	
	public WebDriver driver;
	

    public void PnrPage(WebDriver driver) {
	this.driver=driver;
 }
    

    @FindBy(xpath ="//a[@title='PNR Enquiry']")
    public WebElement PnrEnquiryBtn;
    
    @FindBy(xpath="//input[@Id='pnrPrefixWithTktNo']")
    public WebElement PnrNo;
    
    @FindBy(xpath="//input[@Id='mobileNo']")
    public WebElement MobileNo;
    

    @FindBy(id="searchBtn")
    public WebElement SearchBtn;
    
    @FindBy(xpath="//*[contains(text(),'Please enter valid PNR and Prefix.')]")
    public WebElement ErrorMsg;
    
    
    
    
    
    
    
    
	public void pnrtest(String pnrnbr,String mblnbr) {
		elementClick(PnrEnquiryBtn);
		Assert.assertTrue("Sign In successfully",true);
		
		setValue(PnrNo, pnrnbr);
		setValue(MobileNo, mblnbr);
		elementClick(SearchBtn);
		elementClick(ErrorMsg);
		
		String exp = "Please enter valid PNR and Prefix.";
		String Act = ErrorMsg.getText();
		Assert.assertEquals(Act, exp);
		System.out.println(exp);
		System.out.println(Act);
		

	}
    
    

}
