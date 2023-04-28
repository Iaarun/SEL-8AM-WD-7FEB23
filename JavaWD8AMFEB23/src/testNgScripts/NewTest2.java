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

public class NewTest2 {
  @Test
  public void test1() {
	  System.out.println("Test Method1");
  }
  @Test
  public void test2() {
	  System.out.println("Test Method2");
  }
  @Test (enabled = false)
  public void test3() {
	  System.out.println("Test Method3");
	  System.out.println(1/0);
  }
  
}
