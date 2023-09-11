package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepositoriesPage {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"user-profile-frame\"]/div/div[1]/div/div/a")
	WebElement btn_New;

	public RepositoriesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void cliquerNew() {
		btn_New.click();

	}
}
