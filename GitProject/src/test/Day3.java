package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Day3 {
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("This will run before Day 3 class");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("This will run Before every test from respcetive class only not from folder/ suite");
	}
	
	
	@Test(dataProvider = "getdata")
	public void WebLogin(String username,String Password)
	{
		//Selenium
		System.out.println("WebLogin");
		System.out.println(username +" "+Password);
	}
	
	
	@DataProvider
	public Object[][] getdata()
	{
		//1st username password- good credit history
		//2nd Username password- no credit history
		//Fraudant credit history
		Object[][] data=new Object[3][2];
		//first[3] Rows:- how mwnay times we have to run,[2] Columns:- how many values we are passing
		
		//1st combination
		data[0][0]="firstName";
		data[0][1]="1stPassword";
		//columns in the row are nothing but values for that paricular combination
		
		//2nd Combination
		data[1][0]="SecondName";
		data[1][1]="2ndPassword";
		
		//3rd combination
		//2nd Combination
		data[2][0]="ThirdName";
		data[2][1]="3rdPassword";
		
		return data;
		
	}
	
	@Parameters({"URL"})//this wil work only for WebLogin method only
	@Test
	public void WebLogout(String urlname)
	{
		//Selenium
		System.out.println("WebLogout");
		System.out.println(urlname);
	}
	@Test(groups = {"Smoke"})
	public void MobileCarLogin()
	{
		//Appium
		System.out.println("MobileCarLogin");
	}
	//dependsmethods required coz while running the methods get executed as alphabetical order
	//Weblogin or any other method given will execute first then login API 
	@Test(dependsOnMethods = {"WebLogin","WebLogout"})
	public void APICarLogin()
	{
		//Rest API 
		System.out.println("APICarLogin");
	}
	@Test(enabled = false)//to skip test case while executing if want to run then put true to enable
	public void MobileCarLogout()
	{
		//Appium
		System.out.println("MobileCarLogout");
	}
	
	@Test(timeOut = 4000)//execution will wait till fail
	public void APICarLogout()
	{
		//Rest API 
		System.out.println("APICarLogout");
	}

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("i will execute before Suite");
	}
	
	
	
	
}
