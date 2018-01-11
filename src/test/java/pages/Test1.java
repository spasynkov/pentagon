package pages;

import java.util.List;
import java.util.Set;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	private static WebDriver driver;

	@Before
	public void test(){}

	@BeforeClass
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "E:\\Java\\chromedriver.exe");

		driver = new ChromeDriver();
	}


	@AfterClass
	public static  void destroy(){
		driver.quit();
		driver = null;

	}

	@Test
	public void test2(){
		driver.get("https://www.pornhub.com/");
		driver.findElement(By.tagName("a")).click();

	}
	@Test
	public void test3(){
		driver.get("http://www.patriarchia.ru/");
	   WebElement poiskPopov = driver
			   .findElement(By.cssSelector("#Patriarchia\\2e Ru > div.header.header_ru > " +
					   "div.search > form > input.textfield"));
	   poiskPopov.sendKeys(Keys.CONTROL,"a");
	   poiskPopov.sendKeys(Keys.DELETE);
	   poiskPopov.sendKeys("Попы-Няшки!!! КАВАЙ!!!!");
	   poiskPopov.submit();
	}



}
