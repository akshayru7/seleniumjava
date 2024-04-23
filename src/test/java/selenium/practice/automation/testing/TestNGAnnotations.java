package selenium.practice.automation.testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Before Suite");	
	}
	
	@BeforeTest
	public void BeforeTestPlan() {
		System.out.println("Before Test plan");
	}
	
	@BeforeClass
	public void Beforeclass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before Method");
	}
	
	@Test
	public void TestCase1() {
		System.out.println("Test Case1");
	}
	
	@Test
	public void TestCase2() {
		System.out.println("Test Case2");
	}
	@AfterMethod
	public void AfterMethod(){
		System.out.println("After Method");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class");
	}
	
	@AfterTest
	public void AfterTestPlan() {
		System.out.println("After Test plan");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite");
	}
}