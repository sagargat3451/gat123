package TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;

public class RegisterPageTest extends BaseClass {

	private static RegisterPage registerPage;
	
	@BeforeTest
	public void setUp() {
		initialization();
	}

	@Test(priority = 1)
	public void validateGeneralDetailFunctionality() throws InterruptedException {

		registerPage = new RegisterPage();
		registerPage.generalDetailFunctionality("Ms.", "Sagar", "Gat", "Gadital", "Hadapsar", "Pune", "France", /*"GOA",*/
				 " ", "411028", "sagar@gmail.com", "1234567890", "9876543210");
	}

	@Test(priority = 2)
	public void validateChooseAnswerFunctionality() {

		registerPage.chooseAnswerFunctionality("What is your spouse name?", "Supriya");
	}

	
	@Test(priority = 3)
	public void validateUserTypeFunctionality() {

		registerPage.chooseUserTypeFunctionality("rdoSociety");
	}
	
	
	@Test(priority = 4)
	public void validateChooseIdPasswordFunctionality() {

		registerPage.chooseIdPasswordFunctionality("sagar", "sagar@123", "sagar@123");
	}

}
