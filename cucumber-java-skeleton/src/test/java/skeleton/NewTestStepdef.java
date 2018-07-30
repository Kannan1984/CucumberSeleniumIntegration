package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewTestStepdef {
	WebDriver driver;
	
	public NewTestStepdef() {
		driver=DriverUtility.getDriver("chrome");
		driver.manage().window().maximize();
		driver.get("http://localhost:8083/TestMeApp/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	
	@Given("^(Sarah|He said) buys (no|-?\\d*) cucumbers?!?$")
	public void sarah_buys_no_cucumbers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Given("^The Login URL of TestMeApp$")
	public void the_Login_URL_of_TestMeApp() throws Throwable {
	    driver.findElement(By.partialLinkText("SignIn")).click();
	}

	@When("^User enters (\\w*) as username$")
	public void user_enters_Lalitha_as_username(String username) throws Throwable {
	    driver.findElement(By.name("userName")).sendKeys(username);
	    
	}

	@When("^User enters (\\w*) as password$")
	public void user_enters_Password_as_password(String password) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^User clicks on Sign in (\\w*)$")
	public void user_clicks_on_Sign_in() throws Throwable {
		
			driver.findElement(By.name("Login")).click();
			Assert.assertTrue(driver.getTitle().contains("Home"));
	}

}
