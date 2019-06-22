package com.MeruryTours.Tests;

import org.testng.annotations.Test;

import com.Library.BasePage;
import com.MercuryTours_Pages.B_MercuryTours_Dep_Return;
import com.MercuryTours_Pages.A_MercuryTours_HomePage;
import com.MercuryTours_Pages.C_MercuryTours_Regiseter;

public class MercuryTours_TestPage extends BasePage {

	A_MercuryTours_HomePage homePage = new A_MercuryTours_HomePage();
	C_MercuryTours_Regiseter register = new C_MercuryTours_Regiseter();
	B_MercuryTours_Dep_Return depRetrun = new B_MercuryTours_Dep_Return();

	@Test 
	public void callMethods_MercuryTours() {

		homePage.smoke_Test();
		homePage.signIn();
		depRetrun.Departure_Return();
		depRetrun.bookFlight();
		register.register();

	}

}
