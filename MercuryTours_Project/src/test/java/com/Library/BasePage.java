package com.Library;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BasePage {
	public static WebDriver driver;
	public static seleniumRepository myRepository;

	@BeforeClass (  groups = { "Regrission_Test", "Smoke_Test" })
	public void beforeAllClassesStare() {
		myRepository = new seleniumRepository(driver);

	}

	@AfterClass
	public void afterAllTestCompleted() {

	}

	@BeforeMethod (  groups = { "Regrission_Test", "Smoke_Test" })
	public void beforeEachTestStart() {
		driver = myRepository.startChromeBrowser();

	}

	@AfterMethod (  groups = { "Regrission_Test", "Smoke_Test" })
	public void afterEachTestEnd() {

		try {
			myRepository.screenShot();
			driver.close();
			driver.quit();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
