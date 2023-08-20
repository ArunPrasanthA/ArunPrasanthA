package com.step;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition1 {
	static WebDriver driver;
	
	@Given("User Lauch Facebook web Application")
	public void user_Lauch_Facebook_web_Application() {
		 driver = new ChromeDriver();
		   driver.get("https://www.facebook.com/");
	}

	@When("User enter valid username and valid Password")
	public void user_enter_valid_username_and_valid_Password(io.cucumber.datatable.DataTable dataTable) {
		WebElement id = driver.findElement(By.id("email"));
		Map<String, String> asMap = dataTable.asMap(String.class,String.class);
		String object = asMap.get("Name");
		   id.sendKeys(object);
		   WebElement pass = driver.findElement(By.id("pass"));
		   pass.sendKeys(asMap.get("Password"));
	    
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
