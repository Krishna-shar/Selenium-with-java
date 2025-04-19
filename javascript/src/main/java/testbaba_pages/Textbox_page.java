package testbaba_pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import AllLocators_pages.Alllocators;
import baselibrary.BaseLibrary;

public class Textbox_page extends BaseLibrary {
	String excelpath = "C:\\Users\\PC\\Desktop\\javascript\\testdata\\testdata_krishna.xlsx";

public Textbox_page() {
	PageFactory.initElements(driver, this); //user to initialize the memory of current page of web element.
		
	}

	@FindBy(xpath = Alllocators.CLOSE_BTN)
	private WebElement closebtn;
	
	@FindBy(xpath = Alllocators.PRACTICE_BTN)
	private WebElement praticebtn;
	
	@FindBy(xpath = Alllocators.ELEMENT_BTN)
	private WebElement elementbtn;
	
	@FindBy(xpath = Alllocators.TEXTBOX_BTN)
	private WebElement textboxbtn;
	
	@FindBy(xpath = Alllocators.FULL_NAME)
	private WebElement fullname;
	
	
	@FindBy(xpath = Alllocators.FULL_EMAIL)
	private WebElement fullemail;
	
	@FindBy(xpath = Alllocators.CURRENT_ADDRESS)
	private WebElement currentaddress;
	
	@FindBy(xpath = Alllocators.PERMANENT_ADDRESS)
	private WebElement permanentaddress;
	
	@FindBy(xpath = Alllocators.SUBMIT_BTN)
	private WebElement submitbtn;
	
	@FindBy(xpath = Alllocators.LIST_OF_DATA)
	private List<WebElement> listofdata;
	
	
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
			textboxbtn.click();
		}catch(Exception e) {
			
		} 	
		
	}
	public void enterdetails() {
		fullname.sendKeys(getReaddata(excelpath , 0,0,1));
		fullemail.sendKeys(getReaddata(excelpath , 0,1,1));
		currentaddress.sendKeys(getReaddata(excelpath , 0,2,1));
		permanentaddress.sendKeys(getReaddata(excelpath , 0,3,1));
	}
	public void getverifyed() {
		SoftAssert sf = new SoftAssert(); //A SoftAssert object of TestNG has been created. The benefit of this is that all assertions will run, even if one of them fails.
		ArrayList<String>expected_ui=new ArrayList<String>(); //"This list has been created to store the data received from the UI.
		ArrayList<String>actual_exl=new ArrayList<String>(); // this list has been created to store the data received from the UI.
		actual_exl.add(getReaddata(excelpath , 0,0,1)); // These 4 lines are reading data from Excel and adding it to the actual_exl list.
		actual_exl.add(getReaddata(excelpath , 0,1,1));
		actual_exl.add(getReaddata(excelpath , 0,2,1));
		actual_exl.add(getReaddata(excelpath , 0,3,1));
		
		
		for(int i = 1; i<=listofdata.size()-1; i=i+2) {
			expected_ui.add(listofdata.get(i).getText()); // This loop will read alternate elements (i = i+2) from the list listofdata (the list of elements received from the UI), starting from index 1.
			
		}
		for(int i=0; i<=expected_ui.size()-1; i++) {
			sf.assertEquals(actual_exl.get(i),expected_ui.get(i)); // this loop will compare the two lists (expected_ui and actual_exl) element-wise.
		}
		sf.assertAll(); 
	}
	public void submitbtn() {
		submitbtn.click();
	}
	


}
