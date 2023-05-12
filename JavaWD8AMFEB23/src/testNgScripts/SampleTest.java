package testNgScripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SampleTest {
  @Test
  public void test() {
	  System.out.println("Actual Test");
  }
  
  @Test
  public void test1() {
	  System.out.println("Actual Test1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before test method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After test method");
  }

}
