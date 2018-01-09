package pages;

import org.openqa.selenium.WebDriver;

import lombok.Data;

@Data
public abstract class AbstractPage {

	protected String adress;
	protected String title;
	protected WebDriver driver;

	public AbstractPage(WebDriver driver) {
		this.driver = driver;
	}

	protected abstract  void go();


}
