package pages;

import org.openqa.selenium.WebDriver;

public class Navy extends AbstractPage {

	public Navy(WebDriver driver) {
		super(driver);
		adress = "http://www.navy.mil/submit/contacts.asp";
		driver.get(adress);
		go();

	}

	@Override
	protected void go() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.navigate().back();

	}
}
