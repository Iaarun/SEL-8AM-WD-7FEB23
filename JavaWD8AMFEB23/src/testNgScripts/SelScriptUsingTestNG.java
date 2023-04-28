package testNgScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelScriptUsingTestNG {
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
	public void seleniumwaits() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");
		
		//explicit wait 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(),'Done!')]")));
	  WebElement done=   driver.findElement(By.xpath("//p[contains(text(),'Done!')]"));	
	  System.out.println(done.isDisplayed());
	}
	
	@Test
	public void handleCalenders() {
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.click();
		String calTitle = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(calTitle);

		String month = calTitle.split(" ")[0].trim();
		String year = calTitle.split(" ")[1].trim();
		
		System.out.println(month);
		System.out.println(year);
		String nyear= String.valueOf(Integer.parseInt(year)+1);
		
		while(!(month.equals("March") && year.equals(nyear))) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			calTitle = driver.findElement(By.className("ui-datepicker-title")).getText();
			month = calTitle.split(" ")[0].trim();
			year = calTitle.split(" ")[1].trim();
		}
		
		driver.findElement(By.xpath("//a[normalize-space()='31']")).click();

	}

}
