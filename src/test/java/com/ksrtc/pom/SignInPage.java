package com.ksrtc.pom;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static com.ksrtc.Generic.GenericClass.*;

public class SignInPage {

	public WebDriver driver;
	
	
		public SignInPage(WebDriver driver)
		{
			this.driver=driver;
		
		}
	    @FindBy(xpath="//*[contains(text(),'Sign In')]")
		public WebElement SignInBtn;
	
		
		@FindBy(xpath="//input[@Id='userName']")
		public WebElement TxtEmail;
		
		@FindBy(xpath="//input[@Id='password']")
		public WebElement TxtPassword;
		
		@FindBy(id="submitBtn")
		public WebElement LoginBtn;
		
		@FindBy(xpath="//div[@class='dropdown']")
		public WebElement Sdrpdown;
		
		@FindBy(xpath="/html/body/header/div/div/div[1]/div/div/ul[1]/li/div/div/a[5]")
		public WebElement Logout;
		
		
		

		
		
		public void signAsValidUser(String username,String password) {
			elementClick(SignInBtn);
			Assert.assertTrue("Sign In successfully",true);
			
			setValue(TxtEmail, username);
			setValue(TxtPassword, password);
			elementClick(LoginBtn);
//			driver.getTitle();
//			
//			//if(driver.getTitle().equals("")) {
//				
//			//}
//		
//			
//			elementClick(Sdrpdown);
//			elementClick(Logout);
     		driver.close();
//			
			
				
			}
		
     
		}
		