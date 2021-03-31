package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.PageObjectManager;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.Runner;
import com.framework.org.BaseClass.Bassclass;

import cucumber.api.java.en.*;

public class SelectHotelStepDefenition extends Bassclass {
	public static WebDriver driver = Runner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
//	SelectHotel sh = new SelectHotel(driver);

	@Given("^User check the option$")
	public void user_check_the_option() throws Throwable {
		click(pom.getst().getRadiobutn());

	}

	@When("^User click the radiobutton$")
	public void user_click_the_radiobutton() throws Throwable {
		click(pom.getst().getContinu());
	}

	@Then("^User verify the all box$")
	public void user_verify_the_all_box() throws Throwable {
	}

}
