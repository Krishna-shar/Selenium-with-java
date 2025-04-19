package testingbaba_test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test; 
import org.testng.annotations.Parameters;

import baselibrary.BaseLibrary;
import testbaba_pages.Textbox_page;

public class Textbox_test extends BaseLibrary {
	Textbox_page ob;
	@Parameters({"env","browsername"})
	@BeforeTest
	public void getLaunchedUrl_testingbaba(String env , String browsername) {
		getLaunchedUrl(getReaddata(env),browsername);
		ob = new Textbox_page();
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
	public void enterdetails() {
		ob.enterdetails();
	}
	
	@Test(priority = 4)
	public void submitbtn() {
		ob.submitbtn();
	}
	
	@Test(priority = 5)
	public void getverifyed() {
		ob.getverifyed();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}	
}
