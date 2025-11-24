package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@Test(groups = {"Smoke"})
	public void day2()
	{
		System.out.println("day 2");
	}
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute first");
		System.out.println("I will execute 2nd");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("i will execute after day 2 class");
	}
}
