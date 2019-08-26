package webTable_Handling;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class window_Handling {
	WebDriver driver;
	@Test
	public void f() throws Exception {

		driver.findElement(By.linkText("Website")).click();
		Thread.sleep(5000);
		String mainwindow = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			String childwindow=itr.next();
			if (!mainwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
			}

		}
		WebElement history=driver.findElement(By.linkText("History"));
		Assert.assertEquals(history.isDisplayed(), true);
		history.click();
		driver.close();
		driver.switchTo().window(mainwindow);
		driver.findElement(By.linkText("Website")).click();

	}

	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//lib//chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://tspsc.gov.in/TSPSCWEB0508/indexnew.jsp");
		driver.manage().window().maximize();

	}

}
