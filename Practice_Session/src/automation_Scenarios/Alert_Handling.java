package automation_Scenarios;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Alert_Handling {
	WebDriver driver;

	// Assert
	// asssertEquals
	//
	@Test
	public void Alerts() {
		driver.findElement(By.name("")).click();
		driver.switchTo().alert().accept();
	}

	@Test
	public void Waits() throws Exception {
		// Implicit wait
		// Explicit wait --> Thread.sleep
		// Webdriver Wait

		Thread.sleep(2000);
		driver.findElement(By.name("")).click();
		driver.switchTo().alert().accept();

	}

	@Test
	public void Validations() throws Exception {
		// isDisplayed
		// isEnabled()
		// isSelected()

		WebElement appnstatus = driver.findElement(By.xpath(""));
		Assert.assertEquals(appnstatus.isDisplayed(), true);
		Assert.assertTrue(appnstatus.isEnabled(), "Message");
		appnstatus.click();

	}

	@BeforeTest
	public void beforeTest() {

	}

	@AfterTest
	public void afterTest() {

	}

}
