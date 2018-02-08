package pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHanndleIterator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Java\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		WebElement link = driver.findElement(By.tagName("a"));
		link.click();
		String okno = driver.getWindowHandle();
		List <String>df = new ArrayList<>(driver.getWindowHandles());
		System.out.println(df.get(1));
		driver.switchTo().window(df.get(0));
		/*Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		while (iterator.hasNext()){
			String next = iterator.next();
			driver.switchTo().window(next);
			String url = driver.getCurrentUrl();
			if(!url.contains("art")){
				System.out.println("good");
				break;
			}
			else System.out.println("bad");
		}*/

	}

}
