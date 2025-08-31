package TestFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POMFile.HomePage;

public class HomePageTest {
	
	@Test
	public void HomePageTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		try {
			HomePage homePage = new HomePage(driver);
			
			homePage.closeModal();
			
			homePage.clickGlobalNavigationCategory("Holiday Packages");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			driver.quit();
		}
	}

}
