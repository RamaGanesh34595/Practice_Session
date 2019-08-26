package automation_Scenarios;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class validations {
	WebDriver driver;
	// Field Level validation
	// is Displayed
	// is Enabled
	// is Selected
  @Test
  public void pageTitle() {
	  String homePage = driver.getTitle();
	  driver.findElement(By.linkText("Projects")).click();
	  String Projects = driver.getTitle();
	  
	  Assert.assertFalse(homePage.equals(Projects));
	  System.out.println("Opened HomePage");
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Automation\\WorkSpace\\Libs\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
