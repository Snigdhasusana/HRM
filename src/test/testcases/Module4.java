package test.testcases;

public class Module4 extends UserLibrary{
	
	public static void TC14_MyInfoQualification()
	{
		boolean status;
		Login(URL, UserName, Password);
		status=ClickElement(".//*[@id='menu_pim_viewMyDetails']");
		if(status)
			LogEventWithScreeshot("info", "Clicked on MyInfo");
		else
			LogEventWithScreeshot("fail", "Not Clicked on MyInfo");
		
		status=ClickElement(".//*[@id='sidenav']/li[9]/a");
		if(status)
			LogEventWithScreeshot("info", "Clicked on Qualification");
		else
			LogEventWithScreeshot("fail", "Not Clicked on Qualification");
		
		status=ClickElement(".//*[@id='addEducation']");
		if(status)
			LogEventWithScreeshot("info", "Clicked on Add");
		else
			LogEventWithScreeshot("fail", "Not Clicked on Add");
		
		status=SelectOPtionByText(".//*[@id='education_code']", Level);
		if(status)
			LogEventWithScreeshot("info", "Selected");
		else
			LogEventWithScreeshot("fail", "Not Selected");
		
		status=SetText(".//*[@id='education_institute']", Institute);
		if(status)
			LogEventWithScreeshot("info", "Entered Institute Name");
		else
			LogEventWithScreeshot("fail", "Not Entered Institute Name");
	}

}
