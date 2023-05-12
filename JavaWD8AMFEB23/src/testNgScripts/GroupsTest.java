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

public class GroupsTest {

	@Test(priority = 3, groups = "regression")
	public void test5() {
		System.out.println("Test Method5");
	}

	@Test(priority =-2, groups = "sanity")
	public void test1() {
		System.out.println("Test Method1");
	}

	@Test (groups = {"sanity","regression"})
	public void test2() {
		System.out.println("Test Method2");
	}

	@Test (invocationCount = 0, groups = "regression")
	public void test3() {
		System.out.println("Test Method3");
	}

	@Test (timeOut = 2000, groups = "regression")
	public void test4() throws InterruptedException {
		System.out.println("Test Method4");
		Thread.sleep(3000);
	}
	
	@Test (expectedExceptions = ArithmeticException.class, groups = "regression")
	public void test6() {
		System.out.println("Test Method6");
		System.out.println(1/0);
	}
	
	@Test
	public void test7() {
		System.out.println("Test Method7");
	}

}
