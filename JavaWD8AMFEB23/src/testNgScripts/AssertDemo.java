package testNgScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(MyListeners.class)
public class AssertDemo {

	WebDriver driver;

	@BeforeMethod
	public void launchBrowseronchoice() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void closebrowser() {
		driver.close();
	}

	@Test
	public void hardassertdemo() {

		driver.get("http://live.techpanda.org/index.php/");
		String expectedtitle = "Home page";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
		driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
		String t1 = "Mobile";
		Assert.assertEquals(driver.getTitle(), t1);

	}

	@Test
	public void softassertdemo() {

		SoftAssert sofassert = new SoftAssert();
		driver.get("http://live.techpanda.org/index.php/");
		String expectedtitle = "Home page";
		String actualtitle = driver.getTitle();

		sofassert.assertEquals(actualtitle, expectedtitle);

		driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
		String t1 = "Mobile";
		sofassert.assertEquals(driver.getTitle(), t1);
		sofassert.assertAll();
	}

}
