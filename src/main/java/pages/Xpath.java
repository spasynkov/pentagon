package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Java\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/v1/");

		WebElement guru = driver.findElement(By.xpath("//input[@name='uid']"));
		guru.sendKeys("admin");
		guru = driver.findElement(By.xpath("//input[@name='password']"));
		guru.sendKeys("suka");
		//guru = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		guru = driver.findElement(By.xpath("//input[@type='reset']"));
		guru.click();

	}
}
