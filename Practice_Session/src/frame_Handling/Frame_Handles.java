package frame_Handling;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Frame_Handles {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//div[@data-reactid='44']")).click();
	  Thread.sleep(5000);
	  //driver.switchTo().frame("");
	  driver.switchTo().activeElement();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"wallet-container-new qr-bg-white\"]/qr-code-login/div[2]/div[2]/div[3]/span")).click();
	  driver.findElement(By.xpath("//*[@id=\"input_0\"]")).sendKeys("ramaGanesh");
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\git\\repository\\HYD_POLICE\\config_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://paytm.com/");
  }

  @AfterTest
  public void afterTest() {
  }

}
