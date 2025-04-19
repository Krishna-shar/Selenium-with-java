package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import baselibrary.BaseLibrary;
import testbaba_pages.Checkbox_page;

public class Radiobox_test extends BaseLibrary {
	Checkbox_page ob;
	@Parameters("env")
	@BeforeTest
	public void getLaunchedUrl_testingbaba(String env, String browsername ) {
		getLaunchedUrl(getReaddata(env),browsername);
		ob = new Checkbox_page();
	}

}
