package testingbaba_test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import testbaba_pages.WebTable_page;

public class WebTable_test extends BaseLibrary {
	WebTable_page ob; 
	@Parameters({"env","browsername"})
	@BeforeTest
	public void getLaunchedUrl_testingbaba(String env , String browsername ) {
		getLaunchedUrl(getReaddata(env),browsername);
		ob = new WebTable_page();
	}
	
	@Test(priority = 0)
	public void clickclosebtn() {
		try {
			Thread.sleep(1000);
			ob.clickclosebtn();
		}catch(Exception e) {
			
		}
	}
	
	@Test(priority = 1)
	public void praticebtn() {
		try {
			Thread.sleep(1000);
			ob.praticebtn();
		}catch(Exception e) {
			
		}
	}
	@Test(priority = 2)
	public void clickontextbox_elements() {
		ob.clickontextbox_elements();
	}
	
	@Test(priority = 3)
	public void WebTableInputs() {
		ob.WebTableInputs();
	}
	@Test(priority = 4)
	public void clickondeletebtn() {
		ob.clickondeletebtn();
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}	
	
	
}
