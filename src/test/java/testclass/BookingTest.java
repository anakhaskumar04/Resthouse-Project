package testclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

//import java.time.Duration;


import org.testng.annotations.Test;

import basepkg.Baseclass;
import pageclass.HomePage1;

public class BookingTest extends Baseclass {
	@Test(priority=1)
	public void title(){
		String Exp="PWD | Rest House Booking - Kerala";
		String Act=HomePage1.title();
		Assert.assertEquals(Act, Exp,"Actual title is"+driver.getTitle());
	}
	
	@Test(priority=2)
	public void bkng() {
		obj.Bookg();
	}

	@Test(priority=3)
	public void Check() {
		obj.Check();
	}

    @Test(priority=4)
public void dropdown1() {
	bookobj.dropdownf();
}
    
    
    @Test(priority=5)
public void dropdown2() {
	bookobj.dropdowns();
}
   @Test(priority=6)
public void dropdown3() {
	bookobj.dropdownl();
}
   @Test(priority=7)
   public void date() {
	   bookobj.date1();
   }
   @Test(priority=8)
   public void date1() {
	   bookobj.date1();  
   }
   @Test(priority=9)
   public void date2() {
	   bookobj.date2();  
   }
   
   @Test(priority=10)
   public void search() {
	   bookobj.search();
   }
  
}
