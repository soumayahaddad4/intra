package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageFactory.HomePage;
import pageFactory.SignInPage;
import pageFactory.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;

public class Suite1 {
	WebDriver driver = new FirefoxDriver();

	@BeforeMethod
	public void setUp() {

		driver.manage().window().maximize();
		driver.get("https://github.com/");

		// ---

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.get(prop.getProperty(qaUrl));
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

	@Test
	public void creerNewRepository() throws InterruptedException {

		SignInPage SI = new SignInPage(driver);
		SI.SignIn();
		// Thread.sleep(4000);
		LoginPage LI = new LoginPage(driver);
		LI.login("----", "----");

		HomePage Hp = new HomePage(driver);
		Hp.naviger_vers_yourRepositories();
		RepositoriesPage RI = new RepositoriesPage(driver);
		RI.cliquerNew();
		CreateRepositoriePage Cr = new CreateRepositoriePage(driver);
		Cr.creerNewRwpository("intra");

		Thread.sleep(4000);

	}
}
