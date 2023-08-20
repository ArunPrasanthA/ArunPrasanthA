package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	static WebDriver driver;
	@Given("User Lauch Facebook web Application")
	public void user_Lauch_Facebook_web_Application() {
		 driver = new ChromeDriver();
		   driver.get("https://www.facebook.com/");
	}

	@When("User enter valid {string} and valid {string}")
	public void user_enter_valid_and_valid(String A, String B) {
		WebElement id = driver.findElement(By.id("email"));
		   id.sendKeys(A);
		   WebElement pass = driver.findElement(By.id("pass"));
		   pass.sendKeys(B);
	}

	@When("User click login button")
	public void user_click_login_button() {
		WebElement login = driver.findElement(By.name("login"));
	    login.click();
	   
	}

	@Then("User to check home page is displayed")
	public void user_to_check_home_page_is_displayed() {
		 System.out.println("Home page");
	}

	
}
