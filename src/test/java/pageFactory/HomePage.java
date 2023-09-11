package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath = "//img[@class='avatar circle']/ancestor::user-drawer-side-panel")
	WebElement btn_image;
	@FindBy(xpath = "//span[contains(text(),'Your repositories')]")
	WebElement your_repositories;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void naviger_vers_yourRepositories() {
		btn_image.click();
		// driver.getWindowHandles();
		your_repositories.click();

	}

}
