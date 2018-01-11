package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class ArmyPage extends AbstractPage {
	public ArmyPage(WebDriver driver) {
		super(driver);
		adress ="https://www.army.mil/contact/";
		driver.get(adress);
		go();
	}

	@Override
	protected void go() {
		// to do sho to
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.navigate().back();


	}

}
