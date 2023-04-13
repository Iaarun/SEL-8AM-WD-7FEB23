package seleniumScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelScripts {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		SelScripts ss = new SelScripts();
		ss.launchBrowseronchoice("chrome");
		ss.handlingframes();

	}

	public void handlingframes() {
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));

		System.out.println(drag.isDisplayed());
        // to come out of frame
		driver.switchTo().defaultContent();
		
	//	driver.switchTo().parentFrame();
		WebElement logo = driver.findElement(By.xpath("//a[@href='/']"));
		System.out.println(logo.isDisplayed());

	}

	public void modaldialogWindow() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");
		WebElement modalBtn = driver.findElement(By.id("my-modal"));
		modalBtn.click();

		WebElement savebtn = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		savebtn.click();
		String text = driver.findElement(By.id("modal-text")).getText();

		System.out.println(text);
	}

	public void handlealert() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");
		WebElement prompt = driver.findElement(By.id("my-prompt"));
		prompt.click();

		Alert alert = driver.switchTo().alert();

		// get text from alert
		System.out.println(alert.getText());

		// write data to alert
		alert.sendKeys("Test User alert");

		alert.accept();

		String alerttext = driver.findElement(By.id("prompt-text")).getText();
		System.out.println(alerttext);

		// driver.close();

	}

	public void handlemultiplecheckbox() {
		driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		List<WebElement> allboxes = driver.findElements(By.name("my-check"));
		System.out.println(allboxes.size());

		for (WebElement x : allboxes) {
			if (!x.isSelected()) {
				x.click();
			}
		}
	}

	public void elementappearance() {
		driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement dinput = driver.findElement(By.name("my-disabled"));

		// to check element is enabled
		System.out.println(dinput.isEnabled());
		// dinput.sendKeys("Writting some text");

		// is the element displayed
		System.out.println(dinput.isDisplayed());
	}

	public void textfromanelement() {
		driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement ele = driver.findElement(By.className("display-6"));
		String text = ele.getText();
		System.out.println(text);
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
