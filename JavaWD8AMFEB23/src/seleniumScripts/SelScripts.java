package seleniumScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelScripts {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		SelScripts ss = new SelScripts();
		ss.launchBrowseronchoice("chrome");
		ss.seleniumwaits();
		ss.closebrowser();

	}
	
	public void closebrowser() {
		driver.close();
		
	}
	
	public void seleniumwaits() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");
		
		//explicit wait 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(),'Done!')]")));
	  WebElement done=   driver.findElement(By.xpath("//p[contains(text(),'Done!')]"));	
	  System.out.println(done.isDisplayed());
	  
	  FluentWait wait1 = new FluentWait(driver);
	  wait1.withTimeout(Duration.ofSeconds(15));
	  wait1.pollingEvery(Duration.ofSeconds(2));
	  wait1.ignoring(NoSuchElementException.class);
	  
	  
	}

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

	public void handletables() {
		driver.get("https://www.moneycontrol.com/markets/indian-indices/");

		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='indicesTable']/thead/tr/th"));
		int colNo = columns.size();

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='indicesTable']/tbody/tr"));
		int rowNum = rows.size();

		System.out.println("Number of rows: " + rowNum + "\nNumber of Columns: " + colNo);
		// row data

		for (int i = 1; i <= colNo; i++) {
			String data = driver.findElement(By.xpath("//table[@id='indicesTable']/tbody/tr[1]/td[" + i + "]"))
					.getText();
			System.out.print(data + " | ");
		}

		System.out.println();
		System.out.println("==============");
		// column data
		for (int i = 1; i <= rowNum; i++) {
			String data = driver.findElement(By.xpath("//table[@id='indicesTable']/tbody/tr[" + i + "]/td[1]"))
					.getText();
			System.out.println(data);
		}

		System.out.println("========================================================");
		// table data
		for (int i = 1; i <= rowNum; i++) {
			for (int j = 1; j <= colNo; j++) {
				String data = driver
						.findElement(By.xpath("//table[@id='indicesTable']/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.print(data + " | ");
			}
			System.out.println();

		}
	}

	public void handlemorethan3tabs() {
		Set<String> allids = new LinkedHashSet<>();
		driver.get("https://www.naukri.com/");
		String tab1 = driver.getWindowHandle();
		allids.add(tab1);
		WebElement services = driver.findElement(By.xpath("//div[contains(text(),'Services')]"));
		services.click();
		Set<String> twotabs = driver.getWindowHandles();
		allids.addAll(twotabs);

		WebElement companies = driver.findElement(By.xpath("//div[contains(text(),'Companies')]"));
		Actions action = new Actions(driver);

		action.keyDown(Keys.CONTROL).click(companies).keyUp(Keys.CONTROL).build().perform();
		Set<String> alltabs = driver.getWindowHandles();
		allids.addAll(alltabs);

		Iterator<String> it = allids.iterator();
		String ftab = it.next();
		// driver.switchTo().window(ftab);
		// System.out.println(driver.getCurrentUrl());
		String stab = it.next();
		// driver.switchTo().window(stab);
		// System.out.println(driver.getCurrentUrl());
		String ttab = it.next();
		driver.switchTo().window(ttab);
		System.out.println(driver.getCurrentUrl());
		// driver.close();

		driver.quit();
	}

	public void handlemultipletabs() {
		driver.get("https://www.naukri.com/");
		String tab1 = driver.getWindowHandle();
		WebElement services = driver.findElement(By.xpath("//div[contains(text(),'Services')]"));
		services.click();
		Set<String> allids = driver.getWindowHandles();

		for (String x : allids) {
			if (!x.equals(tab1)) {
				driver.switchTo().window(x);
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		}

		driver.switchTo().window(tab1);
		System.out.println(driver.getCurrentUrl());
	}

	public void openNewTabWithSelenium() {
		driver.get("https://www.naukri.com/");
		String tab1 = driver.getWindowHandle();
		System.out.println(tab1);
		driver.switchTo().newWindow(WindowType.TAB);
		String tab2 = driver.getWindowHandle();
		System.out.println(tab2);
		driver.get("https://resume.naukri.com/?fftid=100001");
	}

	public void handleFileupload() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement file = driver.findElement(By.name("my-file"));
		file.sendKeys("D:\\screenshot\\img.png");
	}

	public void handleScrolling() {
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");

		JavascriptExecutor js = ((JavascriptExecutor) driver);

		// random scroll
//		js.executeScript("window.scrollBy(0,500)", "");

		// scroll to bring an element into view
		// WebElement btn= driver.findElement(By.xpath("//input[@value='Confirmation
		// Alert']"));

		// js.executeScript("arguments[0].scrollIntoView()", btn);

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

	}

	public void capturescreenshot() throws IOException {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement dd = driver.findElement(By.name("my-select"));
		// use select class to handle dropdown
		Select select = new Select(dd);
		select.selectByVisibleText("Three");

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileHandler.copy(file, new File("D:\\screenshot\\dd.png"));

		WebElement img = driver.findElement(By.xpath("//img[@class='img-fluid']"));

		file = img.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("D:\\screenshot\\img.png"));
	}

	public void handleDropdown() throws InterruptedException {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement dd = driver.findElement(By.name("my-select"));
		// use select class to handle dropdown
		Select select = new Select(dd);

		// get default value from dropdown
		System.out.println(select.getFirstSelectedOption().getText());
		System.out.println("==================");
		// get options from dropdown
		List<WebElement> li = select.getOptions();

		for (WebElement x : li) {
			System.out.println(x.getText());
		}

		select.selectByValue("2");
		Thread.sleep(1000);
		select.selectByVisibleText("Three");
		Thread.sleep(1000);
		select.selectByIndex(0);

		// check whether dropdown supports the multiple selection
		System.out.println(select.isMultiple()); // false

	}

	public void difffindelementandelements() {
		driver.get("https://www.google.com/");
		// WebElement search= driver.findElement(By.name("q1"));
		// System.out.println(search);

		List<WebElement> li = driver.findElements(By.name("q1"));
		System.out.println(li.size() + "\n" + li);

	}

	public void handleAutosuggestion() {
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("test");

		List<WebElement> li = driver.findElements(By.xpath("//div[@id='Alh6id']/div[1]/div[1]/ul/li"));
		System.out.println(li);

		for (WebElement x : li) {
			if (x.getText().contains("internet")) {
				x.click();
			}
		}
	}

	public void handletooltip() {
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(0);
		WebElement age = driver.findElement(By.id("age"));
		System.out.println(age.getAttribute("title"));
//		Actions actions = new Actions(driver);
//		actions.click(age).keyDown(Keys.SHIFT).sendKeys(Keys.)

		age.sendKeys(Keys.SHIFT, "This is typing");

//		Robot robot = new Robot();

	}

	public void handleslider() {
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));

		Actions actions = new Actions(driver);
		actions.clickAndHold(slider).moveByOffset(500, 0).release().build().perform();
		actions.clickAndHold(slider).moveByOffset(-500, 0).release().build().perform();

	}

	public void handledragandDrop() {
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);

		// action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		action.dragAndDrop(drag, drop).perform();

	}

	public void handlingframes() {
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));

		System.out.println(drag.isDisplayed());
		// to come out of frame
		driver.switchTo().defaultContent();

		// driver.switchTo().parentFrame();
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
		//implicit wait
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
