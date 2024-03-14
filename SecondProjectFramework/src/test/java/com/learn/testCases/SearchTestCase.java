package com.learn.testCases;

import com.learn.pages.BaseTest;
import com.learn.pages.LoginPage;
import com.learn.pages.SearchPage;
import com.learn.utility.ReadExcelFile;

public class SearchTestCase extends BaseTest{
	
	String fileName=System.getProperty("user.dir")+"\\TestData\\MyTestData.xlsx";
	
	void searchCourseTest()
	{
		LoginPage lp=new LoginPage(driver);
		String username=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		
		SearchPage sp=new SearchPage(driver);
		String SearchCourse=ReadExcelFile.getCellValue(fileName, "SearchCourse", 0, 0);
		sp.searchCourse(SearchCourse);
	}

}
