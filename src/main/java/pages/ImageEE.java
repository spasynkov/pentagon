package pages;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageEE {
	public static File captureElementBitmap(WebDriver driver, WebElement element) throws Exception {
		// Де/ Создаем экземплаем скриншот страницы
		driver.manage().window().fullscreen();
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		//Создаем экземпляр BufferedImage для работы с изображением
		BufferedImage img = ImageIO.read(screen);
		// Получаем размеры элемента
		int width = element.getSize().getWidth();
		int height = element.getSize().getHeight();
		// Создаем прямоуголник (Rectangle) с размерами элемента
		//Rectangle rect = new Rectangle(width, height);
		// Получаем координаты элемента
		Point p = element.getLocation();
		// Вырезаем изображенеи элемента из общего изображения
		BufferedImage dest = img.getSubimage(p.getX(), p.getY(), width, height);
		// Перезаписываем File screen
		ImageIO.write(dest, "png",new File("e:\\screenshot.png"));
		// Возвращаем File c изображением элемента
		return screen;
	}

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Java\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://info.javarush.ru");

		WebElement as = driver.findElement(By.xpath("//*[@id=\"content\"]/ul[2]/li[2]/div/div[2]/div[1]/img"));


		File file = captureElementBitmap(driver, as);
		//FileUtils.copyFile(file, new File("e:\\screenshot.png"));
		System.out.println(file);
		driver.quit();

	}
}
