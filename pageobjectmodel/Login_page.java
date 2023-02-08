package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page {
  public WebDriver driver;
	//constructor
	
	Login_page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	By img_Logo=By.xpath("//img[@alt='company-branding']");
	By txt_username=By.xpath("//input[@placeholder='Username']");
	By txt_Password=By.xpath("//input[@placeholder='Password']");
	By btn_submit=By.xpath("//button[@type='submit']");
	
	
//action class
	public void setUserName(String username) 
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void setPassword(String password) 
	{
		driver.findElement(txt_Password).sendKeys(password);
	}
	
	public void clickSubmit() 
	{
		driver.findElement(btn_submit).click();
	}
	
	public boolean checkLogoPresent() 
	{
		boolean status=driver.findElement(img_Logo).isDisplayed();
		return status;
	}
	
	
}
 