package br.com.vsnogueira.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	public WebDriver driver;

//	public LoginSteps() {
//
//		driver = Hooks.driver;
//	}

	@Given("^i am at the WhatsApp login screen$")
	public void iAmAtTheWhatsAppLoginScreen() throws Throwable {
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(10000);
	}

	@When("^i validate the QR Code manualy with a mobile device$")
	public void iValidateTheQRCodeManualyWithAMobileDevice() throws Throwable {

	}

	@Then("^my WhatsApp home page is displayed$")
	public void myWhatsAppHomePageIsDisplayed() throws Throwable {

	}

}
