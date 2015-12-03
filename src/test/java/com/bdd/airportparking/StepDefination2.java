package com.bdd.airportparking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination2 {
	
	
	WebDriver driver = null;
	
	@Given("^that I went on google website$")
	public void that_I_went_on_google_website() throws Throwable {
		driver = new InternetExplorerDriver();
		driver.navigate().to("https://www.google.com");
	 
	}
	@When("^I typed in RHS$")
	public void I_typed_in_RHS() throws Throwable {
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("RHS");
	
	}


	@Then("^I should get a result back$")
	public void I_should_get_a_result_back() throws Throwable {
		driver.quit();
	   
	}
	
	
	@Given("^that I want to search for testers$")
	public void that_I_want_to_search_for_testers() throws Throwable {
		driver = new InternetExplorerDriver();
		driver.navigate().to("https://www.google.com");
	
	}

	@When("^I typed in Testers on the google search$")
	public void I_typed_in_Testers_on_the_google_search() throws Throwable {
	    driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("testers");
	}

	@Then("^I should see testers$")
	public void I_should_see_testers() throws Throwable {
		driver.quit();
	
	}
	@Given("^that I want to search for Teachers$")
	public void that_I_want_to_search_for_Teachers() throws Throwable {
		driver = new InternetExplorerDriver();
		driver.navigate().to("https://www.google.com");
	}

	@When("^I typed in Teachers on the google search$")
	public void I_typed_in_Teachers_on_the_google_search() throws Throwable {
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Teachers");
	}
	@Then("^I should see Teachers$")
	public void I_should_see_Teachers() throws Throwable {
		driver.quit();
	
	}

	@Given("^that I want to search for Nurses$")
	public void that_I_want_to_search_for_Nurses() throws Throwable {
		driver = new InternetExplorerDriver();
		driver.navigate().to("https://www.google.com");
	}

	@When("^I typed in Nurses  on the google search$")
	public void I_typed_in_Nurses_on_the_google_search() throws Throwable {
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Nurses");
	}
	
	@Then("^I should see Nurses$")
	public void I_should_see_Nurses() throws Throwable {
		driver.quit();
	
	}
}
