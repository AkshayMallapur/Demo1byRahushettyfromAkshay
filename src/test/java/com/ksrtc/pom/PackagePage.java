package com.ksrtc.pom;

import static com.ksrtc.Generic.GenericClass.elementClick;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PackagePage {
public WebDriver driver;
	

    public void Packagepage(WebDriver driver) {
	this.driver=driver;
 }
    

    @FindBy(xpath="//a[@title='Package Tours']")
    public WebElement PackageTour;
    
    @FindBy(xpath="//input[@type='button']")
    public WebElement BookNow;
    
    @FindBy(id="txtJourneyDate")
    public WebElement Date;
    

    @FindBy(xpath="//td[contains(@class,'current-day')]")
    public WebElement pickdate;
    
    @FindBy(id="searchBtn")
    public WebElement SearchBtn;
    
	public void pckgpge() {
		elementClick(PackageTour);
		elementClick(BookNow);
		elementClick(Date);
		elementClick(pickdate);
		elementClick(SearchBtn);
		
		

	}
}
