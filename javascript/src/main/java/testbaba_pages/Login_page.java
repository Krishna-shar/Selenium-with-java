package testbaba_pages;

import baselibrary.BaseLibrary;

public class Login_page extends BaseLibrary {
	public void getTitle() {
	String title = driver.getTitle(); 
	System.out.println("testingbaba title is "+title);
	}
}
