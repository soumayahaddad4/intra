package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateRepositoriePage {
	WebDriver driver;
	@FindBy(xpath = "//input[@aria-label='Repository']")
	WebElement repositoryNameField;
	@FindBy(xpath = "//button[@type='submit']/span/span")
	WebElement btnCreate;

	public CreateRepositoriePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void creerNewRwpository(String name) throws InterruptedException {
		repositoryNameField.sendKeys(name);
		Thread.sleep(2000);
		btnCreate.click();
		

	}
}
