package testNgScripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest3 {

	@Test(priority = 3)
	public void test5() {
		System.out.println("Test Method5");
	}

	@Test(priority =2)
	public void test1() {
		System.out.println("Test Method1");
	}

	@Test(priority =0)
	public void test2() {
		System.out.println("Test Method2");
	}

	@Test (invocationCount = 0)
	public void test3() {
		System.out.println("Test Method3");
	}

	@Test
	public void test4() {
		System.out.println("Test Method4");
	}

}
