package webDriver_Commands;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Browser_Commands {
	WebDriver driver;
  @Test
  public void f() {
	  
	  String title = driver.getTitle();
	  System.out.println("Website title is - " + title); // Title of the Page
	  System.out.println("Length of the title is: " + driver.getTitle().length()); // Length of the title
	  
	  String currentURL = driver.getCurrentUrl();
	  System.out.println("Current URL is - " + currentURL);
	  
	  String pageSource = driver.getPageSource();
	  //System.out.println("Page soruce is - " + pageSource);
	  System.out.println("Page source length is: " + driver.getPageSource().length());
	  
	  if(currentURL.equals("http://test4.cgg.gov.in/PWFMS/")) {
		  System.out.println("Expected Url has been opened");
	  }
	  else
		  System.out.println("Expected Url has not been opened");
	  
	  
	  WebElement element = driver.findElement(By.id("username"));
	  element.clear();
	  
	  boolean ele = element.isDisplayed();
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver",
				"D:\\Automation_WorkSpace\\HYD_POLICE\\config_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://test4.cgg.gov.in/PWDMS/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
