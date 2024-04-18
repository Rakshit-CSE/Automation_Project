package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleandTextTest {
	@Test
	public void titleTest()
	{
		SoftAssert softassert = new SoftAssert();
		
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedText = "Search";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		String actualText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		softassert.assertEquals(actualTitle, expectedTitle,"Title verification failed");
		softassert.assertEquals(actualText, expectedText,"Text verification failed");
		driver.close();
		softassert.assertAll();
	}
}
