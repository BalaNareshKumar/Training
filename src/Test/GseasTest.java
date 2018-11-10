package Test;


import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.testng.annotations.BeforeClass;

import ActionLibrary.GseasLib;
import CommonLibrary.DriverConfig;

public class GseasTest {
	DriverConfig d =new DriverConfig();
	GseasLib g;
	
	@BeforeClass
	public void BeforeTest() throws Exception{
		d.openbrowser("chrome");
		g= new GseasLib();
	}  
	
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod(){
		
		d.driver.get("https://www.gseas.com/#/landing");
		String windowHandle = d.driver.getWindowHandle();

		//Get the list of window handles
		/*ArrayList tabs = new ArrayList (d.driver.getWindowHandles());
		System.out.println(tabs.size());
		//Use the list of window handles to switch between windows
		d.driver.switchTo().window(tabs.get(0));

		//Switch back to original window
		d.driver.switchTo().window();
		*/
		ArrayList tabs2 = new ArrayList (d.driver.getWindowHandles());
		 d.driver.switchTo().window((String) tabs2.get(1));
		    d.driver.close();
		    d.driver.switchTo().window((String) tabs2.get(0));
	}

	@org.testng.annotations.Test
	public void Test() throws Exception{
		g.Userid("admin@abc");
		g.Password("password");
		g.submit();
		Thread.sleep(5000);
		/*g.TakeAttendance();
		g.Attdate();
		g.Seldate();
		Thread.sleep(3000);
		g.choosecoursetab();
		g.selcourse();
		g.chooseBatchTab();
		g.selbatch();
		g.choosesession();
		g.createnew();
		g.starttime("12PM");
		g.endtime("1PM");
		g.nav();
		g.pri();
		g.Sub();     	  

		Alert alert = d.driver.switchTo().alert();
		alert.accept();
		
		//g.home();*/ 
		 
		g.Mylib();
		/*g.Filter("Test");
		g.mark();
		g.Filterr();
		Thread.sleep(2000);
		g.Course();*/
		Thread.sleep(2000);
	    g.Addnewcoursetab();
		g.Dropdowntocreatesub(); 
		g.CourseNamejs();
		Thread.sleep(2000);
		g.Title("JAVA SELENIUM");
		g.Radio1();
		g.Publish();
		g.Subcourse();
		/*g.manage();
		Thread.sleep(2000);
		g.AddModule("JAVA");
		g.AddTopic("SELENIUM");*/
	}
} 
    

