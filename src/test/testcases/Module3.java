package test.testcases;

public class Module3 extends UserLibrary
{
public static void Tc11_MyInfo()
{
boolean status;
Login(URL, UserName, Password);
//Clicking my info tab
status = ClickElement(".//*[@id='menu_pim_viewMyDetails']");
if (status)
	LogEventWithScreeshot("info", "Clicking MyInfo tab");
else
	LogEventWithScreeshot("fail", "Unable to click MyInfo tab");
//clicking qualifications tab
status = ClickElement(".//*[@id='sidenav']/li[9]/a");
if (status)
	LogEventWithScreeshot("info", "Clicking Qualifications  tab");
else
	LogEventWithScreeshot("fail", "Unable to click Qualifications tab");
//clicking add tab
status = ClickElement(".//*[@id='addWorkExperience']");
if (status)
	LogEventWithScreeshot("info", "Clicking Add  tab");
else
	LogEventWithScreeshot("fail", "Unable to click Add tab");
//Adding work experience information
//company name
status = SetText(".//*[@id='experience_employer']", Company);
if (status)
	LogEventWithScreeshot("info", "Entering company name");
else
	LogEventWithScreeshot("fail", "Unable to enter the company name");
//job title
status = SetText(".//*[@id='experience_jobtitle']", JobTitle);
if (status)
	LogEventWithScreeshot("info", "Entering Job title");
else
	LogEventWithScreeshot("fail", "Unable to enter Job title");
//entering from date
status = SetTextAndEscape(".//*[@id='experience_from_date']", FromDate);
if (status)
	LogEventWithScreeshot("info", "Entering from date");
else
	LogEventWithScreeshot("fail", "Unable to enter from date");
//entering to date
status = SetTextAndEscape(".//*[@id='experience_to_date']", ToDate);
if (status)
	LogEventWithScreeshot("info", "Entering to date");
else
	LogEventWithScreeshot("fail", "Unable to enter to date");
//entering comments
status = SetText(".//*[@id='experience_comments']", Comment);
if (status)
	LogEventWithScreeshot("info", "Entering comments");
else
	LogEventWithScreeshot("fail", "Unable to enter the comments");
//clicking save tab
status = ClickElement(".//*[@id='btnWorkExpSave']");
if (status)
	LogEventWithScreeshot("info", "Clicking Save tab");
else
	LogEventWithScreeshot("fail", "Unable to click Save tab");

}

public static void TC12_WorkExperience()
{
	boolean status;
	Login(URL, UserName, Password);
	
	status=ClickElement(".//*[@id='menu_pim_viewMyDetails']");
	if(status)
		LogEventWithScreeshot("info", "Clicked on My Info");
	else
		LogEventWithScreeshot("info", "Unable to click on My Info");
	
	status=ClickElement(".//*[@id='sidenav']/li[9]/a");
	if(status)
		LogEventWithScreeshot("info", "Clicked on Qualifications");
	else
		LogEventWithScreeshot("info", "Unable to click on Qualifications");
	
	status=ClickElement(".//*[@id='addWorkExperience']");
	if(status)
		LogEventWithScreeshot("info", "Clicked on Add");
	else
		LogEventWithScreeshot("info", "Unable to click on Add");
	
	status=SetText(".//*[@id='experience_employer']", Company);
	if(status)
		LogEventWithScreeshot("info", "Company Name");
	else
		LogEventWithScreeshot("info", "Unable to enter Company");
	
	status=SetText(".//*[@id='experience_jobtitle']", JobTitle);
	if(status)
		LogEventWithScreeshot("info", "Job Title");
	else
		LogEventWithScreeshot("info", "Unable to enter Job");
	
	status=SetTextAndEscape(".//*[@id='experience_from_date']", FromDate);
	if(status)
		LogEventWithScreeshot("info", "FromDate");
	else
		LogEventWithScreeshot("info", "Unable to enter FromDate");
	
	status=SetTextAndEscape(".//*[@id='experience_to_date']", ToDate);
	if(status)
		LogEventWithScreeshot("info", "ToDate");
	else
		LogEventWithScreeshot("info", "Unable to enter ToDate");
	
	status=SetText(".//*[@id='experience_comments']", Comment);
	if(status)
		LogEventWithScreeshot("info", "Comment");
	else
		LogEventWithScreeshot("info", "Unable to enter Comment");
	
	status=ClickElement(".//*[@id='btnWorkExpSave']");
	if(status)
		LogEventWithScreeshot("info", "Clicked on Save");
	else
		LogEventWithScreeshot("info", "Unable to click on Save");
	
	Logout();
}


public static void TC13_ApplyLeave()
{
	boolean status;
	Login(URL, UserName, Password);
	status = ClickElement(".//*[@id='menu_leave_viewLeaveModule']");
	if(status)
		LogEventWithScreeshot("info", "Clicked on Leave tab");
	else
		LogEventWithScreeshot("info", "Unable to Click on Leave tab");
	
	status = ClickElement(".//*[@id='menu_leave_applyLeave']");
	if(status)
		LogEventWithScreeshot("info", "Clicked on Apply tab");
	else
		LogEventWithScreeshot("info", "Unable to Click on Apply tab");
	
	status=SelectOPtionByText(".//*[@id='applyleave_txtLeaveType']", LeaveType);
	if(status)
		LogEventWithScreeshot("info", "Selected Annual Leave");
	else
		LogEventWithScreeshot("info", "Unable to Select Annual");
	
	status= SetTextAndEscape(".//*[@id='applyleave_txtFromDate']", FromDate);
	if(status)
	LogEventWithScreeshot("info", "Entered FromDate");
	else
		LogEventWithScreeshot("info", "Unable to Enter FromDate");
	
	status= SetTextAndEscape(".//*[@id='applyleave_txtToDate']", ToDate);
	if(status)
	LogEventWithScreeshot("info", "Entered ToDate");
	else
		LogEventWithScreeshot("info", "Unable to Enter ToDate");
	
	status=SetText(".//*[@id='applyleave_txtComment']", Comment);
	if(status)
		LogEventWithScreeshot("info", "Entered Comment");
		else
			LogEventWithScreeshot("info", "Unable to Enter Comment");
	
	status = ClickElement(".//*[@id='applyBtn']");
	if(status)
		LogEventWithScreeshot("info", "Clicked on Apply Button");
	else
		LogEventWithScreeshot("info", "Unable to Click on Apply Button");
	
	Logout();
	
}

}
