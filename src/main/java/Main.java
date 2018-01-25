import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.annotations.VisibleForTesting;

import pages.ContactPage;
import pages.MainPage;
import pages.PrestoShop;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Java\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//new MainPage(driver);
		//new ContactPage(driver);
		new PrestoShop(driver);

		Thread.sleep(5000);
		driver.quit();


		Properties p = new Properties();
		p.load(new FileReader("MILITARYDEPARTMENTS.properties"));

		//System.out.println(p.getProperty("Army"));


	}



}
