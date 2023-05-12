package testNgScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvideDemo {
	
	WebDriver driver;

	@Parameters("browservalue")
	@BeforeMethod
	public void launchBrowseronchoice(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}
	
	@Test (dataProvider = "getlogindata")
	public void login(String username, String password) {
		driver.get("http://live.techpanda.org/index.php/customer/account/login/");
		
		driver.findElement(By.id("email")).sendKeys(username);
		
		driver.findElement(By.id("pass")).sendKeys(password);
		
		driver.findElement(By.id("send2")).click();
		
	}
	
	
	@DataProvider 
	public Object[][] getlogindata(){
		Object[][] data = new Object[1][2];
		
		data[0][0]="cbatest7@gmail.com";
		data[0][1]="cba@test";
		
		return data;
		
	}

}
