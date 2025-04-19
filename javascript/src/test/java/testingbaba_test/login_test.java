package testingbaba_test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import testbaba_pages.Login_page;

public class login_test extends BaseLibrary
{
	Login_page ob;  
	@Parameters({"env","browsername"})
	@BeforeTest
	public void getLaunchedUrl_testingbaba(String env , String browsername) {
		getLaunchedUrl(getReaddata(env),browsername);
		ob = new Login_page();
		
	}
	@Test
	public void ToverifyTitle() {
		ob.getTitle();
	}

	

	
	

}
