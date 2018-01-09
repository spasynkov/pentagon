package pages;

import org.openqa.selenium.WebDriver;

public class AirForce extends AbstractPage {
	public AirForce(WebDriver driver) {
		super(driver);
		adress = "http://www.af.mil/Contact-Us/";
		driver.get(adress);
		go();
	}

	@Override
	protected void go() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		driver.navigate().back();

	}
}
