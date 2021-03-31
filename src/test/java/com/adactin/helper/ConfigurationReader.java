package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;

	public ConfigurationReader() throws IOException {

		File f = new File(System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getbrowsername() {
		String browser = p.getProperty("browser");
		System.out.println(browser);
		return browser;
	}

	public String geturl() {
		String url = p.getProperty("url");
		System.out.println(url);
		return url;
	}

	public static void main(String[] args) throws IOException {

		ConfigurationReader c = new ConfigurationReader();
		c.getbrowsername();
		c.geturl();
	}
}
