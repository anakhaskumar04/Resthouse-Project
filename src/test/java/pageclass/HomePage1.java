package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage1  {
	static WebDriver driver;
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/div/nav/div/div[2]/div/div/ul/li[3]/a/strong")WebElement Bookingbtn;
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/div/nav/div/div[2]/div/div/ul/li[3]/div/div/div/div[1]/ul/li[1]/a")WebElement Checkbtn;
	

	public HomePage1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public void Bookg() {
		Bookingbtn.click();


	}
	
	public void Check() {
		Checkbtn.click();

	}
	
//@Test
	public static String title() {
		return driver.getTitle();

	}
	
}
