package pageclass;

import java.util.List;

import org.openqa.selenium.By;
//import java.time.Duration;
//
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepkg.Baseclass;

public class BookingPage1 extends Baseclass{
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"district\"]")WebElement dropdown1;
	@FindBy(xpath="//*[@id=\"district\"]/option[2]")WebElement dropoption1; //Dropdown handling
	@FindBy(xpath="//*[@id=\"resthouse\"]")WebElement dropdown2;
	@FindBy(xpath="//*[@id=\"resthouse\"]/option[4]")WebElement dropoption2;
	@FindBy(xpath="//*[@id=\"room_type\"]")WebElement dropdown3;
	@FindBy(xpath="//*[@id=\"room_type\"]/option[3]")WebElement dropoption3;
	@FindBy(xpath="//*[@id=\"starts_from\"]")WebElement datepicker1;           //Datepicker method
	@FindBy(xpath="//*[@id=\"end_to\"]")WebElement datepicker2;
	@FindBy(xpath="//*[@id=\"search_availability\"]")WebElement search;
	

	
	
	public BookingPage1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void dropdownf() {
		dropdown1.click();
		dropoption1.click();	
	}
	public void dropdowns() {
		dropdown2.click();
		dropoption2.click();
	}
	
	public void dropdownl() {
		dropdown3.click();
		dropoption3.click();
	}
	public void date1() {
		datepicker1.click();
		datepickermethod("March 2026","29");
	}
	public void datepickermethod(String expmonth, String expdate) {
    while (true) {
        String currentMonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	    if (currentMonthYear.equalsIgnoreCase(expmonth)) {
		    List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		    for (WebElement date : allDates) {
		      if (date.getText().equals(expdate)) 
		      {
		       date.click();
		         break;  
		       }
		    }		        break;
		        } 
	    
		        else{
		            driver.findElement(By.xpath("//a[@title='Next']")).click();
		        }
		    }
	}
	public void date2() {
		datepicker2.click();
		datepickermethod("March 2026","30");
	}
	public void datepickermethod2(String expmonth1, String expdate1) {
		 while (true) {
		   String currentMonthYear = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
		   if (currentMonthYear.equalsIgnoreCase(expmonth1))
		   {
		     List<WebElement> allDates = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div"));
		     for (WebElement date : allDates) 
		     {
		      if (date.getText().equals(expdate1)) {
		        date.click();
		         break;
	             }
		      }
		            break;
		  }
		        else {
		           driver.findElement(By.xpath("//a[@title='Next']")).click();
		          }
		    }
	}	
	
	public void search() {
		search.click();
	}
}
		
	 