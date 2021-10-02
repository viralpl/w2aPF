package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class LoginTest {
	
	@Test							
	public void loginTest() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.way2automation.com/");
		
		
		HomePage home = new HomePage(driver);
		home.selGotoCourse().gotoBuynow();
		Thread.sleep(2000);
		home.apiGotoCourse().gotoBuynow();
		
	}

}
