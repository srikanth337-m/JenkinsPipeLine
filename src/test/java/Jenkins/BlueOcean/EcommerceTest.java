package Jenkins.BlueOcean;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class EcommerceTest {

	static WebDriver driver;
	@Test(priority = 0)
	public void loginPageVerification() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		WebElement pageDisplayed = driver.findElement(By.xpath("//div[@class='logo pull-left']"));
		Assert.assertTrue("page not found", pageDisplayed.isDisplayed());
		driver.findElement(By.xpath("//a[contains(text(),'Signup')]")).click();
		driver.findElement(By.xpath("//form[@action='/login']/input[@type='email']")).sendKeys("srikanth.mattigunta337@gmail.com");
		driver.findElement(By.xpath("//form[@action='/login']/input[@type='password']")).sendKeys("Srikanth@123&");
		driver.findElement(By.xpath("//form[@action='/login']/button[@type='submit']")).click();
		WebElement Logout = driver.findElement(By.xpath("//a[contains(text(),' Logout')]"));
		Assert.assertTrue("page not loaded", Logout.isDisplayed());
		driver.quit();
		System.out.println("Page loaded successfully");
	}



	//	@Test(priority = 1,timeOut = 3000)
	//	public void getUrl() throws InterruptedException {
	//		Thread.sleep(5000);
	//		System.out.println("URL launched successfully");
	//	}

	@Test(priority = 1)
	public void navigateToHomePage() {
		System.out.println("navigated to home page launched successfully");
	}

	@Test(priority = 2)
	public void loggedIn() {
		System.out.println("successfully logged into home page and enjoy shopping");
	}
}
