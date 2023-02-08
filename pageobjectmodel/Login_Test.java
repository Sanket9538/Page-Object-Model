package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Test {
    WebDriver driver;
    Login_Page2 lp;
	
	
	@BeforeClass
	void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}
	@Test(priority=1)
	void testLogo()
	{
		lp=new Login_Page2(driver);//whenever creating objects, it will try to invoke constructor.and this constructor is expecting driver parameter.so pass the driver
		Assert.assertEquals(lp.checkLogoPresent(),true);
		
		
	}
	@Test(priority=2)
	void testLogin()
	{
		lp.setUserName("Admin");
		lp.setPassword("Admin123");
		lp.clickSubmit();
		
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}
