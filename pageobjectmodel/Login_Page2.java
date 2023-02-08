package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page2 {
       public WebDriver driver;
      
       Login_Page2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//web elements capture(locators + identification)= need to capture web elements and not the locators
	@FindBy(xpath="//img[@alt='company-branding']") 
	WebElement img_logo;
	
	@FindBy(xpath="//input[@placeholder='Username']") 
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_Password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btn_submit;
	
	//@FindBy(tagName="a")
	
	//List<WebElement>tagname;
	
	
	
//action class 
	public void setUserName(String username) 
	{
		txt_username.sendKeys(username);
	}
	
	public void setPassword(String password) 
	{
		txt_Password.sendKeys(password);
	}
	
	public void clickSubmit() 
	{
		btn_submit.click();
	}
	
	public boolean checkLogoPresent() 
	{
		boolean status= img_logo.isDisplayed();
		return status;
	}
	
	
	
}
