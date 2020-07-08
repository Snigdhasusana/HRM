package test.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Module2 extends UserLibrary{
	
	public static void TC09_VerifyQualifications(){
		Boolean status;
		
		Login(URL,UserName, Password);
		status = ClickElement("//b[text()='My Info']");
		if (status)
			LogEventWithScreeshot("info", "Clicked on My Info button");
		else
			LogEventWithScreeshot("fail", "Unable to Click on My Info button");
		
		status = ClickElement("//a[text()='Qualifications']");
		if (status)
			LogEventWithScreeshot("info", "Clicked on Qualifications Details");
		else
			LogEventWithScreeshot("fail", "Unable to Click on Qualifications Details");
		
		status = ClickElement(".//*[@id='addEducation']");
		if (status)
			LogEventWithScreeshot("info", "Clicked on Add button");
		else
			LogEventWithScreeshot("fail", "Unable to Click on Add button");
		
		status = SelectOPtionByText(".//*[@id='education_code']", Level);
		if (status)
			LogEventWithScreeshot("info", "Selected");
		else
			LogEventWithScreeshot("fail", "Not Selected");
		
		status = SetText(".//*[@id='education_institute']", Institute);
		if (status)
			LogEventWithScreeshot("info", "Text entered");
		else
			LogEventWithScreeshot("fail", "Text not entered");
		
		status = SetText(".//*[@id='education_major']", Specialization);
		if (status)
			LogEventWithScreeshot("info", "Text entered");
		else
			LogEventWithScreeshot("fail", "Text not entered");
		
		status = SetText(".//*[@id='education_year']", Year);
		if (status)
			LogEventWithScreeshot("info", "Text entered");
		else
			LogEventWithScreeshot("fail", "Text not entered");
		
		status = SetText(".//*[@id='education_gpa']", GPA);
		if (status)
			LogEventWithScreeshot("info", "Text entered");
		else
			LogEventWithScreeshot("fail", "Text not entered");
		
		status = SetTextAndEscape(".//*[@id='education_start_date']", StartDate);
		if (status)
			LogEventWithScreeshot("info", "Date Selected");
		else
			LogEventWithScreeshot("fail", "Date not Selected");
		
		status = SetTextAndEscape(".//*[@id='education_end_date']", EndDate);
		if (status)
			LogEventWithScreeshot("info", "Date Selected");
		else
			LogEventWithScreeshot("fail", "Date not Selected");
		
		status = ClickElement(".//*[@id='btnEducationSave']");
		if (status)
			LogEventWithScreeshot("info", "Clicked on Save button");
		else
			LogEventWithScreeshot("fail", "Unable to Click on Save button");
		
		
		Logout();
		
		
	}
	
	
	public static void TC10_LeaveApply(){
		Boolean status;
		Login(URL, UserName, Password);
		status=ClickElement("//a[@id='menu_leave_viewLeaveModule']");
		if(status)
			LogEventWithScreeshot("info", "Clicked on Leave Tab");
		else
			LogEventWithScreeshot("fail", "Unable to click");
		status=ClickElement("//a[@id='menu_leave_applyLeave']");
		if(status)
			LogEventWithScreeshot("info", "Clicked on Apply Tab");
		else
			LogEventWithScreeshot("fail", "Unable to click on Apply");
		status=SelectOPtionByText("//select[@id='applyleave_txtLeaveType']", LeaveType);
		if(status)
			LogEventWithScreeshot("info", "Selected ");
		else
			LogEventWithScreeshot("fail", "Unable to Select");
		
		status=SetTextAndEscape("//input[@id='applyleave_txtFromDate']", FromDate);
		if(status)
			LogEventWithScreeshot("info", "Selected FromDate");
		else
			LogEventWithScreeshot("fail", "Unable to Select FromDate");
		
		status=SetTextAndEscape("//input[@id='applyleave_txtToDate']", ToDate);
		if(status)
			LogEventWithScreeshot("info", "Selected ToDate");
		else
			LogEventWithScreeshot("fail", "Unable to Select ToDate");
		
		status=SelectOPtionByText("//select[@id='applyleave_duration_duration']","Full Day");
		
		if(status)
			LogEventWithScreeshot("info", "Selected Duration");
		else
			LogEventWithScreeshot("fail", "Unable to Select Duration");
		
		status=SetText("//textarea[@id='applyleave_txtComment']", Comment);
		if(status)
			LogEventWithScreeshot("info", "Commented");
		else
			LogEventWithScreeshot("fail", "Unable to Comment");
		
		status=ClickElement("//input[@id='applyBtn']");
		if(status)
			LogEventWithScreeshot("info", "Clicked on Apply Btn");
		else
			LogEventWithScreeshot("fail", "Unable to click on Apply Btn");
		Logout();
		
	}
	
	

}
