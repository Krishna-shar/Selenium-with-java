package testbaba_pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.BaseLibrary;

public class WebTable_page extends BaseLibrary{
	String excelpath = "C:\\Users\\PC\\Desktop\\javascript\\testdata\\testdata_krishna.xlsx";
	public WebTable_page() {
		PageFactory.initElements(driver, this); //user to initialize the memory of current page of web element.
		
	}
	
	@FindBy(xpath = "//button[text()=\"×\"]")
	private WebElement closebtn;
	
	@FindBy(xpath = "//a[text()=\"Practice\"]")
	private WebElement praticebtn;
	
	@FindBy(xpath = "//*[@data-target=\"#elements\"]")
	private WebElement elementbtn;
	
	@FindBy(xpath = "//a[text()=\"web tables\"]")
	private WebElement WebTablebtn;
	
	@FindBy(xpath = "//iframe[@src=\"Webtable.html\"]")
	private WebElement WebTableIframe;
	
	@FindBy(xpath = "//input[@pattern=\"^[a-zA-Z][\\sa-zA-Z]{2,32}\"]")
	private WebElement NameInput;
	
	@FindBy(xpath = "//input[@pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\"]")
	private WebElement EmailInput;
	
	@FindBy(xpath = "//button[@class=\"btn btn-success save-btn\"]")
	private WebElement Savebtn;
	
	@FindBy(xpath = "//button[@class=\"btn btn-danger btn-xs btn-delete\"]")
	private List<WebElement> deleteButtons; // this line return all delete element and stored in deleteButtons
	
	
	
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
			WebTablebtn.click();
		}catch(Exception e) {
			
		} 	
		
	}
	
	
	public void WebTableInputs() {
		driver.switchTo().frame(WebTableIframe);
		NameInput.sendKeys(getReaddata(excelpath , 0,0,1));
		EmailInput.sendKeys(getReaddata(excelpath , 0,1,1));
		Savebtn.click();
		NameInput.sendKeys(getReaddata(excelpath , 0,0,2));
		EmailInput.sendKeys(getReaddata(excelpath , 0,1,2));
		Savebtn.click();
		NameInput.sendKeys(getReaddata(excelpath , 0,0,3));
		EmailInput.sendKeys(getReaddata(excelpath , 0,1,3));
		Savebtn.click();
		NameInput.sendKeys(getReaddata(excelpath , 0,0,4));
		EmailInput.sendKeys(getReaddata(excelpath , 0,1,4));
		Savebtn.click();
		NameInput.sendKeys(getReaddata(excelpath , 0,0,5));
		EmailInput.sendKeys(getReaddata(excelpath , 0,1,5));
		Savebtn.click();
		NameInput.sendKeys(getReaddata(excelpath , 0,0,1));
		EmailInput.sendKeys(getReaddata(excelpath , 0,1,1));
		Savebtn.click();
		NameInput.sendKeys(getReaddata(excelpath , 0,0,2));
		EmailInput.sendKeys(getReaddata(excelpath , 0,1,2));
		Savebtn.click();
		NameInput.sendKeys(getReaddata(excelpath , 0,0,3));
		EmailInput.sendKeys(getReaddata(excelpath , 0,1,3));
		Savebtn.click();
		NameInput.sendKeys(getReaddata(excelpath , 0,0,4));
		EmailInput.sendKeys(getReaddata(excelpath , 0,1,4));
		Savebtn.click();
		NameInput.sendKeys(getReaddata(excelpath , 0,0,5));
		EmailInput.sendKeys(getReaddata(excelpath , 0,1,5));
		Savebtn.click();
		NameInput.sendKeys(getReaddata(excelpath , 0,0,1));
		EmailInput.sendKeys(getReaddata(excelpath , 0,1,1));
		Savebtn.click();
		NameInput.sendKeys(getReaddata(excelpath , 0,0,2));
		EmailInput.sendKeys(getReaddata(excelpath , 0,1,2));
		Savebtn.click();
		NameInput.sendKeys(getReaddata(excelpath , 0,0,3));
		EmailInput.sendKeys(getReaddata(excelpath , 0,1,3));
		Savebtn.click();
		NameInput.sendKeys(getReaddata(excelpath , 0,0,4));
		EmailInput.sendKeys(getReaddata(excelpath , 0,1,4));
		Savebtn.click();
		NameInput.sendKeys(getReaddata(excelpath , 0,0,5));
		EmailInput.sendKeys(getReaddata(excelpath , 0,1,5));
		Savebtn.click();
		NameInput.sendKeys(getReaddata(excelpath , 0,0,1));
		EmailInput.sendKeys(getReaddata(excelpath , 0,1,1));
		Savebtn.click();
		NameInput.sendKeys(getReaddata(excelpath , 0,0,2));
		EmailInput.sendKeys(getReaddata(excelpath , 0,1,2));
		Savebtn.click();
		NameInput.sendKeys(getReaddata(excelpath , 0,0,3));
		EmailInput.sendKeys(getReaddata(excelpath , 0,1,3));
		Savebtn.click();
		NameInput.sendKeys(getReaddata(excelpath , 0,0,4));
		EmailInput.sendKeys(getReaddata(excelpath , 0,1,4));
		Savebtn.click();
		NameInput.sendKeys(getReaddata(excelpath , 0,0,5));
		EmailInput.sendKeys(getReaddata(excelpath , 0,1,5));
		Savebtn.click();
		driver.switchTo().defaultContent();
		
	}
	
	public void clickondeletebtn() {
		driver.switchTo().frame(WebTableIframe);
		
		for (WebElement delBtn : deleteButtons) {
	        delBtn.click();
	        try {
	            Thread.sleep(500); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
		driver.switchTo().defaultContent();
			
	}
	
		
		
	
	
	
}


