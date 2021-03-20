package StepDefinitions;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver = null;
	
	@SuppressWarnings("deprecation")
	@Given("^browser is open$")
	public void browser_is_open() {

		System.out.println("browser is open");
		//System.setProperty("webdriver.chrome.driver","/home/mose/eclipse-workspace/CucumberJava/src/test/resources/Drivers/chromedriver" );
		//driver = new ChromeDriver();
		String getProjectPathString = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",getProjectPathString+"/src/test/resources/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {

		System.out.println("In user is on search page");
	}

	@When("a user enters a text in search box")
	public void a_user_enters_a_text_in_search_box() {

		System.out.println("Is in user enters search box");
	}

	@And("hits enter")
	public void hits_enter() {

		System.out.println("Is in user hits enter"); 
	}


	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Is in user navigated to search results");
	}


}
