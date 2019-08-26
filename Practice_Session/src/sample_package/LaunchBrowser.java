package sample_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class LaunchBrowser {
	WebDriver driver;
  @Test
  public void LaunchBrowser() {
	  driver.manage().window().maximize();
		driver.get("http://staging1.cgg.gov.in/APOBMMS_NEW/");
  }
  
 /* @Test
  public void Dropdown_Handling() {
	  
  }*/
  
  @BeforeTest
  public void beforeTest() {
	   	System.setProperty("webdriver.gecko.driver", "E:\\Selenium Automation\\WorkSpace\\Libs\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
