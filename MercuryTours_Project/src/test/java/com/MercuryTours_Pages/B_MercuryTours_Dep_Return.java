package com.MercuryTours_Pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Library.BasePage;

public class B_MercuryTours_Dep_Return extends BasePage {
	
	
    @ Test (dependsOnGroups = {"Regrission_Test", "Smoke_Test"})
	public void Departure_Return() {

		try {

			myRepository.clickButton(By.cssSelector("[method] [border='0']:nth-child(9) tr:nth-of-type(5) [type]"));
			myRepository.clickButton(By.cssSelector("[method] [border='0']:nth-child(10) tr:nth-of-type(7) [type]"));
			myRepository.clickButton(By.cssSelector("[src='\\/images\\/forms\\/continue\\.gif']"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    @Test (dependsOnGroups = {"Regrission_Test", "Smoke_Test"})
	public void bookFlight() {
		try {
			myRepository.enterTextField(
					By.cssSelector("[method] tr:nth-of-type(4) [width='33\\%']:nth-of-type(1) [maxlength]"), "mike");
			myRepository.enterTextField(By.cssSelector("[method] [width='33\\%']:nth-of-type(2) [maxlength='60']"),
					"jason");
			myRepository.selectDropDownVisibleText(By.cssSelector("[name='pass\\.0\\.meal']"), "Low Sodium");
			myRepository.selectDropDownVisibleText(By.cssSelector("[name='creditCard']"), "MasterCard");
			myRepository.enterTextField(By.cssSelector("[method] tr:nth-child(7) [type]"), "23456456352");
			myRepository.selectDropDownbyIndex(By.cssSelector("[name='cc_exp_dt_mn']"), 7);
			myRepository.enterTextField(By.cssSelector("[method] [width='33\\%']:nth-of-type(1) [type]"), "mike");
			myRepository.enterTextField(
					By.cssSelector("[method] tr:nth-child(8) [width='33\\%']:nth-of-type(2) [type]"), "jason");
			myRepository.enterTextField(By.cssSelector("[method] [width='34\\%'] [type]"), "steve");
			myRepository.enterTextField(By.cssSelector("[method] tr:nth-child(10) [maxlength]"), "1325 Borregas Ave. ");
			myRepository.enterTextField(By.cssSelector("[method] tr:nth-child(12) [maxlength]"), "Chentley");
			myRepository.enterTextField(By.cssSelector("[method] tr:nth-child(13) [maxlength='40']"), "Sunnyvale");
			myRepository.enterTextField(By.cssSelector("[method] tr:nth-child(13) [maxlength='20']"), "94089");
			myRepository.selectDropDownVisibleText(By.cssSelector("[name='billCountry']"), "UNITED STATES ");
			myRepository.clickButton(By.cssSelector("[method] [bgcolor='\\#CCCCCC']:nth-child(15) [type]"));
			myRepository.clickButton(By.cssSelector("[src='\\/images\\/forms\\/purchase\\.gif']"));
			myRepository.clickButton(By.cssSelector("body [align='right']:nth-of-type(2) [width]"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
