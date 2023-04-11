package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelScripts {
	WebDriver driver;
	


	public static void main(String[] args) throws InterruptedException {
		SelScripts ss = new SelScripts();
		ss.launchBrowseronchoice("firefox");
		ss.handlecheckbox();

	}

	public void handlecheckbox() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement checkbox = driver.findElement(By.id("my-check-2"));
		checkbox.click();
	}

	public void senddatatoInputBox() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement input1 = driver.findElement(By.id("my-text-id"));
		input1.sendKeys("First Input box");
	}

	public void launchBrowseronchoice(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		// driver.manage().window().minimize();

//		Dimension d = new Dimension(800,600);
//		driver.manage().window().setSize(d);

	}

	public void navigationFunctions() throws InterruptedException {
		// driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");

		driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();

	}

}
