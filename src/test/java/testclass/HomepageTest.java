package testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pageclass.HomePage1;

public class HomepageTest extends Baseclass {
	@Test(priority=1)           //Assertion
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

}
