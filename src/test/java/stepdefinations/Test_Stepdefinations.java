package stepdefinations;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Create_Faculty;

public class Test_Stepdefinations extends Create_Faculty {

	WebDriver d;
	@Given("Launch the Url")
	public void launch_the_url() throws IOException {
	    d= lauch();
	    
	}

	@When("Login to Application with Username {string} and Password {string}")
	public void login_to_application_with_username_and_password(String Uname, String Password) {
	    Login(d, Uname, Password);
		
	}

	@Then("Verify {string} Text in the Home Page")
	public void verify_text_in_the_home_page(String string) {
		if(string.equalsIgnoreCase("Dashboard")) {
		Assert.assertEquals(d.findElement(dashboard).getText(), string);
		}
		else {
			Assert.assertEquals(display(d, Error), true);
		}
	}

	@When("Close the browser")
	public void close_the_browser() {
	    closeallbrowsers();
	   
	}

	@Given("Launch the Urls")
	public void launch_the_urls() throws IOException {
		d=lauch();
	}

	@When("Login to Application  Username {string} and Password {string}")
	public void login_to_application_username_and_password(String Username, String Pass) {
	    Login(d, Username, Pass);
	}

	@Then("Verify {string}  in the Home Page")
	public void verify_in_the_home_page(String string) {
	  Assert.assertEquals(d.findElement(dashboard).getText(), string);
	}

	@When("Close the browsers")
	public void close_the_browsers() {
	   closeallbrowsers();
	}

	
}
