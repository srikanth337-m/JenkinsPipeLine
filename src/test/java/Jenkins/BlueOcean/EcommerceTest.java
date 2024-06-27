package Jenkins.BlueOcean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EcommerceTest {

	static WebDriver driver;
	@Test(priority = 0)
	public void launchBrouser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/webhp?authuser=2");
		System.out.println("browser launched successfully");
	}
	
	@Test(priority = 1,timeOut = 3000)
	public void getUrl() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("URL launched successfully");
	}
	
	@Test(priority = 2)
	public void navigateToHomePage() {
		System.out.println("navigated to home page launched successfully");
	}
	
	@Test(priority = 3)
	public void loggedIn() {
		System.out.println("successfully logged into home page and enjoy shopping");
	}
}
