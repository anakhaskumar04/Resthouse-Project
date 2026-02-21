package testclass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pageclass.ConfirmationPage;
import pageclass.HomePage1;

public class ConfirmationTest extends Baseclass {
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
	   
	   
	   @Test(priority=11)
	   public void screenshot() throws Exception {
		   JavascriptExecutor sc1=(JavascriptExecutor) driver;
			sc1.executeScript("scrollBy(0,2500)");
			Thread.sleep(3000);
			
		   ConfirmationPage sc= new ConfirmationPage(driver);
		   sc.scrnsht();
	   }
	   
	   
	   @Test(priority=12)
	   public void booking() {
		   conobj.confirmation();
	   }
	   
	   @Test(priority=13)
	   public void checkboxalert() {
		   conobj.check();
	   }
	   @Test(priority=14)
	   public void alert() {
		   conobj.proceed();
	   }
	   
//	   @Test(priority=15)
//	   public void radio() {
//		   conobj.radio();
//	   }
//	   
	   @Test(priority=15)
	   public void screenshot2() throws Exception {
			Thread.sleep(3000);
			
		   ConfirmationPage conobj= new ConfirmationPage(driver);
		   conobj.scrnsht2();
		   
		 
	   }
}
