package com.framework.org.BaseClass;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.parser.Element;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bassclass {

	private static final WebElement WebElement = null;
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browsername) {

		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.firefox.driver",
						System.getProperty("user.dir") + "\\Driver\\firefox.exe");
				driver = new FirefoxDriver();
			} else if (browsername.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\Driver\\IE.exe");
				driver = new InternetExplorerDriver();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.manage().window().maximize();
		}

		return driver;

	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();

	}

	public static void Navigate() {
		driver.navigate();
	}

	public static void Navigate_back() {
		driver.navigate();

	}

	public static void Navigae_forward() {
		driver.navigate();
	}

	public static void NAvigate_Refresh() {
		driver.navigate();
	}

	public static void get(String bbo) {
		driver.get(bbo);

	}

	public static void Alert(String Alert, String Option) {
		if (Option.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		} else if (Option.equalsIgnoreCase("Reject")) {
			driver.switchTo().alert().dismiss();
		} else if (Option.equalsIgnoreCase("sendkeys")) {
			driver.switchTo().alert().sendKeys(Option);
		}
		{
		}
	}

	public static void action(WebElement local) {
		Actions a = new Actions(driver);
		a.contextClick(local).build().perform();
	}

	public static void dobleclick(WebElement local) {
		Actions a = new Actions(driver);
		a.doubleClick(local).build().perform();
	}

	public static void movetoelement(WebElement local) {
		Actions a = new Actions(driver);
		a.moveToElement(local).build().perform();
	}

	public static void dragandrop(WebElement local, WebElement main) {
		Actions a = new Actions(driver);
		a.dragAndDrop(local, main).build().perform();
	}

	public static void frame(WebElement part) {
		driver.switchTo().frame(part);

	}

	public static void frame1(WebElement part) {
		driver.switchTo().frame(part);
	}

	public static void frame2(WebElement part) {
		driver.switchTo().frame(part);
	}

	public static void defualt(WebElement part) {
		driver.switchTo().defaultContent();
	}

	public static void app(WebElement part) {

		driver.switchTo().defaultContent();

	}

	public static void robot() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}

	public static void getTitle() {
		driver.getTitle();

	}

	public static void getcrrnturl() {
		driver.getCurrentUrl();
	}

	public static void get_text(String part) {
		driver.get("text");
	}

	public static void getattribute(String value) {
		driver.get("value");
	}

	public static void screenshot(String image) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File(image);
		FileUtils.copyFile(sourcefile, destfile);
	}

	public static void dropdown(WebElement Element, String option, String Value) {

		Select s = new Select(Element);

		if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(Value));
		} else if (option.equalsIgnoreCase(Value)) {
			s.selectByValue(Value);
		} else if (option.equalsIgnoreCase("text"))
			;
		s.selectByVisibleText(Value);
	}

	public static void windowshandel(String Choose) {
		Set<String> pid = driver.getWindowHandles();
		for (String string : pid) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
			if (driver.switchTo().window(Choose).getTitle().equals(Choose)) {
				driver.close();
			}
		}
	}

	public static void clear(WebElement element) {
		element.clear();

	}

	public static void isselected(WebElement element1) {
		element1.isSelected();
	}

	public static void isdisplayed(WebElement element1) {
		element1.isDisplayed();
	}

	public static void isenabel(WebElement element1) {
		element1.isEnabled();
	}

	public static void getOptions(WebElement element) {
		Select d = new Select(element);
		java.util.List<WebElement> options = d.getOptions();
		for (WebElement web : options) {
			System.out.println(web.getText());

		}

//		List<WebElement> options2 = d.getOptions();
//		for (WebElement wb : options2) {
//			System.out.println();
//			wb.getText();

	}

	public static void gettitle(String title) {
		driver.getTitle();
	}

	public static void getAttribute(WebElement attribute, String value) {
		attribute.getAttribute(value);
	}

	public static void wait(String wait, int n) {
		driver.manage().timeouts().implicitlyWait(n, TimeUnit.SECONDS);
	}

	public static void explicitwait(WebElement element, int second) {
		WebDriverWait wait = new WebDriverWait(driver, second);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void fluentWait(WebElement element, int seconds) {
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);
	}

	public static void scrollup(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}

	public static void scrolldown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false);", element);
	}

	public static void firstselectedoption(WebElement element, String option) {
		driver.findElements((By) element);
		System.out.println(option);
	}

	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	

	public static void click(WebElement press) {
		// TODO Auto-generated method stub
		press.click();

	}
}
