package pages;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends AbstractPage{



	public MainPage(WebDriver driver) {
		super(driver);
		adress = "https://www.defense.gov/";
		go();
	}



	protected void go() {
		BufferedWriter writ;
		try {
			writ = new BufferedWriter(new FileWriter("MILITARYDEPARTMENTS.properties"));
		} catch (IOException e) {
			return;
		}
		driver.get(adress);
		WebElement main = driver.findElement(By.cssSelector("#Form > footer > div.container-fluid.footer-inner > " +
				"div > div.col-lg-5.hidden-md.hidden-sm.hidden-xs.footer-pad-middle > div.quick.dept"));

		WebElement ul = main.findElement(By.tagName("ul"));
		List<WebElement> list = ul.findElements(By.tagName("li"));
		for(WebElement e:list ){
			WebElement a = e.findElement(By.tagName("a"));
			String url = a.getAttribute("href");
			String name = a.findElement(By.tagName("span")).getAttribute("innerHTML")
					.replaceAll(" ","");

			try {
				writ.write(name +'=' + url);
				writ.newLine();
			} catch (IOException ignored) {

			}
		}
		try {
			writ.close();
		} catch (IOException ignored) {

		}
	}
}
