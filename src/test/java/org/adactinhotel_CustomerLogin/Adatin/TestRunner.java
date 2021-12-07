package org.adactinhotel_CustomerLogin.Adatin;

import org.openqa.selenium.WebDriver;

import com.PageObjectManager.PageObjectManager;

public class TestRunner extends BassClass {

	public static WebDriver driver = BassClass.driver("chrome");

	public static PageObjectManager pom = new PageObjectManager(driver);

	public static void main(String[] args) {
		
		
		geturl("http://automationpractice.com/index.php?id_category=3&controller=category");

		clicksign(pom.getSigin());
		
		setkeys(pom.getEmailaddress(), "rishiramanathan1999@gmai.com");
		
		clicksign(pom.getCreate());
		
		clicksign(pom.getTitle());
		
		
        setkeys(pom.getFirstname(), "qwert");
		
		
	}

}
