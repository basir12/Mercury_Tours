package com.MercuryTours_Pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Library.BasePage;

public class C_MercuryTours_Regiseter extends BasePage {
	
	
	@Test ( priority =4,  groups = { "Smoke_Test" })
	public void register() {
		try {
		myRepository.clickButton(By.partialLinkText("REGISTER"));
		myRepository.enterTextField(By.cssSelector("[method] tr:nth-of-type(2) [maxlength]"), "Mike");
		myRepository.enterTextField(By.cssSelector("[method] tr:nth-of-type(3) [maxlength]"), "Jason");
		myRepository.enterTextField(By.cssSelector("[method] tr:nth-of-type(4) [maxlength]"), "576528490");
		myRepository.enterTextField(By.cssSelector("[size='35']"), "mike.jason@gmail.com");
		myRepository.enterTextField(By.cssSelector("[method] tr:nth-of-type(7) [maxlength]"), "6734 Shently ct");
		myRepository.enterTextField(By.cssSelector("[method] tr:nth-of-type(9) [maxlength]"), "Chetley");
		myRepository.enterTextField(By.cssSelector("[maxlength='40']"), "Virginia");
		myRepository.enterTextField(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input"),
				"34562");
		myRepository.selectDropDownVisibleText(By.cssSelector("[name='country']"), "CANADA");
		myRepository.enterTextField(By.id("email"), "mike");
		myRepository.enterTextField(By.cssSelector("[method] tr:nth-of-type(15) [maxlength]"), "jason");
		myRepository.enterTextField(By.cssSelector("[method] tr:nth-of-type(16) [maxlength]"), "jason");
		myRepository.clickButton(By.cssSelector("[src='\\/images\\/forms\\/submit\\.gif']"));
		myRepository.navigateToPerviosepage();
		myRepository.navigateToPerviosepage();
      
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
}
