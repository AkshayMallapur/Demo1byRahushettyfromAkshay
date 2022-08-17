
package com.ksrtc.test;

import org.testng.annotations.Test;

import com.ksrtc.Base.BaseSetUp;


public class PNRTest extends BaseSetUp {
	@Test
	public void verifyforValidPNRAndValidMobileNbr() throws InterruptedException
	{
		
		
		//valid PNR Number and valid Mobile Number
		pnrEnquiryPage.pnrtest("4535435", "9538555151");
		
	
		
	}
	
	public void verifyforInValidPNRAndValidMobileNbr() throws InterruptedException
	{
		
		
		//Invalid PNR Number and valid Mobile Number
		pnrEnquiryPage.pnrtest("7635356", "9538555151");
		
	
		
	}
	public void verifyforInValidPNRAndInValidMobileNbr() throws InterruptedException
	{
		
		
		//Invalid PNR Number and valid Mobile Number
		pnrEnquiryPage.pnrtest("7635356", "953855515");
		

	}
	
	public void verifyforInValidPNRAndNoMobileNbr() throws InterruptedException
	{
		
		
		//Invalid PNR Number and valid Mobile Number
		pnrEnquiryPage.pnrtest("7635356", " ");
		driver.switchTo().alert().accept();
		

	}
	
	
	

}
