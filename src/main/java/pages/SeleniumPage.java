package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPage {
	
	
	public SeleniumPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div/div/h2")
	WebElement heading;
	
	@FindBy(linkText = "BUY NOW")
	WebElement buy;


	public void gotoBuynow() {
		
		System.out.println(heading.getText());
		
		
		
	}

}
