package automation_Scenarios;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class screenShot {
	WebDriver driver;

	public void screenShot(String sshot) throws Exception {
		java.util.Date d = new java.util.Date();
		SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-DD_hh-mm-ss-a");
		String time = df.format(d);
		
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E:\\Selenium Automation\\WorkSpace\\Screens\\" + sshot + time + ".JPEG"));
	}

	@Test
	public void dashBoardPage() throws Exception {
		screenShot("HomePage");
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Automation\\WorkSpace\\Libs\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testapobmms.cgg.gov.in/");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
