package myTests.program;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class play {
		
		@Test
		public void play() {
			WebDriver driver = new ChromeDriver();

			
			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			try {
			WebElement popupModal = driver.findElement(By.cssSelector("span.commonModal__close"));
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement popup = wait.until(ExpectedConditions.visibilityOf(popupModal));
			
			popup.click();
			
			driver.findElement(By.cssSelector("#fromCity")).click();
			driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open")).click();
			
			List<WebElement> cities = driver.findElements(By.cssSelector(".font14.appendBottom5.blackText"));
			
			ArrayList<String> arrayCity = new ArrayList<String>();
			for(WebElement city : cities) {
				String cityName = city.getText();
				arrayCity.add(cityName);
			}
			
			//TestNG - it will print the message only in email report
			Reporter.log("City names are taken : "+ arrayCity);
			
			assertTrue(arrayCity.contains("Bangkok, Thailand"));
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				driver.quit();
			}
			
		}


}
