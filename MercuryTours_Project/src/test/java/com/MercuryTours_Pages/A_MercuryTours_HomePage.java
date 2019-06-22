package com.MercuryTours_Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import com.Library.BasePage;

public class A_MercuryTours_HomePage extends BasePage {

	@Test ( priority =0,  groups = { "Regrission_Test", "Smoke_Test" })
	public void smoke_Test() {
		try {
			//driver.get("http://newtours.demoaut.com/mercurywelcome.php");
			String getTitle = driver.getTitle();
			System.out.println("this is Web Page Title:\t" + getTitle);
			assertEquals(getTitle, "Welcome: Mercury Tours");

			myRepository.clickButton(By.partialLinkText("Home"));
			myRepository.navigateToPerviosepage();
			myRepository.clickButton(By.partialLinkText("Flights"));
			myRepository.navigateToPerviosepage();
			myRepository.clickButton(By.partialLinkText("Hotels"));
			myRepository.navigateToPerviosepage();
			myRepository.clickButton(By.partialLinkText("Rentals"));
			myRepository.navigateToPerviosepage();
			myRepository.clickButton(By.partialLinkText("Cruises"));
			myRepository.navigateToPerviosepage();
			myRepository.clickButton(By.partialLinkText("Destinations"));
			myRepository.navigateToPerviosepage();
			myRepository.clickButton(By.partialLinkText("Vacations"));
			myRepository.navigateToPerviosepage();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test ( priority =1,  groups = { "Regrission_Test", "Smoke_Test" })
	public void signIn() {

		try {

			myRepository.enterTextField(By.cssSelector("[type='text']"), "mercury");
			myRepository.enterTextField(By.cssSelector("[type='password']"), "mercury");
			myRepository.clickButton(By.cssSelector("input[name='login']"));
			myRepository.clickButton(By.cssSelector("[width] [face] [type='radio']:nth-child(1)"));
			myRepository.selectDropDownbyIndex(By.cssSelector("[name='passCount']"), 0);
			myRepository.selectDropDownVisibleText(By.cssSelector("[name='fromPort']"), "Paris");
			myRepository.selectDropDownVisibleText(By.cssSelector("[name='fromMonth']"), "February");
			myRepository.selectDropDownbyIndex(By.cssSelector("[name='fromDay']"), 5);
			myRepository.selectDropDownVisibleText(By.cssSelector("[name='toPort']"), "London");
			myRepository.selectDropDownVisibleText(By.cssSelector("[name='toMonth']"), "December");
			myRepository.selectDropDownbyIndex(By.cssSelector("[name='toDay']"), 21);
			myRepository.clickButton(By.cssSelector("[method] [face] [name='servClass']:nth-child(4)"));
			myRepository.selectDropDownVisibleText(By.cssSelector("[name='airline']"), "Blue Skies Airlines");
			myRepository.clickButton(By.cssSelector("[src='\\/images\\/forms\\/continue\\.gif']"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
