package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage extends AbstractPage{


	public ContactPage(WebDriver driver) {
		super(driver);
		adress = "https://www.defense.gov/Resources/Contact-DoD/";
		driver.get(adress);
		go();
	}

	protected void go() {
		//System.out.println("contacs page");

		WebElement army =  driver.findElement(By
				.cssSelector("#dnn_ctr6589_HtmlModule_lblContent > div > div:nth-child(1) > a"));
		//army.click();
		new ArmyPage(driver);
		new Navy(driver);
		new Marine(driver);
		new AirForce(driver);
		WebElement navy = driver
				.findElement(By.cssSelector("#dnn_ctr6589_HtmlModule_lblContent > div > div:nth-child(2) > a"));
		//navy.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


	}


}
