package stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	WebDriver driver;

	@Given("user is at the login page")
	public void userisAtLoginPage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
	}

	@When("user provide valid credential")
	public void userProvidevalidCredential() {
		driver.findElement(By.id("input-email")).sendKeys("cbatest7@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("cba@test");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("Accounts page should be displayed")
	public void accounts_page_should_be_displayed() {
		WebElement account = driver.findElement(By.xpath("//h2[normalize-space()='My Account']"));
		Assert.assertTrue(account.isDisplayed());
	}

	@When("user logout")
	public void userLogout() throws Throwable {
		WebElement accountarrow = driver
				.findElement(By.xpath("//a[@class='icon-left both nav-link dropdown-toggle active']"));
		
		Actions action= new Actions(driver);
		action.moveToElement(accountarrow).perform();
		driver.findElement(By.xpath("//span[normalize-space()='Logout']")).click();
	}

	@And("user close the browser")
	public void userclosebrowser() throws Throwable {
		driver.quit();
	}

}
