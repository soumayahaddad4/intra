package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	@FindBy(id="login_field")
	WebElement usernameField;

	@FindBy(id = "password")
	WebElement passwordField;

	@FindBy(xpath = ("//input[@name='commit']")) 
	WebElement btnlogin;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login(String user, String pass) {
		usernameField.sendKeys(user);
		passwordField.sendKeys(pass);
		btnlogin.click();
	}
}
