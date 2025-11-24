package test;

import org.testng.annotations.Test;

public class Day4 {

	@Test
	public void WebLoginHomeLoan()
	{
		//Selenium
		System.out.println("WebHomeLogin");
	}
	@Test(groups = {"Smoke"})
	public void mobileLoginHomeLoan()
	{
		//Appium
		System.out.println("MobileHomeLogin");
	}
	@Test
	public void APIloginHomeLoan()
	{
		//Rest API 
		System.out.println("APIHomeLogin");
	}
}
