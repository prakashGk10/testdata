package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelnn {

	public static WebDriver driver;

	@FindBy(id = "first_name")
	private WebElement frstname;

	@FindBy(id = "last_name")
	private WebElement lastname;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement ccnum;

	@FindBy(id = "cc_type")
	private WebElement cctype;

	@FindBy(id = "cc_exp_month")
	private WebElement exppmnth;

	@FindBy(id = "cc_exp_year")
	private WebElement ccexppmnth;

	@FindBy(id = "cc_cvv")
	private WebElement ccvv;

	@FindBy(id = "book_now")
	private WebElement bkknow;

	public BookHotelnn(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getFrstname() {
		return frstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExppmnth() {
		return exppmnth;
	}

	public WebElement getCcexppmnth() {
		return ccexppmnth;
	}

	public WebElement getCcvv() {
		return ccvv;
	}

	public WebElement getBkknow() {
		return bkknow;
	}

}
