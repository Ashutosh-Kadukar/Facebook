package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public WebDriver driver ;
	public static String  path = "D:\\Velocity\\TestNG ScreenShots\\Test-" ;
	
	public static void captureScreenshot(WebDriver driver, int TestID) throws IOException
	{
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-YYYY HH.mm.ss");		
	    LocalDateTime now = LocalDateTime.now();	
		String dtf = dt.format(now);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest = new File(path+" "+TestID+" "+dtf+".jpg");
	    FileHandler.copy(src, dest);
	}
	
	public static String getDataFromExcelSheet(String sheet , int a , int b) throws EncryptedDocumentException, IOException
	{
		    String data ;
			String path = "C:\\Users\\hp\\OneDrive\\Desktop\\marksheet.xlsx" ;
			FileInputStream file = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(file);
			try
			{
			data = wb.getSheet(sheet).getRow(a).getCell(b).getStringCellValue();
			}
			catch(IllegalStateException e)
			{
				e.printStackTrace();
				double output = wb.getSheet(sheet).getRow(a).getCell(b).getNumericCellValue();
                data = Double.toString(output);
			}
			 
		return data ;
	}

}
