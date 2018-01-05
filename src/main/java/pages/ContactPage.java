package pages;

import org.openqa.selenium.WebDriver;

public class ContactPage extends AbstractPage{


	public ContactPage(WebDriver driver) {
		super(driver);
		adress = "https://www.defense.gov/Resources/Contact-DoD/";
		go();
	}

	protected void go() {
		System.out.println("contacs page");

	}
}
