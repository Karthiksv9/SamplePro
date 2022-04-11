package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeTest
	public void setUp() {
		System.out.println("At Before Test");
	}
	
	@BeforeMethod
	public void setUpMethod() {
		System.out.println("At Before Method");
	}


	@Test(priority =1)
	public void atTest1() {
		System.out.println("At Test1");
	}

	@Test(priority = 2)
	public void atTest2() {
		System.out.println("At Test2");
	}
}


