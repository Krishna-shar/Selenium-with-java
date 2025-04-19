package testbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.BaseLibrary;

public class Checkbox_page extends BaseLibrary{
	
	public Checkbox_page() {
		PageFactory.initElements(driver, this); //user to initialize the memory of current page of web element.
			
		}
	@FindBy(xpath = "//button[text()=\"×\"]")
	private WebElement closebtn;
	
	@FindBy(xpath = "//a[text()=\"Practice\"]")
	private WebElement praticebtn;
	
	@FindBy(xpath = "//*[@data-target=\"#elements\"]")
	private WebElement elementbtn;
	
	@FindBy(xpath = "//a[text()=\"check box\"]")
	private WebElement checkboxbtn;
	
	@FindBy(xpath = "//iframe[@src=\"Checkbox.html\"]")
	private WebElement iframe;
	
	@FindBy(xpath = "//input[@onclick=\"myFunction()\"]")
	private WebElement mobilecheckbox;
	
	@FindBy(xpath = "//h6[text()=\"You are selected Mobile\"]")
	private WebElement mobilecheckboxtext;
	
	
	public void clickclosebtn() {
		closebtn.click();
	}
	public void praticebtn() {
		praticebtn.click();
	}
	public void clickontextbox_elements() {
		elementbtn.click();
		try {
			Thread.sleep(1000);
			checkboxbtn.click();
		}catch(Exception e) {
			
		} 	
	}
	
	public void clickonmobilecheckbox_verify() {
		driver.switchTo().frame(iframe);
		mobilecheckbox.click();
		String expected = mobilecheckboxtext.getText();
		driver.switchTo().defaultContent();
		Assert.assertEquals(getReaddata("mobilecheckboxtext"), expected);
		System.out.println(expected);
		
		
	}
}
