package page_object_model1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FB_logintest {

	WebDriver driver;
	FB_Loginpage fl;
	@BeforeClass
	void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	void login() {
		fl=new FB_Loginpage(driver);
		fl.setUserName("9503200610");
		fl.setPassword("9503200");
		fl.clickSubmit();
	}
	
	@AfterClass
	void tearDown() {
	driver.quit();
	}
	
}
