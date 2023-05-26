package stepdef;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	WebDriver driver;
	
	@Before
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void closebrowser() {
		driver.quit();
	}


	@Given("user is at the login page")
	@Given("user launches login page")
	public void userisAtLoginPage() {
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
	
	  @When("user provide valid username and password")
	    public void user_provide_valid_username_and_password(DataTable dataTable) {
	        List<Map<String, String>> data=   dataTable.asMaps();
	      String username=  data.get(0).get("username");
	      String password=  data.get(0).get("password");
	      
	      driver.findElement(By.id("input-email")).sendKeys(username);
			driver.findElement(By.id("input-password")).sendKeys(password);
	    }
	  
	  @When("user provides incorrect {string} and {string}")
	    public void userProvidesIncorrectUsernameAndPassword(String username, String password) {
		  driver.findElement(By.id("input-email")).sendKeys(username);
			driver.findElement(By.id("input-password")).sendKeys(password);
	    }
	  
	  @Then("{string} message should be displayed")
	    public void errormessageShouldBeDisplayed(String expectederror)  {
	     String actualerror=   driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
	      Assert.assertEquals(expectederror, actualerror); 
	  }


	
}
