package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.PageObjectManager;
import com.adactin.pom.BookHotelnn;
import com.adactin.runner.Runner;
import com.framework.org.BaseClass.Bassclass;

import cucumber.api.java.en.*;

public class BookAHotelStepDefenition extends Bassclass {

	public static WebDriver Driver = Runner.driver;
	
	PageObjectManager pom = new PageObjectManager(Driver);

//	BookHotelnn bl = new BookHotelnn(driver);

	@Given("^User enter valid first name$")
	public void user_enter_valid_first_name() throws Throwable {
		sendkeys(pom.getbk().getFrstname(), "Prakash");
	}

	@When("^User enter valid last name$")
	public void user_enter_valid_last_name() throws Throwable {
		sendkeys(pom.getbk().getLastname(), "M");
	}

	@When("^User enter valid billing address$")
	public void user_enter_valid_billing_address() throws Throwable {
		sendkeys(pom.getbk().getAddress(), "Londan, Wall Street 4/2, Londan_Time Street");
	}

	@When("^User enter valid credit card num$")
	public void user_enter_valid_credit_card_num() throws Throwable {
		sendkeys(pom.getbk().getCcnum(), "645473");
	}

	@When("^User select valid credit card type$")
	public void user_select_valid_credit_card_type() throws Throwable {
		Thread.sleep(3000);
		dropdown(pom.getbk().getCctype(), "Text", "Master Card");
	}

	@When("^User select valid select month$")
	public void user_select_valid_select_month() throws Throwable {
		dropdown(pom.getbk().getExppmnth(), "Text", "April");
	}

	@When("^User select valid select year$")
	public void user_select_valid_select_year() throws Throwable {
		dropdown(pom.getbk().getCcexppmnth(), "Text", "2021");
	}

	@When("^User enter valid cvv number$")
	public void user_enter_valid_cvv_number() throws Throwable {
		Thread.sleep(3000);
		sendkeys(pom.getbk().getCcvv(), "402");
	}
	@When("^user click the book now$")
	public void user_click_the_book_now() throws Throwable {
		Thread.sleep(3000);
		click(pom.getbk().getBkknow());
	}

}
