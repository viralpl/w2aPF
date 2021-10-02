package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"navbar-collapse-1\"]/ul/li[3]/a")
	WebElement selenium;
	
	@FindBy(xpath = "//*[@id=\"navbar-collapse-1\"]/ul/li[3]/ul/li[2]/a")
	WebElement seltraining;
	
	public SeleniumPage selGotoCourse() {
		
		Actions action = new Actions(driver);
		action.moveToElement(selenium).perform();	
		seltraining.click();
		
		return new SeleniumPage(driver);
		
	}
	
	
	@FindBy(xpath = "//*[@id=\"navbar-collapse-1\"]/ul/li[4]/a")
	WebElement api;
	
	@FindBy(xpath = "(//ul[@class='dropdown-menu']/li)[9]")
	WebElement apitraining;
	
	public APIPage apiGotoCourse() {
		
		new Actions(driver).moveToElement(api).perform();	
		apitraining.click();
		
		return new APIPage(driver);
		
	}
	
	
	
	

}
