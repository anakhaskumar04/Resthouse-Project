package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pageclass.HomePage1;
import pageclass.BookingPage1;
import pageclass.ConfirmationPage;


public class Baseclass {
	public static WebDriver driver;
	public HomePage1 obj;
	public BookingPage1 bookobj;
	public ConfirmationPage conobj;
	
@BeforeClass
	
	public void setup() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		
		
		driver=new ChromeDriver(options);
		driver.get("https://resthouse.pwd.kerala.gov.in/index");
		driver.manage().window().maximize();
	}
@BeforeMethod
public void objmethod() {
	obj=new HomePage1(driver);
	bookobj=new BookingPage1(driver);
	conobj=new ConfirmationPage(driver);
}


	
}
