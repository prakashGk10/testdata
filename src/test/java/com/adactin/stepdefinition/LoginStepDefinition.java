package com.adactin.stepdefinition;

import java.sql.Driver;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.ClickAction;

import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.LoginPage;
import com.adactin.runner.Runner;
import com.framework.org.BaseClass.Bassclass;

import cucumber.api.java.en.*;

public class LoginStepDefinition extends Bassclass {
	public static WebDriver Driver = Runner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	// LoginPage lp = new LoginPage(driver);

	@Given("^User launch application$")
	public void user_launch_application() throws Throwable {
		String url = FileReaderManager.getinstance().GetCrInstance().geturl();
		get("https://adactinhotelapp.com/");
	}

	@When("^User enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {

		sendkeys(pom.getlp().getUsername(), arg1);
	}

	@When("^User enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
		sendkeys(pom.getlp().getPassword(), arg1);
	}

	@Then("^User verify valid username and valid password$")
	public void user_verify_valid_username_and_valid_password() throws Throwable {
		click(pom.getlp().getLogin());
	}

}
