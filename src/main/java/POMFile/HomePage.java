package POMFile;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "span.commonModal__close")
	private WebElement modalCloseIcon;
	
	@FindBy(xpath = "//ul[@class='makeFlex font12 headerIconsGap']//li[contains(@class, 'menu')]//span//a//span[2]")
	private List<WebElement> globalMenuFieldsName;
	
	public void closeModal() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(modalCloseIcon));
		modalCloseIcon.click();
		Thread.sleep(2000);
	}
	
	public void clickGlobalNavigationCategory(String name) {
		for(WebElement category : globalMenuFieldsName) {
			String categoryNames = category.getText();
			if(categoryNames.equalsIgnoreCase(name)) {
				category.click();
			}
		}
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL: "+currentURL);
	}

}
