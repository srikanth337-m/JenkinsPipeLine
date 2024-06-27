package Jenkins.BlueOcean;

import org.testng.annotations.Test;

public class EcommerceTest {

	@Test(priority = 0)
	public void launchBrouser() {
		System.out.println("browser launched successfully");
	}
	
	@Test(priority = 1)
	public void getUrl() {
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
