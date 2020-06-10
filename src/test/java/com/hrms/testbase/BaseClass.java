package com.hrms.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver setUP() {
		ConfigsReader.readPropertieas(Constants.PROPERTIES_FILE_PATH);

		switch (ConfigsReader.getProperty("browser").toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			throw new RuntimeException("browser not Supported !!!!");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_TIME_WAIT, TimeUnit.SECONDS);
		driver.get(ConfigsReader.getProperty("url"));

		PageInitilizer.initialize();
		return driver;
	}

	public static void tearDown() {

		if (driver != null) {
			driver.quit();
		}

	}
}
