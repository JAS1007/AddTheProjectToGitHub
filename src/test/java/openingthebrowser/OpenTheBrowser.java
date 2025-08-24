package openingthebrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenTheBrowser {
	WebDriver driver;
	
	//just adding the comment (jas100799)
	
	@BeforeTest
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com/");
	}
	
	@Test
	public void searchSomtehing() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[contains(@class,'ytSearchboxComponentInput')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'ytSearchboxComponentInput')]")).sendKeys("ramayana trailer");
		driver.findElement(By.className("ytSearchboxComponentSearchButton")).click();
	}
}
