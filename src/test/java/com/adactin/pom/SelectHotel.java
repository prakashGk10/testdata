package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	public static WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement radiobutn;

	@FindBy(id = "continue")
	private WebElement continu;

	public SelectHotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getRadiobutn() {
		return radiobutn;
	}

	public WebElement getContinu() {
		return continu;
	}

}
