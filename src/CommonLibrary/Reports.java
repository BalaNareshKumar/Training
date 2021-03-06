/*package CommonLibrary;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.naming.ldap.ExtendedRequest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Reports {
	 public static ExtentReports report;
	    public static ExtendedRequest logger;  
	           
	    
	         static Calendar cal = Calendar.getInstance();
	       static SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss");
	public static String projectDirectory = System.getProperty("user.dir");
	public static String ReportLocation=projectDirectory+"\\Utilities\\Report1\\CreateOrder"+ sdf.format(cal.getTime())+".html";
	    
	public static void intialiseconfig()
	{
	    report=new ExtentReports(ReportLocation, true);
	    logger=report.startTest("CreateOrder");    

	}
	public static String captureScreenShot(DriverConfig driver,String screenshotname)
	{
	    try{
	        TakesScreenshot ts=(TakesScreenshot) driver; 
	        File src=ts.getScreenshotAs(OutputType.FILE);
	        String des=projectDirectory+"\\Utilities\\Report1\\Screenshots\\"+screenshotname+".png";
	        File destination =new File(des);
	        FileUtils.copyFile(src, destination);
	        return des;        
	    }
	    catch(Exception e)
	    {     
	        System.out.println("Exception while taking screen shot"+e.getMessage());
	        return e.getMessage();
	   
	     }
	    
	}

	public static void PassCase (String ImgDesc,String imagename )
	{
	    String screenshot_path=Reports.captureScreenShot(DriverConfig.driver, imagename);
	    String image= logger.addScreenCapture(screenshot_path);
	    Reports.logger.log(LogStatus.PASS, ImgDesc, image);
	}

	public static void FailCase (String failedDetail,String imagename )
	{
	    String screenshot_path=Reports.captureScreenShot(DriverConfig.driver, imagename);
	    String image= logger.addScreenCapture(screenshot_path);
	    Reports.logger.log(LogStatus.FAIL, failedDetail, image);
	}
	    
	}


}
*/