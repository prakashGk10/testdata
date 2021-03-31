package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.BookHotelnn;
import com.adactin.pom.LoginPage;
import com.adactin.pom.Searchhotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {

	public static WebDriver driver;

	private LoginPage lp;
	private Searchhotel sh;
	private SelectHotel st;
	private BookHotelnn bk;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public LoginPage getlp() {
		lp = new LoginPage(driver);
		return lp;

	}

	public Searchhotel getsh() {
		sh = new Searchhotel(driver);
		return sh;
	}

	public SelectHotel getst() {
		st = new SelectHotel(driver);
		return st;
	}

	public BookHotelnn getbk() {
		bk = new BookHotelnn(driver);
		return bk;
	}
}
