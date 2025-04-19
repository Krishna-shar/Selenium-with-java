package baselibrary;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import excelutility.ExcelUtility;
import propertyutility.propertyutility;


public class BaseLibrary implements ExcelUtility,propertyutility {
	String configpath = "C:\\Users\\PC\\Desktop\\javascript\\testdata\\config.properties";
    public static WebDriver driver;

    public static void getLaunchedUrl(String url , String browsername) {
    	if(browsername.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); 
            driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
    	}else if(browsername.equals("firefox")) {
    		 System.setProperty("webdriver.gecko.driver", "drivers/chromedriver.exe"); 
             driver = new ChromeDriver();
             driver.get(url);
             driver.manage().window().maximize();
    		
    	}
    }

	@Override
	public String getReaddata(String path, int sheetno, int colno, int rowno) {
		String value = "";
		try {
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(sheetno);
			value = sheet.getRow(rowno).getCell(colno).getStringCellValue();
			
		}catch(Exception e){
			System.out.println("Issue in Excel Read data");
			
		}
		return value; 
	}

	@Override
	public String getReaddata(String key) {
		String value = "";
		try {
			FileInputStream fis = new FileInputStream(configpath);
			Properties props = new Properties();
			props.load(fis);
			value = props.getProperty(key );
		}catch(Exception e){
			System.out.println("Issue in Properties files" + e);
			
		}
		return value;
	}
}

  
								