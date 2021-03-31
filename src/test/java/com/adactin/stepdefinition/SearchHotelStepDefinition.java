package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.PageObjectManager;
import com.adactin.pom.Searchhotel;
import com.adactin.runner.Runner;
import com.framework.org.BaseClass.Bassclass;

import cucumber.api.java.en.*;

public class SearchHotelStepDefinition extends Bassclass {
	public static WebDriver driver = Runner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	// Searchhotel sh = new Searchhotel(driver);

	@Given("^User select valid location$")
	public void user_select_valid_location() throws Throwable {
		dropdown(pom.getsh().getLocation(), "value", "London");

	}

	@When("^User select valid hotel$")
	public void user_select_valid_hotel() throws Throwable {
		dropdown(pom.getsh().getHotel(), "value", "Hotel Sunshine");
	}

	@When("^User select valid room type$")
	public void user_select_valid_room_type() throws Throwable {
		dropdown(pom.getsh().getRometype(), "value", "Super Deluxe");

	}

	@When("^User select valid number of room$")
	public void user_select_valid_number_of_room() throws Throwable {
		Thread.sleep(5000);
		dropdown(pom.getsh().getNumroom(), "text", "2 - Two");
	}

	@When("^User enter the valid check in date$")
	public void user_enter_the_valid_check_in_date() throws Throwable {
		clear(pom.getsh().getDatein());
		sendkeys(pom.getsh().getDatein(), "30/07/2021");
	}

	@When("^User enter the valid check out date$")
	public void user_enter_the_valid_check_out_date() throws Throwable {
		clear(pom.getsh().getDateout());
		sendkeys(pom.getsh().getDateout(), "31/07/2021");
	}

	@When("^User select valid adult per room$")
	public void user_select_valid_adult_per_room() throws Throwable {
		dropdown(pom.getsh().getAdultroom(), "text", "2 - Two");
	}

	@When("^user select valid children per room$")
	public void user_select_valid_children_per_room() throws Throwable {
		dropdown(pom.getsh().getChildroom(), "text", "4 - Four");
	}

	@Then("^User verifiy all box$")
	public void user_verifiy_all_box() throws Throwable {
		click(pom.getsh().submit());
	}

}
