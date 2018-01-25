package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class PrestoShop extends AbstractPage {


	public PrestoShop(WebDriver driver) {
		super(driver);
		adress = "https://www.ecwid.com/demo/";
		driver.get(adress);
		go();
	}






	@Override
	protected void go() {

		WebElement a = driver.findElement(By.cssSelector("#p-262 > div.main-container >" +
				" div.page.no_translate > div.ecwid-demo-menu > div > div.ecwid-demo-menu__controls > div > " +
				"div.ecwid-demo-menu__controls-wrapper.ecwid-demo-menu__controls-wrapper--language > div.language-select"));
		List<WebElement> a1 = a.findElements(By.tagName("a"));

		a1.forEach((s)->{
			String text = s.getAttribute("innerHTML");
			String url = s.getAttribute("href");
			System.out.println(text + "("+url+")");

		});
		Actions mouse = new Actions(driver);
		mouse
				.moveToElement(driver.findElement(By.cssSelector("#p-262 > div.main-container > div.page" +
				".no_translate > div.ecwid-demo-menu > div > div.ecwid-demo-menu__controls > div > " +
				"div.ecwid-demo-menu__controls-wrapper." +
				"ecwid-demo-menu__controls-wrapper--language > div.ecwid-demo-menu__control-group > div")))
				.click(driver.findElement(By.cssSelector("#p-262 > div.main-container >" +
						" div.page.no_translate > div.ecwid-demo-menu > div > div.ecwid-demo-menu_" +
						"_controls > div > div.ecwid-demo-menu__controls-wrapper.ecwid-demo-menu" +
						"__controls-wrapper--language > div.language-select > a:nth-child(4)")))
				.pause(10000)
				.build()
				.perform();

	}
}
