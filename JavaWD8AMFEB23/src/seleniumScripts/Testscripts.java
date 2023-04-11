package seleniumScripts;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testscripts {
	int a=10;
	WebDriver driver;
	public static void main(String[] args) {
		Testscripts ts = new Testscripts();
		ts.launchBrowseronchoice("firefox");
		ts.launchApplication();
	}
	
	
	public void launchBrowseronchoice(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
	//	driver.manage().window().minimize();
		
//		Dimension d = new Dimension(800,600);
//		driver.manage().window().setSize(d);
		
	}
	
	public void launchApplication() {
	   driver.get("https://live.guru99.com/");
	   
	   //get the open application url
	  String url=   driver.getCurrentUrl();
	  System.out.println(url);
	  
	  //get the title of the page
	  String title=  driver.getTitle();
	  System.out.println(title);
	  
	  //get the id of the tab
	  String tabid= driver.getWindowHandle();
	  System.out.println(tabid);
	  
	  //get the page source
	 String src=  driver.getPageSource();
	 System.out.println(src);
	  
	}
	
	
	public void launchBrowsers() {
		//to launch chrome browser
	//	driver = new ChromeDriver();
		//tolaunch firefox
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.close();
		
	//	driver.quit();
	}

}
