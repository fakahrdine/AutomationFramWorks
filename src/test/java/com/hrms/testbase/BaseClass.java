package com.hrms.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver setUP() {
		ConfigsReader.readPropertieas(Constants.PROPERTIES_FILE_PATH);
		String headless = ConfigsReader.getProperty("headlessBrowser");

		switch (ConfigsReader.getProperty("browser").toLowerCase()) {

		case "chrome":
			WebDriverManager.chromedriver().setup();

			if (headless.equals("true")) {

				ChromeOptions cOptions = new ChromeOptions();
				cOptions.setHeadless(true);
				driver = new ChromeDriver(cOptions);
			} else {
				driver = new ChromeDriver();
			}

			break;

		case "ie":
			WebDriverManager.iedriver().setup();

			if (headless.equals("true")) {

				// ChromeOptions cOptions = new ChromeOptions();
				InternetExplorerOptions ieOption = new InternetExplorerOptions();
				//
				driver = new InternetExplorerDriver(ieOption);
			} else {
				driver = new InternetExplorerDriver();
			}

			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			throw new RuntimeException("browser not Supported !!!!");
		}

		// driver.manage().window().maximize();
		String siz = driver.manage().window().getSize().toString();
		System.out.println(siz);

		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_TIME_WAIT, TimeUnit.SECONDS);
		driver.get(ConfigsReader.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		PageInitilizer.initialize();
		return driver;
	}

	public static void tearDown() {

		if (driver != null) {
			driver.quit();
		}

	}
}
