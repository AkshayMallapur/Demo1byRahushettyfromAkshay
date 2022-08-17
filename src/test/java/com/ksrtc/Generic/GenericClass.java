package com.ksrtc.Generic;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GenericClass {
	
	
	
	
	public static boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
		
		
	}
   
	public static boolean elementClick(WebElement element) {
		if(isDisplayed(element)){
			element.click();
			return true;
		}
		return false;
		
		
	}
	
	public static boolean setValue(WebElement element, String value) {
		if(isDisplayed(element)){
			element.sendKeys(value);
			return true;
		}
		return false;
	}
	
	public static boolean enterPhoneNumber(WebElement element) {
		if(isDisplayed(element)){
			element.sendKeys("7795331604");
			return true;
		}
		return false;
	}
	public static boolean TxtEmail1(WebElement element) {
		if(isDisplayed(element)){
			element.sendKeys("akshaymallapur1503@gmail.com");
			return true;
		}
		return false;
	}
	public static boolean TxtPassword1(WebElement element) {
		if(isDisplayed(element)){
			element.sendKeys("Akshay@1503");
			return true;
		}
		return false;
	}
		
		public static boolean enterFromplace(WebElement element) {
			if(isDisplayed(element)){
				element.sendKeys("BANGALORE");
				return true;
			}
			return false;
		}
			
			public static boolean enterFromplace1(WebElement element) {
				if(isDisplayed(element)){
					element.sendKeys(Keys.ARROW_DOWN);
					return true;
				}
				return false;
			}
				public static boolean enterFromplace2(WebElement element) {
					if(isDisplayed(element)){
						element.sendKeys(Keys.ENTER);
						return true;
					}
					return false;
				}
				public static boolean GoingTo(WebElement element) {
					if(isDisplayed(element)){
						element.sendKeys("DHARWAD");
						return true;
					}
					return false;
				}
				public static boolean GoingTo1(WebElement element) {
					if(isDisplayed(element)){
						element.sendKeys(Keys.ARROW_DOWN);
						return true;
					}
					return false;
				}
				public static boolean GoingTo2(WebElement element) {
					if(isDisplayed(element)){
						element.sendKeys(Keys.ENTER);
						return true;
					}
					return false;
		
		
	
		
	}
	
	public static boolean enterPnrnbr(WebElement element) {
		if(isDisplayed(element)){
		    element.sendKeys("1235");
		    return true;
		}
		return false;
		
		
		
	}
	public static boolean enterTxnPwd(WebElement element) {
		if(isDisplayed(element)){
		    element.sendKeys("1235");
		    return true;
		}
		return false;
		
	}
	public static boolean clearText(WebElement element) {
		if(isDisplayed(element)){
		    element.clear();
		    return true;
		}
		return false;
	}
}



	
	
	
	
	
	