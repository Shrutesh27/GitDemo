package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basic_Day1 {
	
	@AfterTest
	public void lastExecution()
	{
		System.out.println("Will Execute Last of Each Folder/Test");
		//This will Execute at last of personal loan folder only at last of personal loan Test not for car loan
		
	}
	
	@Parameters({"URL","API Key"})
	@Test
	public void Demo(String URLLogin,String key )
	{
		System.out.println("hello");
		System.out.println(URLLogin);
		System.out.println(key);
		Assert.assertTrue(false);
	}
	
	@Test(groups = {"Smoke"})
	public void secondtest()
	{
		System.out.println("Bye");
		System.out.println("Hello");
	}

	@Test(groups = {"Smoke"})
	public void secondtest2()
	{
		System.out.println("Bye");
		System.out.println("Hello");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("I will run at last of suite");
	}
}
