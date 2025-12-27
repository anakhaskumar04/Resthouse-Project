package pageclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepkg.Baseclass;

public class ConfirmationPage extends Baseclass{
WebDriver driver;
@FindBy(xpath="//*[@id=\"check_availability_submit____\"]/b")WebElement booknow;
@FindBy(xpath="//*[@id=\"chk_agree\"]")WebElement checkbox;          //Checkbox handling
@FindBy(xpath="//*[@id=\"btn_proceed\"]")WebElement alert;           //Alertbox handling
@FindBy(xpath="//*[@wfd-id=\"id3\"]")WebElement radiobutton;         //Radiobutton handling

public ConfirmationPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

//Screesnshot

public void scrnsht() throws IOException, Exception {
	File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(s,new File("C:\\Users\\Anakha\\OneDrive\\Desktop\\Selenium works\\Eclipse\\ScreenShotResthouse\\Resthouse.png"));
	System.out.println("Screenshot taken successfully");
}

public void confirmation() {
	booknow.click();
}


	
public void check() {
	checkbox.click();
	System.out.println(checkbox.isSelected());
}


public void proceed() {
	alert.click();
}
public void radio() {
	radiobutton.click();
	System.out.println(radiobutton.isSelected());
}
public void scrnsht2() throws IOException, Exception {
	File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(s,new File("C:\\Users\\Anakha\\OneDrive\\Desktop\\Selenium works\\Eclipse\\ScreenShotResthouse\\Resthouse2.png"));
	System.out.println("Screenshot taken successfully");
}

}
