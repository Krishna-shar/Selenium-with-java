package testingbaba_test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import junit.framework.Assert;
import testbaba_pages.Checkbox_page;

public class Checkbox_test extends BaseLibrary {
	Checkbox_page ob;
	@Parameters({"env","browsername"})
	@BeforeTest
	public void getLaunchedUrl_testingbaba(String env,String browsername) {
		getLaunchedUrl(getReaddata(env),browsername);
		ob = new Checkbox_page();
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
		try {
			Thread.sleep(1000);
			ob.clickontextbox_elements();
		}catch(Exception e) {
			
		}
		
	}
	@Test(priority = 3)
	public void clickonmobilecheckbox_verify() {
		ob.clickonmobilecheckbox_verify();
	}
			
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
