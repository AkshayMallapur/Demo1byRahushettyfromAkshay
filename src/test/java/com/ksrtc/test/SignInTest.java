package com.ksrtc.test;

import org.testng.annotations.Test;

import com.ksrtc.Base.BaseSetUp;



public class SignInTest extends BaseSetUp {
	
	@Test //(priority=1)
	public void verifySignInforValidusernameAndValidpassword() throws InterruptedException
	{
		
		
		//Valid username and valid password
		signInPage.signAsValidUser("akshaymallapur1503@gmail.com", "Mallapur@1503");
	
		
	}
	
	
	@Test //(priority=2)
	public void verifySignInfoInValidusernameAndValidpassword() throws InterruptedException
	{
		
		//InValid username and valid password
		signInPage.signAsValidUser("akshaymallapur@gmail.com", "Akshay@1503");
	    
	
	}
	@Test// (priority=3)
	public void verifySignInfoValidusernameAndInValidpassword() throws InterruptedException
	{
		
		//Valid username and valid password
		signInPage.signAsValidUser("akshaymallapur1503@gmail.com", "Akshay");
	    
	
	}
	@Test //(priority=4)
	public void verifySignInforNoUsernsameAndValidpassword() throws InterruptedException
	{
		
		
		//Valid username and valid password
		signInPage.signAsValidUser(" ", "Akshay@1503");
	  
	}
	@Test //(priority=5)
	public void verifySignInforNoUsernsameAndNopassword() throws InterruptedException
	{
		
		//Valid username and valid password
		signInPage.signAsValidUser(" ", " ");
	  
	}
	
	
	
	
	
	
}