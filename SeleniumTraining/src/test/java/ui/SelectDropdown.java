package ui;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "C:\\browserdrivers\\geckodriver.exe");
//		System.setProperty("webdriver.msedge.driver", "C:\\browserdrivers\\msedgedriver.exe");

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
//		FirefoxDriver driver = new FirefoxDriver();
//		EdgeDriver driver = new EdgeDriver();
//		driver.get("https://www.google.com/");
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
//		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		WebElement ddown = driver.findElement(By.xpath("//*[@id=\"gh-cat\"]"));
		Select select = new Select(ddown);
		select.selectByIndex(1);
//		select.selectByValue("267");
//		select.selectByVisibleText("Baby");
//		select.deselectByIndex(1); Only for multiple dropdown
//		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		driver.close();
		driver.quit();
	}

}
