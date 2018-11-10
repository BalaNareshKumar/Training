package Elementrepository;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonLibrary.DriverConfig;

public class Gseas {
	@FindBy(xpath="//input[@name='user_id']")
	private WebElement Userid;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password;
	
	@FindBy(xpath="//span[contains (text(),'Login')]")
	private WebElement submit;
	//ATTENDANCE
	/*@FindBy(xpath="(//span[contains (text(),'Take Attendance')])[3]")
	private WebElement TakeAttendance;
	
	@FindBy(xpath="//input[@ng-model='attendance_date']")
	private WebElement attdatetab;
	
	@FindBy(xpath="(//span[contains (text(),'04')])[1]")
	private WebElement seldate;
	
	@FindBy(xpath="//md-select[@placeholder='Choose Course']")
	private WebElement choosecoursetab;
	
	@FindBy(xpath="//div[contains (text(),'Gseas')]")
	private WebElement selcourse;
	
	@FindBy(xpath="//md-select[@aria-label='Choose Batch']")
	private WebElement chooseBatchTab;
	
	@FindBy(xpath="(//md-option[@ng-repeat='batch in attendance_course.batches'])[1]")
	private WebElement selbatch;
	
	@FindBy(xpath="//md-select[@placeholder='Choose Session']")
	private WebElement choosesession;
	
	@FindBy(xpath="(//div[contains (text(),'Create New')])[1]")
	private WebElement createnew;
	
	@FindBy (xpath="//input[@ng-model='contact_session.start_time']")
	private WebElement starttime;
	
	@FindBy(xpath="//input[@ng-model='contact_session.end_time']")
	private WebElement endtime;
	
	@FindBy(xpath="//span[contains (text(),'navaneeth@abc')]")
	private WebElement nav;
	
	@FindBy(xpath="//span[contains (text(),'priyanka@abc')]")
	private WebElement pri;
	
	@FindBy(xpath ="//span[contains (text(),'Submit')]")
	private WebElement Submit2;

    @FindBy(xpath ="(//i[contains (text(),'home')])[2]")
    private WebElement home;
    
    
    public WebElement getTakeAttendance() {
		return TakeAttendance;
	}

    public WebElement getAttdate() {
		return attdatetab;
	}
	
	public WebElement getChoosecoursetab() {
		return choosecoursetab;
	}
	
	public WebElement getSelcourse() {
		return selcourse;
	}
	
	public WebElement getChooseBatchTab() {
		return chooseBatchTab;
	}
	
	public WebElement getSelbatch() {
		return selbatch;
	}
	
	public WebElement getChoosesession() {
		return choosesession;
	}
	
	public WebElement getCreatenew() {
		return createnew;
	}
	
	public WebElement getStarttime() {
		return starttime;
	}

	public WebElement getEndtime() {
		return endtime;
	}
    
    public WebElement getNav() {
		return nav;
	}

	public WebElement getPri() {
		return pri;
	}
	public WebElement getSubmit2() {
		return Submit2;
	}

    */
    
    @FindBy(xpath="(//span[contains (text(),'My Library')])[3]")
    private WebElement Mylib;
    
    @FindBy(xpath="//button[@class='md-link md-primary md-button ng-scope md-ink-ripple']")
    private WebElement Addnewcoursetab;
    
    @FindBy(xpath="//md-select[@placeholder='What type of item do your want to create?']")
    private WebElement dropdowntocreatesub;
    
    
    @FindBy(xpath= "(//div[contains (text(),'Create a new course, subject or training')])[1]")
    private WebElement CourseNamejs;
    
    @FindBy(xpath="(//input[@name='name'])[1]")
    private WebElement Title;
    
    @FindBy(xpath="//md-radio-button[@aria-label='Classroom, Blended or Instructor-Led Learning (in batches)']")
    private WebElement radio1;
    
    @FindBy(xpath="//md-checkbox[@aria-label='Publish to make it visible to others for browsing or searching']")
    private WebElement publish;
    
    @FindBy(xpath="//span[contains (text(),'Submit')]")
    private WebElement subcourse;
    
    
    
   /* @FindBy(xpath="//input[@placeholder='Search and filter...']")
    private WebElement Filter;
    
    @FindBy(xpath="//button[@ng-click='show_filter = !show_filter']")
    private WebElement mark;
    
    @FindBy(xpath ="//span[contains (text(),'FILTER')]")
    private WebElement Filterr;
    
	@FindBy(xpath="//span[contains (text(),'Test Course 00123')]")
    private WebElement TestCourse;*/
    
    @FindBy(xpath="//span[contains (text(),'Manage Curriculum')]")
    private WebElement Managecurriculum;
    
    @FindBy(xpath="//span[contains (text(),'Add A Module')]")
    private WebElement AddModule;
    
    @FindBy(xpath="//input[@name='name']")
    private WebElement Modulename;
    
    @FindBy(xpath="//span[contains (text(),'Submit')]")
    private WebElement Submit;
    
    @FindBy (xpath="//span[contains (text(),'Add A Topic')]")
    private WebElement  Addtopic;
    

    public WebElement getMylib() {
		return Mylib;
	}
  
   

	public WebElement getAddnewcoursetab() {
		return Addnewcoursetab;
	}



	public WebElement getDropdowntocreatesub() {
		return dropdowntocreatesub;
	}

	public WebElement getCourseNamejs() {
		return CourseNamejs;
	}



	public WebElement getTitle() {
		return Title;
	}
	public WebElement getRadio1() {
		return radio1;
	}

	public WebElement getPublish() {
		return publish;
	}

	public WebElement getSubcourse() {
		return subcourse;
	}

	/* public WebElement getMark() {
		return mark;
	}

	public WebElement getFilterr() {
		return Filterr;
	}

	public WebElement getFilter() {
		return Filter;
	}

	public WebElement getMylib() {
		return Mylib;
	}
    
	public WebElement getTestCourse() {
		return TestCourse;
	}
*/
	public WebElement getManagecurriculum() {
		return Managecurriculum;
	}

	public WebElement getAddModule() {
		return AddModule;
	}

	public WebElement getModulename() {
		return Modulename;
	}

	public WebElement getAddtopic() {
		return Addtopic;
	}

	/*public WebElement getHome() {
		return home;
	}

	*/

	public WebElement getUserid() {
		return Userid;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
