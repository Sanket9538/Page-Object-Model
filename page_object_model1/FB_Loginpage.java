package page_object_model1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FB_Loginpage {
    WebDriver driver;
    
	//constructor 
    FB_Loginpage(WebDriver driver)
    {
    	this.driver=driver;
    }
	
    
    
	//locator
	By txt_Username=By.xpath("//input[@id='email']");
	By txt_password=By.xpath("//input[@id='pass']");
	By btn_suubmit=By.xpath("//button[@id='loginbutton']");
	
	
   //actions
	void setUserName(String username)
	{
		driver.findElement(txt_Username).sendKeys(username);
	}
	void setPassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	void clickSubmit()
	{
		driver.findElement(btn_suubmit).click();
	}
	
}
