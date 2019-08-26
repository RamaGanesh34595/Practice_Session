package webTable_Handling;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WebTablw_Handling {
	WebDriver driver;
  @Test
  public void f() {
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\git\\repository\\HYD_POLICE\\config_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qa4.cgg.gov.in:8080/TSPolice");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
