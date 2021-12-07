package org.adactinhotel_CustomerLogin.Adatin;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BassClass {

	public static WebDriver driver;

	public static WebDriver driver(String browsername) {

		if (browsername == "chrome") {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\User\\eclipse-workspace\\Adatin\\driver\\chromedriver.exe");

		}
		driver = new ChromeDriver();

		return driver;

	}

	public static void clicksign(WebElement element) {
		element.click();

	}

	public static void geturl(String url) {

		driver.get(url);

	}
	
	public static void setkeys(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	
	

}
